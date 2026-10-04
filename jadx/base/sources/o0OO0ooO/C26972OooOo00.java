package o0OO0ooO;

import com.aspose.slides.C22227OoooO;
import com.aspose.slides.internal.p332p7.C22237OooO0o0;
import com.google.mlkit.p567nl.translate.TranslateLanguage;
import com.orion.notein.data.service.dto.CreatorDto;
import com.orion.notein.data.service.dto.MaterialDto;
import com.orion.notein.data.service.dto.MaterialListResponse;
import com.orion.notein.domain.mapper.MaterialMapper;
import com.orion.notein.domain.models.material.Material;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import o000OO00.C24472OooOoo;
import o0OOOOO0.InterfaceC27151OooO0o0;
import oO00ooO.C32446OooOOOo;
import oO00ooo.AbstractC32479OooO0OO;
import oO00ooo0.EnumC32485OooO00o;
import oO0o0O0o.C33599OooOo0O;
import oOO00oo.C34406OooO00o;
import oOo000Oo.C34428OooOOo;

/* JADX INFO: renamed from: o0OO0ooO.OooOo00, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C26972OooOo00 {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final InterfaceC27151OooO0o0 f93695OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final MaterialMapper f93696OooO0O0;

    public C26972OooOo00(InterfaceC27151OooO0o0 api, MaterialMapper materialMapper) {
        kotlin.jvm.internal.OooOOO0.OooO0oO(api, "api");
        this.f93695OooO00o = api;
        this.f93696OooO0O0 = materialMapper;
    }

    public static String OooO0OO() {
        Locale locale = Locale.getDefault();
        return (kotlin.jvm.internal.OooOOO0.OooO0O0(locale.getLanguage(), TranslateLanguage.CHINESE) && kotlin.jvm.internal.OooOOO0.OooO0O0(locale.getCountry(), "TW")) ? "zh-TW" : kotlin.jvm.internal.OooOOO0.OooO0O0(locale.getLanguage(), TranslateLanguage.CHINESE) ? "zh-CN" : "en-US";
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object OooO00o(String str, AbstractC32479OooO0OO abstractC32479OooO0OO) {
        C26964OooOOO c26964OooOOO;
        if (abstractC32479OooO0OO instanceof C26964OooOOO) {
            c26964OooOOO = (C26964OooOOO) abstractC32479OooO0OO;
            int i = c26964OooOOO.f93669OooOoO0;
            if ((i & Integer.MIN_VALUE) != 0) {
                c26964OooOOO.f93669OooOoO0 = i - Integer.MIN_VALUE;
            } else {
                c26964OooOOO = new C26964OooOOO(this, abstractC32479OooO0OO);
            }
        }
        Object objOooO0Oo = c26964OooOOO.f93668OooOo0o;
        EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
        int i2 = c26964OooOOO.f93669OooOoO0;
        if (i2 == 0) {
            C32446OooOOOo.OooO0O0(objOooO0Oo);
            String strOooO0OO = OooO0OO();
            c26964OooOOO.f93669OooOoO0 = 1;
            objOooO0Oo = this.f93695OooO00o.OooO0Oo(str, strOooO0OO, c26964OooOOO);
            if (objOooO0Oo == enumC32485OooO00o) {
                return enumC32485OooO00o;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C32446OooOOOo.OooO0O0(objOooO0Oo);
        }
        CreatorDto creatorDto = (CreatorDto) objOooO0Oo;
        String id = creatorDto.getId();
        String name = creatorDto.getName();
        String description = creatorDto.getDescription();
        if (description == null) {
            description = "";
        }
        String avatarUrl = creatorDto.getAvatarUrl();
        return new C26953OooO00o(creatorDto.getMaterialCount(), id, name, description, avatarUrl);
    }

    /* JADX WARN: Removed duplicated region for block: B:8:0x0014  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object OooO0O0(String str, int i, int i2, AbstractC32479OooO0OO abstractC32479OooO0OO) {
        C26966OooOOOO c26966OooOOOO;
        C26972OooOo00 c26972OooOo00;
        if (abstractC32479OooO0OO instanceof C26966OooOOOO) {
            c26966OooOOOO = (C26966OooOOOO) abstractC32479OooO0OO;
            int i3 = c26966OooOOOO.f93676OooOoO;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                c26966OooOOOO.f93676OooOoO = i3 - Integer.MIN_VALUE;
            } else {
                c26966OooOOOO = new C26966OooOOOO(this, abstractC32479OooO0OO);
            }
        }
        C26966OooOOOO c26966OooOOOO2 = c26966OooOOOO;
        Object objOooO0oo = c26966OooOOOO2.f93674OooOo;
        EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
        int i4 = c26966OooOOOO2.f93676OooOoO;
        if (i4 == 0) {
            C32446OooOOOo.OooO0O0(objOooO0oo);
            String strOooO0OO = OooO0OO();
            c26966OooOOOO2.f93675OooOo0o = this;
            c26966OooOOOO2.f93676OooOoO = 1;
            objOooO0oo = this.f93695OooO00o.OooO0oo(str, i, i2, strOooO0OO, c26966OooOOOO2);
            if (objOooO0oo == enumC32485OooO00o) {
                return enumC32485OooO00o;
            }
            c26972OooOo00 = this;
        } else {
            if (i4 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            c26972OooOo00 = c26966OooOOOO2.f93675OooOo0o;
            C32446OooOOOo.OooO0O0(objOooO0oo);
        }
        MaterialListResponse materialListResponse = (MaterialListResponse) objOooO0oo;
        List<MaterialDto> items = materialListResponse.getItems();
        ArrayList arrayList = new ArrayList(C34428OooOOo.OooOOoo(items, 10));
        for (MaterialDto materialDto : items) {
            Material materialFromDto = c26972OooOo00.f93696OooO0O0.fromDto(materialDto);
            String summary = materialDto.getSummary();
            if (summary == null || C33599OooOo0O.Oooo0o0(summary)) {
                summary = null;
            }
            arrayList.add(new C26963OooOO0o(materialFromDto, summary));
        }
        return new C26965OooOOO0(arrayList, materialListResponse.getPagination().getPage(), materialListResponse.getPagination().getSize(), materialListResponse.getPagination().getTotal());
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object OooO0Oo(String str, AbstractC32479OooO0OO abstractC32479OooO0OO) {
        C26967OooOOOo c26967OooOOOo;
        C26972OooOo00 c26972OooOo00;
        if (abstractC32479OooO0OO instanceof C26967OooOOOo) {
            c26967OooOOOo = (C26967OooOOOo) abstractC32479OooO0OO;
            int i = c26967OooOOOo.f93680OooOoO;
            if ((i & Integer.MIN_VALUE) != 0) {
                c26967OooOOOo.f93680OooOoO = i - Integer.MIN_VALUE;
            } else {
                c26967OooOOOo = new C26967OooOOOo(this, abstractC32479OooO0OO);
            }
        }
        Object objOooO0O0 = c26967OooOOOo.f93678OooOo;
        EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
        int i2 = c26967OooOOOo.f93680OooOoO;
        if (i2 == 0) {
            C32446OooOOOo.OooO0O0(objOooO0O0);
            String strOooO0OO = OooO0OO();
            c26967OooOOOo.f93679OooOo0o = this;
            c26967OooOOOo.f93680OooOoO = 1;
            objOooO0O0 = this.f93695OooO00o.OooO0O0(str, strOooO0OO, c26967OooOOOo);
            if (objOooO0O0 == enumC32485OooO00o) {
                return enumC32485OooO00o;
            }
            c26972OooOo00 = this;
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            c26972OooOo00 = c26967OooOOOo.f93679OooOo0o;
            C32446OooOOOo.OooO0O0(objOooO0O0);
        }
        return c26972OooOo00.f93696OooO0O0.fromDto((MaterialDto) objOooO0O0);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object OooO0o(int i, String str, AbstractC32479OooO0OO abstractC32479OooO0OO) {
        C26968OooOOo c26968OooOOo;
        C26972OooOo00 c26972OooOo00;
        if (abstractC32479OooO0OO instanceof C26968OooOOo) {
            c26968OooOOo = (C26968OooOOo) abstractC32479OooO0OO;
            int i2 = c26968OooOOo.f93684OooOoO;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                c26968OooOOo.f93684OooOoO = i2 - Integer.MIN_VALUE;
            } else {
                c26968OooOOo = new C26968OooOOo(this, abstractC32479OooO0OO);
            }
        }
        Object objOooO = c26968OooOOo.f93682OooOo;
        EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
        int i3 = c26968OooOOo.f93684OooOoO;
        if (i3 == 0) {
            C32446OooOOOo.OooO0O0(objOooO);
            String strOooO0OO = OooO0OO();
            c26968OooOOo.f93683OooOo0o = this;
            c26968OooOOo.f93684OooOoO = 1;
            objOooO = this.f93695OooO00o.OooO(str, i, strOooO0OO, c26968OooOOo);
            if (objOooO == enumC32485OooO00o) {
                return enumC32485OooO00o;
            }
            c26972OooOo00 = this;
        } else {
            if (i3 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            c26972OooOo00 = c26968OooOOo.f93683OooOo0o;
            C32446OooOOOo.OooO0O0(objOooO);
        }
        MaterialListResponse materialListResponse = (MaterialListResponse) objOooO;
        List<MaterialDto> items = materialListResponse.getItems();
        ArrayList arrayList = new ArrayList(C34428OooOOo.OooOOoo(items, 10));
        for (MaterialDto materialDto : items) {
            Material materialFromDto = c26972OooOo00.f93696OooO0O0.fromDto(materialDto);
            String summary = materialDto.getSummary();
            if (summary == null || C33599OooOo0O.Oooo0o0(summary)) {
                summary = null;
            }
            arrayList.add(new C26963OooOO0o(materialFromDto, summary));
        }
        return new C26965OooOOO0(arrayList, materialListResponse.getPagination().getPage(), materialListResponse.getPagination().getSize(), materialListResponse.getPagination().getTotal());
    }

    /* JADX WARN: Removed duplicated region for block: B:8:0x0016  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object OooO0o0(String str, int i, int i2, AbstractC32479OooO0OO abstractC32479OooO0OO) throws Exception {
        C26969OooOOo0 c26969OooOOo0;
        C26972OooOo00 c26972OooOo00;
        if (abstractC32479OooO0OO instanceof C26969OooOOo0) {
            c26969OooOOo0 = (C26969OooOOo0) abstractC32479OooO0OO;
            int i3 = c26969OooOOo0.f93688OooOoO;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                c26969OooOOo0.f93688OooOoO = i3 - Integer.MIN_VALUE;
            } else {
                c26969OooOOo0 = new C26969OooOOo0(this, abstractC32479OooO0OO);
            }
        }
        C26969OooOOo0 c26969OooOOo02 = c26969OooOOo0;
        Object objOooO0o = c26969OooOOo02.f93686OooOo;
        EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
        int i4 = c26969OooOOo02.f93688OooOoO;
        try {
            if (i4 == 0) {
                C32446OooOOOo.OooO0O0(objOooO0o);
                String strOooO0OO = OooO0OO();
                C34406OooO00o.C20358OooO00o c20358OooO00o = C34406OooO00o.f123390OooO00o;
                StringBuilder sbOooO00o = C22227OoooO.OooO00o(c20358OooO00o, "MaterialRemoteDS", "getMaterials: type=", str, ", page=");
                C24472OooOoo.OooO0O0(sbOooO00o, ", pageSize=", ", locale=", i, i2);
                sbOooO00o.append(strOooO0OO);
                c20358OooO00o.OooO0o0(sbOooO00o.toString(), new Object[0]);
                InterfaceC27151OooO0o0 interfaceC27151OooO0o0 = this.f93695OooO00o;
                c26969OooOOo02.f93687OooOo0o = this;
                c26969OooOOo02.f93688OooOoO = 1;
                objOooO0o = interfaceC27151OooO0o0.OooO0o(str, i, i2, strOooO0OO, c26969OooOOo02);
                if (objOooO0o == enumC32485OooO00o) {
                    return enumC32485OooO00o;
                }
                c26972OooOo00 = this;
            } else {
                if (i4 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                c26972OooOo00 = c26969OooOOo02.f93687OooOo0o;
                C32446OooOOOo.OooO0O0(objOooO0o);
            }
            MaterialListResponse materialListResponse = (MaterialListResponse) objOooO0o;
            C34406OooO00o.C20358OooO00o c20358OooO00o2 = C34406OooO00o.f123390OooO00o;
            c20358OooO00o2.OooOOO0("MaterialRemoteDS");
            c20358OooO00o2.OooO0o0("getMaterials response: items=" + materialListResponse.getItems().size() + ", pagination=" + materialListResponse.getPagination(), new Object[0]);
            List<MaterialDto> items = materialListResponse.getItems();
            ArrayList arrayList = new ArrayList(C34428OooOOo.OooOOoo(items, 10));
            for (MaterialDto materialDto : items) {
                C34406OooO00o.C20358OooO00o c20358OooO00o3 = C34406OooO00o.f123390OooO00o;
                c20358OooO00o3.OooOOO0("MaterialRemoteDS");
                c20358OooO00o3.OooO0o0("getMaterials mapping dto: id=" + materialDto.getId() + ", title=" + materialDto.getTitle() + ", type=" + materialDto.getType(), new Object[0]);
                Material materialFromDto = c26972OooOo00.f93696OooO0O0.fromDto(materialDto);
                String summary = materialDto.getSummary();
                if (summary == null || C33599OooOo0O.Oooo0o0(summary)) {
                    summary = null;
                }
                arrayList.add(new C26963OooOO0o(materialFromDto, summary));
            }
            return new C26965OooOOO0(arrayList, materialListResponse.getPagination().getPage(), materialListResponse.getPagination().getSize(), materialListResponse.getPagination().getTotal());
        } catch (Exception e) {
            C34406OooO00o.C20358OooO00o c20358OooO00o4 = C34406OooO00o.f123390OooO00o;
            c20358OooO00o4.OooOOO0("MaterialRemoteDS");
            c20358OooO00o4.OooO0o0(C22237OooO0o0.OooO00o("getMaterials error: ", e.getClass().getSimpleName(), ": ", e.getMessage()), new Object[0]);
            throw e;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:8:0x0014  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object OooO0oO(String str, int i, int i2, AbstractC32479OooO0OO abstractC32479OooO0OO) {
        C26970OooOOoo c26970OooOOoo;
        C26972OooOo00 c26972OooOo00;
        if (abstractC32479OooO0OO instanceof C26970OooOOoo) {
            c26970OooOOoo = (C26970OooOOoo) abstractC32479OooO0OO;
            int i3 = c26970OooOOoo.f93692OooOoO;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                c26970OooOOoo.f93692OooOoO = i3 - Integer.MIN_VALUE;
            } else {
                c26970OooOOoo = new C26970OooOOoo(this, abstractC32479OooO0OO);
            }
        }
        C26970OooOOoo c26970OooOOoo2 = c26970OooOOoo;
        Object objOooO0OO = c26970OooOOoo2.f93690OooOo;
        EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
        int i4 = c26970OooOOoo2.f93692OooOoO;
        if (i4 == 0) {
            C32446OooOOOo.OooO0O0(objOooO0OO);
            String strOooO0OO = OooO0OO();
            c26970OooOOoo2.f93691OooOo0o = this;
            c26970OooOOoo2.f93692OooOoO = 1;
            objOooO0OO = this.f93695OooO00o.OooO0OO(str, null, i, i2, strOooO0OO, c26970OooOOoo2);
            if (objOooO0OO == enumC32485OooO00o) {
                return enumC32485OooO00o;
            }
            c26972OooOo00 = this;
        } else {
            if (i4 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            c26972OooOo00 = c26970OooOOoo2.f93691OooOo0o;
            C32446OooOOOo.OooO0O0(objOooO0OO);
        }
        MaterialListResponse materialListResponse = (MaterialListResponse) objOooO0OO;
        List<MaterialDto> items = materialListResponse.getItems();
        ArrayList arrayList = new ArrayList(C34428OooOOo.OooOOoo(items, 10));
        for (MaterialDto materialDto : items) {
            Material materialFromDto = c26972OooOo00.f93696OooO0O0.fromDto(materialDto);
            String summary = materialDto.getSummary();
            if (summary == null || C33599OooOo0O.Oooo0o0(summary)) {
                summary = null;
            }
            arrayList.add(new C26963OooOO0o(materialFromDto, summary));
        }
        return new C26965OooOOO0(arrayList, materialListResponse.getPagination().getPage(), materialListResponse.getPagination().getSize(), materialListResponse.getPagination().getTotal());
    }
}
