package o0OOoo0O;

import com.orion.notein.domain.models.material.Material;
import oO00ooo.AbstractC32479OooO0OO;
import oO00ooo.InterfaceC32482OooO0o0;

/* JADX INFO: renamed from: o0OOoo0O.OooOo0O, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
@InterfaceC32482OooO0o0(m80622c = "com.orion.notein.domain.usecase.material.GetMaterialStateUseCase", m80623f = "GetMaterialStateUseCase.kt", m80624l = {54, 62}, m80625m = "execute")
public final class C27853OooOo0O extends AbstractC32479OooO0OO {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public Material f98422OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public Object f98423OooOo0o;

    /* JADX INFO: renamed from: OooOoO, reason: collision with root package name */
    public /* synthetic */ Object f98424OooOoO;

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public int f98425OooOoO0;

    /* JADX INFO: renamed from: OooOoOO, reason: collision with root package name */
    public final /* synthetic */ C27851OooOo0 f98426OooOoOO;

    /* JADX INFO: renamed from: OooOoo0, reason: collision with root package name */
    public int f98427OooOoo0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C27853OooOo0O(C27851OooOo0 c27851OooOo0, AbstractC32479OooO0OO abstractC32479OooO0OO) {
        super(abstractC32479OooO0OO);
        this.f98426OooOoOO = c27851OooOo0;
    }

    @Override // oO00ooo.AbstractC32477OooO00o
    public final Object invokeSuspend(Object obj) {
        this.f98424OooOoO = obj;
        this.f98427OooOoo0 |= Integer.MIN_VALUE;
        return this.f98426OooOoOO.OooO00o(null, this);
    }
}
