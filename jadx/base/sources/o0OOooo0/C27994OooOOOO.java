package o0OOooo0;

import java.util.List;
import o000O00.C24378OooOoO0;
import o000o0Oo.C24610OooO0O0;
import o0OOOO0o.C27129OoooOOO;
import o0OOo0Oo.InterfaceC27309OooOoO;
import o0OOo0Oo.InterfaceC27313OooOoo0;
import o0OOo0o.C27434o000oo0o;
import o0OOoO.C27710OooO0oo;
import o0OOoo0o.C27869OooOOO;
import oO00ooO.C32460OooOooO;
import oO00ooo.AbstractC32476OooO;
import oO00ooo.AbstractC32479OooO0OO;
import oO00ooo0.EnumC32485OooO00o;
import oO0o0OO.C33609OooO0oo;
import oO0o0OO.C33649OoooOOo;
import oO0o0o0o.C33874OooO0OO;
import oO0o0o0o.ExecutorC33873OooO0O0;
import oOO00oo.C34406OooO00o;

/* JADX INFO: renamed from: o0OOooo0.OooOOOO, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C27994OooOOOO {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final C24378OooOoO0 f99260OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final InterfaceC27313OooOoo0 f99261OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public final InterfaceC27309OooOoO f99262OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final C27129OoooOOO f99263OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public final C27869OooOOO f99264OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final C27710OooO0oo f99265OooO0o0;

    public C27994OooOOOO(C24378OooOoO0 c24378OooOoO0, InterfaceC27313OooOoo0 noteMetaRepo, InterfaceC27309OooOoO noteContentRepo, C27129OoooOOO c27129OoooOOO, C27710OooO0oo c27710OooO0oo, C27869OooOOO c27869OooOOO) {
        kotlin.jvm.internal.OooOOO0.OooO0oO(noteMetaRepo, "noteMetaRepo");
        kotlin.jvm.internal.OooOOO0.OooO0oO(noteContentRepo, "noteContentRepo");
        this.f99260OooO00o = c24378OooOoO0;
        this.f99261OooO0O0 = noteMetaRepo;
        this.f99262OooO0OO = noteContentRepo;
        this.f99263OooO0Oo = c27129OoooOOO;
        this.f99265OooO0o0 = c27710OooO0oo;
        this.f99264OooO0o = c27869OooOOO;
    }

    public static final Object OooO00o(C27994OooOOOO c27994OooOOOO, String str, AbstractC32476OooO abstractC32476OooO) throws Throwable {
        c27994OooOOOO.getClass();
        if (!C24610OooO0O0.f83393OooO00o) {
            C33874OooO0OO c33874OooO0OO = C33649OoooOOo.f121328OooO00o;
            Object objOooO0o = C33609OooO0oo.OooO0o(ExecutorC33873OooO0O0.f122045OooOoO0, new C27992OooOOO(c27994OooOOOO, str, null), abstractC32476OooO);
            return objOooO0o == EnumC32485OooO00o.f116726OooOo0o ? objOooO0o : C32460OooOooO.f116667OooO00o;
        }
        C34406OooO00o.C20358OooO00o c20358OooO00o = C34406OooO00o.f123390OooO00o;
        c20358OooO00o.OooOOO0("QuoteUseCase");
        c20358OooO00o.OooOO0O("skipNoteMetaWriteInEditor enabled, skip noteId=%s", str);
        return C32460OooOooO.f116667OooO00o;
    }

    public final Object OooO0O0(String str, String str2, C27434o000oo0o c27434o000oo0o) {
        C33874OooO0OO c33874OooO0OO = C33649OoooOOo.f121328OooO00o;
        return C33609OooO0oo.OooO0o(ExecutorC33873OooO0O0.f122045OooOoO0, new C27980OooO(this, str, str2, null), c27434o000oo0o);
    }

    public final Object OooO0OO(List list, String str, C27434o000oo0o c27434o000oo0o) {
        C33874OooO0OO c33874OooO0OO = C33649OoooOOo.f121328OooO00o;
        return C33609OooO0oo.OooO0o(ExecutorC33873OooO0O0.f122045OooOoO0, new C27990OooOO0O(this, list, str, null), c27434o000oo0o);
    }

    public final Object OooO0Oo(String str, List list, AbstractC32479OooO0OO abstractC32479OooO0OO) throws Throwable {
        C33874OooO0OO c33874OooO0OO = C33649OoooOOo.f121328OooO00o;
        Object objOooO0o = C33609OooO0oo.OooO0o(ExecutorC33873OooO0O0.f122045OooOoO0, new C27993OooOOO0(this, list, str, null), abstractC32479OooO0OO);
        return objOooO0o == EnumC32485OooO00o.f116726OooOo0o ? objOooO0o : C32460OooOooO.f116667OooO00o;
    }
}
