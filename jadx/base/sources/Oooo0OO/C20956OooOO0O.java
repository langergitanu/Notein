package Oooo0OO;

import OooOoOO.C20518OooO0OO;
import OooOoOO.C20519OooO0Oo;
import OooOoOO.C20529OooOOOO;
import Oooo0oO.C21105o000OoO;
import Oooo0oO.o000O0O0;
import OooooO0.C21290OooO0o0;
import androidx.compose.runtime.ParcelableSnapshotMutableState;
import oO00ooO.C32446OooOOOo;
import oO00ooO.C32460OooOooO;
import oO00ooo.AbstractC32479OooO0OO;
import oO00ooo0.EnumC32485OooO00o;
import oO0o0OO.C33621OooOo0;
import oO0o0OO.C33633Oooo0;

/* JADX INFO: renamed from: Oooo0OO.OooOO0O, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C20956OooOO0O {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public C21290OooO0o0 f60485OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final float f60486OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public final boolean f60487OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public Float f60488OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public C21290OooO0o0 f60489OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public Float f60490OooO0o0;

    /* JADX INFO: renamed from: OooOO0, reason: collision with root package name */
    public final C33621OooOo0 f60493OooOO0;

    /* JADX INFO: renamed from: OooOO0O, reason: collision with root package name */
    public final ParcelableSnapshotMutableState f60494OooOO0O;

    /* JADX INFO: renamed from: OooOO0o, reason: collision with root package name */
    public final ParcelableSnapshotMutableState f60495OooOO0o;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public final C20518OooO0OO<Float, C20529OooOOOO> f60491OooO0oO = C20519OooO0Oo.OooO00o(0.0f);

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    public final C20518OooO0OO<Float, C20529OooOOOO> f60492OooO0oo = C20519OooO0Oo.OooO00o(0.0f);

    /* JADX INFO: renamed from: OooO, reason: collision with root package name */
    public final C20518OooO0OO<Float, C20529OooOOOO> f60484OooO = C20519OooO0Oo.OooO00o(0.0f);

    public C20956OooOO0O(C21290OooO0o0 c21290OooO0o0, float f, boolean z) {
        this.f60485OooO00o = c21290OooO0o0;
        this.f60486OooO0O0 = f;
        this.f60487OooO0OO = z;
        C33621OooOo0 c33621OooOo0 = new C33621OooOo0(true);
        c33621OooOo0.Oooo0oO(null);
        this.f60493OooOO0 = c33621OooOo0;
        Boolean bool = Boolean.FALSE;
        o000O0O0 o000o0o02 = o000O0O0.f61218OooO00o;
        this.f60494OooOO0O = C21105o000OoO.OooO0OO(bool, o000o0o02);
        this.f60495OooOO0o = C21105o000OoO.OooO0OO(bool, o000o0o02);
    }

    /* JADX WARN: Code restructure failed: missing block: B:32:0x0084, code lost:
    
        if (r8 != r1) goto L34;
     */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0082  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object OooO00o(AbstractC32479OooO0OO abstractC32479OooO0OO) {
        C20954OooO0oo c20954OooO0oo;
        C20956OooOO0O c20956OooOO0O;
        Object objOooO0o0;
        if (abstractC32479OooO0OO instanceof C20954OooO0oo) {
            c20954OooO0oo = (C20954OooO0oo) abstractC32479OooO0OO;
            int i = c20954OooO0oo.f60478OooOoO;
            if ((i & Integer.MIN_VALUE) != 0) {
                c20954OooO0oo.f60478OooOoO = i - Integer.MIN_VALUE;
            } else {
                c20954OooO0oo = new C20954OooO0oo(this, abstractC32479OooO0OO);
            }
        }
        Object obj = c20954OooO0oo.f60476OooOo;
        Object obj2 = EnumC32485OooO00o.f116726OooOo0o;
        int i2 = c20954OooO0oo.f60478OooOoO;
        if (i2 == 0) {
            C32446OooOOOo.OooO0O0(obj);
            c20954OooO0oo.f60477OooOo0o = this;
            c20954OooO0oo.f60478OooOoO = 1;
            Object objOooO0o02 = C33633Oooo0.OooO0o0(new C20946OooO(this, null), c20954OooO0oo);
            if (objOooO0o02 != obj2) {
                objOooO0o02 = C32460OooOooO.f116667OooO00o;
            }
            if (objOooO0o02 != obj2) {
                c20956OooOO0O = this;
            }
            return obj2;
        }
        if (i2 == 1) {
            c20956OooOO0O = c20954OooO0oo.f60477OooOo0o;
            C32446OooOOOo.OooO0O0(obj);
        } else {
            if (i2 != 2) {
                if (i2 != 3) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C32446OooOOOo.OooO0O0(obj);
                return C32460OooOooO.f116667OooO00o;
            }
            c20956OooOO0O = c20954OooO0oo.f60477OooOo0o;
            C32446OooOOOo.OooO0O0(obj);
            c20954OooO0oo.f60477OooOo0o = null;
            c20954OooO0oo.f60478OooOoO = 3;
            c20956OooOO0O.getClass();
            objOooO0o0 = C33633Oooo0.OooO0o0(new C20955OooOO0(c20956OooOO0O, null), c20954OooO0oo);
            if (objOooO0o0 != obj2) {
                objOooO0o0 = C32460OooOooO.f116667OooO00o;
            }
        }
        c20956OooOO0O.f60494OooOO0O.setValue(Boolean.TRUE);
        c20954OooO0oo.f60477OooOo0o = c20956OooOO0O;
        c20954OooO0oo.f60478OooOoO = 2;
        if (c20956OooOO0O.f60493OooOO0.OooOo00(c20954OooO0oo) != obj2) {
            c20954OooO0oo.f60477OooOo0o = null;
            c20954OooO0oo.f60478OooOoO = 3;
            c20956OooOO0O.getClass();
            objOooO0o0 = C33633Oooo0.OooO0o0(new C20955OooOO0(c20956OooOO0O, null), c20954OooO0oo);
            if (objOooO0o0 != obj2) {
            }
        }
        return obj2;
    }
}
