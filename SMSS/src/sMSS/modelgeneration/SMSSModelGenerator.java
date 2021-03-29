package sMSS.modelgeneration;

import org.eclipse.emf.ecore.resource.Resource;

import sMSS.Fragment;
import sMSS.FragmentType;
import sMSS.Message;
import sMSS.MessageType;
import sMSS.Method;
import sMSS.Operand;
import sMSS.SMSS;
import sMSS.SMSSFactory;
import sMSS.SMSSPackage;
import sMSS.util.ResourceHelper;
import sMSS.util.SMSSResourceFactoryImpl;

public class SMSSModelGenerator {

    public static void main(String[] args) {
        SMSSPackage.eINSTANCE.eClass();
        
        generateMessagesModel("examples/messages.smss");
        generateFragmentModel("examples/fragment.smss");
        generateFragmentsModel("examples/fragments.smss");
    }

	private static void generateMessagesModel(String filename) {
		SMSS smss = SMSSFactory.eINSTANCE.createSMSS();
        
        sMSS.Class c = SMSSFactory.eINSTANCE.createClass();
        c.setName("MyClass");
        smss.getClasses().add(c);
        sMSS.Class c1 = SMSSFactory.eINSTANCE.createClass();
        c1.setName("MyClass1");
        smss.getClasses().add(c1);
        sMSS.Class c2 = SMSSFactory.eINSTANCE.createClass();
        c2.setName("MyClass2");
        smss.getClasses().add(c2);
        sMSS.Class c3 = SMSSFactory.eINSTANCE.createClass();
        c3.setName("MyClass3");
        smss.getClasses().add(c3);
        
        sMSS.Object s = SMSSFactory.eINSTANCE.createObject();
        s.setName("mySenderObject");
        s.setType(c);
        smss.getObjects().add(s);
        sMSS.Object r1 = SMSSFactory.eINSTANCE.createObject();
        r1.setName("myReceiverObject1");
        r1.setType(c1);
        smss.getObjects().add(r1);
        sMSS.Object r2 = SMSSFactory.eINSTANCE.createObject();
        r2.setName("myReceiverObject2");
        r2.setType(c2);
        smss.getObjects().add(r2);
        sMSS.Object r3 = SMSSFactory.eINSTANCE.createObject();
        r3.setName("myReceiverObject3");
        r3.setType(c3);
        smss.getObjects().add(r3);

        MessageType mt1 = SMSSFactory.eINSTANCE.createMessageType();
        mt1.setName("message1");
        mt1.setSender(s);
        mt1.setReceiver(r1);
        smss.getMessageTypes().add(mt1);
        MessageType mt2 = SMSSFactory.eINSTANCE.createMessageType();
        mt2.setName("message2");
        mt2.setSender(s);
        mt2.setReceiver(r2);
        smss.getMessageTypes().add(mt2);
        MessageType mt3 = SMSSFactory.eINSTANCE.createMessageType();
        mt3.setName("message3");
        mt3.setSender(s);
        mt3.setReceiver(r3);
        smss.getMessageTypes().add(mt3);
        MessageType mt4 = SMSSFactory.eINSTANCE.createMessageType();
        mt4.setName("message4");
        mt4.setSender(s);
        mt4.setReceiver(r1);
        smss.getMessageTypes().add(mt4);
        MessageType mt5 = SMSSFactory.eINSTANCE.createMessageType();
        mt5.setName("message5");
        mt5.setSender(s);
        mt5.setReceiver(r3);
        smss.getMessageTypes().add(mt5);
        
        Method method = SMSSFactory.eINSTANCE.createMethod();
        method.setName("myMethod");
        method.setClass(c);
        smss.setMethod(method);
        
        Message m1 = SMSSFactory.eINSTANCE.createMessage();
        m1.setType(mt1);
        method.getElements().add(m1);
        Message m2 = SMSSFactory.eINSTANCE.createMessage();
        m2.setType(mt2);
        method.getElements().add(m2);
        Message m3 = SMSSFactory.eINSTANCE.createMessage();
        m3.setType(mt3);
        method.getElements().add(m3);
        Message m4 = SMSSFactory.eINSTANCE.createMessage();
        m4.setType(mt2);
        method.getElements().add(m4);
        Message m5 = SMSSFactory.eINSTANCE.createMessage();
        m5.setType(mt4);
        method.getElements().add(m5);
        Message m6 = SMSSFactory.eINSTANCE.createMessage();
        m6.setType(mt5);
        method.getElements().add(m6);
        Message m7 = SMSSFactory.eINSTANCE.createMessage();
        m7.setType(mt5);
        method.getElements().add(m7);
        Message m8 = SMSSFactory.eINSTANCE.createMessage();
        m8.setType(mt3);
        method.getElements().add(m8);
        
        saveModel(filename, smss);
	}
	
