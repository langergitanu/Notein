package o0OOO00o;

import java.util.Collection;
import java.util.Iterator;
import oO00ooo.AbstractC32479OooO0OO;
import oO00ooo.InterfaceC32482OooO0o0;

/* JADX INFO: renamed from: o0OOO00o.OooO0oo, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
@InterfaceC32482OooO0o0(m80622c = "com.orion.notein.data.repo.notemeta.NoteMetaRepoImpl", m80623f = "NoteMetaRepoImpl.kt", m80624l = {123}, m80625m = "getNoteMetasByIdSync")
public final class C26992OooO0oo extends AbstractC32479OooO0OO {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public String f93843OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public C26990OooO0o0 f93844OooOo0o;

    /* JADX INFO: renamed from: OooOoO, reason: collision with root package name */
    public Iterator f93845OooOoO;

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public Collection f93846OooOoO0;

    /* JADX INFO: renamed from: OooOoOO, reason: collision with root package name */
    public Collection f93847OooOoOO;

    /* JADX INFO: renamed from: OooOoo, reason: collision with root package name */
    public final /* synthetic */ C26990OooO0o0 f93848OooOoo;

    /* JADX INFO: renamed from: OooOoo0, reason: collision with root package name */
    public /* synthetic */ Object f93849OooOoo0;

    /* JADX INFO: renamed from: OooOooO, reason: collision with root package name */
    public int f93850OooOooO;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C26992OooO0oo(C26990OooO0o0 c26990OooO0o0, AbstractC32479OooO0OO abstractC32479OooO0OO) {
        super(abstractC32479OooO0OO);
        this.f93848OooOoo = c26990OooO0o0;
    }

    @Override // oO00ooo.AbstractC32477OooO00o
    public final Object invokeSuspend(Object obj) {
        this.f93849OooOoo0 = obj;
        this.f93850OooOooO |= Integer.MIN_VALUE;
        return this.f93848OooOoo.OooOOOO(null, null, this);
    }
}
