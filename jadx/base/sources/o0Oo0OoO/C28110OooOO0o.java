package o0Oo0OoO;

import Oooo0OO.AbstractC20960OooOOOO;
import com.orion.notein.data.p602db.entity.HyperLinkEntity;
import com.orion.notein.domain.mapper.HyperLinkMapper;
import com.orion.notein.domain.models.page.HyperLink;
import java.util.ArrayList;
import java.util.Map;
import java.util.UUID;
import o0OOo0Oo.InterfaceC27301OooOOo;
import oO00ooO.C32435OooO0Oo;
import oO00ooO.C32446OooOOOo;
import oO00ooo.AbstractC32479OooO0OO;
import oO00ooo0.EnumC32485OooO00o;
import oOO00oo.C34406OooO00o;

/* JADX INFO: renamed from: o0Oo0OoO.OooOO0o, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C28110OooOO0o extends AbstractC20960OooOOOO {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public final InterfaceC27301OooOOo f99628OooOo;

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public final HyperLinkMapper f99629OooOoO0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C28110OooOO0o(InterfaceC27301OooOOo hyperLinkRepo, HyperLinkMapper hyperLinkMapper) {
        super(2);
        kotlin.jvm.internal.OooOOO0.OooO0oO(hyperLinkRepo, "hyperLinkRepo");
        kotlin.jvm.internal.OooOOO0.OooO0oO(hyperLinkMapper, "hyperLinkMapper");
        this.f99628OooOo = hyperLinkRepo;
        this.f99629OooOoO0 = hyperLinkMapper;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0019  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object o00000Oo(String str, Map map, String str2, AbstractC32479OooO0OO abstractC32479OooO0OO) {
        C28109OooOO0O c28109OooOO0O;
        HyperLink hyperLinkCopy$default;
        String str3;
        if (abstractC32479OooO0OO instanceof C28109OooOO0O) {
            c28109OooOO0O = (C28109OooOO0O) abstractC32479OooO0OO;
            int i = c28109OooOO0O.f99627OooOoO0;
            if ((i & Integer.MIN_VALUE) != 0) {
                c28109OooOO0O.f99627OooOoO0 = i - Integer.MIN_VALUE;
            } else {
                c28109OooOO0O = new C28109OooOO0O(this, abstractC32479OooO0OO);
            }
        }
        Object obj = c28109OooOO0O.f99626OooOo0o;
        EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
        int i2 = c28109OooOO0O.f99627OooOoO0;
        try {
            if (i2 == 0) {
                C32446OooOOOo.OooO0O0(obj);
                ArrayList arrayListO00000 = o00000(HyperLinkEntity.class, str + "/hyperlink");
                ArrayList<HyperLinkEntity> arrayList = new ArrayList();
                for (Object obj2 : arrayListO00000) {
                    if (map.containsKey(((HyperLinkEntity) obj2).getPageId())) {
                        arrayList.add(obj2);
                    }
                }
                ArrayList arrayList2 = new ArrayList();
                for (HyperLinkEntity hyperLinkEntity : arrayList) {
                    String string = UUID.randomUUID().toString();
                    kotlin.jvm.internal.OooOOO0.OooO0o(string, "toString(...)");
                    int type = hyperLinkEntity.getType();
                    HyperLinkMapper hyperLinkMapper = this.f99629OooOoO0;
                    HyperLink hyperLink = null;
                    if (type == 1) {
                        HyperLink hyperLink2 = hyperLinkMapper.toHyperLink(hyperLinkEntity);
                        String str4 = (String) map.get(hyperLinkEntity.getPageId());
                        if (str4 != null && (str3 = (String) map.get(hyperLinkEntity.getDestination())) != null) {
                            hyperLinkCopy$default = HyperLink.copy$default(hyperLink2, string, str4, 0, str3, null, null, System.currentTimeMillis(), 52, null);
                            hyperLink = hyperLinkCopy$default;
                        }
                    } else {
                        HyperLink hyperLink3 = hyperLinkMapper.toHyperLink(hyperLinkEntity);
                        String str5 = (String) map.get(hyperLinkEntity.getPageId());
                        if (str5 != null) {
                            hyperLinkCopy$default = HyperLink.copy$default(hyperLink3, string, str5, 0, null, null, null, System.currentTimeMillis(), 60, null);
                            hyperLink = hyperLinkCopy$default;
                        }
                    }
                    if (hyperLink != null) {
                        arrayList2.add(hyperLink);
                    }
                }
                InterfaceC27301OooOOo interfaceC27301OooOOo = this.f99628OooOo;
                c28109OooOO0O.f99627OooOoO0 = 1;
                if (interfaceC27301OooOOo.OooO0O0(str2, arrayList2, c28109OooOO0O) == enumC32485OooO00o) {
                    return enumC32485OooO00o;
                }
            } else {
                if (i2 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C32446OooOOOo.OooO0O0(obj);
            }
            return new Integer(0);
        } catch (Exception e) {
            C34406OooO00o.C20358OooO00o c20358OooO00o = C34406OooO00o.f123390OooO00o;
            c20358OooO00o.OooOOO0("hyperlink");
            c20358OooO00o.OooO0OO("Couldn't restore data. ".concat(C32435OooO0Oo.OooO0O0(e)), new Object[0]);
            return new Integer(-999);
        }
    }
}
