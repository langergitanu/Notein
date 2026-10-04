package o0Oo0oOo;

import com.orion.notein.p607ui.creative_library.C23040OooOOoo;
import kotlin.coroutines.Continuation;
import oO00ooo.AbstractC32479OooO0OO;
import oO00ooo.InterfaceC32482OooO0o0;

/* JADX INFO: renamed from: o0Oo0oOo.OoooOOo, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
@InterfaceC32482OooO0o0(m80622c = "com.orion.notein.ui.creative_library.CreativeLibrarySearchViewModel", m80623f = "CreativeLibrarySearchViewModel.kt", m80624l = {103, 104}, m80625m = "performSearch")
public final class C28353OoooOOo extends AbstractC32479OooO0OO {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public /* synthetic */ Object f100511OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public C23040OooOOoo f100512OooOo0o;

    /* JADX INFO: renamed from: OooOoO, reason: collision with root package name */
    public int f100513OooOoO;

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public final /* synthetic */ C23040OooOOoo f100514OooOoO0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C28353OoooOOo(C23040OooOOoo c23040OooOOoo, Continuation<? super C28353OoooOOo> continuation) {
        super(continuation);
        this.f100514OooOoO0 = c23040OooOOoo;
    }

    @Override // oO00ooo.AbstractC32477OooO00o
    public final Object invokeSuspend(Object obj) {
        this.f100511OooOo = obj;
        this.f100513OooOoO |= Integer.MIN_VALUE;
        return C23040OooOOoo.OooO0o0(this.f100514OooOoO0, null, this);
    }
}
