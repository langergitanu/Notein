package o0OO0ooO;

import com.aspose.slides.C22212OooOoO0;
import com.facebook.soloader.OooOo;
import com.google.gson.Gson;
import com.orion.notein.data.p602db.entity.DownloadedMaterialEntity;
import com.orion.notein.data.p602db.entity.MaterialDownloadStateEntity;
import com.orion.notein.domain.models.material.Creator;
import com.orion.notein.domain.models.material.DownloadResult;
import com.orion.notein.domain.models.material.Entitlement;
import com.orion.notein.domain.models.material.Font;
import com.orion.notein.domain.models.material.Material;
import com.orion.notein.domain.models.material.Orientation;
import com.orion.notein.domain.models.material.PageSize;
import com.orion.notein.domain.models.material.Palette;
import com.orion.notein.domain.models.material.Sticker;
import com.orion.notein.domain.models.material.TemplateBook;
import com.orion.notein.domain.models.material.TemplateCollection;
import com.orion.notein.domain.models.material.TemplateFile;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import o0OOo0Oo.InterfaceC27304OooOo;
import o0OOoo0O.C27840OooOO0;
import o0Oo0oOo.o0O0O00;
import oO00ooO.C32442OooOO0o;
import oO00ooO.C32446OooOOOo;
import oO00ooO.C32460OooOooO;
import oO00ooo.AbstractC32479OooO0OO;
import oO00ooo0.EnumC32485OooO00o;
import oO0o0OO.C33609OooO0oo;
import oO0o0OO.C33649OoooOOo;
import oO0o0Oo.InterfaceC33721OooO0o;
import oO0o0o0o.C33874OooO0OO;
import oO0o0o0o.ExecutorC33873OooO0O0;
import oOO00oo.C34406OooO00o;
import oOo000Oo.C34434OooOoO;
import oOo000Oo.C34436OooOoOO;
import oo0oO0.InterfaceC34791o000o00O;
import oo0oO0.InterfaceC34847o00Oo0;

