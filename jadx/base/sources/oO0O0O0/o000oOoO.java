package oO0O0O0;

import java.io.ByteArrayInputStream;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC24015OooO0Oo;
import kotlin.jvm.internal.AbstractC24020OooOOOo;
import kotlin.jvm.internal.AbstractC24021OooOOo;
import kotlin.jvm.internal.AbstractC24025OooOo0O;
import kotlin.jvm.internal.AbstractC24027OooOoO;
import kotlin.jvm.internal.InterfaceC24016OooO0o0;
import oO00ooO.C32443OooOOO;
import oO0O0OO.InterfaceC32609OooOo0;
import oO0O0OO.InterfaceC32632OoooOO0;
import oO0O0OO.InterfaceC32641OooooOO;
import oO0OO00.C32887OooO0oo;
import oO0OO00.C32892OooOOoo;
import oO0OO0Oo.C32922OooO0oO;
import oO0OOO.C32934OooO0o0;
import oO0OOO.C32936OooO0oo;
import oO0OOOO.C32944OooO0Oo;
import oO0OOOO0.C32951OooO0Oo;
import oO0OOOO0.InterfaceC32958OooOOOo;
import oO0Ooo.AbstractC33320OooOoo;
import oOo000Oo.C34434OooOoO;
import oOoo0.InterfaceC34591OooO;
import oOoo0.InterfaceC34595OooO0Oo;
import oOoo0.InterfaceC34596OooO0o;
import oOoo0.InterfaceC34598OooO0oO;
import oOoo0.InterfaceC34600OooOO0;
import oOoo0.InterfaceC34603OooOOO;
import oOoo0.InterfaceC34604OooOOO0;
import oOoo0.InterfaceC34605OooOOOO;
import oOoo0.InterfaceC34606OooOOOo;

/* JADX INFO: loaded from: classes10.dex */
public class o000oOoO extends kotlin.jvm.internal.Oooo0 {
    public static AbstractC32552OooOOo OooOO0o(AbstractC24015OooO0Oo abstractC24015OooO0Oo) {
        InterfaceC34596OooO0o owner = abstractC24015OooO0Oo.getOwner();
        return owner instanceof AbstractC32552OooOOo ? (AbstractC32552OooOOo) owner : C32534OooO0Oo.f116898OooOo;
    }

