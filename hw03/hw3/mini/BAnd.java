package mini;

import compiler.*;
import compiler.Failure;

/** Abstract syntax for bitwise and expressions (&).
 */
class BAnd extends BinBitwiseExpr {
    BAnd(Expr left, Expr right) {
        super(left, right);
    }

    /** Generate assembly language code for this expression that will
     *  evaluate the expression when it is executed and leave the result
     *  in the specified free register, preserving any lower numbered
     *  registers in the process.
     */
    public void compileExpr(Assembly a, int pushed, int free) {
        compileCommutativeOp(a, "andl", pushed, free);
    }
}
