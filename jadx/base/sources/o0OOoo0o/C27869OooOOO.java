package o0OOoo0o;

import java.util.List;
import o000o0Oo.C24610OooO0O0;
import o0OO00o0.C26612o00OOOo0;
import o0OO00o0.C26613o00OOOoO;
import o0OO00o0.C26620o00Oo00o;
import o0OOOO0o.C27129OoooOOO;
import o0OOo0Oo.InterfaceC27309OooOoO;
import o0OOo0Oo.InterfaceC27313OooOoo0;
import oO00ooO.C32446OooOOOo;
import oO00ooO.C32460OooOooO;
import oO00ooo.AbstractC32479OooO0OO;
import oO00ooo0.EnumC32485OooO00o;
import oO0o0OO.C33609OooO0oo;
import oO0o0OO.C33649OoooOOo;
import oO0o0o0o.C33874OooO0OO;
import oO0o0o0o.ExecutorC33873OooO0O0;
import oOO00oo.C34406OooO00o;

/* JADX INFO: renamed from: o0OOoo0o.OooOOO, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C27869OooOOO {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final C26620o00Oo00o f98487OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final InterfaceC27313OooOoo0 f98488OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public final InterfaceC27309OooOoO f98489OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final C27129OoooOOO f98490OooO0Oo;

    public C27869OooOOO(C26620o00Oo00o c26620o00Oo00o, InterfaceC27313OooOoo0 noteMetaRepo, InterfaceC27309OooOoO noteContentRepo, C27129OoooOOO c27129OoooOOO) {
        kotlin.jvm.internal.OooOOO0.OooO0oO(noteMetaRepo, "noteMetaRepo");
        kotlin.jvm.internal.OooOOO0.OooO0oO(noteContentRepo, "noteContentRepo");
        this.f98487OooO00o = c26620o00Oo00o;
        this.f98488OooO0O0 = noteMetaRepo;
        this.f98489OooO0OO = noteContentRepo;
        this.f98490OooO0Oo = c27129OoooOOO;
    }

    public final Object OooO00o(String str, List list, AbstractC32479OooO0OO abstractC32479OooO0OO) throws Throwable {
        C33874OooO0OO c33874OooO0OO = C33649OoooOOo.f121328OooO00o;
        Object objOooO0o = C33609OooO0oo.OooO0o(ExecutorC33873OooO0O0.f122045OooOoO0, new C27860OooO0OO(this, list, str, null), abstractC32479OooO0OO);
        return objOooO0o == EnumC32485OooO00o.f116726OooOo0o ? objOooO0o : C32460OooOooO.f116667OooO00o;
    }

    public final Object OooO0O0(String str, String str2, AbstractC32479OooO0OO abstractC32479OooO0OO) {
        C33874OooO0OO c33874OooO0OO = C33649OoooOOo.f121328OooO00o;
        return C33609OooO0oo.OooO0o(ExecutorC33873OooO0O0.f122045OooOoO0, new C27863OooO0o0(this, str, str2, null), abstractC32479OooO0OO);
    }

    public final Object OooO0OO(String str, AbstractC32479OooO0OO abstractC32479OooO0OO) throws Throwable {
        if (!C24610OooO0O0.f83393OooO00o) {
            C33874OooO0OO c33874OooO0OO = C33649OoooOOo.f121328OooO00o;
            Object objOooO0o = C33609OooO0oo.OooO0o(ExecutorC33873OooO0O0.f122045OooOoO0, new C27866OooOO0(this, str, null), abstractC32479OooO0OO);
            return objOooO0o == EnumC32485OooO00o.f116726OooOo0o ? objOooO0o : C32460OooOooO.f116667OooO00o;
        }
        C34406OooO00o.C20358OooO00o c20358OooO00o = C34406OooO00o.f123390OooO00o;
        c20358OooO00o.OooOOO0("OutlineUseCase");
        c20358OooO00o.OooOO0O("skipNoteMetaWriteInEditor enabled, skip noteId=%s", str);
        return C32460OooOooO.f116667OooO00o;
    }

    /* JADX WARN: Code restructure failed: missing block: B:27:0x006c, code lost:
    
        if (r7.OooO0OO(r9, r0) == r1) goto L28;
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object OooO0Oo(String str, String str2, String str3, AbstractC32479OooO0OO abstractC32479OooO0OO) {
        C27868OooOO0o c27868OooOO0o;
        C27869OooOOO c27869OooOOO;
        if (abstractC32479OooO0OO instanceof C27868OooOO0o) {
            c27868OooOO0o = (C27868OooOO0o) abstractC32479OooO0OO;
            int i = c27868OooOO0o.f98486OooOoOO;
            if ((i & Integer.MIN_VALUE) != 0) {
                c27868OooOO0o.f98486OooOoOO = i - Integer.MIN_VALUE;
            } else {
                c27868OooOO0o = new C27868OooOO0o(this, abstractC32479OooO0OO);
            }
        }
        Object obj = c27868OooOO0o.f98485OooOoO0;
        EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
        int i2 = c27868OooOO0o.f98486OooOoOO;
        if (i2 == 0) {
            C32446OooOOOo.OooO0O0(obj);
            c27868OooOO0o.f98483OooOo0o = this;
            c27868OooOO0o.f98482OooOo = str3;
            c27868OooOO0o.f98486OooOoOO = 1;
            C26613o00OOOoO c26613o00OOOoO = this.f98487OooO00o.f91878OooO00o;
            c26613o00OOOoO.getClass();
            Object objOooO00o = c26613o00OOOoO.OooO00o(str3, new C26612o00OOOo0(str, str2, null));
            if (objOooO00o != enumC32485OooO00o) {
                objOooO00o = C32460OooOooO.f116667OooO00o;
            }
            if (objOooO00o != enumC32485OooO00o) {
                objOooO00o = C32460OooOooO.f116667OooO00o;
            }
            if (objOooO00o != enumC32485OooO00o) {
                c27869OooOOO = this;
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
        str3 = c27868OooOO0o.f98482OooOo;
        c27869OooOOO = c27868OooOO0o.f98483OooOo0o;
        C32446OooOOOo.OooO0O0(obj);
        c27868OooOO0o.f98483OooOo0o = null;
        c27868OooOO0o.f98482OooOo = null;
        c27868OooOO0o.f98486OooOoOO = 2;
    }

    public final Object OooO0o0(String str, List list, AbstractC32479OooO0OO abstractC32479OooO0OO) throws Throwable {
        C33874OooO0OO c33874OooO0OO = C33649OoooOOo.f121328OooO00o;
        Object objOooO0o = C33609OooO0oo.OooO0o(ExecutorC33873OooO0O0.f122045OooOoO0, new C27870OooOOO0(this, list, str, null), abstractC32479OooO0OO);
        return objOooO0o == EnumC32485OooO00o.f116726OooOo0o ? objOooO0o : C32460OooOooO.f116667OooO00o;
    }
}