    @Override // kotlin.jvm.internal.Oooo0
    public final String OooO(kotlin.jvm.internal.OooOO0 oooOO02) throws oO0OOOO0.OooOO0 {
        C32556OooOo0O c32556OooOo0OOooO0O0;
        Metadata metadata = (Metadata) oooOO02.getClass().getAnnotation(Metadata.class);
        C32556OooOo0O c32556OooOo0O = null;
        if (metadata != null) {
            String[] strArrM80611d1 = metadata.m80611d1();
            if (strArrM80611d1.length == 0) {
                strArrM80611d1 = null;
            }
            if (strArrM80611d1 != null) {
                String[] strings = metadata.m80612d2();
                oO0OOOO0.OooO0o oooO0o = C32936OooO0oo.f118827OooO00o;
                kotlin.jvm.internal.OooOOO0.OooO0oO(strings, "strings");
                ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(oO0OOO.OooO00o.OooO00o(strArrM80611d1));
                oO0OOOO0.OooO0o oooO0o2 = C32936OooO0oo.f118827OooO00o;
                oO0OOO.OooO0o oooO0oOooO0oO = C32936OooO0oo.OooO0oO(byteArrayInputStream, strings);
                C32887OooO0oo.OooO00o oooO00o = C32887OooO0oo.f118223OoooO0;
                oO0OOOO0.OooO0o oooO0o3 = C32936OooO0oo.f118827OooO00o;
                oooO00o.getClass();
                C32951OooO0Oo c32951OooO0Oo = new C32951OooO0Oo(byteArrayInputStream);
                InterfaceC32958OooOOOo interfaceC32958OooOOOo = (InterfaceC32958OooOOOo) oooO00o.OooO00o(c32951OooO0Oo, oooO0o3);
                try {
                    c32951OooO0Oo.OooO00o(0);
                    oO0OOOO0.OooO0O0.OooO0O0(interfaceC32958OooOOOo);
                    C32887OooO0oo c32887OooO0oo = (C32887OooO0oo) interfaceC32958OooOOOo;
                    C32934OooO0o0 c32934OooO0o0 = new C32934OooO0o0(metadata.m80614mv(), (metadata.m80616xi() & 8) != 0);
                    Class<?> cls = oooOO02.getClass();
                    C32892OooOOoo c32892OooOOoo = c32887OooO0oo.f118241Oooo0o0;
                    kotlin.jvm.internal.OooOOO0.OooO0o(c32892OooOOoo, "proto.typeTable");
                    c32556OooOo0O = new C32556OooOo0O(C32534OooO0Oo.f116898OooOo, (InterfaceC32632OoooOO0) C32585OoooOoo.OooO0o(cls, c32887OooO0oo, oooO0oOooO0oO, new C32922OooO0oO(c32892OooOOoo), c32934OooO0o0, oO0O0O00.OooO0OO.f117095OooOo0o));
                } catch (oO0OOOO0.OooOO0 e) {
                    e.f119095OooOo0o = interfaceC32958OooOOOo;
                    throw e;
                }
            }
        }
        if (c32556OooOo0O == null || (c32556OooOo0OOooO0O0 = C32585OoooOoo.OooO0O0(c32556OooOo0O)) == null) {
            return super.OooO(oooOO02);
        }
        C32944OooO0Oo c32944OooO0Oo = C32581OoooOOO.f117086OooO00o;
        InterfaceC32609OooOo0 interfaceC32609OooOo0OooOOo = c32556OooOo0OOooO0O0.OooOOO();
        StringBuilder sb = new StringBuilder();
        C32581OoooOOO.OooO00o(sb, interfaceC32609OooOo0OooOOo);
        List<InterfaceC32641OooooOO> listOooO0o = interfaceC32609OooOo0OooOOo.OooO0o();
        kotlin.jvm.internal.OooOOO0.OooO0o(listOooO0o, "invoke.valueParameters");
        oOo000Oo.OooOo.OoooOO0(listOooO0o, sb, ", ", "(", ")", C32582OoooOOo.f117088OooOo0o, 48);
        sb.append(" -> ");
        AbstractC33320OooOoo returnType = interfaceC32609OooOo0OooOOo.getReturnType();
        kotlin.jvm.internal.OooOOO0.OooO0Oo(returnType);
        sb.append(C32581OoooOOO.OooO0Oo(returnType));
        String string = sb.toString();
        kotlin.jvm.internal.OooOOO0.OooO0o(string, "StringBuilder().apply(builderAction).toString()");
        return string;
    }

    @Override // kotlin.jvm.internal.Oooo0
    public final InterfaceC34598OooO0oO OooO00o(kotlin.jvm.internal.OooOO0O oooOO0O) {
        AbstractC32552OooOOo container = OooOO0o(oooOO0O);
        String name = oooOO0O.getName();
        String signature = oooOO0O.getSignature();
        Object boundReceiver = oooOO0O.getBoundReceiver();
        kotlin.jvm.internal.OooOOO0.OooO0oO(container, "container");
        kotlin.jvm.internal.OooOOO0.OooO0oO(name, "name");
        kotlin.jvm.internal.OooOOO0.OooO0oO(signature, "signature");
        return new C32556OooOo0O(container, name, signature, null, boundReceiver);
    }

    @Override // kotlin.jvm.internal.Oooo0
    public final InterfaceC34595OooO0Oo OooO0O0(Class cls) {
        return OooO0O0.OooO00o(cls);
    }

    @Override // kotlin.jvm.internal.Oooo0
    public final InterfaceC34596OooO0o OooO0OO(Class jClass, String str) {
        OooO0OO oooO0OO = OooO0O0.f116887OooO00o;
        kotlin.jvm.internal.OooOOO0.OooO0oO(jClass, "jClass");
        return (InterfaceC34596OooO0o) OooO0O0.f116888OooO0O0.OooO00o(jClass);
    }

