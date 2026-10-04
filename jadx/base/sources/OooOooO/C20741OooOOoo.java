package OooOooO;

import Oooo0o0.C21009OooOooO;
import Oooo0oO.C21065OoooOOO;
import Oooo0oO.C21105o000OoO;
import Oooo0oO.InterfaceC21033OooOOOO;
import Oooo0oO.o000O0O0;
import Oooo0oO.o00oO0O;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcelable;
import android.util.Log;
import androidx.appcompat.widget.C21532OooOOo;
import androidx.fragment.app.C21904OooOoo0;
import com.google.android.gms.tasks.Task;
import com.huawei.hms.support.api.entity.auth.AuthCode;
import io.ktor.utils.p616io.C24005o00o0O;
import io.ktor.utils.p616io.InterfaceC23967Oooo00O;
import io.ktor.utils.p616io.InterfaceC23986Ooooo0o;
import java.io.Serializable;
import java.lang.reflect.Field;
import java.lang.reflect.Modifier;
import java.util.List;
import java.util.concurrent.CancellationException;
import oO00ooo.AbstractC32479OooO0OO;
import oO00ooo0.EnumC32485OooO00o;
import oO0O000o.InterfaceC32508OooOOOo;
import oO0O000o.InterfaceC32510OooOOo0;
import oO0O0OoO.C32708OooO00o;
import oO0o0OO.C33614OooOOO0;
import oO0o0OO.C33662Ooooooo;
import oO0o0oo.C33907OooO0O0;
import oO0o0oo.ExecutorC33906OooO00o;
import oOo0000O.InterfaceC34415OooO0oo;

