public class BMICalculation {

	// Enum for BMI Ranges
    public enum BMIRange {
        UNDERWEIGHT,
        NORMAL,
        OVERWEIGHT,
        OBESE
    }

    // BMI Calculation
    public static double calculateBMI(double weight, double height) {
        return (weight / (height * height)) * 703;
    }

    // Determine BMI Range
    public static BMIRange getBMIRange(double bmi) {
        if (bmi < 18.5) {
            return BMIRange.UNDERWEIGHT;
        } else if (bmi < 25) {
            return BMIRange.NORMAL;
        } else if (bmi < 30) {
            return BMIRange.OVERWEIGHT;
        } else {
            return BMIRange.OBESE;
        }
    }

    // Get BMI Category (for health purposes)
    public static String getBMICategory(double bmi) {
        switch (getBMIRange(bmi)) {
            case UNDERWEIGHT:
                return "Underweight";
            case NORMAL:
                return "Normal weight";
            case OVERWEIGHT:
                return "Overweight";
            case OBESE:
                return "Obesity";
            default:
                return "Unknown";
        }
    }

    // Get Insurance Payment Category (based on BMI)
    public static String getInsurancePaymentCategory(double bmi) {
        switch (getBMIRange(bmi)) {
            case UNDERWEIGHT:
            	return "Low";
            case NORMAL:
                return "Low";
            case OVERWEIGHT:
                return "High";
            case OBESE:
                return "Highest";
            default:
                return "Unknown";
        }
    }

}
