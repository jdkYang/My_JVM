package cn.yangjian.jvm.classfile.attribute.Exceptions;


import cn.yangjian.jvm.classfile.attribute.AttributeBase;
import cn.yangjian.jvm.classfile.basestruct.unsignednumber.U2;
import cn.yangjian.jvm.classfile.basestruct.unsignednumber.U4;

public class ExceptionsAttribute extends AttributeBase {
    public U2 attributeNameIndex;
    public U4 attributeLength;
    public U2 numberOfExceptions;
    public U2[] exceptionIndexTable;
}
