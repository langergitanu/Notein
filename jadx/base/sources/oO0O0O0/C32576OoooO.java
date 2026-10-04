package oO0O0O0;

import java.lang.ref.WeakReference;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import o00Ooo.C25086OooOo0O;
import o00ooOo.C25785OooO0oO;
import o0oOOoOO.C30847OooO0Oo;
import oO000Oo.C31998OoooOoO;
import oO00ooO.C32460OooOooO;
import oO0O0O.C32524OooO0oo;
import oO0O0O.C32531OooOo0O;
import oO0O0O0o.C32591OooOO0o;
import oO0O0OO.C32618OooOooo;
import oO0O0OO.InterfaceC32635OoooOo0;
import oO0O0Oo0.C32674OooOOo0;
import oO0O0Oo0.C32692Oooo0o0;
import oO0O0o.C32711OooO00o;
import oO0O0o0O.C32716OooO;
import oO0O0o0O.C32717OooO00o;
import oO0O0o0O.C32720OooO0Oo;
import oO0O0o0O.C32721OooO0o;
import oO0O0o0O.C32724OooO0oo;
import oO0O0o0O.C32725OooOO0;
import oO0O0oO0.C32730OooO0Oo;
import oO0O0oOO.C32767OooO0oO;
import oO0O0oOO.InterfaceC32770OooOO0O;
import oO0O0ooo.C32875OooOo00;
import oO0OOO.C32934OooO0o0;
import oO0OOO.C32936OooO0oo;
import oO0OoO.C33227OooO00o;
import oO0OoO0.C33236OooO0o0;
import oO0OoO0.C33239OooOO0o;
import oO0OoO0.InterfaceC33241OooOOo;
import oO0OoO0.InterfaceC33242OooOOo0;
import oO0Ooo.C33308OooOOOo;
import oO0Ooo0.C33361OooO0Oo;
import oO0Ooo0.InterfaceC33372OooOO0o;
import oO0OooO.C33462OooOOO;
import oO0OooO.InterfaceC33463OooOOO0;
import oO0OooO0.C33479OooO0o;
import oOo000Oo.C34429OooOOo0;
import oOo000Oo.C34434OooOoO;
import oOo00OOo.C34492OooO;
import oOo00OOo.C34495OooO0OO;
import oOo00OOo.C34496OooO0Oo;
import oOo00OOo.C34497OooO0o;
import ooOOO0Oo.C35033OooO0o0;
import ooOOO0Oo.C35039OooOOo0;
import ooOOO0Oo.C35043OooOo0o;
import ooOOOoOo.InterfaceC35101OooO00o;
import ooOOOoOo.InterfaceC35103OooO0OO;
import ooo0o.C35191OooO0oO;
import ooo0o.InterfaceC35198OooOo0;

