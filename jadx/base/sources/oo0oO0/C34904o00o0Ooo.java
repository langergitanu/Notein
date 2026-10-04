package oo0oO0;

import java.util.List;
import kotlin.coroutines.Continuation;
import oO00ooo.AbstractC32479OooO0OO;
import oO00ooo.InterfaceC32482OooO0o0;

/* JADX INFO: renamed from: oo0oO0.o00o0Ooo, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
@InterfaceC32482OooO0o0(m80622c = "com.orion.notein.data.db.dao.PageLayerDao", m80623f = "PageLayerDao.kt", m80624l = {48, 49}, m80625m = "setPageLayers$suspendImpl")
public final class C34904o00o0Ooo extends AbstractC32479OooO0OO {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public List f125470OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public AbstractC34903o00o0OoO f125471OooOo0o;

    /* JADX INFO: renamed from: OooOoO, reason: collision with root package name */
    public final /* synthetic */ AbstractC34903o00o0OoO f125472OooOoO;

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public /* synthetic */ Object f125473OooOoO0;

    /* JADX INFO: renamed from: OooOoOO, reason: collision with root package name */
    public int f125474OooOoOO;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C34904o00o0Ooo(AbstractC34903o00o0OoO abstractC34903o00o0OoO, Continuation<? super C34904o00o0Ooo> continuation) {
        super(continuation);
        this.f125472OooOoO = abstractC34903o00o0OoO;
    }

    @Override // oO00ooo.AbstractC32477OooO00o
    public final Object invokeSuspend(Object obj) {
        this.f125473OooOoO0 = obj;
        this.f125474OooOoOO |= Integer.MIN_VALUE;
        return AbstractC34903o00o0OoO.OooOooO(this.f125472OooOoO, null, null, this);
    }
}
