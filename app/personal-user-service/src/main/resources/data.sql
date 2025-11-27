-- Drop tables if they exist
DROP TABLE IF EXISTS users CASCADE;
DROP TABLE IF EXISTS gender CASCADE;
DROP TABLE IF EXISTS nationality CASCADE;
DROP TABLE IF EXISTS account_type CASCADE;
DROP TABLE IF EXISTS account_detail CASCADE;
DROP TABLE IF EXISTS profile_detail CASCADE;
DROP TABLE IF EXISTS Transaction;




-- Create Gender table
CREATE TABLE IF NOT EXISTS gender (
                                      id SERIAL PRIMARY KEY,
                                      name VARCHAR(100),
                                      created_at TIMESTAMP DEFAULT CURRENT_TIMESTAMP,
                                      updated_at TIMESTAMP DEFAULT CURRENT_TIMESTAMP,
                                      created_by INT,
                                      updated_by INT
);

-- Create Nationality table
CREATE TABLE IF NOT EXISTS nationality (
                                           id SERIAL PRIMARY KEY,
                                           name VARCHAR(100),
                                           created_at TIMESTAMP DEFAULT CURRENT_TIMESTAMP,
                                           updated_at TIMESTAMP DEFAULT CURRENT_TIMESTAMP,
                                           created_by INT,
                                           updated_by INT
);

-- Create Account_Type table
CREATE TABLE IF NOT EXISTS account_type (
                                            id SERIAL PRIMARY KEY,
                                            code VARCHAR(50),
                                            created_at TIMESTAMP DEFAULT CURRENT_TIMESTAMP,
                                            updated_at TIMESTAMP DEFAULT CURRENT_TIMESTAMP,
                                            created_by INT,
                                            updated_by INT
);

-- Insert demo data into Gender
INSERT INTO gender (name, created_by, updated_by)
VALUES
    ('Male', 1, 1),
    ('Female', 1, 1),
    ('Other', 1, 1);

-- Insert demo data into Nationality
INSERT INTO nationality (name, created_by, updated_by)
VALUES
    ('Myanmar', 1, 1),
    ('Thailand', 1, 1),
    ('Singapore', 1, 1),
    ('Malaysia', 1, 1),
    ('Indonesia', 1, 1),
    ('Philippines', 1, 1);

-- Insert demo data into Account_Type
INSERT INTO account_type (code, created_by, updated_by)
VALUES
    ('SAVINGS', 1, 1),
    ('CHECKING', 1, 1);

-- Create Account_Detail table (now that referenced tables exist)
CREATE TABLE IF NOT EXISTS account_detail (
                                              id SERIAL PRIMARY KEY,
                                              account_number VARCHAR(100) UNIQUE NOT NULL,
                                              user_id INT,
                                              account_type_id INT,
                                              current_balance DECIMAL(19, 4) DEFAULT 0.00,
                                              created_at TIMESTAMP DEFAULT CURRENT_TIMESTAMP,
                                              updated_at TIMESTAMP DEFAULT CURRENT_TIMESTAMP,
                                              created_by INT,
                                              updated_by INT,
                                              FOREIGN KEY (user_id) REFERENCES users(id),
                                              FOREIGN KEY (account_type_id) REFERENCES account_type(id)
);

-- Create Profile_Detail table (now that referenced tables exist)
CREATE TABLE IF NOT EXISTS profile_detail (
                                              id SERIAL PRIMARY KEY,
                                              fullname VARCHAR(255),
                                              date_of_birth DATE,
                                              organization_id INT,
                                              gender_id INT,
                                              phone_number VARCHAR(20),
                                              address VARCHAR(200),
                                              selected_account_id INT,
                                              nationality_id INT,
                                              pin VARCHAR(255),
                                              is_policy_agreement BOOLEAN DEFAULT FALSE,
                                              is_auto_save_receipt BOOLEAN DEFAULT FALSE,
                                              has_initial_pin BOOLEAN DEFAULT FALSE,
                                              created_at TIMESTAMP DEFAULT CURRENT_TIMESTAMP,
                                              updated_at TIMESTAMP DEFAULT CURRENT_TIMESTAMP,
                                              created_by INT,
                                              updated_by INT,
                                              FOREIGN KEY (gender_id) REFERENCES gender(id),
                                              FOREIGN KEY (nationality_id) REFERENCES nationality(id),
                                              FOREIGN KEY (selected_account_id) REFERENCES account_detail(id)
);