/* JADX INFO: renamed from: oO0O0O0.OoooO, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C32576OoooO {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public static final ConcurrentHashMap f117075OooO00o = new ConcurrentHashMap();

    public static final C32716OooO OooO00o(Class<?> cls) {
        InterfaceC35101OooO00o interfaceC35101OooO00oOooo0O0;
        InterfaceC35103OooO0OO interfaceC35103OooO0OOOooo0O0;
        kotlin.jvm.internal.OooOOO0.OooO0oO(cls, "<this>");
        ClassLoader classLoaderOooO0Oo = C32730OooO0Oo.OooO0Oo(cls);
        C32586Ooooo00 c32586Ooooo00 = new C32586Ooooo00(classLoaderOooO0Oo);
        ConcurrentHashMap concurrentHashMap = f117075OooO00o;
        WeakReference weakReference = (WeakReference) concurrentHashMap.get(c32586Ooooo00);
        if (weakReference != null) {
            C32716OooO c32716OooO = (C32716OooO) weakReference.get();
            if (c32716OooO != null) {
                return c32716OooO;
            }
            concurrentHashMap.remove(c32586Ooooo00, weakReference);
        }
        C32721OooO0o c32721OooO0o = new C32721OooO0o(classLoaderOooO0Oo);
        ClassLoader classLoader = C32460OooOooO.class.getClassLoader();
        kotlin.jvm.internal.OooOOO0.OooO0o(classLoader, "Unit::class.java.classLoader");
        C32721OooO0o c32721OooO0o2 = new C32721OooO0o(classLoader);
        C32720OooO0Oo c32720OooO0Oo = new C32720OooO0Oo(classLoaderOooO0Oo);
        String moduleName = "runtime module for " + classLoaderOooO0Oo;
        C32724OooO0oo c32724OooO0oo = C32724OooO0oo.f117651OooO0O0;
        C32725OooOO0 c32725OooOO0 = C32725OooOO0.f117652OooO00o;
        kotlin.jvm.internal.OooOOO0.OooO0oO(moduleName, "moduleName");
        C33361OooO0Oo c33361OooO0Oo = new C33361OooO0Oo("DeserializationComponentsForJava.ModuleData");
        C32524OooO0oo c32524OooO0oo = new C32524OooO0oo(c33361OooO0Oo);
        C32692Oooo0o0 c32692Oooo0o0 = new C32692Oooo0o0(C33479OooO0o.OooO0oO("<" + moduleName + '>'), c33361OooO0Oo, c32524OooO0oo, 56);
        InterfaceC33372OooOO0o interfaceC33372OooOO0o = c33361OooO0Oo.f120643OooO00o;
        interfaceC33372OooOO0o.lock();
        try {
            if (c32524OooO0oo.f117106OooO00o != null) {
                throw new AssertionError("Built-ins module is already set: " + c32524OooO0oo.f117106OooO00o + " (attempting to reset to " + c32692Oooo0o0 + ")");
            }
            c32524OooO0oo.f117106OooO00o = c32692Oooo0o0;
            interfaceC33372OooOO0o.unlock();
            c32524OooO0oo.f116850OooO0o = new oO0O0O.OooOO0O(c32692Oooo0o0);
            ooo0o.OooOO0 oooOO02 = new ooo0o.OooOO0();
            C34492OooO c34492OooO = new C34492OooO();
            C32618OooOooo c32618OooOooo = new C32618OooOooo(c33361OooO0Oo, c32692Oooo0o0);
            InterfaceC35198OooOo0.OooO00o oooO00o = InterfaceC35198OooOo0.OooO00o.f126385OooO00o;
            InterfaceC32770OooOO0O.OooO00o oooO00o2 = InterfaceC32770OooOO0O.f117737OooO00o;
            C32767OooO0oO c32767OooO0oO = C32767OooO0oO.f117732OooO00o;
            C34434OooOoO c34434OooOoO = C34434OooOoO.f123453OooOo0o;
            C25785OooO0oO c25785OooO0oO = new C25785OooO0oO(c33361OooO0Oo);
            InterfaceC32635OoooOo0.OooO00o oooO00o3 = InterfaceC32635OoooOo0.OooO00o.f117292OooO00o;
            oOo0o0oO.OooO00o oooO00o4 = oOo0o0oO.OooO00o.f123884OooO00o;
            C32591OooOO0o c32591OooOO0o = new C32591OooOO0o(c32692Oooo0o0, c32618OooOooo);
            C35043OooOo0o javaTypeEnhancementState = C35043OooOo0o.f125821OooO0Oo;
            kotlin.jvm.internal.OooOOO0.OooO0oO(javaTypeEnhancementState, "javaTypeEnhancementState");
            C35033OooO0o0 c35033OooO0o0 = new C35033OooO0o0(javaTypeEnhancementState);
            C34496OooO0Oo c34496OooO0Oo = C34496OooO0Oo.f123629OooO00o;
            C32875OooOo00 c32875OooOo00 = new C32875OooOo00();
            C35039OooOOo0 c35039OooOOo0 = C35039OooOOo0.f125807OooO00o;
            InterfaceC33463OooOOO0.f120931OooO0O0.getClass();
            C33462OooOOO c33462OooOOO = InterfaceC33463OooOOO0.OooO00o.f120933OooO0O0;
            C34497OooO0o c34497OooO0o = new C34497OooO0o(new C34495OooO0OO(c33361OooO0Oo, c32720OooO0Oo, c32721OooO0o, oooOO02, oooO00o2, c32724OooO0oo, c32767OooO0oO, c25785OooO0oO, c32725OooOO0, c34492OooO, oooO00o, oooO00o3, oooO00o4, c32692Oooo0o0, c32591OooOO0o, c35033OooO0o0, c32875OooOo00, c35039OooOOo0, c34496OooO0Oo, c33462OooOOO, javaTypeEnhancementState, new C30847OooO0Oo()));
            C32934OooO0o0 jvmMetadataVersion = C32934OooO0o0.f118820OooO0oO;
            kotlin.jvm.internal.OooOOO0.OooO0oO(jvmMetadataVersion, "jvmMetadataVersion");
            C25086OooOo0O c25086OooOo0O = new C25086OooOo0O();
            c25086OooOo0O.f85155OooO00o = c32721OooO0o;
            c25086OooOo0O.f85156OooO0O0 = oooOO02;
            C35191OooO0oO c35191OooO0oO = new C35191OooO0oO(c32692Oooo0o0, c32618OooOooo, c33361OooO0Oo, c32721OooO0o);
            c35191OooO0oO.f126339OooO0o = jvmMetadataVersion;
            List listOooO0oO = com.facebook.soloader.OooOo.OooO0oO(C33308OooOOOo.f120546OooO00o);
            oO0O0O0o.OooOO0 oooOO03 = c32692Oooo0o0.f117524OooOoO;
            C32524OooO0oo c32524OooO0oo2 = oooOO03 instanceof C32524OooO0oo ? (C32524OooO0oo) oooOO03 : null;
            ooo0o.OooOO0O oooOO0O = ooo0o.OooOO0O.f126366OooO00o;
            if (c32524OooO0oo2 == null || (interfaceC35101OooO00oOooo0O0 = c32524OooO0oo2.Oooo0O0()) == null) {
                interfaceC35101OooO00oOooo0O0 = InterfaceC35101OooO00o.C20380OooO00o.f126083OooO00o;
            }
            InterfaceC35101OooO00o interfaceC35101OooO00o = interfaceC35101OooO00oOooo0O0;
            if (c32524OooO0oo2 == null || (interfaceC35103OooO0OOOooo0O0 = c32524OooO0oo2.Oooo0O0()) == null) {
                interfaceC35103OooO0OOOooo0O0 = InterfaceC35103OooO0OO.OooO0O0.f126085OooO00o;
            }
            C33239OooOO0o c33239OooOO0o = new C33239OooOO0o(c33361OooO0Oo, c32692Oooo0o0, c25086OooOo0O, c35191OooO0oO, c34497OooO0o, c32724OooO0oo, oooOO0O, c34434OooOoO, c32618OooOooo, interfaceC35101OooO00o, interfaceC35103OooO0OOOooo0O0, C32936OooO0oo.f118827OooO00o, c33462OooOOO, new C25785OooO0oO(c33361OooO0Oo), listOooO0oO, 262144);
            oooOO02.f126365OooO00o = c33239OooOO0o;
            c34492OooO.f123600OooO0OO = new oO0Oo0.OooO0O0(c34497OooO0o);
            oO0O0O.OooOOO additionalClassPartsProvider = c32524OooO0oo.Oooo0O0();
            oO0O0O.OooOOO platformDependentDeclarationFilter = c32524OooO0oo.Oooo0O0();
            C25785OooO0oO c25785OooO0oO2 = new C25785OooO0oO(c33361OooO0Oo);
            kotlin.jvm.internal.OooOOO0.OooO0oO(additionalClassPartsProvider, "additionalClassPartsProvider");
            kotlin.jvm.internal.OooOOO0.OooO0oO(platformDependentDeclarationFilter, "platformDependentDeclarationFilter");
            C32531OooOo0O c32531OooOo0O = new C32531OooOo0O(c33361OooO0Oo, c32721OooO0o2, c32692Oooo0o0);
            C31998OoooOoO c31998OoooOoO = new C31998OoooOoO(c32531OooOo0O);
            C33227OooO00o c33227OooO00o = C33227OooO00o.f120239OooOOO0;
            c32531OooOo0O.f120245OooO0Oo = new C33239OooOO0o(c33361OooO0Oo, c32692Oooo0o0, c31998OoooOoO, new C33236OooO0o0(c32692Oooo0o0, c32618OooOooo, c33227OooO00o), c32531OooOo0O, InterfaceC33242OooOOo0.f120305OooO00o, InterfaceC33241OooOOo.OooO00o.f120304OooO00o, C34429OooOOo0.OooOO0o(new C32711OooO00o(c33361OooO0Oo, c32692Oooo0o0), new oO0O0O.OooO0o(c33361OooO0Oo, c32692Oooo0o0)), c32618OooOooo, additionalClassPartsProvider, platformDependentDeclarationFilter, c33227OooO00o.f120376OooO00o, c33462OooOOO, c25785OooO0oO2, null, 786432);
            c32692Oooo0o0.f117527OooOoo = new oO0O0Oo0.Oooo0(oOo000Oo.OooOOO.OoooOO0(new C32692Oooo0o0[]{c32692Oooo0o0}));
            c32692Oooo0o0.f117529OooOooO = new C32674OooOOo0(C34429OooOOo0.OooOO0o(c34497OooO0o, c32531OooOo0O), "CompositeProvider@RuntimeModuleData for " + c32692Oooo0o0);
            C32716OooO c32716OooO2 = new C32716OooO(c33239OooOO0o, new C32717OooO00o(oooOO02, c32721OooO0o));
            while (true) {
                WeakReference weakReference2 = (WeakReference) concurrentHashMap.putIfAbsent(c32586Ooooo00, new WeakReference(c32716OooO2));
                if (weakReference2 == null) {
                    return c32716OooO2;
                }
                C32716OooO c32716OooO3 = (C32716OooO) weakReference2.get();
                if (c32716OooO3 != null) {
                    return c32716OooO3;
                }
                concurrentHashMap.remove(c32586Ooooo00, weakReference2);
            }
        } finally {
        }
    }
}
