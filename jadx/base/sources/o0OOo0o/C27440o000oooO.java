package o0OOo0o;

import com.orion.notein.domain.models.note.Note;
import oO00ooo.AbstractC32479OooO0OO;
import oO00ooo.InterfaceC32482OooO0o0;

/* JADX INFO: renamed from: o0OOo0o.o000oooO, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
@InterfaceC32482OooO0o0(m80622c = "com.orion.notein.domain.usecase.NoteUseCase", m80623f = "NoteUseCase.kt", m80624l = {2348, 2350, 2351}, m80625m = "createNote")
public final class C27440o000oooO extends AbstractC32479OooO0OO {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public Note f95854OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public C27449o00O0OoO f95855OooOo0o;

    /* JADX INFO: renamed from: OooOoO, reason: collision with root package name */
    public /* synthetic */ Object f95856OooOoO;

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public String f95857OooOoO0;

    /* JADX INFO: renamed from: OooOoOO, reason: collision with root package name */
    public final /* synthetic */ C27449o00O0OoO f95858OooOoOO;

    /* JADX INFO: renamed from: OooOoo0, reason: collision with root package name */
    public int f95859OooOoo0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C27440o000oooO(C27449o00O0OoO c27449o00O0OoO, AbstractC32479OooO0OO abstractC32479OooO0OO) {
        super(abstractC32479OooO0OO);
        this.f95858OooOoOO = c27449o00O0OoO;
    }

    @Override // oO00ooo.AbstractC32477OooO00o
    public final Object invokeSuspend(Object obj) {
        this.f95856OooOoO = obj;
        this.f95859OooOoo0 |= Integer.MIN_VALUE;
        return this.f95858OooOoOO.OooOO0(null, this);
    }
}
