package o0000oO0;

import Oooo0.C20892o0ooOO0;
import android.content.Context;
import com.facebook.soloader.OooOo;
import java.util.List;
import kotlin.jvm.internal.OooOOO0;
import o0000o0O.C24252OooO0oO;
import o0000o0O.C24277Oooo0o0;
import o0000o0O.C24278Oooo0oO;
import o0000o0O.OooOO0;
import o0000o0O.OooOOO;
import o0000o0o.C24305OooO00o;
import o0000oOO.AbstractC24338OooO0o0;
import o0000oOO.C24335OooO0OO;
import o0000oOO.C24339OooO0oO;
import oO0O000o.InterfaceC32507OooOO0o;
import oO0o0OO.InterfaceC33636Oooo00o;
import oOoo0.InterfaceC34602OooOO0o;

/* JADX INFO: renamed from: o0000oO0.OooO0OO, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C24326OooO0OO implements oO0O00o0.OooO0O0<Context, OooOO0<AbstractC24338OooO0o0>> {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final String f81891OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final InterfaceC32507OooOO0o<Context, List<o0000o0O.OooO0o<AbstractC24338OooO0o0>>> f81892OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public final InterfaceC33636Oooo00o f81893OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final Object f81894OooO0Oo = new Object();

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public volatile C24335OooO0OO f81895OooO0o0;

    public C24326OooO0OO(String str, InterfaceC32507OooOO0o interfaceC32507OooOO0o, InterfaceC33636Oooo00o interfaceC33636Oooo00o) {
        this.f81891OooO00o = str;
        this.f81892OooO0O0 = interfaceC32507OooOO0o;
        this.f81893OooO0OO = interfaceC33636Oooo00o;
    }

    @Override // oO0O00o0.OooO0O0
    public final OooOO0<AbstractC24338OooO0o0> getValue(Context context, InterfaceC34602OooOO0o property) {
        C24335OooO0OO c24335OooO0OO;
        Context thisRef = context;
        OooOOO0.OooO0oO(thisRef, "thisRef");
        OooOOO0.OooO0oO(property, "property");
        C24335OooO0OO c24335OooO0OO2 = this.f81895OooO0o0;
        if (c24335OooO0OO2 != null) {
            return c24335OooO0OO2;
        }
        synchronized (this.f81894OooO0Oo) {
            try {
                if (this.f81895OooO0o0 == null) {
                    Context applicationContext = thisRef.getApplicationContext();
                    InterfaceC32507OooOO0o<Context, List<o0000o0O.OooO0o<AbstractC24338OooO0o0>>> interfaceC32507OooOO0o = this.f81892OooO0O0;
                    OooOOO0.OooO0o(applicationContext, "applicationContext");
                    List<o0000o0O.OooO0o<AbstractC24338OooO0o0>> migrations = interfaceC32507OooOO0o.invoke(applicationContext);
                    InterfaceC33636Oooo00o interfaceC33636Oooo00o = this.f81893OooO0OO;
                    C24325OooO0O0 c24325OooO0O0 = new C24325OooO0O0(applicationContext, this);
                    OooOOO0.OooO0oO(migrations, "migrations");
                    this.f81895OooO0o0 = new C24335OooO0OO(new C24335OooO0OO(new OooOOO(new C24278Oooo0oO(C24339OooO0oO.f81923OooO00o, C24277Oooo0o0.f81701OooOo0o, new C20892o0ooOO0(c24325OooO0O0, 1)), OooOo.OooO0oO(new C24252OooO0oO(migrations, null)), new C24305OooO00o(), interfaceC33636Oooo00o)));
                }
                c24335OooO0OO = this.f81895OooO0o0;
                OooOOO0.OooO0Oo(c24335OooO0OO);
            } catch (Throwable th) {
                throw th;
            }
        }
        return c24335OooO0OO;
    }
}
