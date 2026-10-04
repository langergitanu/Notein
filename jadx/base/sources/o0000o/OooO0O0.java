package o0000o;

import OooOoOO.C20519OooO0Oo;
import android.content.Context;
import android.content.SharedPreferences;
import java.io.IOException;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import kotlin.jvm.internal.OooOOO0;
import o0000o0O.OooO;
import o0000o0O.OooO0o;
import o0000oO0.C24330OooO0oO;
import o0000oO0.C24331OooO0oo;
import oO00ooO.C32446OooOOOo;
import oO00ooO.C32447OooOOo;
import oO00ooO.C32460OooOooO;
import oO00ooo.AbstractC32479OooO0OO;
import oO00ooo0.EnumC32485OooO00o;
import oOo000Oo.OooOo;

/* JADX INFO: loaded from: classes.dex */
public final class OooO0O0<T> implements OooO0o<T> {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final C24331OooO0oo f81506OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final C24330OooO0oO f81507OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public final Context f81508OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final String f81509OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public final Set<String> f81510OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final C32447OooOOo f81511OooO0o0;

    public static final class OooO00o {
        public static final boolean OooO00o(Context context, String name) {
            OooOOO0.OooO0oO(context, "context");
            OooOOO0.OooO0oO(name, "name");
            return context.deleteSharedPreferences(name);
        }
    }

    public OooO0O0(Context context, String sharedPreferencesName, Set keysToMigrate, C24331OooO0oo c24331OooO0oo, C24330OooO0oO c24330OooO0oO) {
        OooOOO0.OooO0oO(context, "context");
        OooOOO0.OooO0oO(sharedPreferencesName, "sharedPreferencesName");
        OooOOO0.OooO0oO(keysToMigrate, "keysToMigrate");
        C24244OooO00o c24244OooO00o = new C24244OooO00o(context, sharedPreferencesName);
        this.f81506OooO00o = c24331OooO0oo;
        this.f81507OooO0O0 = c24330OooO0oO;
        this.f81508OooO0OO = context;
        this.f81509OooO0Oo = sharedPreferencesName;
        this.f81511OooO0o0 = C20519OooO0Oo.OooO0OO(c24244OooO00o);
        this.f81510OooO0o = keysToMigrate == C24245OooO0Oo.f81516OooO00o ? null : OooOo.o0Oo0oo(keysToMigrate);
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x006a  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // o0000o0O.OooO0o
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object OooO00o(Object obj, AbstractC32479OooO0OO abstractC32479OooO0OO) {
        OooO0OO oooO0OO;
        OooO0O0<T> oooO0O0;
        if (abstractC32479OooO0OO instanceof OooO0OO) {
            oooO0OO = (OooO0OO) abstractC32479OooO0OO;
            int i = oooO0OO.f81514OooOoO;
            if ((i & Integer.MIN_VALUE) != 0) {
                oooO0OO.f81514OooOoO = i - Integer.MIN_VALUE;
            } else {
                oooO0OO = new OooO0OO(this, abstractC32479OooO0OO);
            }
        }
        Object objInvoke = oooO0OO.f81512OooOo;
        EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
        int i2 = oooO0OO.f81514OooOoO;
        boolean z = true;
        if (i2 == 0) {
            C32446OooOOOo.OooO0O0(objInvoke);
            oooO0OO.f81513OooOo0o = this;
            oooO0OO.f81514OooOoO = 1;
            objInvoke = this.f81506OooO00o.invoke(obj, oooO0OO);
            if (objInvoke == enumC32485OooO00o) {
                return enumC32485OooO00o;
            }
            oooO0O0 = this;
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            oooO0O0 = oooO0OO.f81513OooOo0o;
            C32446OooOOOo.OooO0O0(objInvoke);
        }
        if (!((Boolean) objInvoke).booleanValue()) {
            return Boolean.FALSE;
        }
        Set<String> set = oooO0O0.f81510OooO0o;
        C32447OooOOo c32447OooOOo = oooO0O0.f81511OooO0o0;
        if (set == null) {
            Map<String, ?> all = ((SharedPreferences) c32447OooOOo.getValue()).getAll();
            OooOOO0.OooO0o(all, "sharedPrefs.all");
            if (all.isEmpty()) {
                z = false;
            }
        } else {
            Set<String> set2 = set;
            SharedPreferences sharedPreferences = (SharedPreferences) c32447OooOOo.getValue();
            if (!(set2 instanceof Collection) || !set2.isEmpty()) {
                Iterator<T> it = set2.iterator();
                while (it.hasNext()) {
                    if (sharedPreferences.contains((String) it.next())) {
                        break;
                    }
                }
                z = false;
            }
        }
        return Boolean.valueOf(z);
    }

    @Override // o0000o0O.OooO0o
    public final Object OooO0O0(Object obj, OooO oooO) {
        return this.f81507OooO0O0.invoke(new C24246OooO0o0((SharedPreferences) this.f81511OooO0o0.getValue(), this.f81510OooO0o), obj, oooO);
    }

    @Override // o0000o0O.OooO0o
    public final C32460OooOooO cleanUp() throws IOException {
        Context context;
        String str;
        C32447OooOOo c32447OooOOo = this.f81511OooO0o0;
        SharedPreferences.Editor editorEdit = ((SharedPreferences) c32447OooOOo.getValue()).edit();
        Set<String> set = this.f81510OooO0o;
        if (set == null) {
            editorEdit.clear();
        } else {
            Iterator<T> it = set.iterator();
            while (it.hasNext()) {
                editorEdit.remove((String) it.next());
            }
        }
        if (!editorEdit.commit()) {
            throw new IOException("Unable to delete migrated keys from SharedPreferences.");
        }
        if (((SharedPreferences) c32447OooOOo.getValue()).getAll().isEmpty() && (context = this.f81508OooO0OO) != null && (str = this.f81509OooO0Oo) != null) {
            OooO00o.OooO00o(context, str);
        }
        if (set != null) {
            set.clear();
        }
        return C32460OooOooO.f116667OooO00o;
    }
}
