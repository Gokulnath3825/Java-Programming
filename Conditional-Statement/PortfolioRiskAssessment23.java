import java.util.Scanner;

public class PortfolioRiskAssessment23 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int stockPercentage = sc.nextInt();
        int investmentYears = sc.nextInt();
        String riskTolerance = sc.next();
        String marketVolatility = sc.next();

        int bondPercentage = 100 - stockPercentage;
        int riskScore = stockPercentage;
        if (investmentYears >= 1 && investmentYears <= 5) {
            if (stockPercentage > 50) {
                riskScore += 20;
            }
        } else if (investmentYears >= 6 && investmentYears <= 10) {
            if (stockPercentage > 60) {
                riskScore += 10;
            }
        } else if (investmentYears >= 11 && investmentYears <= 20) {
            if (stockPercentage > 80) {
                riskScore += 5;
            }
        }
        if (marketVolatility.equalsIgnoreCase("Medium")) {
            riskScore += 10;
        } else if (marketVolatility.equalsIgnoreCase("High")) {
            riskScore += 20;
        }
        if (riskScore > 100) {
            riskScore = 100;
        }

        String riskCategory;
        if (riskScore <= 30) {
            riskCategory = "Low";
        } else if (riskScore <= 60) {
            riskCategory = "Moderate";
        } else if (riskScore <= 80) {
            riskCategory = "High";
        } else {
            riskCategory = "Very High";
        }

        String alignmentStatus = "";

        if (riskTolerance.equalsIgnoreCase("Conservative")) {
            if (riskCategory.equals("Low")) {
                alignmentStatus = "Well Aligned";
            } else if (riskCategory.equals("Moderate")) {
                alignmentStatus = "Acceptable";
            } else {
                alignmentStatus = "Misaligned";
            }
        } 
        else if (riskTolerance.equalsIgnoreCase("Moderate")) {
            if (riskCategory.equals("Moderate")) {
                alignmentStatus = "Well Aligned";
            } else if (riskCategory.equals("Low") || riskCategory.equals("High")) {
                alignmentStatus = "Acceptable";
            } else {
                alignmentStatus = "Misaligned";
            }
        } 
        else { 
            if (riskCategory.equals("High") || riskCategory.equals("Very High")) {
                alignmentStatus = "Well Aligned";
            } else if (riskCategory.equals("Moderate")) {
                alignmentStatus = "Acceptable";
            } else {
                alignmentStatus = "Misaligned";
            }
        }
        String recommendation = "";
        String rebalancing = "";

        if (alignmentStatus.equals("Well Aligned")) {
            recommendation = "Portfolio is appropriately balanced for your profile";
            rebalancing = "No action needed";
        } 
        else if (alignmentStatus.equals("Acceptable")) {

            if (riskTolerance.equalsIgnoreCase("Aggressive") 
                && riskCategory.equals("Very High")) {

                recommendation = "High risk level acceptable given long horizon and tolerance";
                rebalancing = "Monitor closely, consider slight reduction if volatility persists";

            } else {

                recommendation = "High risk level acceptable given long horizon and tolerance";
                rebalancing = "Monitor closely, consider slight reduction if volatility persists";
            }
        } 
        else {

            if (riskTolerance.equalsIgnoreCase("Conservative")) {
                recommendation = "Portfolio risk significantly exceeds tolerance level";
                rebalancing = "Reduce stocks to 30-40%, increase bonds and cash";
            } 
            else if (riskTolerance.equalsIgnoreCase("Aggressive")) {
                recommendation = "Portfolio is too conservative for your risk tolerance";
                rebalancing = "Increase stocks to 80-90% for better growth potential";
            } 
            else {
                recommendation = "Portfolio allocation needs adjustment";
                rebalancing = "Rebalance according to your risk profile";
            }
        }
        System.out.println();
        System.out.println("Stock Allocation: " + stockPercentage + "%");
        System.out.println("Bond Allocation: " + bondPercentage + "%");
        System.out.println("Investment Horizon: " + investmentYears + " years");
        System.out.println("Risk Tolerance: " + riskTolerance);
        System.out.println("Market Volatility: " + marketVolatility);
        System.out.println("Portfolio Risk Score: " + riskScore + "/100");
        System.out.println("Risk Category: " + riskCategory);
        System.out.println("Alignment Status: " + alignmentStatus);
        System.out.println("Recommendation: " + recommendation);
        System.out.println("Suggested Rebalancing: " + rebalancing);

        sc.close();
    }
}