package o0OOo0o;

import com.orion.notein.domain.models.note.PdfInfo;
import oO00ooo.AbstractC32479OooO0OO;
import oO00ooo.InterfaceC32482OooO0o0;

/* JADX INFO: renamed from: o0OOo0o.o000oo0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
@InterfaceC32482OooO0o0(m80622c = "com.orion.notein.domain.usecase.NoteUseCase", m80623f = "NoteUseCase.kt", m80624l = {2319, 2323, 2324, 2328}, m80625m = "appendExtraInfoToNoteMetaById")
public final class C27431o000oo0 extends AbstractC32479OooO0OO {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public String f95783OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public C27449o00O0OoO f95784OooOo0o;

    /* JADX INFO: renamed from: OooOoO, reason: collision with root package name */
    public int f95785OooOoO;

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public PdfInfo f95786OooOoO0;

    /* JADX INFO: renamed from: OooOoOO, reason: collision with root package name */
    public /* synthetic */ Object f95787OooOoOO;

    /* JADX INFO: renamed from: OooOoo, reason: collision with root package name */
    public int f95788OooOoo;

    /* JADX INFO: renamed from: OooOoo0, reason: collision with root package name */
    public final /* synthetic */ C27449o00O0OoO f95789OooOoo0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C27431o000oo0(C27449o00O0OoO c27449o00O0OoO, AbstractC32479OooO0OO abstractC32479OooO0OO) {
        super(abstractC32479OooO0OO);
        this.f95789OooOoo0 = c27449o00O0OoO;
    }

    @Override // oO00ooo.AbstractC32477OooO00o
    public final Object invokeSuspend(Object obj) {
        this.f95787OooOoOO = obj;
        this.f95788OooOoo |= Integer.MIN_VALUE;
        return C27449o00O0OoO.OooO00o(this.f95789OooOoo0, null, this);
    }
}
