package o00OO0o0;

import android.os.Environment;
import android.util.Log;
import androidx.core.location.LocationRequestCompat;
import com.facebook.soloader.OooOo;
import io.ktor.utils.p616io.InterfaceC23986Ooooo0o;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.OooOOO0;
import o00OooO0.C25150OooO00o;
import oO000oOo.C32123OooO00o;
import oO000oOo.C32124OooO0O0;
import oO000oOo.C32125OooO0OO;
import oO00Oo0.C32266OooO0Oo;
import oO00ooO.C32446OooOOOo;
import oO00ooo.AbstractC32479OooO0OO;
import oO00ooo0.EnumC32485OooO00o;
import oO0Ooo.AbstractC33338OoooOO0;
import oO0Ooo.C33303OooOO0O;
import oO0Ooo.C33304OooOO0o;
import oO0Ooo.C33339OoooOOO;
import oOo0oooO.InterfaceC34588OooO0oO;
import ooOOOOOo.C35055OooO0o0;
import ooOOOOOo.OooO0o;

/* JADX INFO: renamed from: o00OO0o0.OooO0OO, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C24999OooO0OO {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public static final /* synthetic */ int f84815OooO00o = 0;

    public static boolean OooO00o() {
        String externalStorageState = Environment.getExternalStorageState();
        if (externalStorageState == null || externalStorageState.length() <= 0) {
            return false;
        }
        return (externalStorageState.equals("mounted") || externalStorageState.equals("mounted_ro")) && Environment.getExternalStorageDirectory() != null;
    }

    public static void OooO0O0(String str, String str2) {
        Log.e("SecurityComp10200303: ".concat(str), str2);
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0050  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x005e  */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$PrimitiveArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final C33339OoooOOO OooO0OO(C33339OoooOOO c33339OoooOOO, InterfaceC34588OooO0oO interfaceC34588OooO0oO) {
        C33339OoooOOO c33339OoooOOOOooO0OO;
        OooOOO0.OooO0oO(c33339OoooOOO, "<this>");
        if (C33304OooOO0o.OooO00o(c33339OoooOOO) == interfaceC34588OooO0oO) {
            return c33339OoooOOO;
        }
        C33303OooOO0O c33303OooOO0O = (C33303OooOO0O) C33304OooOO0o.f120541OooO0O0.getValue(c33339OoooOOO, C33304OooOO0o.f120540OooO00o[0]);
        if (c33303OooOO0O != null) {
            if (c33339OoooOOO.isEmpty()) {
                c33339OoooOOOOooO0OO = c33339OoooOOO;
                if (c33339OoooOOOOooO0OO != null) {
                    c33339OoooOOO = c33339OoooOOOOooO0OO;
                }
            } else {
                Iterable iterable = c33339OoooOOO.f126231OooOo0o;
                ArrayList arrayList = new ArrayList();
                for (Object obj : iterable) {
                    if (!OooOOO0.OooO0O0((AbstractC33338OoooOO0) obj, c33303OooOO0O)) {
                        arrayList.add(obj);
                    }
                }
                if (arrayList.size() != c33339OoooOOO.f126231OooOo0o.OooO0O0()) {
                    C33339OoooOOO.f120598OooOo.getClass();
                    c33339OoooOOOOooO0OO = C33339OoooOOO.OooO00o.OooO0OO(arrayList);
                }
                if (c33339OoooOOOOooO0OO != null) {
                }
            }
        }
        if (interfaceC34588OooO0oO.iterator().hasNext() || !interfaceC34588OooO0oO.isEmpty()) {
            C33303OooOO0O c33303OooOO0O2 = new C33303OooOO0O(interfaceC34588OooO0oO);
            if (c33339OoooOOO.f126231OooOo0o.get(C33339OoooOOO.f120598OooOo.OooO0O0(c33303OooOO0O2.OooO0O0())) == null) {
                return c33339OoooOOO.isEmpty() ? new C33339OoooOOO(OooOo.OooO0oO(c33303OooOO0O2)) : C33339OoooOOO.OooO00o.OooO0OO(oOo000Oo.OooOo.OooooOo(oOo000Oo.OooOo.o0ooOO0(c33339OoooOOO), c33303OooOO0O2));
            }
        }
        return c33339OoooOOO;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object OooO0Oo(ooOOOOOo.OooO0OO oooO0OO, AbstractC32479OooO0OO abstractC32479OooO0OO) {
        C35055OooO0o0 c35055OooO0o0;
        if (abstractC32479OooO0OO instanceof C35055OooO0o0) {
            c35055OooO0o0 = (C35055OooO0o0) abstractC32479OooO0OO;
            int i = c35055OooO0o0.f125921OooOoO0;
            if ((i & Integer.MIN_VALUE) != 0) {
                c35055OooO0o0.f125921OooOoO0 = i - Integer.MIN_VALUE;
            } else {
                c35055OooO0o0 = new C35055OooO0o0(abstractC32479OooO0OO);
            }
        }
        Object objOooOo0O = c35055OooO0o0.f125919OooOo;
        EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
        int i2 = c35055OooO0o0.f125921OooOoO0;
        if (i2 == 0) {
            C32446OooOOOo.OooO0O0(objOooOo0O);
            InterfaceC23986Ooooo0o interfaceC23986Ooooo0oOooO0O0 = oooO0OO.OooO0o0().OooO0O0();
            c35055OooO0o0.f125920OooOo0o = oooO0OO;
            c35055OooO0o0.f125921OooOoO0 = 1;
            objOooOo0O = interfaceC23986Ooooo0oOooO0O0.OooOo0O(LocationRequestCompat.PASSIVE_INTERVAL, c35055OooO0o0);
            if (objOooOo0O == enumC32485OooO00o) {
                return enumC32485OooO00o;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            oooO0OO = c35055OooO0o0.f125920OooOo0o;
            C32446OooOOOo.OooO0O0(objOooOo0O);
        }
        return new OooO0o(oooO0OO.f125913OooOo0o, oooO0OO.OooO0Oo(), oooO0OO.OooO0o0(), C25150OooO00o.OooO0oO((C32266OooO0Oo) objOooOo0O));
    }

    public static final C32123OooO00o OooO0o(ooOOOOOo.OooO0OO oooO0OO, InterfaceC23986Ooooo0o content) {
        OooOOO0.OooO0oO(oooO0OO, "<this>");
        OooOOO0.OooO0oO(content, "content");
        oO000o0.OooO0o client = oooO0OO.f125913OooOo0o;
        OooOOO0.OooO0oO(client, "client");
        C32123OooO00o c32123OooO00o = new C32123OooO00o(client);
        c32123OooO00o.f125912OooOo = new C32124OooO0O0(c32123OooO00o, oooO0OO.OooO0Oo());
        c32123OooO00o.f125914OooOoO0 = new C32125OooO0OO(c32123OooO00o, content, oooO0OO.OooO0o0());
        return c32123OooO00o;
    }

    public static final C33339OoooOOO OooO0o0(InterfaceC34588OooO0oO interfaceC34588OooO0oO) {
        OooOOO0.OooO0oO(interfaceC34588OooO0oO, "<this>");
        if (interfaceC34588OooO0oO.isEmpty()) {
            C33339OoooOOO.f120598OooOo.getClass();
            return C33339OoooOOO.f120599OooOoO0;
        }
        C33339OoooOOO.OooO00o oooO00o = C33339OoooOOO.f120598OooOo;
        List listOooO0oO = OooOo.OooO0oO(new C33303OooOO0O(interfaceC34588OooO0oO));
        oooO00o.getClass();
        return C33339OoooOOO.OooO00o.OooO0OO(listOooO0oO);
    }
}
