package cn.yangjian.jvm.instruction.loadandstore.constant;

import cn.yangjian.jvm.instruction.Instruction;
import cn.yangjian.jvm.interpreter.CallSite;
import cn.yangjian.jvm.interpreter.CodeUtils;
import cn.yangjian.jvm.interpreter.Interpreter;
import cn.yangjian.jvm.runtime.JavaClass;
import cn.yangjian.jvm.runtime.RunTimeEnv;
import cn.yangjian.jvm.runtime.stack.JThread;

public class Nop implements Instruction {
    @Override
    public void execute(RunTimeEnv runTimeEnv, JThread jThread, JavaClass javaClass, CallSite callSite, Interpreter interpreter, CodeUtils code) {

    }
}
