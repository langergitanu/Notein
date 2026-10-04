package o0OOoOo0;

import o0OOo0Oo.InterfaceC27306OooOo00;
import oO00ooO.C32446OooOOOo;
import oO00ooO.C32460OooOooO;
import oO00ooo.AbstractC32479OooO0OO;
import oO00ooo0.EnumC32485OooO00o;

/* JADX INFO: renamed from: o0OOoOo0.OooO0oO, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C27799OooO0oO {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final InterfaceC27306OooOo00 f98197OooO00o;

    public C27799OooO0oO(InterfaceC27306OooOo00 labelRepo) {
        kotlin.jvm.internal.OooOOO0.OooO0oO(labelRepo, "labelRepo");
        this.f98197OooO00o = labelRepo;
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x0058, code lost:
    
        if (r8.OooO0o0(r6, r0) == r1) goto L22;
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object OooO00o(long j, AbstractC32479OooO0OO abstractC32479OooO0OO) {
        C27797OooO0o c27797OooO0o;
        C27799OooO0oO c27799OooO0oO;
        if (abstractC32479OooO0OO instanceof C27797OooO0o) {
            c27797OooO0o = (C27797OooO0o) abstractC32479OooO0OO;
            int i = c27797OooO0o.f98195OooOoOO;
            if ((i & Integer.MIN_VALUE) != 0) {
                c27797OooO0o.f98195OooOoOO = i - Integer.MIN_VALUE;
            } else {
                c27797OooO0o = new C27797OooO0o(this, abstractC32479OooO0OO);
            }
        }
        Object obj = c27797OooO0o.f98194OooOoO0;
        EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
        int i2 = c27797OooO0o.f98195OooOoOO;
        if (i2 == 0) {
            C32446OooOOOo.OooO0O0(obj);
            c27797OooO0o.f98192OooOo0o = this;
            c27797OooO0o.f98191OooOo = j;
            c27797OooO0o.f98195OooOoOO = 1;
            if (this.f98197OooO00o.OooO(j, c27797OooO0o) != enumC32485OooO00o) {
                c27799OooO0oO = this;
            }
            return enumC32485OooO00o;
        }
        if (i2 != 1) {
            if (i2 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C32446OooOOOo.OooO0O0(obj);
            return C32460OooOooO.f116667OooO00o;
        }
        j = c27797OooO0o.f98191OooOo;
        c27799OooO0oO = c27797OooO0o.f98192OooOo0o;
        C32446OooOOOo.OooO0O0(obj);
        InterfaceC27306OooOo00 interfaceC27306OooOo00 = c27799OooO0oO.f98197OooO00o;
        c27797OooO0o.f98192OooOo0o = null;
        c27797OooO0o.f98195OooOoOO = 2;
    }

    public final Object OooO0O0(int i, long j, String str, String str2, AbstractC32479OooO0OO abstractC32479OooO0OO) {
        Object objOooOO0o = this.f98197OooO00o.OooOO0o(i, j, str, str2, abstractC32479OooO0OO);
        return objOooOO0o == EnumC32485OooO00o.f116726OooOo0o ? objOooOO0o : C32460OooOooO.f116667OooO00o;
    }
}
