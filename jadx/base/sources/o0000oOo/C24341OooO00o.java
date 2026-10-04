package o0000oOo;

import Oooo0.C20892o0ooOO0;
import OooooO0.C21294OooOO0O;
import android.content.Context;
import com.facebook.soloader.OooOo;
import java.io.File;
import java.util.ArrayList;
import kotlin.jvm.internal.OooOOO0;
import kotlin.jvm.internal.OooOOOO;
import o0000o0O.C24252OooO0oO;
import o0000o0O.C24277Oooo0o0;
import o0000o0O.C24278Oooo0oO;
import o0000o0O.OooOOO;
import o0000o0o.C24305OooO00o;
import o0000oOO.AbstractC24338OooO0o0;
import o0000oOO.C24335OooO0OO;
import o0000oOO.C24339OooO0oO;
import o0000oo0.C24356OooO0O0;
import oO00o00.OooO0OO;
import oO00oOO.C32416OooO0OO;
import oO00oOo.C32428OooO00o;
import oO0o0OO.C33633Oooo0;
import oO0o0Ooo.C33822OooO0OO;
import oO0o0o0O.C33869OooOOO;
import oOo0000O.InterfaceC34415OooO0oo;

/* JADX INFO: renamed from: o0000oOo.OooO00o, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C24341OooO00o {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final Context f81925OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final String f81926OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public final C32416OooO0OO f81927OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final ArrayList f81928OooO0Oo;

    /* JADX INFO: renamed from: o0000oOo.OooO00o$OooO00o, reason: collision with other inner class name */
    public static final class C19610OooO00o extends OooOOOO implements oO0O000o.OooO00o<File> {

        /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
        public final /* synthetic */ String f81929OooOo;

        /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
        public final /* synthetic */ Context f81930OooOo0o;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C19610OooO00o(Context context, String str) {
            super(0);
            this.f81930OooOo0o = context;
            this.f81929OooOo = str;
        }

        @Override // oO0O000o.OooO00o
        public final File invoke() {
            return C21294OooOO0O.OooO0Oo(this.f81930OooOo0o, this.f81929OooOo);
        }
    }

    public C24341OooO00o(Context context, String str) {
        OooOOO0.OooO0oO(context, "context");
        C32416OooO0OO c32416OooO0OO = C32428OooO00o.f116617OooO00o;
        OooOOO0.OooO0o(c32416OooO0OO, "io()");
        this.f81927OooO0OO = c32416OooO0OO;
        this.f81928OooO0Oo = new ArrayList();
        this.f81925OooO00o = context;
        this.f81926OooO0O0 = str;
    }

    public final C24356OooO0O0<AbstractC24338OooO0o0> OooO00o() {
        String str;
        C33822OooO0OO c33822OooO0OOOooO00o = C33633Oooo0.OooO00o(InterfaceC34415OooO0oo.OooO00o.OooO00o(new C33869OooOOO(this.f81927OooO0OO), OooO0OO.OooO00o()));
        Context context = this.f81925OooO00o;
        if (context == null || (str = this.f81926OooO0O0) == null) {
            throw new IllegalStateException("Either produceFile or context and name must be set. This should never happen.");
        }
        ArrayList migrations = this.f81928OooO0Oo;
        C19610OooO00o c19610OooO00o = new C19610OooO00o(context, str);
        OooOOO0.OooO0oO(migrations, "migrations");
        return new C24356OooO0O0<>(new C24335OooO0OO(new C24335OooO0OO(new OooOOO(new C24278Oooo0oO(C24339OooO0oO.f81923OooO00o, C24277Oooo0o0.f81701OooOo0o, new C20892o0ooOO0(c19610OooO00o, 1)), OooOo.OooO0oO(new C24252OooO0oO(migrations, null)), new C24305OooO00o(), c33822OooO0OOOooO00o))), c33822OooO0OOOooO00o);
    }
}