/* JADX INFO: renamed from: OooOooO.OooOOoo, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C20741OooOOoo {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public static boolean f59587OooO00o = false;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public static String f59588OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public static final /* synthetic */ int f59589OooO0OO = 0;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public static final /* synthetic */ int f59590OooO0Oo = 0;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public static final /* synthetic */ int f59591OooO0o0 = 0;

    public static Bundle OooO00o(Bundle bundle, Object obj) {
        for (Class<?> superclass = obj.getClass(); superclass != null && superclass != Object.class; superclass = superclass.getSuperclass()) {
            for (Field field : superclass.getDeclaredFields()) {
                try {
                    OooO0Oo(obj, field, bundle);
                } catch (IllegalAccessException | IllegalArgumentException e) {
                    Log.e("MessageCodec", "encode, get value of the field exception, field name: " + field.getName(), e);
                }
            }
        }
        return bundle;
    }

    public static String OooO0O0() {
        int iOooO00o = o00OOOO0.OooO0O0.OooO00o(AuthCode.StatusCode.WAITING_CONNECT);
        return OooO0OO(o00OOOO0.OooO0O0.OooO0O0(iOooO00o), o00OOOO0.OooO0O0.OooO0OO(iOooO00o), "");
    }

    public static String OooO0OO(int i, String str, String str2) {
        return androidx.concurrent.futures.OooO00o.OooO0OO(C21009OooOooO.OooO0OO(i, "resultStatus={", "};memo={", str, "};result={"), str2, "}");
    }

    public static void OooO0Oo(Object obj, Field field, Bundle bundle) {
        if (Modifier.isTransient(field.getModifiers())) {
            return;
        }
        boolean zIsAccessible = field.isAccessible();
        field.setAccessible(true);
        OooO0o0(field.getName(), field.get(obj), bundle);
        field.setAccessible(zIsAccessible);
    }

    public static final Object OooO0o(Task task, AbstractC32479OooO0OO abstractC32479OooO0OO) throws Exception {
        if (!task.isComplete()) {
            C33614OooOOO0 c33614OooOOO0 = new C33614OooOOO0(1, C21904OooOoo0.OooO0o0(abstractC32479OooO0OO));
            c33614OooOOO0.OooOOoo();
            task.addOnCompleteListener(ExecutorC33906OooO00o.f122121OooOo0o, new C33907OooO0O0(c33614OooOOO0));
            Object objOooOOo = c33614OooOOO0.OooOOo();
            EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
            return objOooOOo;
        }
        Exception exception = task.getException();
        if (exception != null) {
            throw exception;
        }
        if (!task.isCanceled()) {
            return task.getResult();
        }
        throw new CancellationException("Task " + task + " was cancelled normally.");
    }

    public static void OooO0o0(String str, Object obj, Bundle bundle) {
        if (obj != null) {
            if (obj instanceof String) {
                bundle.putString(str, (String) obj);
                return;
            }
            if (obj instanceof Integer) {
                bundle.putInt(str, ((Integer) obj).intValue());
                return;
            }
            if (obj instanceof Short) {
                bundle.putShort(str, ((Short) obj).shortValue());
                return;
            }
            if (obj instanceof Long) {
                bundle.putLong(str, ((Long) obj).longValue());
                return;
            }
            if (obj instanceof Float) {
                bundle.putFloat(str, ((Float) obj).floatValue());
                return;
            }
            if (obj instanceof Double) {
                bundle.putDouble(str, ((Double) obj).doubleValue());
                return;
            }
            if (obj instanceof Boolean) {
                bundle.putBoolean(str, ((Boolean) obj).booleanValue());
                return;
            }
            if (obj instanceof CharSequence) {
                bundle.putCharSequence(str, (CharSequence) obj);
                return;
            }
            if (obj instanceof IBinder) {
                bundle.putBinder(str, (IBinder) obj);
                return;
            }
            if (obj instanceof Parcelable) {
                bundle.putParcelable(str, (Parcelable) obj);
                return;
            }
            if (obj instanceof byte[]) {
                bundle.putByteArray(str, (byte[]) obj);
                return;
            }
            if (obj instanceof List) {
                List list = (List) obj;
                Bundle bundle2 = new Bundle();
                bundle2.putInt("_val_type_", 1);
                bundle2.putInt("_list_size_", list.size());
                for (int i = 0; i < list.size(); i++) {
                    OooO0o0(C21532OooOOo.OooO0OO(i, "_list_item_"), list.get(i), bundle2);
                }
                bundle.putBundle(str, bundle2);
                return;
            }
            if (obj instanceof Serializable) {
                bundle.putSerializable(str, (Serializable) obj);
            } else if (obj.getClass() != Object.class) {
                Bundle bundle3 = new Bundle();
                OooO00o(bundle3, obj);
                bundle3.putInt("_val_type_", 0);
                bundle.putBundle(str, bundle3);
            }
        }
    }

    public static final o00oO0O OooO0oO(InterfaceC20736OooOOO0 interfaceC20736OooOOO0, InterfaceC21033OooOOOO interfaceC21033OooOOOO, int i) {
        kotlin.jvm.internal.OooOOO0.OooO0oO(interfaceC20736OooOOO0, "<this>");
        interfaceC21033OooOOOO.OooOo00(-1692965168);
        interfaceC21033OooOOOO.OooOo00(-492369756);
        Object objOooOo0 = interfaceC21033OooOOOO.OooOo0();
        Object obj = InterfaceC21033OooOOOO.OooO00o.f60894OooO00o;
        if (objOooOo0 == obj) {
            objOooOo0 = C21105o000OoO.OooO0OO(Boolean.FALSE, o000O0O0.f61218OooO00o);
            interfaceC21033OooOOOO.OooOOo0(objOooOo0);
        }
        interfaceC21033OooOOOO.OooOoo();
        o00oO0O o00oo0o = (o00oO0O) objOooOo0;
        interfaceC21033OooOOOO.OooOo00(511388516);
        boolean zOooO0oo = interfaceC21033OooOOOO.OooO0oo(interfaceC20736OooOOO0) | interfaceC21033OooOOOO.OooO0oo(o00oo0o);
        Object objOooOo02 = interfaceC21033OooOOOO.OooOo0();
        if (zOooO0oo || objOooOo02 == obj) {
            objOooOo02 = new C20739OooOOo(interfaceC20736OooOOO0, o00oo0o, null);
            interfaceC21033OooOOOO.OooOOo0(objOooOo02);
        }
        interfaceC21033OooOOOO.OooOoo();
        C21065OoooOOO.OooO0O0(interfaceC21033OooOOOO, interfaceC20736OooOOO0, (InterfaceC32508OooOOOo) objOooOo02);
        interfaceC21033OooOOOO.OooOoo();
        return o00oo0o;
    }

    public static final InterfaceC23967Oooo00O OooO0oo(InterfaceC23986Ooooo0o interfaceC23986Ooooo0o, InterfaceC34415OooO0oo context, Long l, InterfaceC32510OooOOo0 listener) {
        kotlin.jvm.internal.OooOOO0.OooO0oO(interfaceC23986Ooooo0o, "<this>");
        kotlin.jvm.internal.OooOOO0.OooO0oO(context, "context");
        kotlin.jvm.internal.OooOOO0.OooO0oO(listener, "listener");
        return C24005o00o0O.OooO0OO(C33662Ooooooo.f121350OooOo0o, context, true, new C32708OooO00o(l, interfaceC23986Ooooo0o, listener, null)).f80790OooOo;
    }
}
