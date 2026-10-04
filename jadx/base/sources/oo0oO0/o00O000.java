package oo0oO0;

import java.util.Iterator;
import kotlin.coroutines.Continuation;
import oO00ooo.AbstractC32479OooO0OO;
import oO00ooo.InterfaceC32482OooO0o0;

/* JADX INFO: loaded from: classes9.dex */
@InterfaceC32482OooO0o0(m80622c = "com.orion.notein.data.db.dao.NoteAndFolderSortDao", m80623f = "NoteAndFolderSortDao.kt", m80624l = {39, 42}, m80625m = "updateNoteSortKey$suspendImpl")
public final class o00O000 extends AbstractC32479OooO0OO {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public Object f125245OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public AbstractC34938o00oOoo f125246OooOo0o;

    /* JADX INFO: renamed from: OooOoO, reason: collision with root package name */
    public /* synthetic */ Object f125247OooOoO;

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public Iterator f125248OooOoO0;

    /* JADX INFO: renamed from: OooOoOO, reason: collision with root package name */
    public final /* synthetic */ AbstractC34938o00oOoo f125249OooOoOO;

    /* JADX INFO: renamed from: OooOoo0, reason: collision with root package name */
    public int f125250OooOoo0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o00O000(AbstractC34938o00oOoo abstractC34938o00oOoo, Continuation<? super o00O000> continuation) {
        super(continuation);
        this.f125249OooOoOO = abstractC34938o00oOoo;
    }

    @Override // oO00ooo.AbstractC32477OooO00o
    public final Object invokeSuspend(Object obj) {
        this.f125247OooOoO = obj;
        this.f125250OooOoo0 |= Integer.MIN_VALUE;
        return AbstractC34938o00oOoo.OooOO0(this.f125249OooOoOO, null, null, this);
    }
}