	private static void generateFragmentModel(String filename) {
		SMSS smss = SMSSFactory.eINSTANCE.createSMSS();
        
        sMSS.Class c = SMSSFactory.eINSTANCE.createClass();
        c.setName("MyClass");
        smss.getClasses().add(c);
        sMSS.Class c1 = SMSSFactory.eINSTANCE.createClass();
        c1.setName("MyClass1");
        smss.getClasses().add(c1);
        sMSS.Class c2 = SMSSFactory.eINSTANCE.createClass();
        c2.setName("MyClass2");
        smss.getClasses().add(c2);
        sMSS.Class c3 = SMSSFactory.eINSTANCE.createClass();
        c3.setName("MyClass3");
        smss.getClasses().add(c3);
        
        sMSS.Object s = SMSSFactory.eINSTANCE.createObject();
        s.setName("mySenderObject");
        s.setType(c);
        smss.getObjects().add(s);
        sMSS.Object r1 = SMSSFactory.eINSTANCE.createObject();
        r1.setName("myReceiverObject1");
        r1.setType(c1);
        smss.getObjects().add(r1);
        sMSS.Object r2 = SMSSFactory.eINSTANCE.createObject();
        r2.setName("myReceiverObject2");
        r2.setType(c2);
        smss.getObjects().add(r2);
        sMSS.Object r3 = SMSSFactory.eINSTANCE.createObject();
        r3.setName("myReceiverObject3");
        r3.setType(c3);
        smss.getObjects().add(r3);

        MessageType mt1 = SMSSFactory.eINSTANCE.createMessageType();
        mt1.setName("message1");
        mt1.setSender(s);
        mt1.setReceiver(r2);
        smss.getMessageTypes().add(mt1);
        MessageType mt2 = SMSSFactory.eINSTANCE.createMessageType();
        mt2.setName("message2");
        mt2.setSender(s);
        mt2.setReceiver(r1);
        smss.getMessageTypes().add(mt2);
        MessageType mt3 = SMSSFactory.eINSTANCE.createMessageType();
        mt3.setName("message3");
        mt3.setSender(s);
        mt3.setReceiver(r2);
        smss.getMessageTypes().add(mt3);
        MessageType mt4 = SMSSFactory.eINSTANCE.createMessageType();
        mt4.setName("message4");
        mt4.setSender(s);
        mt4.setReceiver(r3);
        smss.getMessageTypes().add(mt4);
        
        Method method = SMSSFactory.eINSTANCE.createMethod();
        method.setName("myMethod");
        method.setClass(c);
        smss.setMethod(method);
        
        Message m1 = SMSSFactory.eINSTANCE.createMessage();
        m1.setType(mt1);
        method.getElements().add(m1);
        Message m2 = SMSSFactory.eINSTANCE.createMessage();
        m2.setType(mt2);
        method.getElements().add(m2);
        
        Fragment f = SMSSFactory.eINSTANCE.createFragment();
        f.setType(FragmentType.ALT);
        Operand o1 = SMSSFactory.eINSTANCE.createOperand();
        o1.setCondition("myCondition1");
        Message m3 = SMSSFactory.eINSTANCE.createMessage();
        m3.setType(mt2);
        o1.getMessages().add(m3);
        Message m4 = SMSSFactory.eINSTANCE.createMessage();
        m4.setType(mt4);
        o1.getMessages().add(m4);
        f.getOperands().add(o1);

        Operand o2 = SMSSFactory.eINSTANCE.createOperand();
        o2.setCondition("myCondition2");
        Message m5 = SMSSFactory.eINSTANCE.createMessage();
        m5.setType(mt1);
        o2.getMessages().add(m5);
        f.getOperands().add(o2);
        
        Operand o3 = SMSSFactory.eINSTANCE.createOperand();
        o3.setCondition("myCondition3");
        Message m6 = SMSSFactory.eINSTANCE.createMessage();
        m6.setType(mt3);
        o3.getMessages().add(m6);
        f.getOperands().add(o3);
        method.getElements().add(f);
        
        Message m7 = SMSSFactory.eINSTANCE.createMessage();
        m7.setType(mt3);
        method.getElements().add(m7);
        Message m8 = SMSSFactory.eINSTANCE.createMessage();
        m8.setType(mt4);
        method.getElements().add(m8);
        
        saveModel(filename, smss);
	}