    @Override // kotlin.jvm.internal.Oooo0
    public final InterfaceC34591OooO OooO0Oo(AbstractC24020OooOOOo abstractC24020OooOOOo) {
        return new C32557OooOo0o(OooOO0o(abstractC24020OooOOOo), abstractC24020OooOOOo.getName(), abstractC24020OooOOOo.getSignature(), abstractC24020OooOOOo.getBoundReceiver());
    }

    @Override // kotlin.jvm.internal.Oooo0
    public final InterfaceC34604OooOOO0 OooO0o(AbstractC24025OooOo0O abstractC24025OooOo0O) {
        return new C32566OooOooo(OooOO0o(abstractC24025OooOo0O), abstractC24025OooOo0O.getName(), abstractC24025OooOo0O.getSignature(), abstractC24025OooOo0O.getBoundReceiver());
    }

    @Override // kotlin.jvm.internal.Oooo0
    public final InterfaceC34600OooOO0 OooO0o0(AbstractC24021OooOOo abstractC24021OooOOo) {
        return new C32559OooOoO0(OooOO0o(abstractC24021OooOOo), abstractC24021OooOOo.getName(), abstractC24021OooOOo.getSignature(), abstractC24021OooOOo.getBoundReceiver());
    }

    @Override // kotlin.jvm.internal.Oooo0
    public final InterfaceC34603OooOOO OooO0oO(kotlin.jvm.internal.OooOo oooOo) {
        return new C32569Oooo00o(OooOO0o(oooOo), oooOo.getName(), oooOo.getSignature(), oooOo.getBoundReceiver());
    }

    @Override // kotlin.jvm.internal.Oooo0
    public final InterfaceC34605OooOOOO OooO0oo(AbstractC24027OooOoO abstractC24027OooOoO) {
        return new Oooo0(OooOO0o(abstractC24027OooOoO), abstractC24027OooOoO.getName(), abstractC24027OooOoO.getSignature());
    }

    @Override // kotlin.jvm.internal.Oooo0
    public final String OooOO0(kotlin.jvm.internal.OooOOOO oooOOOO) {
        return OooO(oooOOOO);
    }

    @Override // kotlin.jvm.internal.Oooo0
    public final InterfaceC34606OooOOOo OooOO0O(InterfaceC34595OooO0Oo interfaceC34595OooO0Oo) {
        List arguments = Collections.EMPTY_LIST;
        if (!(interfaceC34595OooO0Oo instanceof InterfaceC24016OooO0o0)) {
            return oO0O0.OooO0OO.OooO00o(interfaceC34595OooO0Oo, arguments, false, arguments);
        }
        Class<?> jClass = ((InterfaceC24016OooO0o0) interfaceC34595OooO0Oo).OooO();
        OooO0OO oooO0OO = OooO0O0.f116887OooO00o;
        kotlin.jvm.internal.OooOOO0.OooO0oO(jClass, "jClass");
        kotlin.jvm.internal.OooOOO0.OooO0oO(arguments, "arguments");
        if (arguments.isEmpty()) {
            return (InterfaceC34606OooOOOo) OooO0O0.f116889OooO0OO.OooO00o(jClass);
        }
        ConcurrentHashMap concurrentHashMap = (ConcurrentHashMap) OooO0O0.f116890OooO0Oo.OooO00o(jClass);
        C32443OooOOO c32443OooOOO = new C32443OooOOO(arguments, Boolean.FALSE);
        Object obj = concurrentHashMap.get(c32443OooOOO);
        if (obj == null) {
            C32567Oooo c32567OoooOooO00o = oO0O0.OooO0OO.OooO00o(OooO0O0.OooO00o(jClass), arguments, false, C34434OooOoO.f123453OooOo0o);
            Object objPutIfAbsent = concurrentHashMap.putIfAbsent(c32443OooOOO, c32567OoooOooO00o);
            obj = objPutIfAbsent == null ? c32567OoooOooO00o : objPutIfAbsent;
        }
        return (InterfaceC34606OooOOOo) obj;
    }
}
