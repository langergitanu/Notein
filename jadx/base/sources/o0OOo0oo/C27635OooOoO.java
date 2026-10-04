package o0OOo0oo;

import o0000oOO.AbstractC24338OooO0o0;
import o0000oOO.C24332OooO;
import o0000oOO.C24340OooO0oo;
import o00o00O0.C25252OooO0Oo;
import o0O0oooO.AbstractApplicationC26277OooOoOO;
import o0OOo0o0.InterfaceC27605OooO00o;
import o0OOooO0.EnumC27953o00000Oo;
import o0Oo00oO.C28037OooO0OO;
import oO00ooO.C32446OooOOOo;
import oO00ooO.C32460OooOooO;
import oO00ooo.AbstractC32479OooO0OO;
import oO00ooo0.EnumC32485OooO00o;

/* JADX INFO: renamed from: o0OOo0oo.OooOoO, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C27635OooOoO {

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public static final EnumC27953o00000Oo f97182OooO0o0 = EnumC27953o00000Oo.f98990OooOo;

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final InterfaceC27605OooO00o f97183OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final o0000o0O.OooOO0<AbstractC24338OooO0o0> f97184OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public final AbstractApplicationC26277OooOoOO f97185OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final AbstractC24338OooO0o0.OooO00o<Integer> f97186OooO0Oo;

    public C27635OooOoO(InterfaceC27605OooO00o repo, o0000o0O.OooOO0 preferences, AbstractApplicationC26277OooOoOO abstractApplicationC26277OooOoOO) {
        kotlin.jvm.internal.OooOOO0.OooO0oO(repo, "repo");
        kotlin.jvm.internal.OooOOO0.OooO0oO(preferences, "preferences");
        this.f97183OooO00o = repo;
        this.f97184OooO0O0 = preferences;
        this.f97185OooO0OO = abstractApplicationC26277OooOoOO;
        this.f97186OooO0Oo = C24340OooO0oo.OooO0OO("cloud_sync_mode");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object OooO00o(AbstractC32479OooO0OO abstractC32479OooO0OO) {
        C27632OooOo00 c27632OooOo00;
        C27635OooOoO c27635OooOoO;
        if (abstractC32479OooO0OO instanceof C27632OooOo00) {
            c27632OooOo00 = (C27632OooOo00) abstractC32479OooO0OO;
            int i = c27632OooOo00.f97169OooOoO;
            if ((i & Integer.MIN_VALUE) != 0) {
                c27632OooOo00.f97169OooOoO = i - Integer.MIN_VALUE;
            } else {
                c27632OooOo00 = new C27632OooOo00(this, abstractC32479OooO0OO);
            }
        }
        Object objOooO0O0 = c27632OooOo00.f97167OooOo;
        Object obj = EnumC32485OooO00o.f116726OooOo0o;
        int i2 = c27632OooOo00.f97169OooOoO;
        boolean z = true;
        if (i2 == 0) {
            C32446OooOOOo.OooO0O0(objOooO0O0);
            c27632OooOo00.f97168OooOo0o = this;
            c27632OooOo00.f97169OooOoO = 1;
            objOooO0O0 = OooO0O0(c27632OooOo00);
            if (objOooO0O0 == obj) {
                return obj;
            }
            c27635OooOoO = this;
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            c27635OooOoO = c27632OooOo00.f97168OooOo0o;
            C32446OooOOOo.OooO0O0(objOooO0O0);
        }
        boolean z2 = objOooO0O0 != EnumC27953o00000Oo.f98991OooOo0o;
        if (C28037OooO0OO.OooO0OO(c27635OooOoO.f97185OooO0OO) && !z2) {
            z = false;
        }
        return Boolean.valueOf(z);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Enum OooO0O0(AbstractC32479OooO0OO abstractC32479OooO0OO) {
        C27633OooOo0O c27633OooOo0O;
        C27635OooOoO c27635OooOoO;
        if (abstractC32479OooO0OO instanceof C27633OooOo0O) {
            c27633OooOo0O = (C27633OooOo0O) abstractC32479OooO0OO;
            int i = c27633OooOo0O.f97173OooOoO;
            if ((i & Integer.MIN_VALUE) != 0) {
                c27633OooOo0O.f97173OooOoO = i - Integer.MIN_VALUE;
            } else {
                c27633OooOo0O = new C27633OooOo0O(this, abstractC32479OooO0OO);
            }
        }
        Object objOooOo00 = c27633OooOo0O.f97171OooOo;
        EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
        int i2 = c27633OooOo0O.f97173OooOoO;
        if (i2 == 0) {
            C32446OooOOOo.OooO0O0(objOooOo00);
            C27631OooOo0 c27631OooOo0 = new C27631OooOo0(this.f97184OooO0O0.getData(), this);
            c27633OooOo0O.f97172OooOo0o = this;
            c27633OooOo0O.f97173OooOoO = 1;
            objOooOo00 = C25252OooO0Oo.OooOo00(c27631OooOo0, c27633OooOo0O);
            if (objOooOo00 == enumC32485OooO00o) {
                return enumC32485OooO00o;
            }
            c27635OooOoO = this;
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            c27635OooOoO = c27633OooOo0O.f97172OooOo0o;
            C32446OooOOOo.OooO0O0(objOooOo00);
        }
        Integer num = (Integer) objOooOo00;
        if (num == null) {
            return f97182OooO0o0;
        }
        int iIntValue = num.intValue();
        c27635OooOoO.getClass();
        return iIntValue != 0 ? iIntValue != 1 ? EnumC27953o00000Oo.f98990OooOo : EnumC27953o00000Oo.f98990OooOo : EnumC27953o00000Oo.f98991OooOo0o;
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x005f, code lost:
    
        if (r8.OooOoOO(r7, r0) == r1) goto L22;
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object OooO0OO(EnumC27953o00000Oo enumC27953o00000Oo, AbstractC32479OooO0OO abstractC32479OooO0OO) {
        C27630OooOo c27630OooOo;
        C27635OooOoO c27635OooOoO;
        if (abstractC32479OooO0OO instanceof C27630OooOo) {
            c27630OooOo = (C27630OooOo) abstractC32479OooO0OO;
            int i = c27630OooOo.f97159OooOoOO;
            if ((i & Integer.MIN_VALUE) != 0) {
                c27630OooOo.f97159OooOoOO = i - Integer.MIN_VALUE;
            } else {
                c27630OooOo = new C27630OooOo(this, abstractC32479OooO0OO);
            }
        }
        Object obj = c27630OooOo.f97158OooOoO0;
        EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
        int i2 = c27630OooOo.f97159OooOoOO;
        if (i2 == 0) {
            C32446OooOOOo.OooO0O0(obj);
            C27636OooOoO0 c27636OooOoO0 = new C27636OooOoO0(this, enumC27953o00000Oo, null);
            c27630OooOo.f97156OooOo0o = this;
            c27630OooOo.f97155OooOo = enumC27953o00000Oo;
            c27630OooOo.f97159OooOoOO = 1;
            if (C24332OooO.OooO00o(this.f97184OooO0O0, c27636OooOoO0, c27630OooOo) != enumC32485OooO00o) {
                c27635OooOoO = this;
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
        enumC27953o00000Oo = c27630OooOo.f97155OooOo;
        c27635OooOoO = c27630OooOo.f97156OooOo0o;
        C32446OooOOOo.OooO0O0(obj);
        InterfaceC27605OooO00o interfaceC27605OooO00o = c27635OooOoO.f97183OooO00o;
        c27630OooOo.f97156OooOo0o = null;
        c27630OooOo.f97155OooOo = null;
        c27630OooOo.f97159OooOoOO = 2;
    }
}