	private static void generateFragmentsModel(String filename) {
		SMSS smss = SMSSFactory.eINSTANCE.createSMSS();
        
        sMSS.Class c = SMSSFactory.eINSTANCE.createClass();
        c.setName("MyClass");
        smss.getClasses().add(c);
        sMSS.Class c1 = SMSSFactory.eINSTANCE.createClass();
        c1.setName("MyClass1");
        smss.getClasses().add(c1);
        sMSS.Class c2 = SMSSFactory.eINSTANCE.createClass();
        c2.setName("MyClass2");
        smss.getClasses().add(c2);
        
        sMSS.Object s = SMSSFactory.eINSTANCE.createObject();
        s.setName("mySenderObject");
        s.setType(c);
        smss.getObjects().add(s);
        sMSS.Object r1 = SMSSFactory.eINSTANCE.createObject();
        r1.setName("myReceiverObject1");
        r1.setType(c1);
        smss.getObjects().add(r1);
        sMSS.Object r2 = SMSSFactory.eINSTANCE.createObject();
        r2.setName("myReceiverObject2");
        r2.setType(c2);
        smss.getObjects().add(r2);

        MessageType mt1 = SMSSFactory.eINSTANCE.createMessageType();
        mt1.setName("message1");
        mt1.setSender(s);
        mt1.setReceiver(r1);
        smss.getMessageTypes().add(mt1);
        MessageType mt2 = SMSSFactory.eINSTANCE.createMessageType();
        mt2.setName("message2");
        mt2.setSender(s);
        mt2.setReceiver(r2);
        smss.getMessageTypes().add(mt2);
        MessageType mt3 = SMSSFactory.eINSTANCE.createMessageType();
        mt3.setName("message3");
        mt3.setSender(s);
        mt3.setReceiver(r2);
        smss.getMessageTypes().add(mt3);
        MessageType mt4 = SMSSFactory.eINSTANCE.createMessageType();
        mt4.setName("message4");
        mt4.setSender(s);
        mt4.setReceiver(r1);
        smss.getMessageTypes().add(mt4);
        
        Method method = SMSSFactory.eINSTANCE.createMethod();
        method.setName("myMethod");
        method.setClass(c);
        smss.setMethod(method);
        
        Fragment f1 = SMSSFactory.eINSTANCE.createFragment();
        f1.setType(FragmentType.ALT);
        Operand o11 = SMSSFactory.eINSTANCE.createOperand();
        o11.setCondition("myCondition1");
        Message m1 = SMSSFactory.eINSTANCE.createMessage();
        m1.setType(mt3);
        o11.getMessages().add(m1);
        f1.getOperands().add(o11);

        Operand o12 = SMSSFactory.eINSTANCE.createOperand();
        o12.setCondition("myCondition2");
        Message m2 = SMSSFactory.eINSTANCE.createMessage();
        m2.setType(mt1);
        o12.getMessages().add(m2);
        Message m3 = SMSSFactory.eINSTANCE.createMessage();
        m3.setType(mt3);
        o12.getMessages().add(m3);
        f1.getOperands().add(o12);
        method.getElements().add(f1);

        Message m4 = SMSSFactory.eINSTANCE.createMessage();
        m4.setType(mt1);
        method.getElements().add(m4);
        Message m5 = SMSSFactory.eINSTANCE.createMessage();
        m5.setType(mt2);
        method.getElements().add(m5);
        
        Fragment f2 = SMSSFactory.eINSTANCE.createFragment();
        f2.setType(FragmentType.PAR);
        Operand o21 = SMSSFactory.eINSTANCE.createOperand();
        o21.setCondition("");
        Message m6 = SMSSFactory.eINSTANCE.createMessage();
        m6.setType(mt2);
        o21.getMessages().add(m6);
        Message m7 = SMSSFactory.eINSTANCE.createMessage();
        m7.setType(mt4);
        o21.getMessages().add(m7);
        f2.getOperands().add(o21);

        Operand o22 = SMSSFactory.eINSTANCE.createOperand();
        o22.setCondition("");
        Message m8 = SMSSFactory.eINSTANCE.createMessage();
        m8.setType(mt1);
        o22.getMessages().add(m8);
        f2.getOperands().add(o22);
        
        Operand o23 = SMSSFactory.eINSTANCE.createOperand();
        o23.setCondition("");
        Message m9 = SMSSFactory.eINSTANCE.createMessage();
        m9.setType(mt3);
        o23.getMessages().add(m9);
        f2.getOperands().add(o23);
        method.getElements().add(f2);
        
        Message m10 = SMSSFactory.eINSTANCE.createMessage();
        m10.setType(mt3);
        method.getElements().add(m10);
        
        saveModel(filename, smss);
	}

	private static void saveModel(String filename, SMSS smss) {
		/**
         * Save the model.
         */
        ResourceHelper.INSTANCE.addResourceFactory("smss", new SMSSResourceFactoryImpl());
        ResourceHelper.INSTANCE.saveResource(smss, filename);
        Resource resource = ResourceHelper.INSTANCE.loadResource(filename);
        
        /**
         * Get the root object.
         */
        SMSS savedSMSS = (SMSS) resource.getContents().get(0);
        System.out.println(savedSMSS.getClasses());
	}
    
}
