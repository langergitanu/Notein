package o0OOo0o;

import com.aspose.slides.C22227OoooO;
import com.aspose.words.StyleIdentifier;
import com.orion.notein.domain.models.sticker.Sticker;
import com.orion.notein.domain.models.sticker.StickerCollection;
import com.orion.notein.global.R;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import o00o00O0.C25252OooO0Oo;
import o0O0oooO.AbstractApplicationC26277OooOoOO;
import o0OO00o0.C26596o00O0o0;
import o0OOO0oo.C27072OooOO0O;
import o0OOOO0o.C27129OoooOOO;
import o0OOo0Oo.InterfaceC27298OooOOO0;
import o0OOo0Oo.InterfaceC27321Oooo0o;
import oO00ooO.C32446OooOOOo;
import oO00ooO.C32460OooOooO;
import oO00ooo.AbstractC32476OooO;
import oO00ooo.AbstractC32479OooO0OO;
import oO00ooo0.EnumC32485OooO00o;
import oO0O000.C32501OooO0oO;
import oO0o0OO.C33609OooO0oo;
import oO0o0OO.C33649OoooOOo;
import oO0o0o0o.C33874OooO0OO;
import oO0o0o0o.ExecutorC33873OooO0O0;
import oOO00oo.C34406OooO00o;
import oOo000Oo.C34428OooOOo;
import oOo000Oo.C34429OooOOo0;

