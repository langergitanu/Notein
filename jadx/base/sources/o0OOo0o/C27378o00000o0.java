package o0OOo0o;

import com.orion.notein.domain.models.page.Page;
import java.util.Iterator;
import oO00ooo.AbstractC32479OooO0OO;
import oO00ooo.InterfaceC32482OooO0o0;

/* JADX INFO: renamed from: o0OOo0o.o00000o0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
@InterfaceC32482OooO0o0(m80622c = "com.orion.notein.domain.usecase.NoteCreationUseCase", m80623f = "NoteCreationUseCase.kt", m80624l = {660}, m80625m = "createAllPageThumbnailsInNote")
public final class C27378o00000o0 extends AbstractC32479OooO0OO {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public Iterator f95380OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public o000OO f95381OooOo0o;

    /* JADX INFO: renamed from: OooOoO, reason: collision with root package name */
    public /* synthetic */ Object f95382OooOoO;

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public Page f95383OooOoO0;

    /* JADX INFO: renamed from: OooOoOO, reason: collision with root package name */
    public final /* synthetic */ o000OO f95384OooOoOO;

    /* JADX INFO: renamed from: OooOoo0, reason: collision with root package name */
    public int f95385OooOoo0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C27378o00000o0(o000OO o000oo2, AbstractC32479OooO0OO abstractC32479OooO0OO) {
        super(abstractC32479OooO0OO);
        this.f95384OooOoOO = o000oo2;
    }

    @Override // oO00ooo.AbstractC32477OooO00o
    public final Object invokeSuspend(Object obj) {
        this.f95382OooOoO = obj;
        this.f95385OooOoo0 |= Integer.MIN_VALUE;
        return this.f95384OooOoOO.OooO00o(null, this);
    }
}
