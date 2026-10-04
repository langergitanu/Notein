package o0OOO00o;

import java.util.Collection;
import java.util.Iterator;
import oO00ooo.AbstractC32479OooO0OO;
import oO00ooo.InterfaceC32482OooO0o0;

/* JADX INFO: renamed from: o0OOO00o.OooOO0o, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
@InterfaceC32482OooO0o0(m80622c = "com.orion.notein.data.repo.notemeta.NoteMetaRepoImpl", m80623f = "NoteMetaRepoImpl.kt", m80624l = {99}, m80625m = "getNoteNamesByIdSync")
public final class C26993OooOO0o extends AbstractC32479OooO0OO {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public String f93862OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public C26990OooO0o0 f93863OooOo0o;

    /* JADX INFO: renamed from: OooOoO, reason: collision with root package name */
    public Iterator f93864OooOoO;

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public Collection f93865OooOoO0;

    /* JADX INFO: renamed from: OooOoOO, reason: collision with root package name */
    public /* synthetic */ Object f93866OooOoOO;

    /* JADX INFO: renamed from: OooOoo, reason: collision with root package name */
    public int f93867OooOoo;

    /* JADX INFO: renamed from: OooOoo0, reason: collision with root package name */
    public final /* synthetic */ C26990OooO0o0 f93868OooOoo0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C26993OooOO0o(C26990OooO0o0 c26990OooO0o0, AbstractC32479OooO0OO abstractC32479OooO0OO) {
        super(abstractC32479OooO0OO);
        this.f93868OooOoo0 = c26990OooO0o0;
    }

    @Override // oO00ooo.AbstractC32477OooO00o
    public final Object invokeSuspend(Object obj) {
        this.f93866OooOoOO = obj;
        this.f93867OooOoo |= Integer.MIN_VALUE;
        return this.f93868OooOoo0.OooOOOo(null, null, this);
    }
}
