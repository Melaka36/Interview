# Constants
monthly_deposit = 240000
annual_interest_rate = 0.115
compounds_per_year = 4
investment_period_years = 1

# Initialize variables
total_value = 0

# Calculate the future value for each quarter
for _ in range(compounds_per_year):
    # Calculate interest for the current quarter
    interest = total_value * (annual_interest_rate / compounds_per_year)
    
    # Add the monthly deposit, original deposit, and interest
    total_value = total_value + monthly_deposit + interest

# The total_value now holds the future value after one year
print(f"Future value after one year: {total_value:.2f}")