/* JADX INFO: renamed from: o0OOo0o.o00o0o0O, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C27538o00o0o0O {

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public static final List<String> f96549OooO0oO = C34429OooOOo0.OooOO0o("post", "planner1", "planner2", "planner3", "planner4", "planner5", "planner6", "animal", "sketches", "element");

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final InterfaceC27321Oooo0o f96550OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final C27129OoooOOO f96551OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public final InterfaceC27298OooOOO0 f96552OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final C26596o00O0o0 f96553OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public final AbstractApplicationC26277OooOoOO f96554OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final o0OOo0Oo.Oooo000 f96555OooO0o0;

    public C27538o00o0o0O(InterfaceC27321Oooo0o stickerRepo, C27129OoooOOO c27129OoooOOO, InterfaceC27298OooOOO0 fileRepo, C26596o00O0o0 c26596o00O0o0, o0OOo0Oo.Oooo000 ossRepo, AbstractApplicationC26277OooOoOO abstractApplicationC26277OooOoOO) {
        kotlin.jvm.internal.OooOOO0.OooO0oO(stickerRepo, "stickerRepo");
        kotlin.jvm.internal.OooOOO0.OooO0oO(fileRepo, "fileRepo");
        kotlin.jvm.internal.OooOOO0.OooO0oO(ossRepo, "ossRepo");
        this.f96550OooO00o = stickerRepo;
        this.f96551OooO0O0 = c27129OoooOOO;
        this.f96552OooO0OO = fileRepo;
        this.f96553OooO0Oo = c26596o00O0o0;
        this.f96555OooO0o0 = ossRepo;
        this.f96554OooO0o = abstractApplicationC26277OooOoOO;
    }

    public static final Object OooO00o(C27538o00o0o0O c27538o00o0o0O, List list, File file, AbstractC32476OooO abstractC32476OooO) {
        c27538o00o0o0O.getClass();
        C33874OooO0OO c33874OooO0OO = C33649OoooOOo.f121328OooO00o;
        return C33609OooO0oo.OooO0o(ExecutorC33873OooO0O0.f122045OooOoO0, new C27521o00o00o0(list, c27538o00o0o0O, file, null), abstractC32476OooO);
    }

    public static final File OooO0O0(C27538o00o0o0O c27538o00o0o0O, String str) {
        c27538o00o0o0O.getClass();
        File file = new File(c27538o00o0o0O.f96554OooO0o.getCacheDir(), "stickers");
        file.mkdirs();
        File file2 = new File(file, str);
        if (file2.exists()) {
            C32501OooO0oO.OooO0Oo(file2);
        }
        file2.mkdirs();
        return file2;
    }

    public static final File OooO0OO(C27538o00o0o0O c27538o00o0o0O, String str) throws IOException {
        c27538o00o0o0O.getClass();
        File file = new File(c27538o00o0o0O.f96554OooO0o.getCacheDir(), "stickers_zip");
        file.mkdirs();
        File file2 = new File(file, str);
        if (file2.exists()) {
            file2.delete();
        }
        file2.createNewFile();
        return file2;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0016  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object OooO0Oo(C27538o00o0o0O c27538o00o0o0O, String str, AbstractC32479OooO0OO abstractC32479OooO0OO) {
        C27529o00o0OO0 c27529o00o0OO0;
        c27538o00o0o0O.getClass();
        if (abstractC32479OooO0OO instanceof C27529o00o0OO0) {
            c27529o00o0OO0 = (C27529o00o0OO0) abstractC32479OooO0OO;
            int i = c27529o00o0OO0.f96499OooOoO;
            if ((i & Integer.MIN_VALUE) != 0) {
                c27529o00o0OO0.f96499OooOoO = i - Integer.MIN_VALUE;
            } else {
                c27529o00o0OO0 = new C27529o00o0OO0(c27538o00o0o0O, abstractC32479OooO0OO);
            }
        }
        Object objOooO0OO = c27529o00o0OO0.f96497OooOo;
        EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
        int i2 = c27529o00o0OO0.f96499OooOoO;
        if (i2 == 0) {
            C32446OooOOOo.OooO0O0(objOooO0OO);
            c27529o00o0OO0.f96498OooOo0o = str;
            c27529o00o0OO0.f96499OooOoO = 1;
            objOooO0OO = c27538o00o0o0O.f96550OooO00o.OooO0OO(c27529o00o0OO0);
            if (objOooO0OO == enumC32485OooO00o) {
                return enumC32485OooO00o;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            str = c27529o00o0OO0.f96498OooOo0o;
            C32446OooOOOo.OooO0O0(objOooO0OO);
        }
        File file = new File((File) objOooO0OO, str);
        file.mkdirs();
        return file;
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    public final String OooO0o(StickerCollection item) {
        kotlin.jvm.internal.OooOOO0.OooO0oO(item, "item");
        if (!item.getBuiltIn()) {
            return item.getName();
        }
        String id = item.getId();
        int iHashCode = id.hashCode();
        AbstractApplicationC26277OooOoOO abstractApplicationC26277OooOoOO = this.f96554OooO0o;
        switch (iHashCode) {
            case -1407496688:
                if (id.equals("notein_built_in_sticker_set_post")) {
                    if (!"post".equals(item.getName())) {
                        return item.getName();
                    }
                    String string = abstractApplicationC26277OooOoOO.getString(R.string.sticker_collection_post);
                    kotlin.jvm.internal.OooOOO0.OooO0Oo(string);
                    return string;
                }
                break;
            case -1090839862:
                if (id.equals("notein_built_in_sticker_set_sketches")) {
                    if (!"sketches".equals(item.getName())) {
                        return item.getName();
                    }
                    String string2 = abstractApplicationC26277OooOoOO.getString(R.string.sticker_collection_sketches);
                    kotlin.jvm.internal.OooOOO0.OooO0Oo(string2);
                    return string2;
                }
                break;
            case -239651956:
                if (id.equals("notein_built_in_sticker_set_element")) {
                    if (!"element".equals(item.getName())) {
                        return item.getName();
                    }
                    String string3 = abstractApplicationC26277OooOoOO.getString(R.string.sticker_collection_element);
                    kotlin.jvm.internal.OooOOO0.OooO0Oo(string3);
                    return string3;
                }
                break;
            case -120281236:
                if (id.equals("notein_built_in_sticker_set_animal")) {
                    if (!"animal".equals(item.getName())) {
                        return item.getName();
                    }
                    String string4 = abstractApplicationC26277OooOoOO.getString(R.string.sticker_collection_animal);
                    kotlin.jvm.internal.OooOOO0.OooO0Oo(string4);
                    return string4;
                }
                break;
            default:
                switch (iHashCode) {
                    case -1256532465:
                        if (id.equals("notein_built_in_sticker_set_planner1")) {
                            if (!"planner1".equals(item.getName())) {
                                return item.getName();
                            }
                            String string5 = abstractApplicationC26277OooOoOO.getString(R.string.sticker_collection_planner1);
                            kotlin.jvm.internal.OooOOO0.OooO0Oo(string5);
                            return string5;
                        }
                        break;
                    case -1256532464:
                        if (id.equals("notein_built_in_sticker_set_planner2")) {
                            if (!"planner2".equals(item.getName())) {
                                return item.getName();
                            }
                            String string6 = abstractApplicationC26277OooOoOO.getString(R.string.sticker_collection_planner2);
                            kotlin.jvm.internal.OooOOO0.OooO0Oo(string6);
                            return string6;
                        }
                        break;
                    case -1256532463:
                        if (id.equals("notein_built_in_sticker_set_planner3")) {
                            if (!"planner3".equals(item.getName())) {
                                return item.getName();
                            }
                            String string7 = abstractApplicationC26277OooOoOO.getString(R.string.sticker_collection_planner3);
                            kotlin.jvm.internal.OooOOO0.OooO0Oo(string7);
                            return string7;
                        }
                        break;
                    case -1256532462:
                        if (id.equals("notein_built_in_sticker_set_planner4")) {
                            if (!"planner4".equals(item.getName())) {
                                return item.getName();
                            }
                            String string8 = abstractApplicationC26277OooOoOO.getString(R.string.sticker_collection_planner4);
                            kotlin.jvm.internal.OooOOO0.OooO0Oo(string8);
                            return string8;
                        }
                        break;
                    case -1256532461:
                        if (id.equals("notein_built_in_sticker_set_planner5")) {
                            if (!"planner5".equals(item.getName())) {
                                return item.getName();
                            }
                            String string9 = abstractApplicationC26277OooOoOO.getString(R.string.sticker_collection_planner5);
                            kotlin.jvm.internal.OooOOO0.OooO0Oo(string9);
                            return string9;
                        }
                        break;
                    case -1256532460:
                        if (id.equals("notein_built_in_sticker_set_planner6")) {
                            if (!"planner6".equals(item.getName())) {
                                return item.getName();
                            }
                            String string10 = abstractApplicationC26277OooOoOO.getString(R.string.sticker_collection_planner6);
                            kotlin.jvm.internal.OooOOO0.OooO0Oo(string10);
                            return string10;
                        }
                        break;
                }
                break;
        }
        return item.getName();
    }

    /* JADX WARN: Code restructure failed: missing block: B:29:0x00f0, code lost:
    
        if (r1.OooO0O0(r6, r2) == r3) goto L30;
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0017  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object OooO0o0(String str, AbstractC32479OooO0OO abstractC32479OooO0OO) {
        C27518o00o00O0 c27518o00o00O0;
        String str2;
        C27538o00o0o0O c27538o00o0o0O;
        if (abstractC32479OooO0OO instanceof C27518o00o00O0) {
            c27518o00o00O0 = (C27518o00o00O0) abstractC32479OooO0OO;
            int i = c27518o00o00O0.f96444OooOoOO;
            if ((i & Integer.MIN_VALUE) != 0) {
                c27518o00o00O0.f96444OooOoOO = i - Integer.MIN_VALUE;
            } else {
                c27518o00o00O0 = new C27518o00o00O0(this, abstractC32479OooO0OO);
            }
        }
        Object obj = c27518o00o00O0.f96443OooOoO0;
        EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
        int i2 = c27518o00o00O0.f96444OooOoOO;
        if (i2 == 0) {
            C32446OooOOOo.OooO0O0(obj);
            c27518o00o00O0.f96441OooOo0o = this;
            c27518o00o00O0.f96440OooOo = str;
            c27518o00o00O0.f96444OooOoOO = 1;
            Object objOooOO0o = this.f96550OooO00o.OooOO0o(c27518o00o00O0);
            if (objOooOO0o != enumC32485OooO00o) {
                str2 = str;
                obj = objOooOO0o;
                c27538o00o0o0O = this;
            }
            return enumC32485OooO00o;
        }
        if (i2 != 1) {
            if (i2 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C32446OooOOOo.OooO0O0(obj);
            return C32460OooOooO.f116667OooO00o;
        }
        String str3 = c27518o00o00O0.f96440OooOo;
        C27538o00o0o0O c27538o00o0o0O2 = c27518o00o00O0.f96441OooOo0o;
        C32446OooOOOo.OooO0O0(obj);
        str2 = str3;
        c27538o00o0o0O = c27538o00o0o0O2;
        C34406OooO00o.C20358OooO00o c20358OooO00o = C34406OooO00o.f123390OooO00o;
        c20358OooO00o.OooOOO0("StickerUseCase");
        List list = (List) obj;
        ArrayList arrayList = new ArrayList(C34428OooOOo.OooOOoo(list, 10));
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(((StickerCollection) it.next()).getName());
        }
        c20358OooO00o.OooO0o0("adoptOrphanStickers: " + str2 + ", stickerCollections: " + arrayList, new Object[0]);
        ArrayList arrayList2 = new ArrayList(C34428OooOOo.OooOOoo(list, 10));
        Iterator it2 = list.iterator();
        while (it2.hasNext()) {
            ArrayList arrayList3 = arrayList2;
            arrayList3.add(StickerCollection.copy$default((StickerCollection) it2.next(), null, str2, null, null, false, 0L, 0L, 0, StyleIdentifier.MEDIUM_GRID_1_ACCENT_6, null));
            arrayList2 = arrayList3;
        }
        InterfaceC27321Oooo0o interfaceC27321Oooo0o = c27538o00o0o0O.f96550OooO00o;
        c27518o00o00O0.f96441OooOo0o = null;
        c27518o00o00O0.f96440OooOo = null;
        c27518o00o00O0.f96444OooOoOO = 2;
    }

    /* JADX WARN: Code restructure failed: missing block: B:34:0x0100, code lost:
    
        if (r1 != r3) goto L36;
     */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0110  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x014a  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x016a  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0196 A[LOOP:2: B:56:0x0190->B:58:0x0196, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:62:0x01f6  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x01fd  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0017  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:62:0x01f6 -> B:63:0x01f8). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object OooO0oO(String str, AbstractC32479OooO0OO abstractC32479OooO0OO) {
        C27534o00o0OoO c27534o00o0OoO;
        String str2;
        C27538o00o0o0O c27538o00o0o0O;
        Iterator it;
        StickerCollection stickerCollection;
        C27538o00o0o0O c27538o00o0o0O2;
        Iterator it2;
        Iterator it3;
        StickerCollection stickerCollectionCopy$default;
        InterfaceC27321Oooo0o interfaceC27321Oooo0o;
        if (abstractC32479OooO0OO instanceof C27534o00o0OoO) {
            c27534o00o0OoO = (C27534o00o0OoO) abstractC32479OooO0OO;
            int i = c27534o00o0OoO.f96515OooOoo0;
            if ((i & Integer.MIN_VALUE) != 0) {
                c27534o00o0OoO.f96515OooOoo0 = i - Integer.MIN_VALUE;
            } else {
                c27534o00o0OoO = new C27534o00o0OoO(this, abstractC32479OooO0OO);
            }
        }
        Object objOooOOO0 = c27534o00o0OoO.f96512OooOoO;
        EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
        int i2 = c27534o00o0OoO.f96515OooOoo0;
        int i3 = 10;
        int i4 = 4;
        if (i2 == 0) {
            C32446OooOOOo.OooO0O0(objOooOOO0);
            c27534o00o0OoO.f96511OooOo0o = this;
            c27534o00o0OoO.f96510OooOo = str;
            c27534o00o0OoO.f96515OooOoo0 = 1;
            Object objOooO0o0 = this.f96550OooO00o.OooO0o0(c27534o00o0OoO);
            if (objOooO0o0 != enumC32485OooO00o) {
                str2 = str;
                objOooOOO0 = objOooO0o0;
                c27538o00o0o0O = this;
            }
            return enumC32485OooO00o;
        }
        if (i2 == 1) {
            String str3 = (String) c27534o00o0OoO.f96510OooOo;
            C27538o00o0o0O c27538o00o0o0O3 = c27534o00o0OoO.f96511OooOo0o;
            C32446OooOOOo.OooO0O0(objOooOOO0);
            str2 = str3;
            c27538o00o0o0O = c27538o00o0o0O3;
        } else if (i2 == 2) {
            String str4 = (String) c27534o00o0OoO.f96510OooOo;
            C27538o00o0o0O c27538o00o0o0O4 = c27534o00o0OoO.f96511OooOo0o;
            C32446OooOOOo.OooO0O0(objOooOOO0);
            str2 = str4;
            c27538o00o0o0O = c27538o00o0o0O4;
            InterfaceC27321Oooo0o interfaceC27321Oooo0o2 = c27538o00o0o0O.f96550OooO00o;
            c27534o00o0OoO.f96511OooOo0o = c27538o00o0o0O;
            c27534o00o0OoO.f96510OooOo = null;
            c27534o00o0OoO.f96515OooOoo0 = 3;
            objOooOOO0 = interfaceC27321Oooo0o2.OooOOO0(str2, c27534o00o0OoO);
        } else if (i2 == 3) {
            c27538o00o0o0O = c27534o00o0OoO.f96511OooOo0o;
            C32446OooOOOo.OooO0O0(objOooOOO0);
            it = ((List) objOooOOO0).iterator();
            if (it.hasNext()) {
            }
        } else {
            if (i2 == 4) {
                StickerCollection stickerCollection2 = c27534o00o0OoO.f96513OooOoO0;
                Iterator it4 = (Iterator) c27534o00o0OoO.f96510OooOo;
                C27538o00o0o0O c27538o00o0o0O5 = c27534o00o0OoO.f96511OooOo0o;
                C32446OooOOOo.OooO0O0(objOooOOO0);
                stickerCollection = stickerCollection2;
                it2 = it4;
                c27538o00o0o0O2 = c27538o00o0o0O5;
                ArrayList arrayList = new ArrayList();
                while (r1.hasNext()) {
                }
                ArrayList arrayList2 = new ArrayList();
                while (r12.hasNext()) {
                }
                ArrayList arrayList3 = new ArrayList(C34428OooOOo.OooOOoo(arrayList2, i3));
                it3 = arrayList2.iterator();
                while (it3.hasNext()) {
                }
                C34406OooO00o.C20358OooO00o c20358OooO00o = C34406OooO00o.f123390OooO00o;
                c20358OooO00o.OooOOO0("StickerUseCase");
                StringBuilder sbOooO0O0 = com.aspose.slides.internal.p332p7.OooO0o.OooO0O0("resetAllStickersUserId stickerCollection id: ", stickerCollection.getId(), ",stickerCollection name: ", stickerCollection.getName(), ",toAddStickerIds: ");
                sbOooO0O0.append(arrayList3);
                c20358OooO00o.OooO0o0(sbOooO0O0.toString(), new Object[0]);
                stickerCollectionCopy$default = StickerCollection.copy$default(stickerCollection, null, null, null, oOo000Oo.OooOo.OooooOO(arrayList3, stickerCollection.getChildren()), false, 0L, 0L, 0, StyleIdentifier.LIGHT_LIST_ACCENT_6, null);
                interfaceC27321Oooo0o = c27538o00o0o0O2.f96550OooO00o;
                c27534o00o0OoO.f96511OooOo0o = c27538o00o0o0O2;
                c27534o00o0OoO.f96510OooOo = it2;
                c27534o00o0OoO.f96513OooOoO0 = null;
                c27534o00o0OoO.f96515OooOoo0 = 5;
                if (interfaceC27321Oooo0o.OooOO0O(stickerCollectionCopy$default, c27534o00o0OoO) != enumC32485OooO00o) {
                }
                return enumC32485OooO00o;
            }
            if (i2 != 5) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            Iterator it5 = (Iterator) c27534o00o0OoO.f96510OooOo;
            C27538o00o0o0O c27538o00o0o0O6 = c27534o00o0OoO.f96511OooOo0o;
            C32446OooOOOo.OooO0O0(objOooOOO0);
            it = it5;
            c27538o00o0o0O = c27538o00o0o0O6;
            i3 = 10;
            i4 = 4;
            if (it.hasNext()) {
                StickerCollection stickerCollection3 = (StickerCollection) it.next();
                C27072OooOO0O c27072OooOO0OOooO00o = c27538o00o0o0O.f96550OooO00o.OooO00o(stickerCollection3.getId());
                c27534o00o0OoO.f96511OooOo0o = c27538o00o0o0O;
                c27534o00o0OoO.f96510OooOo = it;
                c27534o00o0OoO.f96513OooOoO0 = stickerCollection3;
                c27534o00o0OoO.f96515OooOoo0 = i4;
                Object objOooOOo = C25252OooO0Oo.OooOOo(c27072OooOO0OOooO00o, c27534o00o0OoO);
                if (objOooOOo != enumC32485OooO00o) {
                    C27538o00o0o0O c27538o00o0o0O7 = c27538o00o0o0O;
                    it2 = it;
                    objOooOOO0 = objOooOOo;
                    stickerCollection = stickerCollection3;
                    c27538o00o0o0O2 = c27538o00o0o0O7;
                    ArrayList arrayList4 = new ArrayList();
                    for (Object obj : (List) objOooOOO0) {
                        if (!((Sticker) obj).getBuiltIn()) {
                            arrayList4.add(obj);
                        }
                    }
                    ArrayList arrayList22 = new ArrayList();
                    for (Object obj2 : arrayList4) {
                        if (!stickerCollection.getChildren().contains(((Sticker) obj2).getId())) {
                            arrayList22.add(obj2);
                        }
                    }
                    ArrayList arrayList32 = new ArrayList(C34428OooOOo.OooOOoo(arrayList22, i3));
                    it3 = arrayList22.iterator();
                    while (it3.hasNext()) {
                        arrayList32.add(((Sticker) it3.next()).getId());
                    }
                    C34406OooO00o.C20358OooO00o c20358OooO00o2 = C34406OooO00o.f123390OooO00o;
                    c20358OooO00o2.OooOOO0("StickerUseCase");
                    StringBuilder sbOooO0O02 = com.aspose.slides.internal.p332p7.OooO0o.OooO0O0("resetAllStickersUserId stickerCollection id: ", stickerCollection.getId(), ",stickerCollection name: ", stickerCollection.getName(), ",toAddStickerIds: ");
                    sbOooO0O02.append(arrayList32);
                    c20358OooO00o2.OooO0o0(sbOooO0O02.toString(), new Object[0]);
                    stickerCollectionCopy$default = StickerCollection.copy$default(stickerCollection, null, null, null, oOo000Oo.OooOo.OooooOO(arrayList32, stickerCollection.getChildren()), false, 0L, 0L, 0, StyleIdentifier.LIGHT_LIST_ACCENT_6, null);
                    interfaceC27321Oooo0o = c27538o00o0o0O2.f96550OooO00o;
                    c27534o00o0OoO.f96511OooOo0o = c27538o00o0o0O2;
                    c27534o00o0OoO.f96510OooOo = it2;
                    c27534o00o0OoO.f96513OooOoO0 = null;
                    c27534o00o0OoO.f96515OooOoo0 = 5;
                    if (interfaceC27321Oooo0o.OooOO0O(stickerCollectionCopy$default, c27534o00o0OoO) != enumC32485OooO00o) {
                        it = it2;
                        c27538o00o0o0O = c27538o00o0o0O2;
                        i3 = 10;
                        i4 = 4;
                        if (it.hasNext()) {
                            return C32460OooOooO.f116667OooO00o;
                        }
                    }
                }
                return enumC32485OooO00o;
            }
        }
        List list = (List) objOooOOO0;
        C34406OooO00o.C20358OooO00o c20358OooO00o3 = C34406OooO00o.f123390OooO00o;
        StringBuilder sbOooO00o = C22227OoooO.OooO00o(c20358OooO00o3, "StickerUseCase", "resetAllStickersUserId uid: ", str2, ", stickerCollections: ");
        sbOooO00o.append(list);
        c20358OooO00o3.OooO0o0(sbOooO00o.toString(), new Object[0]);
        List list2 = list;
        ArrayList arrayList5 = new ArrayList(C34428OooOOo.OooOOoo(list2, 10));
        Iterator it6 = list2.iterator();
        while (it6.hasNext()) {
            arrayList5.add(StickerCollection.copy$default((StickerCollection) it6.next(), null, str2, null, null, false, 0L, 0L, 0, StyleIdentifier.MEDIUM_GRID_1_ACCENT_6, null));
        }
        InterfaceC27321Oooo0o interfaceC27321Oooo0o3 = c27538o00o0o0O.f96550OooO00o;
        c27534o00o0OoO.f96511OooOo0o = c27538o00o0o0O;
        c27534o00o0OoO.f96510OooOo = str2;
        c27534o00o0OoO.f96515OooOoo0 = 2;
        if (interfaceC27321Oooo0o3.OooO0O0(arrayList5, c27534o00o0OoO) != enumC32485OooO00o) {
            InterfaceC27321Oooo0o interfaceC27321Oooo0o22 = c27538o00o0o0O.f96550OooO00o;
            c27534o00o0OoO.f96511OooOo0o = c27538o00o0o0O;
            c27534o00o0OoO.f96510OooOo = null;
            c27534o00o0OoO.f96515OooOoo0 = 3;
            objOooOOO0 = interfaceC27321Oooo0o22.OooOOO0(str2, c27534o00o0OoO);
        }
        return enumC32485OooO00o;
    }
}
