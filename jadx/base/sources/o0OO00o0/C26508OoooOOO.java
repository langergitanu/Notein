package o0OO00o0;

import com.orion.notein.data.p602db.entity.DualLinkRefEntity;
import java.util.Collection;
import java.util.Iterator;
import oO00ooo.AbstractC32479OooO0OO;
import oO00ooo.InterfaceC32482OooO0o0;

/* JADX INFO: renamed from: o0OO00o0.OoooOOO, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
@InterfaceC32482OooO0o0(m80622c = "com.orion.notein.data.repo.DualLinkRepoImpl", m80623f = "DualLinkRepoImpl.kt", m80624l = {127, 129}, m80625m = "getDualLinkRefImagesByNoteIdSync")
public final class C26508OoooOOO extends AbstractC32479OooO0OO {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public String f91121OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public C26515OooooO0 f91122OooOo0o;

    /* JADX INFO: renamed from: OooOoO, reason: collision with root package name */
    public Iterator f91123OooOoO;

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public Collection f91124OooOoO0;

    /* JADX INFO: renamed from: OooOoOO, reason: collision with root package name */
    public DualLinkRefEntity f91125OooOoOO;

    /* JADX INFO: renamed from: OooOoo, reason: collision with root package name */
    public final /* synthetic */ C26515OooooO0 f91126OooOoo;

    /* JADX INFO: renamed from: OooOoo0, reason: collision with root package name */
    public /* synthetic */ Object f91127OooOoo0;

    /* JADX INFO: renamed from: OooOooO, reason: collision with root package name */
    public int f91128OooOooO;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C26508OoooOOO(C26515OooooO0 c26515OooooO0, AbstractC32479OooO0OO abstractC32479OooO0OO) {
        super(abstractC32479OooO0OO);
        this.f91126OooOoo = c26515OooooO0;
    }

    @Override // oO00ooo.AbstractC32477OooO00o
    public final Object invokeSuspend(Object obj) {
        this.f91127OooOoo0 = obj;
        this.f91128OooOooO |= Integer.MIN_VALUE;
        return this.f91126OooOoo.OooO(null, this);
    }
}
