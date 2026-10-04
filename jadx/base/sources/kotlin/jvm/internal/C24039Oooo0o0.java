package kotlin.jvm.internal;

import Oooo0oO.o0Oo0oo;
import com.orion.notein.domain.models.cloudsync.CloudMetaExtra;
import java.util.AbstractCollection;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.Set;
import oO00ooO.InterfaceC32437OooO0o0;
import oO0O00.InterfaceC32497OooO0Oo;
import oO0O00.InterfaceC32498OooO0o0;
import oO0O000o.InterfaceC32503OooO0Oo;
import oO0O000o.InterfaceC32504OooO0o0;
import oO0O000o.InterfaceC32505OooO0oO;
import oO0O000o.InterfaceC32506OooO0oo;
import oO0O000o.InterfaceC32507OooOO0o;
import oO0O000o.InterfaceC32508OooOOOo;
import oO0O000o.InterfaceC32509OooOOo;
import oO0O000o.InterfaceC32510OooOOo0;
import oO0O000o.InterfaceC32511OooOOoo;
import oO0O000o.InterfaceC32512OooOo0;
import oO0O000o.InterfaceC32513OooOo0O;
import oO0O000o.InterfaceC32514OooOo0o;

/* JADX INFO: renamed from: kotlin.jvm.internal.Oooo0o0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C24039Oooo0o0 {
    public static Collection OooO00o(AbstractCollection abstractCollection) {
        if (!(abstractCollection instanceof oO0O00.OooO00o) || (abstractCollection instanceof oO0O00.OooO0O0)) {
            return abstractCollection;
        }
        OooO0oo(abstractCollection, "kotlin.collections.MutableCollection");
        throw null;
    }

    public static List OooO0O0(Object obj) {
        if ((obj instanceof oO0O00.OooO00o) && !(obj instanceof oO0O00.OooO0OO)) {
            OooO0oo(obj, "kotlin.collections.MutableList");
            throw null;
        }
        try {
            return (List) obj;
        } catch (ClassCastException e) {
            OooOOO0.OooOO0o(C24039Oooo0o0.class.getName(), e);
            throw e;
        }
    }

    public static Map OooO0OO(Object obj) {
        if ((obj instanceof oO0O00.OooO00o) && !(obj instanceof InterfaceC32497OooO0Oo)) {
            OooO0oo(obj, "kotlin.collections.MutableMap");
            throw null;
        }
        try {
            return (Map) obj;
        } catch (ClassCastException e) {
            OooOOO0.OooOO0o(C24039Oooo0o0.class.getName(), e);
            throw e;
        }
    }

    public static Set OooO0Oo(Object obj) {
        if ((obj instanceof oO0O00.OooO00o) && !(obj instanceof InterfaceC32498OooO0o0)) {
            OooO0oo(obj, "kotlin.collections.MutableSet");
            throw null;
        }
        try {
            return (Set) obj;
        } catch (ClassCastException e) {
            OooOOO0.OooOO0o(C24039Oooo0o0.class.getName(), e);
            throw e;
        }
    }

    public static boolean OooO0o(int i, Object obj) {
        if (obj instanceof InterfaceC32437OooO0o0) {
            if ((obj instanceof OooOO0 ? ((OooOO0) obj).getArity() : obj instanceof oO0O000o.OooO00o ? 0 : obj instanceof InterfaceC32507OooOO0o ? 1 : obj instanceof InterfaceC32508OooOOOo ? 2 : obj instanceof InterfaceC32510OooOOo0 ? 3 : obj instanceof InterfaceC32509OooOOo ? 4 : obj instanceof InterfaceC32511OooOOoo ? 5 : obj instanceof oO0O000o.OooOo00 ? 6 : obj instanceof InterfaceC32512OooOo0 ? 7 : obj instanceof InterfaceC32513OooOo0O ? 8 : obj instanceof InterfaceC32514OooOo0o ? 9 : obj instanceof oO0O000o.OooO0O0 ? 10 : obj instanceof oO0O000o.OooO0OO ? 11 : obj instanceof InterfaceC32503OooO0Oo ? 12 : obj instanceof InterfaceC32504OooO0o0 ? 13 : obj instanceof oO0O000o.OooO0o ? 14 : obj instanceof InterfaceC32505OooO0oO ? 15 : obj instanceof InterfaceC32506OooO0oo ? 16 : obj instanceof oO0O000o.OooO ? 17 : obj instanceof oO0O000o.OooOO0 ? 18 : obj instanceof oO0O000o.OooOO0O ? 19 : obj instanceof oO0O000o.OooOOO0 ? 20 : obj instanceof oO0O000o.OooOOO ? 21 : obj instanceof oO0O000o.OooOOOO ? 22 : -1) == i) {
                return true;
            }
        }
        return false;
    }

    public static void OooO0o0(int i, Object obj) {
        if (obj == null || OooO0o(i, obj)) {
            return;
        }
        OooO0oo(obj, "kotlin.jvm.functions.Function" + i);
        throw null;
    }

    public static boolean OooO0oO(Object obj) {
        if (obj instanceof List) {
            return !(obj instanceof oO0O00.OooO00o) || (obj instanceof oO0O00.OooO0OO);
        }
        return false;
    }

    public static void OooO0oo(Object obj, String str) {
        ClassCastException classCastException = new ClassCastException(o0Oo0oo.OooO0Oo(obj == null ? CloudMetaExtra.DEFINE_NON_PARENT_ID : obj.getClass().getName(), " cannot be cast to ", str));
        OooOOO0.OooOO0o(C24039Oooo0o0.class.getName(), classCastException);
        throw classCastException;
    }
}