/* JADX INFO: renamed from: o0OO0ooO.OooO, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C26952OooO implements InterfaceC27304OooOo {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final InterfaceC34791o000o00O f93613OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final InterfaceC34847o00Oo0 f93614OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public final Gson f93615OooO0OO;

    public C26952OooO(InterfaceC34791o000o00O downloadStateDao, InterfaceC34847o00Oo0 downloadedMaterialDao, Gson gson) {
        kotlin.jvm.internal.OooOOO0.OooO0oO(downloadStateDao, "downloadStateDao");
        kotlin.jvm.internal.OooOOO0.OooO0oO(downloadedMaterialDao, "downloadedMaterialDao");
        kotlin.jvm.internal.OooOOO0.OooO0oO(gson, "gson");
        this.f93613OooO00o = downloadStateDao;
        this.f93614OooO0O0 = downloadedMaterialDao;
        this.f93615OooO0OO = gson;
    }

    public static String OooOO0(Material material) {
        if (material instanceof TemplateCollection) {
            return "template_single";
        }
        if (material instanceof TemplateBook) {
            return "template_book";
        }
        if (material instanceof Sticker) {
            return "sticker";
        }
        if (material instanceof Font) {
            return "font";
        }
        if (material instanceof Palette) {
            return "palette";
        }
        throw new C32442OooOO0o();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v1, types: [oOo000Oo.OooOoO] */
    /* JADX WARN: Type inference failed for: r3v2, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r3v3, types: [java.util.ArrayList] */
    public static List OooOO0O(Map map, String str) {
        Object obj = map.get(str);
        ?? arrayList = C34434OooOoO.f123453OooOo0o;
        if (obj != null && (obj instanceof List)) {
            arrayList = new ArrayList();
            for (Object obj2 : (Iterable) obj) {
                if (obj2 instanceof String) {
                    arrayList.add(obj2);
                }
            }
        }
        return arrayList;
    }

    public static List OooOO0o(Object obj) {
        Orientation orientationValueOf;
        if (!(obj instanceof List)) {
            return C34434OooOoO.f123453OooOo0o;
        }
        ArrayList arrayList = new ArrayList();
        for (Object obj2 : (Iterable) obj) {
            TemplateFile templateFile = null;
            if (obj2 instanceof Map) {
                Map map = (Map) obj2;
                Object obj3 = map.get("path");
                String str = obj3 instanceof String ? (String) obj3 : null;
                if (str != null) {
                    Object obj4 = map.get("orientation");
                    String str2 = obj4 instanceof String ? (String) obj4 : null;
                    if (str2 != null) {
                        Object obj5 = map.get("color");
                        String str3 = obj5 instanceof String ? (String) obj5 : null;
                        if (str3 != null) {
                            Object obj6 = map.get("colorName");
                            String str4 = obj6 instanceof String ? (String) obj6 : null;
                            if (str4 != null) {
                                try {
                                    orientationValueOf = Orientation.valueOf(str2);
                                } catch (Exception unused) {
                                    orientationValueOf = Orientation.PORTRAIT;
                                }
                                templateFile = new TemplateFile(str, orientationValueOf, str3, str4);
                            }
                        }
                    }
                }
            }
            if (templateFile != null) {
                arrayList.add(templateFile);
            }
        }
        return arrayList;
    }

    @Override // o0OOo0Oo.InterfaceC27304OooOo
    public final Object OooO(String str, C27840OooOO0 c27840OooOO0) {
        return this.f93613OooO00o.OooO0Oo(str, c27840OooOO0);
    }

    @Override // o0OOo0Oo.InterfaceC27304OooOo
    public final Object OooO00o(String str, AbstractC32479OooO0OO abstractC32479OooO0OO) {
        return this.f93613OooO00o.OooO00o(str, abstractC32479OooO0OO);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // o0OOo0Oo.InterfaceC27304OooOo
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Serializable OooO0O0(String str, AbstractC32479OooO0OO abstractC32479OooO0OO) {
        C26960OooO0oo c26960OooO0oo;
        C26952OooO c26952OooO;
        Material materialOooOOO0;
        if (abstractC32479OooO0OO instanceof C26960OooO0oo) {
            c26960OooO0oo = (C26960OooO0oo) abstractC32479OooO0OO;
            int i = c26960OooO0oo.f93644OooOoO;
            if ((i & Integer.MIN_VALUE) != 0) {
                c26960OooO0oo.f93644OooOoO = i - Integer.MIN_VALUE;
            } else {
                c26960OooO0oo = new C26960OooO0oo(this, abstractC32479OooO0OO);
            }
        }
        Object objOooO0OO = c26960OooO0oo.f93642OooOo;
        EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
        int i2 = c26960OooO0oo.f93644OooOoO;
        if (i2 == 0) {
            C32446OooOOOo.OooO0O0(objOooO0OO);
            c26960OooO0oo.f93643OooOo0o = this;
            c26960OooO0oo.f93644OooOoO = 1;
            objOooO0OO = this.f93614OooO0O0.OooO0OO(str, c26960OooO0oo);
            if (objOooO0OO == enumC32485OooO00o) {
                return enumC32485OooO00o;
            }
            c26952OooO = this;
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            c26952OooO = c26960OooO0oo.f93643OooOo0o;
            C32446OooOOOo.OooO0O0(objOooO0OO);
        }
        ArrayList arrayList = new ArrayList();
        for (DownloadedMaterialEntity downloadedMaterialEntity : (Iterable) objOooO0OO) {
            try {
                materialOooOOO0 = c26952OooO.OooOOO0(downloadedMaterialEntity);
            } catch (Exception e) {
                C34406OooO00o.f123390OooO00o.OooOO0o(e, com.alibaba.sdk.android.oss.internal.OooO00o.OooO00o("Failed to rebuild material: ", downloadedMaterialEntity.getId()), new Object[0]);
                materialOooOOO0 = null;
            }
            if (materialOooOOO0 != null) {
                arrayList.add(materialOooOOO0);
            }
        }
        return arrayList;
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x0089, code lost:
    
        if (r5.OooO0OO(r9, r3) == r4) goto L26;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x00dd, code lost:
    
        if (r5.OooO0OO(r9, r3) == r4) goto L26;
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0019  */
    @Override // o0OOo0Oo.InterfaceC27304OooOo
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object OooO0OO(DownloadResult downloadResult, AbstractC32479OooO0OO abstractC32479OooO0OO) {
        C26957OooO0o c26957OooO0o;
        DownloadResult downloadResult2 = downloadResult;
        if (abstractC32479OooO0OO instanceof C26957OooO0o) {
            c26957OooO0o = (C26957OooO0o) abstractC32479OooO0OO;
            int i = c26957OooO0o.f93634OooOoO;
            if ((i & Integer.MIN_VALUE) != 0) {
                c26957OooO0o.f93634OooOoO = i - Integer.MIN_VALUE;
            } else {
                c26957OooO0o = new C26957OooO0o(this, abstractC32479OooO0OO);
            }
        }
        Object obj = c26957OooO0o.f93632OooOo;
        EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
        int i2 = c26957OooO0o.f93634OooOoO;
        if (i2 == 0) {
            C32446OooOOOo.OooO0O0(obj);
            boolean z = downloadResult2 instanceof DownloadResult.Success;
            InterfaceC34791o000o00O interfaceC34791o000o00O = this.f93613OooO00o;
            if (z) {
                DownloadResult.Success success = (DownloadResult.Success) downloadResult2;
                MaterialDownloadStateEntity materialDownloadStateEntity = new MaterialDownloadStateEntity(success.getMaterial().getId(), OooOO0(success.getMaterial()), success.getMaterial().getTitle(), success.getMaterial().getDownloadUrl(), success.getLocalPath(), success.getFileSize(), System.currentTimeMillis(), true);
                c26957OooO0o.f93633OooOo0o = downloadResult2;
                c26957OooO0o.f93634OooOoO = 1;
            } else if (downloadResult2 instanceof DownloadResult.NoFileNeeded) {
                DownloadResult.NoFileNeeded noFileNeeded = (DownloadResult.NoFileNeeded) downloadResult2;
                MaterialDownloadStateEntity materialDownloadStateEntity2 = new MaterialDownloadStateEntity(noFileNeeded.getMaterial().getId(), OooOO0(noFileNeeded.getMaterial()), noFileNeeded.getMaterial().getTitle(), "", "", 0L, System.currentTimeMillis(), true);
                c26957OooO0o.f93633OooOo0o = downloadResult2;
                c26957OooO0o.f93634OooOoO = 2;
            } else if (downloadResult2 instanceof DownloadResult.Failed) {
                DownloadResult.Failed failed = (DownloadResult.Failed) downloadResult2;
                C34406OooO00o.f123390OooO00o.OooO0Oo(failed.getError(), com.alibaba.sdk.android.oss.internal.OooO00o.OooO00o("Download failed for material: ", failed.getMaterial().getId()), new Object[0]);
            } else if (downloadResult2 instanceof DownloadResult.InProgress) {
                DownloadResult.InProgress inProgress = (DownloadResult.InProgress) downloadResult2;
                C34406OooO00o.f123390OooO00o.OooO00o(C22212OooOoO0.OooO0OO((int) (inProgress.getProgress() * 100), "Download in progress for material: ", inProgress.getMaterial().getId(), ", progress: ", "%"), new Object[0]);
            } else {
                if (!(downloadResult2 instanceof DownloadResult.AuthRequired)) {
                    throw new C32442OooOO0o();
                }
                C34406OooO00o.f123390OooO00o.OooO00o(com.alibaba.sdk.android.oss.internal.OooO00o.OooO00o("Download auth required for material: ", ((DownloadResult.AuthRequired) downloadResult2).getMaterial().getId()), new Object[0]);
            }
            return enumC32485OooO00o;
        }
        if (i2 == 1) {
            downloadResult2 = c26957OooO0o.f93633OooOo0o;
            C32446OooOOOo.OooO0O0(obj);
            C34406OooO00o.f123390OooO00o.OooO00o(com.alibaba.sdk.android.oss.internal.OooO00o.OooO00o("Download state saved for material: ", ((DownloadResult.Success) downloadResult2).getMaterial().getId()), new Object[0]);
        } else {
            if (i2 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            downloadResult2 = c26957OooO0o.f93633OooOo0o;
            C32446OooOOOo.OooO0O0(obj);
            C34406OooO00o.f123390OooO00o.OooO00o(com.alibaba.sdk.android.oss.internal.OooO00o.OooO00o("Download state saved for material (no file): ", ((DownloadResult.NoFileNeeded) downloadResult2).getMaterial().getId()), new Object[0]);
        }
        return C32460OooOooO.f116667OooO00o;
    }

    /*  JADX ERROR: JadxRuntimeException in pass: ModVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r7v0 com.orion.notein.data.db.entity.DownloadedMaterialEntity, still in use, count: 3, list:
          (r7v0 com.orion.notein.data.db.entity.DownloadedMaterialEntity) from 0x00f2: MOVE (r17v0 com.orion.notein.data.db.entity.DownloadedMaterialEntity) = (r7v0 com.orion.notein.data.db.entity.DownloadedMaterialEntity)
          (r7v0 com.orion.notein.data.db.entity.DownloadedMaterialEntity) from 0x00d7: MOVE (r17v1 com.orion.notein.data.db.entity.DownloadedMaterialEntity) = (r7v0 com.orion.notein.data.db.entity.DownloadedMaterialEntity)
          (r7v0 com.orion.notein.data.db.entity.DownloadedMaterialEntity) from 0x00b4: MOVE (r17v5 com.orion.notein.data.db.entity.DownloadedMaterialEntity) = (r7v0 com.orion.notein.data.db.entity.DownloadedMaterialEntity)
        	at jadx.core.utils.InsnRemover.removeSsaVar(InsnRemover.java:162)
        	at jadx.core.utils.InsnRemover.unbindResult(InsnRemover.java:127)
        	at jadx.core.utils.InsnRemover.unbindInsn(InsnRemover.java:91)
        	at jadx.core.utils.InsnRemover.addAndUnbind(InsnRemover.java:57)
        	at jadx.core.dex.visitors.ModVisitor.removeStep(ModVisitor.java:463)
        	at jadx.core.dex.visitors.ModVisitor.visit(ModVisitor.java:97)
        */
    @Override // o0OOo0Oo.InterfaceC27304OooOo
    public final java.lang.Object OooO0Oo(com.orion.notein.domain.models.material.Material r34, oO00ooo.AbstractC32479OooO0OO r35) {
        /*
            Method dump skipped, instruction units count: 773
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: o0OO0ooO.C26952OooO.OooO0Oo(com.orion.notein.domain.models.material.Material, oO00ooo.OooO0OO):java.lang.Object");
    }

    @Override // o0OOo0Oo.InterfaceC27304OooOo
    public final C26958OooO0o0 OooO0o() {
        return new C26958OooO0o0(this.f93613OooO00o.OooO0o0(), 0);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // o0OOo0Oo.InterfaceC27304OooOo
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object OooO0o0(String str, AbstractC32479OooO0OO abstractC32479OooO0OO) {
        C26955OooO0OO c26955OooO0OO;
        C26952OooO c26952OooO;
        if (abstractC32479OooO0OO instanceof C26955OooO0OO) {
            c26955OooO0OO = (C26955OooO0OO) abstractC32479OooO0OO;
            int i = c26955OooO0OO.f93626OooOoO;
            if ((i & Integer.MIN_VALUE) != 0) {
                c26955OooO0OO.f93626OooOoO = i - Integer.MIN_VALUE;
            } else {
                c26955OooO0OO = new C26955OooO0OO(this, abstractC32479OooO0OO);
            }
        }
        Object objOooO0o0 = c26955OooO0OO.f93624OooOo;
        EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
        int i2 = c26955OooO0OO.f93626OooOoO;
        if (i2 == 0) {
            C32446OooOOOo.OooO0O0(objOooO0o0);
            c26955OooO0OO.f93625OooOo0o = this;
            c26955OooO0OO.f93626OooOoO = 1;
            objOooO0o0 = this.f93614OooO0O0.OooO0o0(str, c26955OooO0OO);
            if (objOooO0o0 == enumC32485OooO00o) {
                return enumC32485OooO00o;
            }
            c26952OooO = this;
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            c26952OooO = c26955OooO0OO.f93625OooOo0o;
            C32446OooOOOo.OooO0O0(objOooO0o0);
        }
        DownloadedMaterialEntity downloadedMaterialEntity = (DownloadedMaterialEntity) objOooO0o0;
        if (downloadedMaterialEntity == null) {
            return null;
        }
        return c26952OooO.OooOOO0(downloadedMaterialEntity);
    }

    @Override // o0OOo0Oo.InterfaceC27304OooOo
    public final InterfaceC33721OooO0o<List<MaterialDownloadStateEntity>> OooO0oO() {
        return this.f93613OooO00o.OooO0o();
    }

    @Override // o0OOo0Oo.InterfaceC27304OooOo
    public final Object OooO0oo(String str, o0O0O00 o0o0o00) throws Throwable {
        C33874OooO0OO c33874OooO0OO = C33649OoooOOo.f121328OooO00o;
        Object objOooO0o = C33609OooO0oo.OooO0o(ExecutorC33873OooO0O0.f122045OooOoO0, new C26954OooO0O0(this, str, null), o0o0o00);
        return objOooO0o == EnumC32485OooO00o.f116726OooOo0o ? objOooO0o : C32460OooOooO.f116667OooO00o;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Can't wrap try/catch for region: R(17:0|2|(18:4|179|5|(1:7)(1:11)|(0)|16|(1:18)|19|(1:21)|22|181|23|24|26|(1:28)(1:30)|29|31|SW:32)(1:14)|15|16|(0)|19|(0)|22|181|23|24|26|(0)(0)|29|31|SW:32) */
    /* JADX WARN: Code restructure failed: missing block: B:113:0x01f4, code lost:
    
        if (r4.equals("template_single") != false) goto L114;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0065, code lost:
    
        r4 = com.orion.notein.domain.models.material.Entitlement.FREE;
     */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Removed duplicated region for block: B:112:0x01ec  */
    /* JADX WARN: Removed duplicated region for block: B:132:0x0265  */
    /* JADX WARN: Removed duplicated region for block: B:142:0x027e  */
    /* JADX WARN: Removed duplicated region for block: B:151:0x02b2  */
    /* JADX WARN: Removed duplicated region for block: B:173:0x0308  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x003c  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0047  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x006e  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0074  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0090  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x009c  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00f4  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x0168  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x0181  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x01aa  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Material OooOOO0(DownloadedMaterialEntity downloadedMaterialEntity) {
        Map map;
        String authorId;
        String authorDescription;
        String type;
        Material sticker;
        String str;
        long jLongValue;
        PageSize pageSizeValueOf;
        Orientation orientationValueOf;
        PageSize pageSizeValueOf2;
        Orientation orientationValueOf2;
        Object objFromJson;
        String specJson = downloadedMaterialEntity.getSpecJson();
        if (specJson != null) {
            try {
                objFromJson = this.f93615OooO0OO.fromJson(specJson, (Class<Object>) Map.class);
            } catch (Exception e) {
                C34406OooO00o.f123390OooO00o.OooOO0o(e, com.alibaba.sdk.android.oss.internal.OooO00o.OooO00o("Failed to parse specJson for material: ", downloadedMaterialEntity.getId()), new Object[0]);
            }
            map = objFromJson instanceof Map ? (Map) objFromJson : null;
            if (map == null) {
            }
            authorId = downloadedMaterialEntity.getAuthorId();
            if (authorId == null) {
                authorId = "";
            }
            String authorName = downloadedMaterialEntity.getAuthorName();
            authorDescription = downloadedMaterialEntity.getAuthorDescription();
            if (authorDescription == null) {
                authorDescription = "";
            }
            Creator creator = new Creator(authorId, authorName, authorDescription, downloadedMaterialEntity.getAuthorAvatarUrl());
            String upperCase = downloadedMaterialEntity.getEntitlement().toUpperCase(Locale.ROOT);
            kotlin.jvm.internal.OooOOO0.OooO0o(upperCase, "toUpperCase(...)");
            Entitlement entitlementValueOf = Entitlement.valueOf(upperCase);
            Entitlement entitlement = entitlementValueOf;
            String previewUrl = downloadedMaterialEntity.getPreviewUrl();
            List listOooO0oO = previewUrl == null ? OooOo.OooO0oO(previewUrl) : C34434OooOoO.f123453OooOo0o;
            type = downloadedMaterialEntity.getType();
            switch (type.hashCode()) {
                case -1890252483:
                    if (type.equals("sticker")) {
                        String id = downloadedMaterialEntity.getId();
                        String title = downloadedMaterialEntity.getTitle();
                        String description = downloadedMaterialEntity.getDescription();
                        String str2 = description == null ? "" : description;
                        String coverUrl = downloadedMaterialEntity.getCoverUrl();
                        String downloadUrl = downloadedMaterialEntity.getDownloadUrl();
                        String str3 = downloadUrl == null ? "" : downloadUrl;
                        Long fileSize = downloadedMaterialEntity.getFileSize();
                        long jLongValue2 = fileSize != null ? fileSize.longValue() : 0L;
                        Object obj = map.get("stickerCount");
                        Number number = obj instanceof Number ? (Number) obj : null;
                        sticker = new Sticker(id, title, str2, coverUrl, listOooO0oO, entitlement, creator, str3, jLongValue2, number != null ? number.intValue() : 0);
                        return sticker;
                    }
                    throw new IllegalArgumentException(com.alibaba.sdk.android.oss.internal.OooO00o.OooO00o("Unknown material type: ", downloadedMaterialEntity.getType()));
                case -1237346387:
                    str = "";
                    break;
                case -798910853:
                    if (type.equals("palette")) {
                        String id2 = downloadedMaterialEntity.getId();
                        String title2 = downloadedMaterialEntity.getTitle();
                        String description2 = downloadedMaterialEntity.getDescription();
                        String str4 = description2 == null ? "" : description2;
                        String coverUrl2 = downloadedMaterialEntity.getCoverUrl();
                        String downloadUrl2 = downloadedMaterialEntity.getDownloadUrl();
                        String str5 = downloadUrl2 == null ? "" : downloadUrl2;
                        Long fileSize2 = downloadedMaterialEntity.getFileSize();
                        sticker = new Palette(id2, title2, str4, coverUrl2, listOooO0oO, entitlement, creator, str5, fileSize2 != null ? fileSize2.longValue() : 0L, OooOO0O(map, "colors"));
                        return sticker;
                    }
                    throw new IllegalArgumentException(com.alibaba.sdk.android.oss.internal.OooO00o.OooO00o("Unknown material type: ", downloadedMaterialEntity.getType()));
                case -180558962:
                    if (type.equals("template_book")) {
                        List listOooOO0o = OooOO0o(map.get("files"));
                        C34406OooO00o.f123390OooO00o.OooO00o("Rebuilding template_book from DB: id=" + downloadedMaterialEntity.getId() + ", files.size=" + listOooOO0o.size(), new Object[0]);
                        String id3 = downloadedMaterialEntity.getId();
                        String title3 = downloadedMaterialEntity.getTitle();
                        String description3 = downloadedMaterialEntity.getDescription();
                        if (description3 == null) {
                            description3 = "";
                        }
                        String coverUrl3 = downloadedMaterialEntity.getCoverUrl();
                        String downloadUrl3 = downloadedMaterialEntity.getDownloadUrl();
                        if (downloadUrl3 == null) {
                            downloadUrl3 = "";
                        }
                        Long fileSize3 = downloadedMaterialEntity.getFileSize();
                        jLongValue = fileSize3 != null ? fileSize3.longValue() : 0L;
                        Object obj2 = map.get("pageSize");
                        String str6 = obj2 instanceof String ? (String) obj2 : null;
                        if (str6 != null) {
                            try {
                                pageSizeValueOf = PageSize.valueOf(str6);
                            } catch (Exception unused) {
                                pageSizeValueOf = PageSize.f57843A4;
                            }
                            if (pageSizeValueOf == null) {
                                pageSizeValueOf = PageSize.f57843A4;
                            }
                            Object obj3 = map.get("orientation");
                            String str7 = obj3 instanceof String ? (String) obj3 : null;
                            if (str7 != null) {
                                try {
                                    orientationValueOf = Orientation.valueOf(str7);
                                } catch (Exception unused2) {
                                    orientationValueOf = Orientation.PORTRAIT;
                                }
                                if (orientationValueOf == null) {
                                    orientationValueOf = Orientation.PORTRAIT;
                                }
                                Object obj4 = map.get("pageCount");
                                Number number2 = obj4 instanceof Number ? (Number) obj4 : null;
                                sticker = new TemplateBook(id3, title3, description3, coverUrl3, listOooO0oO, entitlement, creator, downloadUrl3, jLongValue, pageSizeValueOf, orientationValueOf, number2 != null ? number2.intValue() : 0, listOooOO0o);
                                break;
                            }
                            break;
                        }
                        return sticker;
                    }
                    throw new IllegalArgumentException(com.alibaba.sdk.android.oss.internal.OooO00o.OooO00o("Unknown material type: ", downloadedMaterialEntity.getType()));
                case 3148879:
                    if (type.equals("font")) {
                        String id4 = downloadedMaterialEntity.getId();
                        String title4 = downloadedMaterialEntity.getTitle();
                        String description4 = downloadedMaterialEntity.getDescription();
                        String str8 = description4 == null ? "" : description4;
                        String coverUrl4 = downloadedMaterialEntity.getCoverUrl();
                        String downloadUrl4 = downloadedMaterialEntity.getDownloadUrl();
                        String str9 = downloadUrl4 == null ? "" : downloadUrl4;
                        Long fileSize4 = downloadedMaterialEntity.getFileSize();
                        long jLongValue3 = fileSize4 != null ? fileSize4.longValue() : 0L;
                        Object obj5 = map.get("fontFamily");
                        String str10 = obj5 instanceof String ? (String) obj5 : null;
                        sticker = new Font(id4, title4, str8, coverUrl4, listOooO0oO, entitlement, creator, str9, jLongValue3, str10 == null ? "" : str10, OooOO0O(map, "fontWeights"));
                        return sticker;
                    }
                    throw new IllegalArgumentException(com.alibaba.sdk.android.oss.internal.OooO00o.OooO00o("Unknown material type: ", downloadedMaterialEntity.getType()));
                case 973768579:
                    if (type.equals("template_collection")) {
                        str = "";
                        List listOooOO0o2 = OooOO0o(map.get("files"));
                        C34406OooO00o.f123390OooO00o.OooO00o("Rebuilding template_single from DB: id=" + downloadedMaterialEntity.getId() + ", files.size=" + listOooOO0o2.size(), new Object[0]);
                        String id5 = downloadedMaterialEntity.getId();
                        String title5 = downloadedMaterialEntity.getTitle();
                        String description5 = downloadedMaterialEntity.getDescription();
                        if (description5 == null) {
                            description5 = str;
                        }
                        String coverUrl5 = downloadedMaterialEntity.getCoverUrl();
                        String downloadUrl5 = downloadedMaterialEntity.getDownloadUrl();
                        if (downloadUrl5 == null) {
                            downloadUrl5 = str;
                        }
                        Long fileSize5 = downloadedMaterialEntity.getFileSize();
                        jLongValue = fileSize5 != null ? fileSize5.longValue() : 0L;
                        Object obj6 = map.get("pageSize");
                        String str11 = obj6 instanceof String ? (String) obj6 : null;
                        if (str11 != null) {
                            try {
                                pageSizeValueOf2 = PageSize.valueOf(str11);
                            } catch (Exception unused3) {
                                pageSizeValueOf2 = PageSize.f57843A4;
                            }
                            if (pageSizeValueOf2 == null) {
                                pageSizeValueOf2 = PageSize.f57843A4;
                            }
                            Object obj7 = map.get("orientation");
                            String str12 = obj7 instanceof String ? (String) obj7 : null;
                            if (str12 != null) {
                                try {
                                    orientationValueOf2 = Orientation.valueOf(str12);
                                } catch (Exception unused4) {
                                    orientationValueOf2 = Orientation.PORTRAIT;
                                }
                                if (orientationValueOf2 == null) {
                                    orientationValueOf2 = Orientation.PORTRAIT;
                                }
                                Object obj8 = map.get("pageCount");
                                Number number3 = obj8 instanceof Number ? (Number) obj8 : null;
                                sticker = new TemplateCollection(id5, title5, description5, coverUrl5, listOooO0oO, entitlement, creator, downloadUrl5, jLongValue, pageSizeValueOf2, orientationValueOf2, number3 != null ? number3.intValue() : 0, OooOO0O(map, "colorVariants"), listOooOO0o2);
                                break;
                            }
                            break;
                        }
                        return sticker;
                    }
                    throw new IllegalArgumentException(com.alibaba.sdk.android.oss.internal.OooO00o.OooO00o("Unknown material type: ", downloadedMaterialEntity.getType()));
                default:
                    throw new IllegalArgumentException(com.alibaba.sdk.android.oss.internal.OooO00o.OooO00o("Unknown material type: ", downloadedMaterialEntity.getType()));
            }
        }
        map = C34436OooOoOO.f123455OooOo0o;
        authorId = downloadedMaterialEntity.getAuthorId();
        if (authorId == null) {
        }
        String authorName2 = downloadedMaterialEntity.getAuthorName();
        authorDescription = downloadedMaterialEntity.getAuthorDescription();
        if (authorDescription == null) {
        }
        Creator creator2 = new Creator(authorId, authorName2, authorDescription, downloadedMaterialEntity.getAuthorAvatarUrl());
        String upperCase2 = downloadedMaterialEntity.getEntitlement().toUpperCase(Locale.ROOT);
        kotlin.jvm.internal.OooOOO0.OooO0o(upperCase2, "toUpperCase(...)");
        Entitlement entitlementValueOf2 = Entitlement.valueOf(upperCase2);
        Entitlement entitlement2 = entitlementValueOf2;
        String previewUrl2 = downloadedMaterialEntity.getPreviewUrl();
        List listOooO0oO2 = previewUrl2 == null ? OooOo.OooO0oO(previewUrl2) : C34434OooOoO.f123453OooOo0o;
        type = downloadedMaterialEntity.getType();
        switch (type.hashCode()) {
            case -1890252483:
                break;
            case -1237346387:
                break;
            case -798910853:
                break;
            case -180558962:
                break;
            case 3148879:
                break;
            case 973768579:
                break;
        }
    }
}
