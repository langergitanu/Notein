package o0OO;

import java.util.Collection;
import java.util.Iterator;
import oO00ooo.AbstractC32479OooO0OO;
import oO00ooo.InterfaceC32482OooO0o0;

/* JADX INFO: renamed from: o0OO.OooO0o0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
@InterfaceC32482OooO0o0(m80622c = "com.orion.notein.data.repo.note.NoteContentLocalDataSource", m80623f = "NoteContentLocalDataSource.kt", m80624l = {45}, m80625m = "getNoteContentsByIdsSync")
public final class C26406OooO0o0 extends AbstractC32479OooO0OO {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public Collection f90637OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public OooOOO f90638OooOo0o;

    /* JADX INFO: renamed from: OooOoO, reason: collision with root package name */
    public /* synthetic */ Object f90639OooOoO;

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public Iterator f90640OooOoO0;

    /* JADX INFO: renamed from: OooOoOO, reason: collision with root package name */
    public final /* synthetic */ OooOOO f90641OooOoOO;

    /* JADX INFO: renamed from: OooOoo0, reason: collision with root package name */
    public int f90642OooOoo0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C26406OooO0o0(OooOOO oooOOO, AbstractC32479OooO0OO abstractC32479OooO0OO) {
        super(abstractC32479OooO0OO);
        this.f90641OooOoOO = oooOOO;
    }

    @Override // oO00ooo.AbstractC32477OooO00o
    public final Object invokeSuspend(Object obj) {
        this.f90639OooOoO = obj;
        this.f90642OooOoo0 |= Integer.MIN_VALUE;
        return this.f90641OooOoOO.OooO00o(null, this);
    }
}
