package com.orion.notein.p607ui.creative_library;

import androidx.lifecycle.o0OoOo0;
import com.alibaba.sdk.android.oss.internal.OooO00o;
import com.aspose.words.StyleIdentifier;
import com.orion.notein.domain.models.material.Material;
import com.orion.notein.domain.models.material.MaterialActionType;
import com.orion.notein.p607ui.creative_library.C23028OooO0Oo;
import kotlin.coroutines.Continuation;
import o00o00O0.C25252OooO0Oo;
import o0OO00o0.o000Oo0;
import o0OOoo0O.C27849OooOOoo;
import o0OOoo0O.C27852OooOo00;
import o0Oo0oOo.C28325OooOo0;
import oO00ooO.C32446OooOOOo;
import oO00ooO.C32460OooOooO;
import oO00ooo.AbstractC32476OooO;
import oO00ooo.InterfaceC32482OooO0o0;
import oO00ooo0.EnumC32485OooO00o;
import oO0O000o.InterfaceC32508OooOOOo;
import oO0o0OO.C33609OooO0oo;
import oO0o0OO.InterfaceC33636Oooo00o;
import oO0o0Oo.C33770OooooO0;
import oO0o0Oo.C33772OooooOo;
import oOO00oo.C34406OooO00o;

/* JADX INFO: renamed from: com.orion.notein.ui.creative_library.OooO0oo, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
@InterfaceC32482OooO0o0(m80622c = "com.orion.notein.ui.creative_library.CreativeLibraryDetailViewModel$onActionClicked$1", m80623f = "CreativeLibraryDetailViewModel.kt", m80624l = {StyleIdentifier.GRID_TABLE_3_ACCENT_1, StyleIdentifier.GRID_TABLE_2_ACCENT_2}, m80625m = "invokeSuspend")
public final class C23032OooO0oo extends AbstractC32476OooO implements InterfaceC32508OooOOOo<InterfaceC33636Oooo00o, Continuation<? super C32460OooOooO>, Object> {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public final /* synthetic */ C23028OooO0Oo.C19176OooO0Oo f71062OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public int f71063OooOo0o;

    /* JADX INFO: renamed from: OooOoO, reason: collision with root package name */
    public final /* synthetic */ C23028OooO0Oo f71064OooOoO;

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public final /* synthetic */ Material f71065OooOoO0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C23032OooO0oo(C23028OooO0Oo.C19176OooO0Oo c19176OooO0Oo, Material material, C23028OooO0Oo c23028OooO0Oo, Continuation<? super C23032OooO0oo> continuation) {
        super(2, continuation);
        this.f71062OooOo = c19176OooO0Oo;
        this.f71065OooOoO0 = material;
        this.f71064OooOoO = c23028OooO0Oo;
    }

    @Override // oO00ooo.AbstractC32477OooO00o
    public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
        return new C23032OooO0oo(this.f71062OooOo, this.f71065OooOoO0, this.f71064OooOoO, continuation);
    }

    @Override // oO0O000o.InterfaceC32508OooOOOo
    public final Object invoke(InterfaceC33636Oooo00o interfaceC33636Oooo00o, Continuation<? super C32460OooOooO> continuation) {
        return ((C23032OooO0oo) create(interfaceC33636Oooo00o, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x0054, code lost:
    
        if (r10.emit(r1, r9) == r0) goto L20;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x007c, code lost:
    
        if (r10 == r0) goto L20;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x007e, code lost:
    
        return r0;
     */
    @Override // oO00ooo.AbstractC32477OooO00o
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
        int i = this.f71063OooOo0o;
        C23028OooO0Oo c23028OooO0Oo = this.f71064OooOoO;
        if (i == 0) {
            C32446OooOOOo.OooO0O0(obj);
            C23028OooO0Oo.C19176OooO0Oo c19176OooO0Oo = this.f71062OooOo;
            MaterialActionType materialActionType = c19176OooO0Oo.f71040OooOOOO;
            MaterialActionType materialActionType2 = MaterialActionType.GO_TO_CREATE;
            Material material = this.f71065OooOoO0;
            if (materialActionType == materialActionType2) {
                C34406OooO00o.C20358OooO00o c20358OooO00o = C34406OooO00o.f123390OooO00o;
                c20358OooO00o.OooOOO0("CreativeLibraryDetailVM");
                c20358OooO00o.OooO00o(OooO00o.OooO00o("GO_TO_CREATE clicked: ", material.getTitle()), new Object[0]);
                C33772OooooOo c33772OooooOo = c23028OooO0Oo.f71012OooOO0o;
                C23028OooO0Oo.OooO0OO.OooO0O0 oooO0O0 = new C23028OooO0Oo.OooO0OO.OooO0O0(material.getId());
                this.f71063OooOo0o = 1;
            } else if (c19176OooO0Oo.f71043OooOOo0) {
                C34406OooO00o.C20358OooO00o c20358OooO00o2 = C34406OooO00o.f123390OooO00o;
                c20358OooO00o2.OooOOO0("CreativeLibraryDetailVM");
                c20358OooO00o2.OooO00o(OooO00o.OooO00o("Material already applied: ", material.getTitle()), new Object[0]);
            } else {
                String id = material.getId();
                this.f71063OooOo0o = 2;
                obj = c23028OooO0Oo.f71006OooO0o.OooO00o(id, this);
            }
        } else if (i == 1) {
            C32446OooOOOo.OooO0O0(obj);
        } else {
            if (i != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C32446OooOOOo.OooO0O0(obj);
            if (((Boolean) obj).booleanValue()) {
                String str = c23028OooO0Oo.f71015OooOOOO;
                if (str != null) {
                    C33609OooO0oo.OooO0OO(o0OoOo0.OooO00o(c23028OooO0Oo), null, null, new C23030OooO0o0(c23028OooO0Oo, str, null), 3);
                }
            } else {
                Material material2 = c23028OooO0Oo.f71013OooOOO;
                if (material2 != null) {
                    C27852OooOo00 c27852OooOo00 = c23028OooO0Oo.f71009OooO0oo;
                    c27852OooOo00.getClass();
                    C25252OooO0Oo.OooOo0o(new o000Oo0(new C33770OooooO0(new C27849OooOOoo(c27852OooOo00, material2, null)), new C28325OooOo0(material2, c23028OooO0Oo, null), 1), o0OoOo0.OooO00o(c23028OooO0Oo));
                }
            }
        }
        return C32460OooOooO.f116667OooO00o;
    }
}
