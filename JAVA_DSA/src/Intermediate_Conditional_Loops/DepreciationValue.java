package Intermediate_Conditional_Loops;

import java.util.Scanner;

public class DepreciationValue {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Initial_Cost ");
        double Initial_Cost = sc.nextDouble();
        System.out.println("Salvage_Value ");
        double Salvage_Value = sc.nextDouble();
        System.out.println("Total_Units_Production ");
        double Total_Units_Production = sc.nextDouble();
        System.out.println("Units_Produced ");
        double Units_Produced = sc.nextDouble();
        double Depreciation_Expense_per_Unit = (Initial_Cost - Salvage_Value) / Total_Units_Production;
        double Annual_Depreciation_Expense = Depreciation_Expense_per_Unit * Units_Produced;
        System.out.println("Depreciation Expense per Unit: " + Depreciation_Expense_per_Unit);
        System.out.println("Annual Depreciation Expense: " + Annual_Depreciation_Expense);
        sc.close();
    }
}

// Depreciation refers to the decline in the value of an asset over time due to
// factors such as wear and tear, obsolescence, or market conditions.
// It is commonly associated with tangible assets like vehicles, machinery,
// buildings, or equipment.
// The depreciation of value is usually calculated as an annual expense and is
// used for accounting and tax purposes.
// There are several methods for calculating depreciation, and the most commonly
// used ones include:
// 1.Straight-Line Depreciation: This is the simplest and most widely used
// method.
// It assumes that the asset depreciates by an equal amount each year over its
// useful life. The formula for straight-line depreciation is:
// Annual Depreciation Expense = (Initial Cost - Salvage Value) / Useful Life

// Where:
// Initial Cost is the original cost of the asset.
// Salvage Value is the estimated value of the asset at the end of its useful
// life.
// Useful Life is the estimated number of years the asset will be used.
// 2.Declining Balance Method: This method assumes that the asset depreciates by
// a
// higher amount in the earlier years and the depreciation expense decreases
// gradually over time.
// The two commonly used declining balance methods are the double-declining
// balance method and the 150% declining balance method.
// 3. Units of Production Method: This method calculates depreciation based on
// the
// asset's usage or production output rather than time. The formula is:
// Depreciation Expense per Unit = (Initial Cost - Salvage Value) / Total Units
// of Production
// Annual Depreciation Expense = Depreciation Expense per Unit × Units Produced
// or Used