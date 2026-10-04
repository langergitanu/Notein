package o0Oo0oOo;

import com.orion.notein.domain.models.material.Material;
import com.orion.notein.p607ui.creative_library.C23040OooOOoo;
import oO00ooo.AbstractC32479OooO0OO;
import oO00ooo.InterfaceC32482OooO0o0;

/* JADX INFO: renamed from: o0Oo0oOo.o000oOoO, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
@InterfaceC32482OooO0o0(m80622c = "com.orion.notein.ui.creative_library.CreativeLibrarySearchViewModel", m80623f = "CreativeLibrarySearchViewModel.kt", m80624l = {195}, m80625m = "buildCreativeMaterialItem")
public final class C28371o000oOoO extends AbstractC32479OooO0OO {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public String f100572OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public Material f100573OooOo0o;

    /* JADX INFO: renamed from: OooOoO, reason: collision with root package name */
    public /* synthetic */ Object f100574OooOoO;

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public boolean f100575OooOoO0;

    /* JADX INFO: renamed from: OooOoOO, reason: collision with root package name */
    public final /* synthetic */ C23040OooOOoo f100576OooOoOO;

    /* JADX INFO: renamed from: OooOoo0, reason: collision with root package name */
    public int f100577OooOoo0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C28371o000oOoO(C23040OooOOoo c23040OooOOoo, AbstractC32479OooO0OO abstractC32479OooO0OO) {
        super(abstractC32479OooO0OO);
        this.f100576OooOoOO = c23040OooOOoo;
    }

    @Override // oO00ooo.AbstractC32477OooO00o
    public final Object invokeSuspend(Object obj) {
        this.f100574OooOoO = obj;
        this.f100577OooOoo0 |= Integer.MIN_VALUE;
        return this.f100576OooOoOO.OooO0o(null, null, false, this);
    }
}
