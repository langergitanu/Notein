package com.orion.notein.p607ui.creative_library;

import androidx.core.app.OooO;
import com.orion.notein.domain.models.material.Entitlement;
import com.orion.notein.domain.models.material.Material;
import com.orion.notein.domain.models.material.MaterialActionType;
import com.orion.notein.p607ui.creative_library.C23028OooO0Oo;
import com.orion.notein.p607ui.creative_library.C23033OooOO0o;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.coroutines.Continuation;
import o0OO0ooO.C26963OooOO0o;
import o0OO0ooO.C26965OooOOO0;
import o0OOo0Oo.InterfaceC27310OooOoO0;
import o0OOoo0O.C27851OooOo0;
import oO00ooO.C32446OooOOOo;
import oO00ooO.C32460OooOooO;
import oO00ooo.AbstractC32476OooO;
import oO00ooo.InterfaceC32482OooO0o0;
import oO00ooo0.EnumC32485OooO00o;
import oO0O000o.InterfaceC32508OooOOOo;
import oO0o0OO.InterfaceC33636Oooo00o;
import oO0o0Oo.C33781o00o0O;
import oOO00oo.C34406OooO00o;
import oOo000Oo.C34428OooOOo;

/* JADX INFO: renamed from: com.orion.notein.ui.creative_library.OooO0oO, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
@InterfaceC32482OooO0o0(m80622c = "com.orion.notein.ui.creative_library.CreativeLibraryDetailViewModel$loadRecommendations$1", m80623f = "CreativeLibraryDetailViewModel.kt", m80624l = {143, 149}, m80625m = "invokeSuspend")
public final class C23031OooO0oO extends AbstractC32476OooO implements InterfaceC32508OooOOOo<InterfaceC33636Oooo00o, Continuation<? super C32460OooOooO>, Object> {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public Collection f71053OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public C23028OooO0Oo f71054OooOo0o;

    /* JADX INFO: renamed from: OooOoO, reason: collision with root package name */
    public C26963OooOO0o f71055OooOoO;

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public Iterator f71056OooOoO0;

    /* JADX INFO: renamed from: OooOoOO, reason: collision with root package name */
    public Material f71057OooOoOO;

    /* JADX INFO: renamed from: OooOoo, reason: collision with root package name */
    public int f71058OooOoo;

    /* JADX INFO: renamed from: OooOoo0, reason: collision with root package name */
    public Collection f71059OooOoo0;

    /* JADX INFO: renamed from: OooOooO, reason: collision with root package name */
    public final /* synthetic */ C23028OooO0Oo f71060OooOooO;

    /* JADX INFO: renamed from: OooOooo, reason: collision with root package name */
    public final /* synthetic */ String f71061OooOooo;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C23031OooO0oO(C23028OooO0Oo c23028OooO0Oo, String str, Continuation<? super C23031OooO0oO> continuation) {
        super(2, continuation);
        this.f71060OooOooO = c23028OooO0Oo;
        this.f71061OooOooo = str;
    }

    @Override // oO00ooo.AbstractC32477OooO00o
    public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
        return new C23031OooO0oO(this.f71060OooOooO, this.f71061OooOooo, continuation);
    }

    @Override // oO0O000o.InterfaceC32508OooOOOo
    public final Object invoke(InterfaceC33636Oooo00o interfaceC33636Oooo00o, Continuation<? super C32460OooOooO> continuation) {
        return ((C23031OooO0oO) create(interfaceC33636Oooo00o, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
    }

    /* JADX WARN: Path cross not found for [B:34:0x00e6, B:38:0x00ee], limit reached: 49 */
    /* JADX WARN: Removed duplicated region for block: B:23:0x008a A[Catch: Exception -> 0x0033, TryCatch #0 {Exception -> 0x0033, blocks: (B:7:0x0027, B:27:0x00b5, B:32:0x00d6, B:34:0x00e6, B:39:0x00f0, B:21:0x0083, B:23:0x008a, B:40:0x010b, B:41:0x0111, B:14:0x003e, B:20:0x0052, B:17:0x0047), top: B:47:0x0011 }] */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00cf  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00d4  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x010b A[Catch: Exception -> 0x0033, TryCatch #0 {Exception -> 0x0033, blocks: (B:7:0x0027, B:27:0x00b5, B:32:0x00d6, B:34:0x00e6, B:39:0x00f0, B:21:0x0083, B:23:0x008a, B:40:0x010b, B:41:0x0111, B:14:0x003e, B:20:0x0052, B:17:0x0047), top: B:47:0x0011 }] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:26:0x00b0 -> B:9:0x002f). Please report as a decompilation issue!!! */
    @Override // oO00ooo.AbstractC32477OooO00o
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        Object objOooO0o0;
        Collection arrayList;
        Iterator it;
        C23028OooO0Oo c23028OooO0Oo;
        Object value;
        C23031OooO0oO c23031OooO0oO = this;
        EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
        int i = c23031OooO0oO.f71058OooOoo;
        String str = c23031OooO0oO.f71061OooOooo;
        int i2 = 2;
        C23028OooO0Oo c23028OooO0Oo2 = c23031OooO0oO.f71060OooOooO;
        try {
        } catch (Exception e) {
            C34406OooO00o.C20358OooO00o c20358OooO00o = C34406OooO00o.f123390OooO00o;
            c20358OooO00o.OooO0Oo(e, OooO.OooO0O0(c20358OooO00o, "CreativeLibraryDetailVM", "Failed to load recommendations for: ", str), new Object[0]);
        }
        if (i == 0) {
            C32446OooOOOo.OooO0O0(obj);
            InterfaceC27310OooOoO0 interfaceC27310OooOoO0 = c23028OooO0Oo2.f71007OooO0o0;
            c23031OooO0oO.f71058OooOoo = 1;
            objOooO0o0 = interfaceC27310OooOoO0.OooO0o0(str, c23031OooO0oO);
            if (objOooO0o0 == enumC32485OooO00o) {
                return enumC32485OooO00o;
            }
        } else {
            if (i != 1) {
                if (i != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                Collection collection = c23031OooO0oO.f71059OooOoo0;
                Material material = c23031OooO0oO.f71057OooOoOO;
                C26963OooOO0o c26963OooOO0o = c23031OooO0oO.f71055OooOoO;
                it = c23031OooO0oO.f71056OooOoO0;
                Collection collection2 = c23031OooO0oO.f71053OooOo;
                c23028OooO0Oo = c23031OooO0oO.f71054OooOo0o;
                C32446OooOOOo.OooO0O0(obj);
                Material material2 = material;
                arrayList = collection2;
                Object objOooO00o = obj;
                C23028OooO0Oo c23028OooO0Oo3 = c23028OooO0Oo;
                C27851OooOo0.OooO00o oooO00o = (C27851OooOo0.OooO00o) objOooO00o;
                String id = material2.getId();
                String title = material2.getTitle();
                String str2 = c26963OooOO0o.f93666OooO0O0;
                String thumbnailUrl = material2.getThumbnailUrl();
                String str3 = material2.getEntitlement() != Entitlement.VIP ? "VIP" : null;
                String strName = material2.getEntitlement().name();
                MaterialActionType materialActionType = oooO00o.f98416OooO0OO;
                String str4 = oooO00o.f98417OooO0Oo;
                boolean z = oooO00o.f98415OooO0O0;
                collection.add(new C23033OooOO0o.OooO00o(id, title, str2, thumbnailUrl, str3, strName, materialActionType, str4, z || materialActionType == MaterialActionType.GO_TO_CREATE, oooO00o.f98414OooO00o, material2, z));
                i2 = 2;
                c23031OooO0oO = this;
                c23028OooO0Oo = c23028OooO0Oo3;
                collection = arrayList;
                if (it.hasNext()) {
                    c26963OooOO0o = (C26963OooOO0o) it.next();
                    Material material3 = c26963OooOO0o.f93665OooO00o;
                    C27851OooOo0 c27851OooOo0 = c23028OooO0Oo.f71008OooO0oO;
                    c23031OooO0oO.f71054OooOo0o = c23028OooO0Oo;
                    c23031OooO0oO.f71053OooOo = collection;
                    c23031OooO0oO.f71056OooOoO0 = it;
                    c23031OooO0oO.f71055OooOoO = c26963OooOO0o;
                    c23031OooO0oO.f71057OooOoOO = material3;
                    c23031OooO0oO.f71059OooOoo0 = collection;
                    c23031OooO0oO.f71058OooOoo = i2;
                    objOooO00o = c27851OooOo0.OooO00o(material3, c23031OooO0oO);
                    if (objOooO00o != enumC32485OooO00o) {
                        material2 = material3;
                        arrayList = collection;
                        C23028OooO0Oo c23028OooO0Oo32 = c23028OooO0Oo;
                        C27851OooOo0.OooO00o oooO00o2 = (C27851OooOo0.OooO00o) objOooO00o;
                        String id2 = material2.getId();
                        String title2 = material2.getTitle();
                        String str22 = c26963OooOO0o.f93666OooO0O0;
                        String thumbnailUrl2 = material2.getThumbnailUrl();
                        String str32 = material2.getEntitlement() != Entitlement.VIP ? "VIP" : null;
                        String strName2 = material2.getEntitlement().name();
                        MaterialActionType materialActionType2 = oooO00o2.f98416OooO0OO;
                        String str42 = oooO00o2.f98417OooO0Oo;
                        boolean z2 = oooO00o2.f98415OooO0O0;
                        collection.add(new C23033OooOO0o.OooO00o(id2, title2, str22, thumbnailUrl2, str32, strName2, materialActionType2, str42, z2 || materialActionType2 == MaterialActionType.GO_TO_CREATE, oooO00o2.f98414OooO00o, material2, z2));
                        i2 = 2;
                        c23031OooO0oO = this;
                        c23028OooO0Oo = c23028OooO0Oo32;
                        collection = arrayList;
                        if (it.hasNext()) {
                            List list = (List) collection;
                            C33781o00o0O c33781o00o0O = c23028OooO0Oo2.f71010OooOO0;
                            do {
                                value = c33781o00o0O.getValue();
                            } while (!c33781o00o0O.OooO(value, C23028OooO0Oo.C19176OooO0Oo.OooO00o((C23028OooO0Oo.C19176OooO0Oo) value, false, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, false, list, 131071)));
                        }
                    }
                    return enumC32485OooO00o;
                }
                return C32460OooOooO.f116667OooO00o;
            }
            C32446OooOOOo.OooO0O0(obj);
            objOooO0o0 = obj;
        }
        C26965OooOOO0 c26965OooOOO0 = (C26965OooOOO0) objOooO0o0;
        C34406OooO00o.C20358OooO00o c20358OooO00o2 = C34406OooO00o.f123390OooO00o;
        c20358OooO00o2.OooOOO0("CreativeLibraryDetailVM");
        c20358OooO00o2.OooO00o("loadRecommendations success: count=" + c26965OooOOO0.f93670OooO00o.size(), new Object[0]);
        ArrayList arrayList2 = c26965OooOOO0.f93670OooO00o;
        arrayList = new ArrayList(C34428OooOOo.OooOOoo(arrayList2, 10));
        it = arrayList2.iterator();
        c23028OooO0Oo = c23028OooO0Oo2;
        collection = arrayList;
        if (it.hasNext()) {
        }
        return C32460OooOooO.f116667OooO00o;
    }
}