-- Create Users table (now that referenced tables exist)
CREATE TABLE IF NOT EXISTS users (
                                     id SERIAL PRIMARY KEY,
                                     username VARCHAR(100) UNIQUE NOT NULL,
                                     email VARCHAR(255) UNIQUE NOT NULL,
                                     password VARCHAR(255) NOT NULL,
                                     profile_id INT,
                                     role_id INT,
                                     gender_id INT,
                                     nationality_id INT,
                                     selected_account_id INT,
                                     status INT DEFAULT 1,
                                     is_first_time_login BOOLEAN DEFAULT TRUE,
                                     created_at TIMESTAMP DEFAULT CURRENT_TIMESTAMP,
                                     updated_at TIMESTAMP DEFAULT CURRENT_TIMESTAMP,
                                     created_by INT,
                                     updated_by INT,
                                     FOREIGN KEY (gender_id) REFERENCES gender(id),
                                     FOREIGN KEY (nationality_id) REFERENCES nationality(id),
                                     FOREIGN KEY (selected_account_id) REFERENCES account_detail(id)
);

-- Insert demo data into Account Detail
INSERT INTO account_detail (account_number, user_id, account_type_id, current_balance, created_by, updated_by)
VALUES
    ('1000000001', 1, 1, 5000.00, 1, 1),  -- Customer account (SAVINGS)
    ('1000000002', 2, 2, 10000.00, 1, 1); -- Admin account (CHECKING)

-- Insert demo data into Profile Detail
INSERT INTO profile_detail (fullname, date_of_birth, gender_id, nationality_id, phone_number, address, pin, is_policy_agreement, created_by, updated_by)
VALUES
    ('John Doe', '1990-01-15', 1, 1, '0912345678', 'Yangon, Myanmar', '1234', TRUE, 1, 1),
    ('Jane Smith', '1992-05-20', 2, 2, '0912345679', 'Bangkok, Thailand', '5678', TRUE, 1, 1);

-- Insert demo data into Users (Customer and Admin)
INSERT INTO users (username, email, password, profile_id, role_id, gender_id, nationality_id, selected_account_id, status, created_by, updated_by)
VALUES
    ('john.doe', 'john.doe@example.com', 'hashed_password_1234', 1, 1, 1, 1, 1, 1, 1, 1), -- Customer
    ('admin', 'admin@example.com', 'admin_hashed_password', 2, 2, 1, 1, 2, 1, 1, 1);      -- Admin

CREATE TABLE transaction (
                             id SERIAL PRIMARY KEY,
                             credit_account_id INTEGER,
                             debit_account_id INTEGER,
                             amount NUMERIC(19,4),
                             created_at TIMESTAMP DEFAULT CURRENT_TIMESTAMP,
                             updated_at TIMESTAMP DEFAULT CURRENT_TIMESTAMP,
                             created_by INTEGER,
                             updated_by INTEGER
);

INSERT INTO transaction (
    credit_account_id,
    debit_account_id,
    amount,
    created_at,
    updated_at,
    created_by,
    updated_by
)
VALUES
-- Existing pattern repeated with variations
(1, 2, 500.0000, '2025-11-20 10:45:55', '2025-11-20 10:45:55', NULL, NULL),
(2, 1, 200.0000, '2025-11-20 10:45:55', '2025-11-20 10:45:55', NULL, NULL),
(1, 2, 500.0000, '2025-11-20 10:51:29', '2025-11-20 10:51:29', NULL, NULL),
(2, 1, 200.0000, '2025-11-20 10:51:29', '2025-11-20 10:51:29', NULL, NULL),

-- Additional 16 new rows
(1, 2, 300.0000, '2025-11-20 11:10:12', '2025-11-20 11:10:12', NULL, NULL),
(2, 1, 150.0000, '2025-11-20 11:12:44', '2025-11-20 11:12:44', NULL, NULL),
(1, 2, 750.0000, '2025-11-20 11:15:01', '2025-11-20 11:15:01', NULL, NULL),
(2, 1, 120.0000, '2025-11-20 11:17:55', '2025-11-20 11:17:55', NULL, NULL),

(1, 2, 999.9900, '2025-11-20 11:20:23', '2025-11-20 11:20:23', NULL, NULL),
(2, 1, 250.5000, '2025-11-20 11:22:35', '2025-11-20 11:22:35', NULL, NULL),
(1, 2, 1300.0000, '2025-11-20 11:25:10', '2025-11-20 11:25:10', NULL, NULL),
(2, 1, 430.2500, '2025-11-20 11:27:48', '2025-11-20 11:27:48', NULL, NULL),

(1, 2, 80.0000, '2025-11-20 11:30:02', '2025-11-20 11:30:02', NULL, NULL),
(2, 1, 60.0000, '2025-11-20 11:32:18', '2025-11-20 11:32:18', NULL, NULL),
(1, 2, 1550.7500, '2025-11-20 11:34:41', '2025-11-20 11:34:41', NULL, NULL),
(2, 1, 500.0000, '2025-11-20 11:36:59', '2025-11-20 11:36:59', NULL, NULL),

(1, 2, 220.2200, '2025-11-20 11:40:00', '2025-11-20 11:40:00', NULL, NULL),
(2, 1, 440.4400, '2025-11-20 11:42:55', '2025-11-20 11:42:55', NULL, NULL),
(1, 2, 1200.0000, '2025-11-20 11:45:30', '2025-11-20 11:45:30', NULL, NULL),
(2, 1, 220.0000, '2025-11-20 11:47:10', '2025-11-20 11:47:10', NULL, NULL);
--
-- SELECT
--     u.email,
--     u.username,
--     p.fullname,
--     p.phone_number,
--     p.address,
--     p.date_of_birth,
--     g.id AS gender_id,
--     g.name AS gender_name,
--     n.id AS nationality_id,
--     n.name AS nationality_name,
--     p.is_policy_agreement,
--     p.is_auto_save_receipt,
--     u.is_first_time_login,
--     p.has_initial_pin,
--     a.current_balance AS account_balance,
--     a.id AS account_id,
--     a.account_number
-- FROM users u
--          LEFT JOIN gender g ON g.id = u.gender_id
--          LEFT JOIN nationality n ON n.id = u.nationality_id
--          LEFT JOIN account_detail a ON a.id = u.selected_account_id
--          LEFT JOIN profile_detail p ON p.id = u.profile_id
-- WHERE u.id = ?;

--
-- SELECT *
-- FROM profile_detail pd
--          JOIN users u ON pd.id = u.profile_id
-- WHERE u.id = 1 AND pd.id = u.profile_id;
--
-- SELECT pd.selected_account_id
-- FROM Profile_detail pd
--          JOIN Users u ON u.profile_id = pd.id
-- WHERE u.id =1;
--
-- SELECT * FROM account_detail;
--
--


INSERT INTO account_detail (account_number, user_id, account_type_id, current_balance, created_by, updated_by)
VALUES
    ('1000000003', 1, 2, 2500.00, 1, 1);

-- SELECT id, account_number, current_balance FROM Account_detail WHERE user_id = 1


UPDATE profile_detail
SET is_policy_agreement = false
FROM users u
WHERE u.id = 1 AND u.profile_id = profile_detail.id