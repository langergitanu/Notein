package o0OOo0o;

import androidx.fragment.app.C21904OooOoo0;
import com.aspose.words.StyleIdentifier;
import com.huawei.hms.network.embedded.C18115b5;
import com.microsoft.identity.common.java.marker.PerfConstants;
import com.orion.notein.data.p602db.entity.NotePdfLostInfoEntity;
import com.orion.notein.domain.models.note.NoteContent;
import com.orion.notein.domain.models.note.NoteInFile;
import com.orion.notein.domain.models.note.NoteMeta;
import com.orion.notein.domain.models.page.Page;
import java.io.File;
import java.io.FileFilter;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.regex.Pattern;
import kotlin.coroutines.Continuation;
import o00o00O0.C25252OooO0Oo;
import o00o00Oo.C25261OooO0o0;
import o00ooO0.C25749OooOoO0;
import o0OOo0Oo.InterfaceC27309OooOoO;
import o0OOo0Oo.InterfaceC27312OooOoo;
import o0OOo0Oo.InterfaceC27313OooOoo0;
import o0OOo0o.C27387o0000o0;
import o0OOoOo0.C27808OooOOo;
import o0Oo00o.C28028OooO0o;
import o0oo000O.C31190OooO0oo;
import o0oo000O.C31193OooOOo;
import o0ooO0O0.C31430OooO00o;
import oO00ooO.C32443OooOOO;
import oO00ooO.C32446OooOOOo;
import oO00ooO.C32460OooOooO;
import oO00ooo.AbstractC32476OooO;
import oO00ooo.InterfaceC32482OooO0o0;
import oO00ooo0.EnumC32485OooO00o;
import oO0O000.C32501OooO0oO;
import oO0O000o.InterfaceC32508OooOOOo;
import oO0o0O0o.C33599OooOo0O;
import oO0o0OO.InterfaceC33636Oooo00o;
import oOO00oo.C34406OooO00o;
import oOo000Oo.C34428OooOOo;
import oOo000Oo.C34434OooOoO;
import oOo000Oo.C34436OooOoOO;
import oOo000Oo.C34444Oooo0O0;

/* JADX INFO: loaded from: classes9.dex */
@InterfaceC32482OooO0o0(m80622c = "com.orion.notein.domain.usecase.NoteInFileUseCase$createNoteInFile$2", m80623f = "NoteInFileUseCase.kt", m80624l = {StyleIdentifier.MEDIUM_SHADING_1_ACCENT_6, StyleIdentifier.MEDIUM_LIST_2_ACCENT_6, StyleIdentifier.BOOK_TITLE, StyleIdentifier.GRID_TABLE_2, StyleIdentifier.GRID_TABLE_6_COLORFUL_ACCENT_1, StyleIdentifier.GRID_TABLE_2_ACCENT_3, StyleIdentifier.GRID_TABLE_2_ACCENT_6, StyleIdentifier.LIST_TABLE_4_ACCENT_3, StyleIdentifier.LIST_TABLE_5_DARK_ACCENT_3, StyleIdentifier.LIST_TABLE_6_COLORFUL_ACCENT_3, StyleIdentifier.LIST_TABLE_7_COLORFUL_ACCENT_4, 391}, m80625m = "invokeSuspend")
public final class o000 extends AbstractC32476OooO implements InterfaceC32508OooOOOo<InterfaceC33636Oooo00o, Continuation<? super NoteInFile>, Object> {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public long f95325OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public long f95326OooOo0o;

    /* JADX INFO: renamed from: OooOoO, reason: collision with root package name */
    public Object f95327OooOoO;

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public Object f95328OooOoO0;

    /* JADX INFO: renamed from: OooOoOO, reason: collision with root package name */
    public Object f95329OooOoOO;

    /* JADX INFO: renamed from: OooOoo, reason: collision with root package name */
    public Map f95330OooOoo;

    /* JADX INFO: renamed from: OooOoo0, reason: collision with root package name */
    public Object f95331OooOoo0;

    /* JADX INFO: renamed from: OooOooO, reason: collision with root package name */
    public Map f95332OooOooO;

    /* JADX INFO: renamed from: OooOooo, reason: collision with root package name */
    public Map f95333OooOooo;

    /* JADX INFO: renamed from: Oooo, reason: collision with root package name */
    public final /* synthetic */ String f95334Oooo;

    /* JADX INFO: renamed from: Oooo0, reason: collision with root package name */
    public File f95335Oooo0;

    /* JADX INFO: renamed from: Oooo000, reason: collision with root package name */
    public File f95336Oooo000;

    /* JADX INFO: renamed from: Oooo00O, reason: collision with root package name */
    public File f95337Oooo00O;

    /* JADX INFO: renamed from: Oooo00o, reason: collision with root package name */
    public NoteMeta f95338Oooo00o;

    /* JADX INFO: renamed from: Oooo0O0, reason: collision with root package name */
    public File f95339Oooo0O0;

    /* JADX INFO: renamed from: Oooo0OO, reason: collision with root package name */
    public Object f95340Oooo0OO;

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    public int f95341Oooo0o;

    /* JADX INFO: renamed from: Oooo0o0, reason: collision with root package name */
    public File f95342Oooo0o0;

    /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
    public final /* synthetic */ C27387o0000o0 f95343Oooo0oO;

    /* JADX INFO: renamed from: Oooo0oo, reason: collision with root package name */
    public final /* synthetic */ String f95344Oooo0oo;

    /* JADX INFO: renamed from: OoooO00, reason: collision with root package name */
    public final /* synthetic */ C27387o0000o0.OooO0OO f95345OoooO00;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o000(C27387o0000o0 c27387o0000o0, String str, String str2, C27387o0000o0.OooO0OO oooO0OO, Continuation<? super o000> continuation) {
        super(2, continuation);
        this.f95343Oooo0oO = c27387o0000o0;
        this.f95344Oooo0oo = str;
        this.f95334Oooo = str2;
        this.f95345OoooO00 = oooO0OO;
    }

    @Override // oO00ooo.AbstractC32477OooO00o
    public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
        return new o000(this.f95343Oooo0oO, this.f95344Oooo0oo, this.f95334Oooo, this.f95345OoooO00, continuation);
    }

    @Override // oO0O000o.InterfaceC32508OooOOOo
    public final Object invoke(InterfaceC33636Oooo00o interfaceC33636Oooo00o, Continuation<? super NoteInFile> continuation) {
        return ((o000) create(interfaceC33636Oooo00o, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:100:0x0587 A[Catch: Exception -> 0x040c, LOOP:7: B:98:0x0581->B:100:0x0587, LOOP_END, TryCatch #14 {Exception -> 0x040c, blocks: (B:121:0x071e, B:122:0x073b, B:124:0x0741, B:125:0x077f, B:109:0x0633, B:110:0x064e, B:112:0x0654, B:113:0x0696, B:117:0x06b7, B:90:0x053e, B:91:0x0549, B:93:0x054f, B:95:0x0560, B:97:0x0568, B:98:0x0581, B:100:0x0587, B:101:0x05bf, B:105:0x05d8, B:78:0x045d, B:79:0x0478, B:81:0x047e, B:82:0x04bc, B:86:0x04d7, B:69:0x03fc, B:74:0x0415), top: B:326:0x03fc }] */
    /* JADX WARN: Removed duplicated region for block: B:108:0x0632  */
    /* JADX WARN: Removed duplicated region for block: B:112:0x0654 A[Catch: Exception -> 0x040c, LOOP:5: B:110:0x064e->B:112:0x0654, LOOP_END, TryCatch #14 {Exception -> 0x040c, blocks: (B:121:0x071e, B:122:0x073b, B:124:0x0741, B:125:0x077f, B:109:0x0633, B:110:0x064e, B:112:0x0654, B:113:0x0696, B:117:0x06b7, B:90:0x053e, B:91:0x0549, B:93:0x054f, B:95:0x0560, B:97:0x0568, B:98:0x0581, B:100:0x0587, B:101:0x05bf, B:105:0x05d8, B:78:0x045d, B:79:0x0478, B:81:0x047e, B:82:0x04bc, B:86:0x04d7, B:69:0x03fc, B:74:0x0415), top: B:326:0x03fc }] */
    /* JADX WARN: Removed duplicated region for block: B:119:0x0710  */
    /* JADX WARN: Removed duplicated region for block: B:120:0x0712  */
    /* JADX WARN: Removed duplicated region for block: B:124:0x0741 A[Catch: Exception -> 0x040c, LOOP:2: B:122:0x073b->B:124:0x0741, LOOP_END, TryCatch #14 {Exception -> 0x040c, blocks: (B:121:0x071e, B:122:0x073b, B:124:0x0741, B:125:0x077f, B:109:0x0633, B:110:0x064e, B:112:0x0654, B:113:0x0696, B:117:0x06b7, B:90:0x053e, B:91:0x0549, B:93:0x054f, B:95:0x0560, B:97:0x0568, B:98:0x0581, B:100:0x0587, B:101:0x05bf, B:105:0x05d8, B:78:0x045d, B:79:0x0478, B:81:0x047e, B:82:0x04bc, B:86:0x04d7, B:69:0x03fc, B:74:0x0415), top: B:326:0x03fc }] */
    /* JADX WARN: Removed duplicated region for block: B:129:0x07f3 A[Catch: Exception -> 0x0802, TryCatch #24 {Exception -> 0x0802, blocks: (B:127:0x0793, B:129:0x07f3, B:131:0x07fe, B:134:0x0806, B:135:0x0809, B:136:0x0820, B:138:0x0826, B:139:0x086a), top: B:343:0x0793 }] */
    /* JADX WARN: Removed duplicated region for block: B:138:0x0826 A[Catch: Exception -> 0x0802, LOOP:4: B:136:0x0820->B:138:0x0826, LOOP_END, TryCatch #24 {Exception -> 0x0802, blocks: (B:127:0x0793, B:129:0x07f3, B:131:0x07fe, B:134:0x0806, B:135:0x0809, B:136:0x0820, B:138:0x0826, B:139:0x086a), top: B:343:0x0793 }] */
    /* JADX WARN: Removed duplicated region for block: B:143:0x08e3  */
    /* JADX WARN: Removed duplicated region for block: B:144:0x08e5  */
    /* JADX WARN: Removed duplicated region for block: B:155:0x093d A[Catch: Exception -> 0x0938, TryCatch #3 {Exception -> 0x0938, blocks: (B:147:0x08ed, B:149:0x08fa, B:152:0x0901, B:156:0x0994, B:155:0x093d), top: B:305:0x08ed }] */
    /* JADX WARN: Removed duplicated region for block: B:162:0x0a6e  */
    /* JADX WARN: Removed duplicated region for block: B:165:0x0a8b  */
    /* JADX WARN: Removed duplicated region for block: B:167:0x0a90  */
    /* JADX WARN: Removed duplicated region for block: B:176:0x0ad9  */
    /* JADX WARN: Removed duplicated region for block: B:189:0x0b20  */
    /* JADX WARN: Removed duplicated region for block: B:196:0x0b84  */
    /* JADX WARN: Removed duplicated region for block: B:198:0x0b89  */
    /* JADX WARN: Removed duplicated region for block: B:202:0x0bf9  */
    /* JADX WARN: Removed duplicated region for block: B:203:0x0bfc  */
    /* JADX WARN: Removed duplicated region for block: B:214:0x0c5d  */
    /* JADX WARN: Removed duplicated region for block: B:249:0x0d5a  */
    /* JADX WARN: Removed duplicated region for block: B:252:0x0d7f A[Catch: Exception -> 0x0e7e, TryCatch #20 {Exception -> 0x0e7e, blocks: (B:250:0x0d5b, B:252:0x0d7f, B:254:0x0de5, B:258:0x0e81, B:259:0x0e99, B:260:0x0e9a, B:261:0x0ea4), top: B:338:0x0d5b }] */
    /* JADX WARN: Removed duplicated region for block: B:260:0x0e9a A[Catch: Exception -> 0x0e7e, TryCatch #20 {Exception -> 0x0e7e, blocks: (B:250:0x0d5b, B:252:0x0d7f, B:254:0x0de5, B:258:0x0e81, B:259:0x0e99, B:260:0x0e9a, B:261:0x0ea4), top: B:338:0x0d5b }] */
    /* JADX WARN: Removed duplicated region for block: B:289:0x0ed9  */
    /* JADX WARN: Removed duplicated region for block: B:296:0x0f03  */
    /* JADX WARN: Removed duplicated region for block: B:309:0x0c86 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:315:0x0aea A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:317:0x0c21 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:366:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:367:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:56:0x03aa A[Catch: Exception -> 0x027c, TryCatch #21 {Exception -> 0x027c, blocks: (B:26:0x0250, B:32:0x029f, B:35:0x02db, B:38:0x0311, B:103:0x05d3, B:41:0x0346, B:84:0x04d2, B:44:0x0369, B:59:0x03b8, B:61:0x03bc, B:64:0x03c9, B:66:0x03ef, B:47:0x0375, B:54:0x03a6, B:56:0x03aa, B:50:0x0384), top: B:325:0x0025 }] */
    /* JADX WARN: Removed duplicated region for block: B:63:0x03c2  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x03fa  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x0411  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x0455  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x0458  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x047e A[Catch: Exception -> 0x040c, LOOP:8: B:79:0x0478->B:81:0x047e, LOOP_END, TryCatch #14 {Exception -> 0x040c, blocks: (B:121:0x071e, B:122:0x073b, B:124:0x0741, B:125:0x077f, B:109:0x0633, B:110:0x064e, B:112:0x0654, B:113:0x0696, B:117:0x06b7, B:90:0x053e, B:91:0x0549, B:93:0x054f, B:95:0x0560, B:97:0x0568, B:98:0x0581, B:100:0x0587, B:101:0x05bf, B:105:0x05d8, B:78:0x045d, B:79:0x0478, B:81:0x047e, B:82:0x04bc, B:86:0x04d7, B:69:0x03fc, B:74:0x0415), top: B:326:0x03fc }] */
    /* JADX WARN: Removed duplicated region for block: B:89:0x0535  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x054f A[Catch: Exception -> 0x040c, TryCatch #14 {Exception -> 0x040c, blocks: (B:121:0x071e, B:122:0x073b, B:124:0x0741, B:125:0x077f, B:109:0x0633, B:110:0x064e, B:112:0x0654, B:113:0x0696, B:117:0x06b7, B:90:0x053e, B:91:0x0549, B:93:0x054f, B:95:0x0560, B:97:0x0568, B:98:0x0581, B:100:0x0587, B:101:0x05bf, B:105:0x05d8, B:78:0x045d, B:79:0x0478, B:81:0x047e, B:82:0x04bc, B:86:0x04d7, B:69:0x03fc, B:74:0x0415), top: B:326:0x03fc }] */
    /* JADX WARN: Type inference failed for: r10v78, types: [o0OOoOo0.OooOoo] */
    /* JADX WARN: Type inference failed for: r9v50, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r9v51, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r9v55 */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @Override // oO00ooo.AbstractC32477OooO00o
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) throws Throwable {
        String str;
        File file;
        File file2;
        C34434OooOoO c34434OooOoO;
        C34436OooOoOO c34436OooOoOO;
        String str2;
        Object objOooO0oo;
        long j;
        NoteMeta noteMeta;
        Object objOoooOO0;
        String str3;
        EnumC32485OooO00o enumC32485OooO00o;
        String str4;
        String str5;
        Map mapOooO0o0;
        String str6;
        Boolean boolOooO0O0;
        long j2;
        C27387o0000o0 c27387o0000o0;
        Object objOooOO0;
        EnumC32485OooO00o enumC32485OooO00o2;
        String str7;
        long j3;
        Iterator it;
        String str8;
        String str9;
        String str10;
        String str11;
        C27387o0000o0 c27387o0000o02;
        String str12;
        Object objOooOOOO;
        EnumC32485OooO00o enumC32485OooO00o3;
        NoteMeta noteMeta2;
        Map map;
        long j4;
        Map map2;
        Iterator it2;
        Iterator it3;
        String str13;
        long j5;
        C27387o0000o0 c27387o0000o03;
        String str14;
        Object objOooOOo;
        long j6;
        EnumC32485OooO00o enumC32485OooO00o4;
        NoteMeta noteMeta3;
        Map map3;
        LinkedHashMap linkedHashMap;
        Iterator it4;
        long j7;
        long jCurrentTimeMillis;
        String str15;
        String str16;
        C27387o0000o0 c27387o0000o04;
        Object objOooO0OO;
        NoteMeta noteMeta4;
        Map map4;
        Map map5;
        long j8;
        Map map6;
        Map map7;
        NoteMeta noteMeta5;
        long j9;
        LinkedHashMap linkedHashMap2;
        Iterator it5;
        String str17;
        Map map8;
        LinkedHashMap linkedHashMap3;
        long jCurrentTimeMillis2;
        String str18;
        String str19;
        String str20;
        Map map9;
        Map map10;
        Map map11;
        long j10;
        Object objOooO0o;
        NoteMeta noteMeta6;
        Map map12;
        Map map13;
        Map map14;
        File file3;
        Map map15;
        File file4;
        long j11;
        String str21;
        Map map16;
        EnumC32485OooO00o enumC32485OooO00o5;
        NoteMeta noteMetaCopy$default;
        long jCurrentTimeMillis3;
        String str22;
        File file5;
        String str23;
        File file6;
        File file7;
        long j12;
        Map map17;
        Object objOooOo00;
        EnumC32485OooO00o enumC32485OooO00o6;
        NoteMeta noteMeta7;
        File file8;
        C27387o0000o0 c27387o0000o05;
        long j13;
        File file9;
        Map map18;
        Map map19;
        Map map20;
        Map map21;
        File file10;
        File file11;
        File file12;
        List list;
        long j14;
        File file13;
        String str24;
        Object objOooOO0o;
        EnumC32485OooO00o enumC32485OooO00o7;
        EnumC32485OooO00o enumC32485OooO00o8;
        long j15;
        List list2;
        File file14;
        File file15;
        long j16;
        File file16;
        Map map22;
        File file17;
        Map map23;
        NoteContent noteContent;
        long j17;
        ?? arrayList;
        List list3;
        C27387o0000o0 c27387o0000o06;
        Map map24;
        long j18;
        EnumC32485OooO00o enumC32485OooO00o9;
        File file18;
        File file19;
        List list4;
        long j19;
        Map map25;
        File file20;
        Map map26;
        File file21;
        Object objOooO0O0;
        EnumC32485OooO00o enumC32485OooO00o10;
        File file22;
        EnumC32485OooO00o enumC32485OooO00o11;
        File file23;
        NoteMeta noteMeta8;
        Map map27;
        Map map28;
        String str25;
        File file24;
        File file25;
        File file26;
        Map map29;
        Map map30;
        Map map31;
        long j20;
        long j21;
        NotePdfLostInfoEntity notePdfLostInfoEntity;
        File file27;
        C27387o0000o0.C27389OooO0o0 c27389OooO0o0;
        ArrayList arrayList2;
        Iterator it6;
        ArrayList arrayListOooooOo;
        NoteMeta noteMeta9;
        long j22;
        long j23;
        Object objOooOoO0;
        EnumC32485OooO00o enumC32485OooO00o12;
        File file28;
        Iterator it7;
        File file29;
        List list5;
        boolean zBooleanValue;
        C21904OooOoo0.OooO0Oo();
        EnumC32485OooO00o enumC32485OooO00o13 = EnumC32485OooO00o.f116726OooOo0o;
        int i = this.f95341Oooo0o;
        C34434OooOoO c34434OooOoO2 = C34434OooOoO.f123453OooOo0o;
        C34436OooOoOO c34436OooOoOO2 = C34436OooOoOO.f123455OooOo0o;
        String str26 = " cost: ";
        String str27 = this.f95344Oooo0oo;
        C27387o0000o0 c27387o0000o07 = this.f95343Oooo0oO;
        try {
            try {
            } catch (Exception e) {
                e = e;
                file = "getNoteInFile, getPdfPathByNoteId ";
            }
        } catch (Exception e2) {
            e = e2;
            str = "NoteInFileUseCase";
        }
        switch (i) {
            case 0:
                c34434OooOoO = c34434OooOoO2;
                C32446OooOOOo.OooO0O0(obj);
                long jCurrentTimeMillis4 = System.currentTimeMillis();
                c34436OooOoOO = c34436OooOoOO2;
                InterfaceC27313OooOoo0 interfaceC27313OooOoo0 = c27387o0000o07.f95427OooO0O0;
                str2 = "noteMeta is null, noteId: ";
                String strOooO0Oo = c27387o0000o07.f95426OooO00o.OooO0Oo();
                this.f95326OooOo0o = jCurrentTimeMillis4;
                this.f95341Oooo0o = 1;
                objOooO0oo = interfaceC27313OooOoo0.OooO0oo(str27, strOooO0Oo, this);
                if (objOooO0oo != enumC32485OooO00o13) {
                    j = jCurrentTimeMillis4;
                    noteMeta = (NoteMeta) objOooO0oo;
                    if (noteMeta == null) {
                        this.f95328OooOoO0 = noteMeta;
                        this.f95326OooOo0o = j;
                        this.f95341Oooo0o = 2;
                        objOoooOO0 = c27387o0000o07.OoooOO0(str27, this);
                        if (objOoooOO0 == enumC32485OooO00o13) {
                        }
                        str3 = (String) objOoooOO0;
                        if (str3 != null || str3.length() == 0) {
                            enumC32485OooO00o = enumC32485OooO00o13;
                            str4 = ", cost: ";
                            str5 = " size: ";
                            mapOooO0o0 = c34436OooOoOO;
                        } else {
                            str4 = ", cost: ";
                            File file30 = new File(str3);
                            str5 = " size: ";
                            enumC32485OooO00o = enumC32485OooO00o13;
                            mapOooO0o0 = oOo000Oo.Oooo0.OooO0o0(C25749OooOoO0.OooO0Oo("note_pdf_" + file30.getName(), file30));
                        }
                        long jCurrentTimeMillis5 = System.currentTimeMillis();
                        C34406OooO00o.C20358OooO00o c20358OooO00o = C34406OooO00o.f123390OooO00o;
                        c20358OooO00o.OooOOO0("NoteInFileUseCase");
                        if (str3 == null) {
                            str6 = "NoteInFileUseCase";
                            try {
                                boolOooO0O0 = C25261OooO0o0.OooO0O0(new File(str3).exists());
                            } catch (Exception e3) {
                                e = e3;
                                str = str6;
                                file2 = null;
                                C34406OooO00o.C20358OooO00o c20358OooO00o2 = C34406OooO00o.f123390OooO00o;
                                c20358OooO00o2.OooOOO0(str);
                                c20358OooO00o2.OooO0Oo(e, "getNoteInFile error.", new Object[0]);
                                if (file2 == null) {
                                }
                            }
                        } else {
                            str6 = "NoteInFileUseCase";
                            boolOooO0O0 = null;
                        }
                        c20358OooO00o.OooO0o0("getNoteInFile, getPdfPathByNoteId " + str3 + ", exist: " + boolOooO0O0 + " cost: " + (jCurrentTimeMillis5 - j) + " ms.", new Object[0]);
                        this.f95328OooOoO0 = noteMeta;
                        this.f95327OooOoO = str3;
                        this.f95329OooOoOO = mapOooO0o0;
                        this.f95326OooOo0o = j;
                        j2 = jCurrentTimeMillis5;
                        this.f95325OooOo = j2;
                        this.f95341Oooo0o = 3;
                        c27387o0000o0 = c27387o0000o07;
                        objOooOO0 = C27387o0000o0.OooOO0(c27387o0000o0, str27, this);
                        enumC32485OooO00o2 = enumC32485OooO00o;
                        if (objOooOO0 != enumC32485OooO00o2) {
                            return enumC32485OooO00o2;
                        }
                        long j24 = j;
                        str7 = str3;
                        j3 = j24;
                        Iterable iterable = (Iterable) objOooOO0;
                        LinkedHashMap linkedHashMap4 = new LinkedHashMap(oO0O00oo.OooOO0.OooO0OO(oOo000Oo.Oooo0.OooO0Oo(C34428OooOOo.OooOOoo(iterable, 10))));
                        it = iterable.iterator();
                        while (it.hasNext()) {
                            long j25 = j2;
                            File file31 = new File((String) it.next());
                            String name = file31.getName();
                            Iterator it8 = it;
                            StringBuilder sb = new StringBuilder();
                            String str28 = str26;
                            sb.append("note_image_");
                            sb.append(name);
                            C32443OooOOO c32443OooOOOOooO0Oo = C25749OooOoO0.OooO0Oo(sb.toString(), file31);
                            linkedHashMap4.put(c32443OooOOOOooO0Oo.OooO0O0(), c32443OooOOOOooO0Oo.OooO0OO());
                            it = it8;
                            str26 = str28;
                            j2 = j25;
                        }
                        str8 = str26;
                        long j26 = j2;
                        long jOooo00O = C27387o0000o0.Oooo00O(c27387o0000o0, linkedHashMap4.values());
                        long jCurrentTimeMillis6 = System.currentTimeMillis();
                        C34406OooO00o.C20358OooO00o c20358OooO00o3 = C34406OooO00o.f123390OooO00o;
                        String str29 = str6;
                        c20358OooO00o3.OooOOO0(str29);
                        str9 = str29;
                        int size = linkedHashMap4.size();
                        EnumC32485OooO00o enumC32485OooO00o14 = enumC32485OooO00o2;
                        String strOooO0OO = C31430OooO00o.OooO0OO(jOooo00O);
                        long j27 = jCurrentTimeMillis6 - j26;
                        C27387o0000o0 c27387o0000o08 = c27387o0000o0;
                        StringBuilder sb2 = new StringBuilder();
                        sb2.append("getNoteInFile, getImageUrisByNoteId, num: ");
                        sb2.append(size);
                        str10 = str5;
                        sb2.append(str10);
                        sb2.append(strOooO0OO);
                        str11 = str4;
                        sb2.append(str11);
                        sb2.append(j27);
                        sb2.append(" ms.");
                        c20358OooO00o3.OooO0o0(sb2.toString(), new Object[0]);
                        this.f95328OooOoO0 = noteMeta;
                        this.f95327OooOoO = str7;
                        this.f95329OooOoOO = mapOooO0o0;
                        this.f95331OooOoo0 = linkedHashMap4;
                        this.f95326OooOo0o = j3;
                        this.f95325OooOo = jCurrentTimeMillis6;
                        this.f95341Oooo0o = 4;
                        c27387o0000o02 = c27387o0000o08;
                        str12 = str27;
                        objOooOOOO = C27387o0000o0.OooOOOO(c27387o0000o02, str12, this);
                        Map map32 = mapOooO0o0;
                        enumC32485OooO00o3 = enumC32485OooO00o14;
                        if (objOooOOOO != enumC32485OooO00o3) {
                            noteMeta2 = noteMeta;
                            map = map32;
                            j4 = jCurrentTimeMillis6;
                            map2 = linkedHashMap4;
                            ArrayList arrayList3 = new ArrayList();
                            it2 = ((Iterable) objOooOOOO).iterator();
                            while (it2.hasNext()) {
                                Iterator it9 = it2;
                                Object next = it9.next();
                                EnumC32485OooO00o enumC32485OooO00o15 = enumC32485OooO00o3;
                                if (!kotlin.jvm.internal.OooOOO0.OooO0O0((String) next, str7)) {
                                    arrayList3.add(next);
                                }
                                it2 = it9;
                                enumC32485OooO00o3 = enumC32485OooO00o15;
                            }
                            EnumC32485OooO00o enumC32485OooO00o16 = enumC32485OooO00o3;
                            LinkedHashMap linkedHashMap5 = new LinkedHashMap(oO0O00oo.OooOO0.OooO0OO(oOo000Oo.Oooo0.OooO0Oo(C34428OooOOo.OooOOoo(arrayList3, 10))));
                            it3 = arrayList3.iterator();
                            while (it3.hasNext()) {
                                File file32 = new File((String) it3.next());
                                String name2 = file32.getName();
                                Iterator it10 = it3;
                                StringBuilder sb3 = new StringBuilder();
                                String str30 = str12;
                                sb3.append("note_local_uri_theme_");
                                sb3.append(name2);
                                C32443OooOOO c32443OooOOOOooO0Oo2 = C25749OooOoO0.OooO0Oo(sb3.toString(), file32);
                                linkedHashMap5.put(c32443OooOOOOooO0Oo2.OooO0O0(), c32443OooOOOOooO0Oo2.OooO0OO());
                                it3 = it10;
                                str12 = str30;
                            }
                            String str31 = str12;
                            long jOooo00O2 = C27387o0000o0.Oooo00O(c27387o0000o02, linkedHashMap5.values());
                            long jCurrentTimeMillis7 = System.currentTimeMillis();
                            C34406OooO00o.C20358OooO00o c20358OooO00o4 = C34406OooO00o.f123390OooO00o;
                            String str32 = str9;
                            c20358OooO00o4.OooOOO0(str32);
                            str13 = str32;
                            C27387o0000o0 c27387o0000o09 = c27387o0000o02;
                            c20358OooO00o4.OooO0o0("getNoteInFile, getPaperThemeUrisByNoteId, num: " + linkedHashMap5.size() + str10 + C31430OooO00o.OooO0OO(jOooo00O2) + str11 + (jCurrentTimeMillis7 - j4) + " ms.", new Object[0]);
                            this.f95328OooOoO0 = noteMeta2;
                            this.f95327OooOoO = map;
                            this.f95329OooOoOO = map2;
                            this.f95331OooOoo0 = linkedHashMap5;
                            j5 = j3;
                            this.f95326OooOo0o = j5;
                            this.f95325OooOo = jCurrentTimeMillis7;
                            this.f95341Oooo0o = 5;
                            c27387o0000o03 = c27387o0000o09;
                            str14 = str31;
                            objOooOOo = C27387o0000o0.OooOOo(c27387o0000o03, str14, this);
                            j6 = jCurrentTimeMillis7;
                            enumC32485OooO00o4 = enumC32485OooO00o16;
                            if (objOooOOo != enumC32485OooO00o4) {
                                noteMeta3 = noteMeta2;
                                map3 = linkedHashMap5;
                                Iterable iterable2 = (Iterable) objOooOOo;
                                linkedHashMap = new LinkedHashMap(oO0O00oo.OooOO0.OooO0OO(oOo000Oo.Oooo0.OooO0Oo(C34428OooOOo.OooOOoo(iterable2, 10))));
                                it4 = iterable2.iterator();
                                while (it4.hasNext()) {
                                    EnumC32485OooO00o enumC32485OooO00o17 = enumC32485OooO00o4;
                                    File file33 = new File((String) it4.next());
                                    C32443OooOOO c32443OooOOOOooO0Oo3 = C25749OooOoO0.OooO0Oo("note_pdf_set_uri_theme_" + file33.getName(), file33);
                                    linkedHashMap.put(c32443OooOOOOooO0Oo3.OooO0O0(), c32443OooOOOOooO0Oo3.OooO0OO());
                                    it4 = it4;
                                    enumC32485OooO00o4 = enumC32485OooO00o17;
                                    j5 = j5;
                                    str14 = str14;
                                }
                                EnumC32485OooO00o enumC32485OooO00o18 = enumC32485OooO00o4;
                                j7 = j5;
                                String str33 = str14;
                                long jOooo00O3 = C27387o0000o0.Oooo00O(c27387o0000o03, linkedHashMap.values());
                                jCurrentTimeMillis = System.currentTimeMillis();
                                C34406OooO00o.C20358OooO00o c20358OooO00o5 = C34406OooO00o.f123390OooO00o;
                                str15 = str13;
                                try {
                                    c20358OooO00o5.OooOOO0(str15);
                                    int size2 = linkedHashMap.size();
                                    str6 = str15;
                                    c20358OooO00o5.OooO0o0("getNoteInFile, getPdfSetPaperThemeUrisByNoteId, num: " + size2 + str10 + C31430OooO00o.OooO0OO(jOooo00O3) + str11 + (jCurrentTimeMillis - j6) + " ms.", new Object[0]);
                                    this.f95328OooOoO0 = noteMeta3;
                                    this.f95327OooOoO = map;
                                    this.f95329OooOoOO = map2;
                                    this.f95331OooOoo0 = map3;
                                    this.f95330OooOoo = linkedHashMap;
                                    this.f95326OooOo0o = j7;
                                    this.f95325OooOo = jCurrentTimeMillis;
                                    this.f95341Oooo0o = 6;
                                    str16 = str33;
                                    c27387o0000o04 = c27387o0000o03;
                                    objOooO0OO = C27387o0000o0.OooO0OO(c27387o0000o04, str16, this);
                                    noteMeta4 = noteMeta3;
                                    enumC32485OooO00o3 = enumC32485OooO00o18;
                                } catch (Exception e4) {
                                    e = e4;
                                    str = str15;
                                    file2 = null;
                                    C34406OooO00o.C20358OooO00o c20358OooO00o22 = C34406OooO00o.f123390OooO00o;
                                    c20358OooO00o22.OooOOO0(str);
                                    c20358OooO00o22.OooO0Oo(e, "getNoteInFile error.", new Object[0]);
                                    if (file2 == null) {
                                    }
                                }
                                if (objOooO0OO == enumC32485OooO00o3) {
                                    map4 = linkedHashMap;
                                    obj = objOooO0OO;
                                    map5 = map2;
                                    j8 = j7;
                                    map6 = map3;
                                    map7 = map;
                                    noteMeta5 = noteMeta4;
                                    j9 = jCurrentTimeMillis;
                                    Iterable iterable3 = (Iterable) obj;
                                    linkedHashMap2 = new LinkedHashMap(oO0O00oo.OooOO0.OooO0OO(oOo000Oo.Oooo0.OooO0Oo(C34428OooOOo.OooOOoo(iterable3, 10))));
                                    it5 = iterable3.iterator();
                                    while (it5.hasNext()) {
                                        EnumC32485OooO00o enumC32485OooO00o19 = enumC32485OooO00o3;
                                        File file34 = new File((String) it5.next());
                                        C32443OooOOO c32443OooOOOOooO0Oo4 = C25749OooOoO0.OooO0Oo("note_audio_" + file34.getName(), file34);
                                        linkedHashMap2.put(c32443OooOOOOooO0Oo4.OooO0O0(), c32443OooOOOOooO0Oo4.OooO0OO());
                                        it5 = it5;
                                        enumC32485OooO00o3 = enumC32485OooO00o19;
                                        j8 = j8;
                                    }
                                    EnumC32485OooO00o enumC32485OooO00o20 = enumC32485OooO00o3;
                                    long j28 = j8;
                                    long jOooo00O4 = C27387o0000o0.Oooo00O(c27387o0000o04, linkedHashMap2.values());
                                    long jCurrentTimeMillis8 = System.currentTimeMillis();
                                    C34406OooO00o.C20358OooO00o c20358OooO00o6 = C34406OooO00o.f123390OooO00o;
                                    str17 = str6;
                                    try {
                                        c20358OooO00o6.OooOOO0(str17);
                                        int size3 = linkedHashMap2.size();
                                        String strOooO0OO2 = C31430OooO00o.OooO0OO(jOooo00O4);
                                        Map map33 = map7;
                                        Map map34 = map6;
                                        long j29 = jCurrentTimeMillis8 - j9;
                                        StringBuilder sb4 = new StringBuilder();
                                        map8 = map5;
                                        sb4.append("getNoteInFile, getAudioPathsByNoteId, num: ");
                                        sb4.append(size3);
                                        sb4.append(str10);
                                        sb4.append(strOooO0OO2);
                                        sb4.append(str11);
                                        sb4.append(j29);
                                        sb4.append(" ms.");
                                        c20358OooO00o6.OooO0o0(sb4.toString(), new Object[0]);
                                        File dataDir = c27387o0000o04.f95452OooOoo0.getDataDir();
                                        kotlin.jvm.internal.OooOOO0.OooO0o(dataDir, "getDataDir(...)");
                                        String[] strArrDatabaseList = c27387o0000o04.f95452OooOoo0.databaseList();
                                        kotlin.jvm.internal.OooOOO0.OooO0o(strArrDatabaseList, "databaseList(...)");
                                        ArrayList<String> arrayList4 = new ArrayList();
                                        for (String str34 : strArrDatabaseList) {
                                            kotlin.jvm.internal.OooOOO0.OooO0Oo(str34);
                                            if (C33599OooOo0O.OooOoOO(str34, str16, false)) {
                                                arrayList4.add(str34);
                                            }
                                        }
                                        linkedHashMap3 = new LinkedHashMap(oO0O00oo.OooOO0.OooO0OO(oOo000Oo.Oooo0.OooO0Oo(C34428OooOOo.OooOOoo(arrayList4, 10))));
                                        for (String str35 : arrayList4) {
                                            StringBuilder sb5 = new StringBuilder();
                                            sb5.append(dataDir);
                                            File file35 = dataDir;
                                            sb5.append("/databases/");
                                            sb5.append(str35);
                                            C32443OooOOO c32443OooOOOOooO0Oo5 = C25749OooOoO0.OooO0Oo("note_database_" + str35, new File(sb5.toString()));
                                            linkedHashMap3.put(c32443OooOOOOooO0Oo5.OooO0O0(), c32443OooOOOOooO0Oo5.OooO0OO());
                                            dataDir = file35;
                                        }
                                        long jOooo00O5 = C27387o0000o0.Oooo00O(c27387o0000o04, linkedHashMap3.values());
                                        jCurrentTimeMillis2 = System.currentTimeMillis();
                                        C34406OooO00o.C20358OooO00o c20358OooO00o7 = C34406OooO00o.f123390OooO00o;
                                        c20358OooO00o7.OooOOO0(str17);
                                        int size4 = linkedHashMap3.size();
                                        String strOooO0OO3 = C31430OooO00o.OooO0OO(jOooo00O5);
                                        str18 = str11;
                                        long j30 = jCurrentTimeMillis2 - jCurrentTimeMillis8;
                                        str19 = str17;
                                        try {
                                            StringBuilder sb6 = new StringBuilder();
                                            str20 = str10;
                                            sb6.append("getNoteInFile, getDatabaseList, num: ");
                                            sb6.append(size4);
                                            sb6.append(", size: ");
                                            sb6.append(strOooO0OO3);
                                            sb6.append(str8);
                                            sb6.append(j30);
                                            sb6.append(" ms.");
                                            c20358OooO00o7.OooO0o0(sb6.toString(), new Object[0]);
                                            this.f95328OooOoO0 = noteMeta5;
                                            map9 = map33;
                                            this.f95327OooOoO = map9;
                                            this.f95329OooOoOO = map8;
                                            map10 = map34;
                                            this.f95331OooOoo0 = map10;
                                            this.f95330OooOoo = map4;
                                            map11 = linkedHashMap2;
                                            this.f95332OooOooO = map11;
                                            this.f95333OooOooo = linkedHashMap3;
                                            j10 = j28;
                                            this.f95326OooOo0o = j10;
                                            this.f95325OooOo = jCurrentTimeMillis2;
                                            this.f95341Oooo0o = 7;
                                            objOooO0o = C27387o0000o0.OooO0o(c27387o0000o04, str16, this);
                                            enumC32485OooO00o4 = enumC32485OooO00o20;
                                        } catch (Exception e5) {
                                            e = e5;
                                            str = str19;
                                            file2 = null;
                                        }
                                    } catch (Exception e6) {
                                        e = e6;
                                        str = str17;
                                        file2 = null;
                                    }
                                    if (objOooO0o == enumC32485OooO00o4) {
                                        noteMeta6 = noteMeta5;
                                        map12 = map8;
                                        map14 = map10;
                                        map13 = linkedHashMap3;
                                        file3 = (File) objOooO0o;
                                        map15 = map13;
                                        try {
                                            j11 = jCurrentTimeMillis2;
                                            file4 = new File(file3, "note_meta.json");
                                            str21 = this.f95334Oooo;
                                            if (str21 != null || str21.length() == 0) {
                                                String input = noteMeta6.getTitle();
                                                Pattern patternCompile = Pattern.compile("[\\\\/:*?\"<>|]");
                                                map16 = map11;
                                                kotlin.jvm.internal.OooOOO0.OooO0o(patternCompile, "compile(...)");
                                                enumC32485OooO00o5 = enumC32485OooO00o4;
                                                kotlin.jvm.internal.OooOOO0.OooO0oO(input, "input");
                                                String strReplaceAll = patternCompile.matcher(input).replaceAll(C18115b5.CONNECTOR);
                                                kotlin.jvm.internal.OooOOO0.OooO0o(strReplaceAll, "replaceAll(...)");
                                                noteMetaCopy$default = NoteMeta.copy$default(noteMeta6, null, null, strReplaceAll, null, null, false, null, 0, 0, false, null, 0, 0L, 0L, null, false, false, false, 0L, 524283, null);
                                            } else {
                                                enumC32485OooO00o5 = enumC32485OooO00o4;
                                                noteMetaCopy$default = NoteMeta.copy$default(noteMeta6, null, null, this.f95334Oooo, null, null, false, null, 0, 0, false, null, 0, 0L, 0L, null, false, false, false, 0L, 524283, null);
                                                map16 = map11;
                                            }
                                            String json = C28028OooO0o.OooO00o().toJson(noteMetaCopy$default);
                                            kotlin.jvm.internal.OooOOO0.OooO0Oo(json);
                                            C32501OooO0oO.OooO(file4, json);
                                            long j31 = j10;
                                            jCurrentTimeMillis3 = System.currentTimeMillis();
                                            C34406OooO00o.C20358OooO00o c20358OooO00o8 = C34406OooO00o.f123390OooO00o;
                                            str22 = str19;
                                            try {
                                                c20358OooO00o8.OooOOO0(str22);
                                                c20358OooO00o8.OooO0o0("getNoteInFile, convert noteMeta: " + noteMetaCopy$default + " to json file, cost: " + (jCurrentTimeMillis3 - j11) + " ms.", new Object[0]);
                                                file5 = new File(file3, "note_in_flag.json");
                                                String json2 = C28028OooO0o.OooO00o().toJson(this.f95345OoooO00);
                                                c20358OooO00o8.OooOOO0(str22);
                                                str23 = " ms.";
                                                c20358OooO00o8.OooO0o0("getNoteInFileByPages, noteInFlagJson: " + json2, new Object[0]);
                                                kotlin.jvm.internal.OooOOO0.OooO0Oo(json2);
                                                C32501OooO0oO.OooO(file5, json2);
                                                file6 = new File(file3, "note_extra.json");
                                                String json3 = C28028OooO0o.OooO00o().toJson(new C27387o0000o0.OooO00o(45));
                                                kotlin.jvm.internal.OooOOO0.OooO0Oo(json3);
                                                C32501OooO0oO.OooO(file6, json3);
                                                C27808OooOOo c27808OooOOoOooO0O0 = c27387o0000o04.f95448OooOo0o.OooO0O0(str16);
                                                this.f95328OooOoO0 = file3;
                                                this.f95327OooOoO = map9;
                                                this.f95329OooOoOO = map12;
                                                this.f95331OooOoo0 = map14;
                                                this.f95330OooOoo = map4;
                                                this.f95332OooOooO = map16;
                                                this.f95333OooOooo = map15;
                                                this.f95336Oooo000 = file3;
                                                file7 = file4;
                                                this.f95337Oooo00O = file7;
                                                this.f95338Oooo00o = noteMetaCopy$default;
                                                this.f95335Oooo0 = file5;
                                                this.f95339Oooo0O0 = file6;
                                                j12 = j31;
                                                this.f95326OooOo0o = j12;
                                                map17 = map9;
                                                this.f95325OooOo = jCurrentTimeMillis3;
                                                this.f95341Oooo0o = 8;
                                                objOooOo00 = C25252OooO0Oo.OooOo00(c27808OooOOoOooO0O0, this);
                                                enumC32485OooO00o3 = enumC32485OooO00o5;
                                            } catch (Exception e7) {
                                                e = e7;
                                                str = str22;
                                                file2 = file3;
                                            }
                                        } catch (Exception e8) {
                                            e = e8;
                                            str = str19;
                                            file2 = file3;
                                            C34406OooO00o.C20358OooO00o c20358OooO00o222 = C34406OooO00o.f123390OooO00o;
                                            c20358OooO00o222.OooOOO0(str);
                                            c20358OooO00o222.OooO0Oo(e, "getNoteInFile error.", new Object[0]);
                                            if (file2 == null) {
                                            }
                                        }
                                        if (objOooOo00 != enumC32485OooO00o3) {
                                            enumC32485OooO00o6 = enumC32485OooO00o3;
                                            str19 = str22;
                                            noteMeta7 = noteMetaCopy$default;
                                            file8 = file3;
                                            c27387o0000o05 = c27387o0000o04;
                                            j13 = jCurrentTimeMillis3;
                                            file9 = file5;
                                            map18 = map14;
                                            map19 = map12;
                                            map20 = map17;
                                            map21 = map15;
                                            obj = objOooOo00;
                                            file10 = file6;
                                            file11 = file3;
                                            try {
                                                List list6 = (List) obj;
                                                String str36 = str16;
                                                list = list6 != null ? c34434OooOoO : list6;
                                                j14 = j13;
                                                InterfaceC27309OooOoO interfaceC27309OooOoO = c27387o0000o05.f95429OooO0Oo;
                                                this.f95328OooOoO0 = file8;
                                                this.f95327OooOoO = map20;
                                                this.f95329OooOoOO = map19;
                                                this.f95331OooOoo0 = map18;
                                                try {
                                                    this.f95330OooOoo = map4;
                                                    this.f95332OooOooO = map16;
                                                    this.f95333OooOooo = map21;
                                                    this.f95336Oooo000 = file11;
                                                    this.f95337Oooo00O = file7;
                                                    this.f95338Oooo00o = noteMeta7;
                                                    this.f95335Oooo0 = file9;
                                                    this.f95339Oooo0O0 = file10;
                                                    this.f95340Oooo0OO = list;
                                                    this.f95326OooOo0o = j12;
                                                    file13 = file10;
                                                    file12 = file8;
                                                } catch (Exception e9) {
                                                    e = e9;
                                                    file12 = file8;
                                                }
                                                try {
                                                    this.f95325OooOo = j14;
                                                    this.f95341Oooo0o = 9;
                                                    str24 = str36;
                                                    objOooOO0o = interfaceC27309OooOoO.OooOO0o(str24, this);
                                                    enumC32485OooO00o7 = enumC32485OooO00o6;
                                                } catch (Exception e10) {
                                                    e = e10;
                                                    str = str19;
                                                    file2 = file12;
                                                }
                                            } catch (Exception e11) {
                                                e = e11;
                                                file12 = file8;
                                            }
                                            if (objOooOO0o != enumC32485OooO00o7) {
                                                enumC32485OooO00o8 = enumC32485OooO00o7;
                                                j15 = j14;
                                                long j32 = j12;
                                                list2 = list;
                                                file14 = file13;
                                                file15 = file7;
                                                j16 = j32;
                                                file16 = file12;
                                                map23 = map18;
                                                file17 = file11;
                                                map22 = map21;
                                                try {
                                                    noteContent = (NoteContent) objOooOO0o;
                                                    if (noteContent == null) {
                                                        try {
                                                            List<Page> pages = noteContent.getPages();
                                                            if (pages != null) {
                                                                List<Page> list7 = pages;
                                                                j17 = j16;
                                                                list3 = list2;
                                                                arrayList = new ArrayList(C34428OooOOo.OooOOoo(list7, 10));
                                                                Iterator it11 = list7.iterator();
                                                                while (it11.hasNext()) {
                                                                    arrayList.add(((Page) it11.next()).getId());
                                                                }
                                                            } else {
                                                                j17 = j16;
                                                                list3 = list2;
                                                                arrayList = c34434OooOoO;
                                                            }
                                                            c27387o0000o06 = c27387o0000o05;
                                                            o0OOOO00.OooOOO0 oooOOO0OooO0OO = c27387o0000o06.f95448OooOo0o.OooO0OO(str24, arrayList);
                                                            this.f95328OooOoO0 = file16;
                                                            this.f95327OooOoO = map20;
                                                            this.f95329OooOoOO = map19;
                                                            this.f95331OooOoo0 = map23;
                                                            this.f95330OooOoo = map4;
                                                            this.f95332OooOooO = map16;
                                                            this.f95333OooOooo = map22;
                                                            this.f95336Oooo000 = file17;
                                                            this.f95337Oooo00O = file15;
                                                            this.f95338Oooo00o = noteMeta7;
                                                            this.f95335Oooo0 = file9;
                                                            this.f95339Oooo0O0 = file14;
                                                            List list8 = list3;
                                                            this.f95340Oooo0OO = list8;
                                                            map24 = map20;
                                                            File file36 = file15;
                                                            long j33 = j17;
                                                            this.f95326OooOo0o = j33;
                                                            long j34 = j15;
                                                            this.f95325OooOo = j34;
                                                            j18 = j34;
                                                            this.f95341Oooo0o = 10;
                                                            Object objOooOo002 = C25252OooO0Oo.OooOo00(oooOOO0OooO0OO, this);
                                                            enumC32485OooO00o7 = enumC32485OooO00o8;
                                                            if (objOooOo002 != enumC32485OooO00o7) {
                                                                obj = objOooOo002;
                                                                enumC32485OooO00o9 = enumC32485OooO00o7;
                                                                file18 = file14;
                                                                file19 = file36;
                                                                list4 = list8;
                                                                j19 = j33;
                                                                map26 = map23;
                                                                file16 = file16;
                                                                file20 = file17;
                                                                map25 = map22;
                                                                Map map35 = (Map) obj;
                                                                String str37 = str24;
                                                                long j35 = j19;
                                                                C27387o0000o0.C27388OooO0Oo c27388OooO0Oo = new C27387o0000o0.C27388OooO0Oo(list4, map35 != null ? c34436OooOoOO : map35);
                                                                File file37 = new File(file20, "note_label.json");
                                                                String json4 = C28028OooO0o.OooO00o().toJson(c27388OooO0Oo);
                                                                kotlin.jvm.internal.OooOOO0.OooO0Oo(json4);
                                                                C32501OooO0oO.OooO(file37, json4);
                                                                File file38 = new File(file20, "notepdf_lost_info.json");
                                                                file38.createNewFile();
                                                                InterfaceC27312OooOoo interfaceC27312OooOoo = c27387o0000o06.f95428OooO0OO;
                                                                this.f95328OooOoO0 = file16;
                                                                this.f95327OooOoO = map24;
                                                                this.f95329OooOoOO = map19;
                                                                this.f95331OooOoo0 = map26;
                                                                this.f95330OooOoo = map4;
                                                                this.f95332OooOooO = map16;
                                                                this.f95333OooOooo = map25;
                                                                this.f95336Oooo000 = file20;
                                                                this.f95337Oooo00O = file19;
                                                                this.f95338Oooo00o = noteMeta7;
                                                                this.f95335Oooo0 = file9;
                                                                this.f95339Oooo0O0 = file18;
                                                                this.f95340Oooo0OO = file37;
                                                                this.f95342Oooo0o0 = file38;
                                                                File file39 = file18;
                                                                file21 = file19;
                                                                this.f95326OooOo0o = j35;
                                                                long j36 = j18;
                                                                this.f95325OooOo = j36;
                                                                this.f95341Oooo0o = 11;
                                                                objOooO0O0 = interfaceC27312OooOoo.OooO0O0(str37, this);
                                                                enumC32485OooO00o10 = enumC32485OooO00o9;
                                                                if (objOooO0O0 != enumC32485OooO00o10) {
                                                                    return enumC32485OooO00o10;
                                                                }
                                                                file22 = file37;
                                                                obj = objOooO0O0;
                                                                Map map36 = map25;
                                                                enumC32485OooO00o11 = enumC32485OooO00o10;
                                                                file23 = file39;
                                                                noteMeta8 = noteMeta7;
                                                                map27 = map36;
                                                                map28 = map4;
                                                                str25 = str37;
                                                                file24 = file16;
                                                                file25 = file20;
                                                                file26 = file38;
                                                                map29 = map26;
                                                                map30 = map19;
                                                                map31 = map16;
                                                                j20 = j35;
                                                                j21 = j36;
                                                                try {
                                                                    notePdfLostInfoEntity = (NotePdfLostInfoEntity) obj;
                                                                    if (notePdfLostInfoEntity == null) {
                                                                        try {
                                                                            c27389OooO0o0 = new C27387o0000o0.C27389OooO0o0(notePdfLostInfoEntity.getId(), notePdfLostInfoEntity.getSrcNoteId(), notePdfLostInfoEntity.getCreationTime(), notePdfLostInfoEntity.getPdfFileName(), notePdfLostInfoEntity.getDbVersion(), notePdfLostInfoEntity.getContentDBVersion());
                                                                            file27 = file24;
                                                                        } catch (Exception e12) {
                                                                            e = e12;
                                                                            file27 = file24;
                                                                            file3 = file27;
                                                                            str = str19;
                                                                            file2 = file3;
                                                                        }
                                                                        try {
                                                                            String json5 = C28028OooO0o.OooO00o().toJson(c27389OooO0o0);
                                                                            kotlin.jvm.internal.OooOOO0.OooO0o(json5, "toJson(...)");
                                                                            C32501OooO0oO.OooO(file26, json5);
                                                                            file27 = file27;
                                                                        } catch (Exception e13) {
                                                                            e = e13;
                                                                            file3 = file27;
                                                                            str = str19;
                                                                            file2 = file3;
                                                                        }
                                                                    } else {
                                                                        file27 = file24;
                                                                    }
                                                                    try {
                                                                        LinkedHashMap linkedHashMapOooOO0 = C34444Oooo0O0.OooOO0(C34444Oooo0O0.OooOO0(C34444Oooo0O0.OooOO0(C34444Oooo0O0.OooOO0(C34444Oooo0O0.OooOO0(map27, map24), map30), map29), map28), map31);
                                                                        arrayList2 = new ArrayList();
                                                                    } catch (Exception e14) {
                                                                        e = e14;
                                                                        file24 = file27;
                                                                    }
                                                                } catch (Exception e15) {
                                                                    e = e15;
                                                                }
                                                                try {
                                                                    it6 = linkedHashMapOooOO0.entrySet().iterator();
                                                                    while (it6.hasNext()) {
                                                                        try {
                                                                            Map.Entry entry = (Map.Entry) it6.next();
                                                                            String str38 = (String) entry.getKey();
                                                                            File file40 = (File) entry.getValue();
                                                                            File file41 = new File(file25, str38);
                                                                            boolean zOooo00o = C27387o0000o0.Oooo00o(c27387o0000o06, file40, file41);
                                                                            if (!zOooo00o && file40.exists()) {
                                                                                throw new C27387o0000o0.OooO0O0("10000", "copy file to zip dir failed, srcFile: " + file40 + ", dstFile: " + file41);
                                                                            }
                                                                            if (zOooo00o) {
                                                                                it7 = it6;
                                                                                str = str19;
                                                                            } else {
                                                                                C34406OooO00o.C20358OooO00o c20358OooO00o9 = C34406OooO00o.f123390OooO00o;
                                                                                str = str19;
                                                                                try {
                                                                                    c20358OooO00o9.OooOOO0(str);
                                                                                    StringBuilder sb7 = new StringBuilder();
                                                                                    it7 = it6;
                                                                                    sb7.append("Skipping missing file during export: ");
                                                                                    sb7.append(file40);
                                                                                    c20358OooO00o9.OooOO0O(sb7.toString(), new Object[0]);
                                                                                    break;
                                                                                } catch (Exception e16) {
                                                                                    e = e16;
                                                                                    file2 = file27;
                                                                                    C34406OooO00o.C20358OooO00o c20358OooO00o2222 = C34406OooO00o.f123390OooO00o;
                                                                                    c20358OooO00o2222.OooOOO0(str);
                                                                                    c20358OooO00o2222.OooO0Oo(e, "getNoteInFile error.", new Object[0]);
                                                                                    if (file2 == null) {
                                                                                    }
                                                                                }
                                                                            }
                                                                            if (!zOooo00o) {
                                                                                file41 = null;
                                                                            }
                                                                            if (file41 != null) {
                                                                                arrayList2.add(file41);
                                                                            }
                                                                            it6 = it7;
                                                                            str19 = str;
                                                                        } catch (Exception e17) {
                                                                            e = e17;
                                                                            str = str19;
                                                                        }
                                                                        break;
                                                                    }
                                                                    str = str19;
                                                                    try {
                                                                        arrayListOooooOo = oOo000Oo.OooOo.OooooOo(oOo000Oo.OooOo.OooooOo(oOo000Oo.OooOo.OooooOo(oOo000Oo.OooOo.OooooOo(oOo000Oo.OooOo.OooooOo(arrayList2, file21), file9), file23), file26), file22);
                                                                        file24 = file27;
                                                                    } catch (Exception e18) {
                                                                        e = e18;
                                                                        file24 = file27;
                                                                    }
                                                                } catch (Exception e19) {
                                                                    e = e19;
                                                                    file24 = file27;
                                                                    str = str19;
                                                                    file2 = file24;
                                                                    C34406OooO00o.C20358OooO00o c20358OooO00o22222 = C34406OooO00o.f123390OooO00o;
                                                                    c20358OooO00o22222.OooOOO0(str);
                                                                    c20358OooO00o22222.OooO0Oo(e, "getNoteInFile error.", new Object[0]);
                                                                    if (file2 == null) {
                                                                    }
                                                                }
                                                                try {
                                                                    this.f95328OooOoO0 = file24;
                                                                    this.f95327OooOoO = file25;
                                                                    noteMeta9 = noteMeta8;
                                                                    this.f95329OooOoOO = noteMeta9;
                                                                    this.f95331OooOoo0 = arrayListOooooOo;
                                                                    this.f95330OooOoo = null;
                                                                    this.f95332OooOooO = null;
                                                                    this.f95333OooOooo = null;
                                                                    this.f95336Oooo000 = null;
                                                                    this.f95337Oooo00O = null;
                                                                    this.f95338Oooo00o = null;
                                                                    this.f95335Oooo0 = null;
                                                                    this.f95339Oooo0O0 = null;
                                                                    this.f95340Oooo0OO = null;
                                                                    this.f95342Oooo0o0 = null;
                                                                    j22 = j20;
                                                                    this.f95326OooOo0o = j22;
                                                                    j23 = j21;
                                                                    this.f95325OooOo = j23;
                                                                    this.f95341Oooo0o = 12;
                                                                    objOooOoO0 = C27387o0000o0.OooOoO0(c27387o0000o06, arrayListOooooOo, str25, this);
                                                                    enumC32485OooO00o12 = enumC32485OooO00o11;
                                                                    if (objOooOoO0 != enumC32485OooO00o12) {
                                                                        return enumC32485OooO00o12;
                                                                    }
                                                                    file28 = file24;
                                                                    list5 = arrayListOooooOo;
                                                                    file29 = file25;
                                                                    try {
                                                                        zBooleanValue = ((Boolean) objOooOoO0).booleanValue();
                                                                        C34406OooO00o.C20358OooO00o c20358OooO00o10 = C34406OooO00o.f123390OooO00o;
                                                                        c20358OooO00o10.OooOOO0(str);
                                                                        c20358OooO00o10.OooO0o0("getNoteInFile, isToZipFileValid: " + zBooleanValue, new Object[0]);
                                                                        if (zBooleanValue) {
                                                                            throw new C27387o0000o0.OooO0O0("10016", "to zip file is not valid.");
                                                                        }
                                                                        long jOooo00O6 = C27387o0000o0.Oooo00O(c27387o0000o06, list5);
                                                                        long jCurrentTimeMillis9 = System.currentTimeMillis();
                                                                        c20358OooO00o10.OooOOO0(str);
                                                                        int size5 = list5.size();
                                                                        String strOooO0OO4 = C31430OooO00o.OooO0OO(jOooo00O6);
                                                                        StringBuilder sb8 = new StringBuilder();
                                                                        sb8.append("getNoteInFile, copy files to zip dir, num: ");
                                                                        sb8.append(size5);
                                                                        String str39 = str20;
                                                                        sb8.append(str39);
                                                                        sb8.append(strOooO0OO4);
                                                                        String str40 = str18;
                                                                        sb8.append(str40);
                                                                        sb8.append(jCurrentTimeMillis9 - j23);
                                                                        String str41 = str23;
                                                                        sb8.append(str41);
                                                                        c20358OooO00o10.OooO0o0(sb8.toString(), new Object[0]);
                                                                        final File file42 = new File(file29, noteMeta9.getTitle() + ".in");
                                                                        if (!C31190OooO0oo.OooO0oO(file42)) {
                                                                            throw new C27387o0000o0.OooO0O0("10009", "createOrExistFile zipFile failed, zipFile: " + file42);
                                                                        }
                                                                        c20358OooO00o10.OooOOO0(str);
                                                                        c20358OooO00o10.OooO0o0("getNoteInFile, createOrExistFile zipFile: " + file42, new Object[0]);
                                                                        C31193OooOOo.OooO0o(list5, file42);
                                                                        long jCurrentTimeMillis10 = System.currentTimeMillis();
                                                                        c20358OooO00o10.OooOOO0(str);
                                                                        c20358OooO00o10.OooO0o0("getNoteInFile, zip files, toZipFiles: " + list5.size() + str39 + C31430OooO00o.OooO0OO(jOooo00O6) + ", zipFile: " + file42 + str40 + (jCurrentTimeMillis10 - jCurrentTimeMillis9) + str41, new Object[0]);
                                                                        String strOooOOO = C31190OooO0oo.OooOOO(file42);
                                                                        C31190OooO0oo.OooOO0O(file29, new FileFilter() { // from class: o0OOo0o.o0000ooO
                                                                            @Override // java.io.FileFilter
                                                                            public final boolean accept(File file43) {
                                                                                return !kotlin.jvm.internal.OooOOO0.OooO0O0(file43, file42);
                                                                            }
                                                                        });
                                                                        c20358OooO00o10.OooOOO0(str);
                                                                        String strOooO00o = C31430OooO00o.OooO00o(System.currentTimeMillis() - j22);
                                                                        StringBuilder sb9 = new StringBuilder();
                                                                        sb9.append("getNoteInFile done, cost: ");
                                                                        sb9.append(strOooO00o);
                                                                        sb9.append(".");
                                                                        c20358OooO00o10.OooO0o0(sb9.toString(), new Object[0]);
                                                                        return new NoteInFile(strOooOOO, file42);
                                                                    } catch (Exception e20) {
                                                                        e = e20;
                                                                        file2 = file28;
                                                                    }
                                                                } catch (Exception e21) {
                                                                    e = e21;
                                                                    file2 = file24;
                                                                }
                                                            }
                                                            break;
                                                        } catch (Exception e22) {
                                                            e = e22;
                                                            file3 = file16;
                                                            str = str19;
                                                            file2 = file3;
                                                            C34406OooO00o.C20358OooO00o c20358OooO00o222222 = C34406OooO00o.f123390OooO00o;
                                                            c20358OooO00o222222.OooOOO0(str);
                                                            c20358OooO00o222222.OooO0Oo(e, "getNoteInFile error.", new Object[0]);
                                                            if (file2 == null) {
                                                            }
                                                        }
                                                    }
                                                } catch (Exception e23) {
                                                    e = e23;
                                                    str = str19;
                                                    file2 = file16;
                                                }
                                                C34406OooO00o.C20358OooO00o c20358OooO00o2222222 = C34406OooO00o.f123390OooO00o;
                                                c20358OooO00o2222222.OooOOO0(str);
                                                c20358OooO00o2222222.OooO0Oo(e, "getNoteInFile error.", new Object[0]);
                                                if (file2 == null) {
                                                    return null;
                                                }
                                                C32501OooO0oO.OooO0Oo(file2);
                                                return null;
                                            }
                                            return enumC32485OooO00o7;
                                        }
                                    }
                                }
                            }
                            return enumC32485OooO00o4;
                        }
                        return enumC32485OooO00o3;
                    }
                    str = "NoteInFileUseCase";
                    try {
                        throw new C27387o0000o0.OooO0O0(PerfConstants.CodeMarkerConstants.ACQUIRE_TOKEN_SILENT_START, str2 + str27);
                    } catch (Exception e24) {
                        e = e24;
                        file2 = null;
                        C34406OooO00o.C20358OooO00o c20358OooO00o22222222 = C34406OooO00o.f123390OooO00o;
                        c20358OooO00o22222222.OooOOO0(str);
                        c20358OooO00o22222222.OooO0Oo(e, "getNoteInFile error.", new Object[0]);
                        if (file2 == null) {
                        }
                    }
                }
                return enumC32485OooO00o13;
            case 1:
                c34434OooOoO = c34434OooOoO2;
                j = this.f95326OooOo0o;
                C32446OooOOOo.OooO0O0(obj);
                str2 = "noteMeta is null, noteId: ";
                c34436OooOoOO = c34436OooOoOO2;
                objOooO0oo = obj;
                noteMeta = (NoteMeta) objOooO0oo;
                if (noteMeta == null) {
                }
                break;
            case 2:
                c34434OooOoO = c34434OooOoO2;
                j = this.f95326OooOo0o;
                noteMeta = (NoteMeta) this.f95328OooOoO0;
                C32446OooOOOo.OooO0O0(obj);
                c34436OooOoOO = c34436OooOoOO2;
                objOoooOO0 = obj;
                str3 = (String) objOoooOO0;
                if (str3 != null) {
                    enumC32485OooO00o = enumC32485OooO00o13;
                    str4 = ", cost: ";
                    str5 = " size: ";
                    mapOooO0o0 = c34436OooOoOO;
                    long jCurrentTimeMillis52 = System.currentTimeMillis();
                    C34406OooO00o.C20358OooO00o c20358OooO00o11 = C34406OooO00o.f123390OooO00o;
                    c20358OooO00o11.OooOOO0("NoteInFileUseCase");
                    if (str3 == null) {
                    }
                    c20358OooO00o11.OooO0o0("getNoteInFile, getPdfPathByNoteId " + str3 + ", exist: " + boolOooO0O0 + " cost: " + (jCurrentTimeMillis52 - j) + " ms.", new Object[0]);
                    this.f95328OooOoO0 = noteMeta;
                    this.f95327OooOoO = str3;
                    this.f95329OooOoOO = mapOooO0o0;
                    this.f95326OooOo0o = j;
                    j2 = jCurrentTimeMillis52;
                    this.f95325OooOo = j2;
                    this.f95341Oooo0o = 3;
                    c27387o0000o0 = c27387o0000o07;
                    objOooOO0 = C27387o0000o0.OooOO0(c27387o0000o0, str27, this);
                    enumC32485OooO00o2 = enumC32485OooO00o;
                    if (objOooOO0 != enumC32485OooO00o2) {
                    }
                }
                C34406OooO00o.C20358OooO00o c20358OooO00o222222222 = C34406OooO00o.f123390OooO00o;
                c20358OooO00o222222222.OooOOO0(str);
                c20358OooO00o222222222.OooO0Oo(e, "getNoteInFile error.", new Object[0]);
                if (file2 == null) {
                }
                break;
            case 3:
                long j37 = this.f95325OooOo;
                long j38 = this.f95326OooOo0o;
                Map map37 = (Map) this.f95329OooOoOO;
                str7 = (String) this.f95327OooOoO;
                NoteMeta noteMeta10 = (NoteMeta) this.f95328OooOoO0;
                C32446OooOOOo.OooO0O0(obj);
                mapOooO0o0 = map37;
                str5 = " size: ";
                str6 = "NoteInFileUseCase";
                noteMeta = noteMeta10;
                c27387o0000o0 = c27387o0000o07;
                enumC32485OooO00o2 = enumC32485OooO00o13;
                objOooOO0 = obj;
                c34434OooOoO = c34434OooOoO2;
                c34436OooOoOO = c34436OooOoOO2;
                j3 = j38;
                str4 = ", cost: ";
                j2 = j37;
                Iterable iterable4 = (Iterable) objOooOO0;
                LinkedHashMap linkedHashMap42 = new LinkedHashMap(oO0O00oo.OooOO0.OooO0OO(oOo000Oo.Oooo0.OooO0Oo(C34428OooOOo.OooOOoo(iterable4, 10))));
                it = iterable4.iterator();
                while (it.hasNext()) {
                }
                str8 = str26;
                long j262 = j2;
                long jOooo00O7 = C27387o0000o0.Oooo00O(c27387o0000o0, linkedHashMap42.values());
                long jCurrentTimeMillis62 = System.currentTimeMillis();
                C34406OooO00o.C20358OooO00o c20358OooO00o32 = C34406OooO00o.f123390OooO00o;
                String str292 = str6;
                c20358OooO00o32.OooOOO0(str292);
                str9 = str292;
                int size6 = linkedHashMap42.size();
                EnumC32485OooO00o enumC32485OooO00o142 = enumC32485OooO00o2;
                String strOooO0OO5 = C31430OooO00o.OooO0OO(jOooo00O7);
                long j272 = jCurrentTimeMillis62 - j262;
                C27387o0000o0 c27387o0000o082 = c27387o0000o0;
                StringBuilder sb22 = new StringBuilder();
                sb22.append("getNoteInFile, getImageUrisByNoteId, num: ");
                sb22.append(size6);
                str10 = str5;
                sb22.append(str10);
                sb22.append(strOooO0OO5);
                str11 = str4;
                sb22.append(str11);
                sb22.append(j272);
                sb22.append(" ms.");
                c20358OooO00o32.OooO0o0(sb22.toString(), new Object[0]);
                this.f95328OooOoO0 = noteMeta;
                this.f95327OooOoO = str7;
                this.f95329OooOoOO = mapOooO0o0;
                this.f95331OooOoo0 = linkedHashMap42;
                this.f95326OooOo0o = j3;
                this.f95325OooOo = jCurrentTimeMillis62;
                this.f95341Oooo0o = 4;
                c27387o0000o02 = c27387o0000o082;
                str12 = str27;
                objOooOOOO = C27387o0000o0.OooOOOO(c27387o0000o02, str12, this);
                Map map322 = mapOooO0o0;
                enumC32485OooO00o3 = enumC32485OooO00o142;
                if (objOooOOOO != enumC32485OooO00o3) {
                }
                return enumC32485OooO00o3;
            case 4:
                long j39 = this.f95325OooOo;
                long j40 = this.f95326OooOo0o;
                Map map38 = (Map) this.f95331OooOoo0;
                Map map39 = (Map) this.f95329OooOoOO;
                String str42 = (String) this.f95327OooOoO;
                NoteMeta noteMeta11 = (NoteMeta) this.f95328OooOoO0;
                C32446OooOOOo.OooO0O0(obj);
                noteMeta2 = noteMeta11;
                enumC32485OooO00o3 = enumC32485OooO00o13;
                str8 = " cost: ";
                str9 = "NoteInFileUseCase";
                objOooOOOO = obj;
                map2 = map38;
                map = map39;
                str7 = str42;
                str12 = str27;
                str10 = " size: ";
                c27387o0000o02 = c27387o0000o07;
                str11 = ", cost: ";
                c34434OooOoO = c34434OooOoO2;
                c34436OooOoOO = c34436OooOoOO2;
                j3 = j40;
                j4 = j39;
                ArrayList arrayList32 = new ArrayList();
                it2 = ((Iterable) objOooOOOO).iterator();
                while (it2.hasNext()) {
                }
                EnumC32485OooO00o enumC32485OooO00o162 = enumC32485OooO00o3;
                LinkedHashMap linkedHashMap52 = new LinkedHashMap(oO0O00oo.OooOO0.OooO0OO(oOo000Oo.Oooo0.OooO0Oo(C34428OooOOo.OooOOoo(arrayList32, 10))));
                it3 = arrayList32.iterator();
                while (it3.hasNext()) {
                }
                String str312 = str12;
                long jOooo00O22 = C27387o0000o0.Oooo00O(c27387o0000o02, linkedHashMap52.values());
                long jCurrentTimeMillis72 = System.currentTimeMillis();
                C34406OooO00o.C20358OooO00o c20358OooO00o42 = C34406OooO00o.f123390OooO00o;
                String str322 = str9;
                c20358OooO00o42.OooOOO0(str322);
                str13 = str322;
                C27387o0000o0 c27387o0000o092 = c27387o0000o02;
                c20358OooO00o42.OooO0o0("getNoteInFile, getPaperThemeUrisByNoteId, num: " + linkedHashMap52.size() + str10 + C31430OooO00o.OooO0OO(jOooo00O22) + str11 + (jCurrentTimeMillis72 - j4) + " ms.", new Object[0]);
                this.f95328OooOoO0 = noteMeta2;
                this.f95327OooOoO = map;
                this.f95329OooOoOO = map2;
                this.f95331OooOoo0 = linkedHashMap52;
                j5 = j3;
                this.f95326OooOo0o = j5;
                this.f95325OooOo = jCurrentTimeMillis72;
                this.f95341Oooo0o = 5;
                c27387o0000o03 = c27387o0000o092;
                str14 = str312;
                objOooOOo = C27387o0000o0.OooOOo(c27387o0000o03, str14, this);
                j6 = jCurrentTimeMillis72;
                enumC32485OooO00o4 = enumC32485OooO00o162;
                if (objOooOOo != enumC32485OooO00o4) {
                }
                return enumC32485OooO00o4;
            case 5:
                long j41 = this.f95325OooOo;
                long j42 = this.f95326OooOo0o;
                Map map40 = (Map) this.f95331OooOoo0;
                Map map41 = (Map) this.f95329OooOoOO;
                Map map42 = (Map) this.f95327OooOoO;
                noteMeta3 = (NoteMeta) this.f95328OooOoO0;
                C32446OooOOOo.OooO0O0(obj);
                str11 = ", cost: ";
                str14 = str27;
                str10 = " size: ";
                c27387o0000o03 = c27387o0000o07;
                str8 = " cost: ";
                str13 = "NoteInFileUseCase";
                j6 = j41;
                objOooOOo = obj;
                map2 = map41;
                c34434OooOoO = c34434OooOoO2;
                c34436OooOoOO = c34436OooOoOO2;
                j5 = j42;
                map3 = map40;
                map = map42;
                enumC32485OooO00o4 = enumC32485OooO00o13;
                Iterable iterable22 = (Iterable) objOooOOo;
                linkedHashMap = new LinkedHashMap(oO0O00oo.OooOO0.OooO0OO(oOo000Oo.Oooo0.OooO0Oo(C34428OooOOo.OooOOoo(iterable22, 10))));
                it4 = iterable22.iterator();
                while (it4.hasNext()) {
                }
                EnumC32485OooO00o enumC32485OooO00o182 = enumC32485OooO00o4;
                j7 = j5;
                String str332 = str14;
                long jOooo00O32 = C27387o0000o0.Oooo00O(c27387o0000o03, linkedHashMap.values());
                jCurrentTimeMillis = System.currentTimeMillis();
                C34406OooO00o.C20358OooO00o c20358OooO00o52 = C34406OooO00o.f123390OooO00o;
                str15 = str13;
                c20358OooO00o52.OooOOO0(str15);
                int size22 = linkedHashMap.size();
                str6 = str15;
                c20358OooO00o52.OooO0o0("getNoteInFile, getPdfSetPaperThemeUrisByNoteId, num: " + size22 + str10 + C31430OooO00o.OooO0OO(jOooo00O32) + str11 + (jCurrentTimeMillis - j6) + " ms.", new Object[0]);
                this.f95328OooOoO0 = noteMeta3;
                this.f95327OooOoO = map;
                this.f95329OooOoOO = map2;
                this.f95331OooOoo0 = map3;
                this.f95330OooOoo = linkedHashMap;
                this.f95326OooOo0o = j7;
                this.f95325OooOo = jCurrentTimeMillis;
                this.f95341Oooo0o = 6;
                str16 = str332;
                c27387o0000o04 = c27387o0000o03;
                objOooO0OO = C27387o0000o0.OooO0OO(c27387o0000o04, str16, this);
                noteMeta4 = noteMeta3;
                enumC32485OooO00o3 = enumC32485OooO00o182;
                if (objOooO0OO == enumC32485OooO00o3) {
                }
                break;
            case 6:
                long j43 = this.f95325OooOo;
                long j44 = this.f95326OooOo0o;
                Map map43 = this.f95330OooOoo;
                Map map44 = (Map) this.f95331OooOoo0;
                Map map45 = (Map) this.f95329OooOoOO;
                Map map46 = (Map) this.f95327OooOoO;
                NoteMeta noteMeta12 = (NoteMeta) this.f95328OooOoO0;
                C32446OooOOOo.OooO0O0(obj);
                str8 = " cost: ";
                str6 = "NoteInFileUseCase";
                c27387o0000o04 = c27387o0000o07;
                str11 = ", cost: ";
                noteMeta5 = noteMeta12;
                map5 = map45;
                map7 = map46;
                enumC32485OooO00o3 = enumC32485OooO00o13;
                str16 = str27;
                str10 = " size: ";
                map4 = map43;
                j9 = j43;
                c34434OooOoO = c34434OooOoO2;
                c34436OooOoOO = c34436OooOoOO2;
                j8 = j44;
                map6 = map44;
                Iterable iterable32 = (Iterable) obj;
                linkedHashMap2 = new LinkedHashMap(oO0O00oo.OooOO0.OooO0OO(oOo000Oo.Oooo0.OooO0Oo(C34428OooOOo.OooOOoo(iterable32, 10))));
                it5 = iterable32.iterator();
                while (it5.hasNext()) {
                }
                EnumC32485OooO00o enumC32485OooO00o202 = enumC32485OooO00o3;
                long j282 = j8;
                long jOooo00O42 = C27387o0000o0.Oooo00O(c27387o0000o04, linkedHashMap2.values());
                long jCurrentTimeMillis82 = System.currentTimeMillis();
                C34406OooO00o.C20358OooO00o c20358OooO00o62 = C34406OooO00o.f123390OooO00o;
                str17 = str6;
                c20358OooO00o62.OooOOO0(str17);
                int size32 = linkedHashMap2.size();
                String strOooO0OO22 = C31430OooO00o.OooO0OO(jOooo00O42);
                Map map332 = map7;
                Map map342 = map6;
                long j292 = jCurrentTimeMillis82 - j9;
                StringBuilder sb42 = new StringBuilder();
                map8 = map5;
                sb42.append("getNoteInFile, getAudioPathsByNoteId, num: ");
                sb42.append(size32);
                sb42.append(str10);
                sb42.append(strOooO0OO22);
                sb42.append(str11);
                sb42.append(j292);
                sb42.append(" ms.");
                c20358OooO00o62.OooO0o0(sb42.toString(), new Object[0]);
                File dataDir2 = c27387o0000o04.f95452OooOoo0.getDataDir();
                kotlin.jvm.internal.OooOOO0.OooO0o(dataDir2, "getDataDir(...)");
                String[] strArrDatabaseList2 = c27387o0000o04.f95452OooOoo0.databaseList();
                kotlin.jvm.internal.OooOOO0.OooO0o(strArrDatabaseList2, "databaseList(...)");
                ArrayList<String> arrayList42 = new ArrayList();
                while (i < r7) {
                }
                linkedHashMap3 = new LinkedHashMap(oO0O00oo.OooOO0.OooO0OO(oOo000Oo.Oooo0.OooO0Oo(C34428OooOOo.OooOOoo(arrayList42, 10))));
                while (r3.hasNext()) {
                }
                long jOooo00O52 = C27387o0000o0.Oooo00O(c27387o0000o04, linkedHashMap3.values());
                jCurrentTimeMillis2 = System.currentTimeMillis();
                C34406OooO00o.C20358OooO00o c20358OooO00o72 = C34406OooO00o.f123390OooO00o;
                c20358OooO00o72.OooOOO0(str17);
                int size42 = linkedHashMap3.size();
                String strOooO0OO32 = C31430OooO00o.OooO0OO(jOooo00O52);
                str18 = str11;
                long j302 = jCurrentTimeMillis2 - jCurrentTimeMillis82;
                str19 = str17;
                StringBuilder sb62 = new StringBuilder();
                str20 = str10;
                sb62.append("getNoteInFile, getDatabaseList, num: ");
                sb62.append(size42);
                sb62.append(", size: ");
                sb62.append(strOooO0OO32);
                sb62.append(str8);
                sb62.append(j302);
                sb62.append(" ms.");
                c20358OooO00o72.OooO0o0(sb62.toString(), new Object[0]);
                this.f95328OooOoO0 = noteMeta5;
                map9 = map332;
                this.f95327OooOoO = map9;
                this.f95329OooOoOO = map8;
                map10 = map342;
                this.f95331OooOoo0 = map10;
                this.f95330OooOoo = map4;
                map11 = linkedHashMap2;
                this.f95332OooOooO = map11;
                this.f95333OooOooo = linkedHashMap3;
                j10 = j282;
                this.f95326OooOo0o = j10;
                this.f95325OooOo = jCurrentTimeMillis2;
                this.f95341Oooo0o = 7;
                objOooO0o = C27387o0000o0.OooO0o(c27387o0000o04, str16, this);
                enumC32485OooO00o4 = enumC32485OooO00o202;
                if (objOooO0o == enumC32485OooO00o4) {
                }
                break;
            case 7:
                long j45 = this.f95325OooOo;
                long j46 = this.f95326OooOo0o;
                Map map47 = this.f95333OooOooo;
                Map map48 = this.f95332OooOooO;
                Map map49 = this.f95330OooOoo;
                Map map50 = (Map) this.f95331OooOoo0;
                Map map51 = (Map) this.f95329OooOoOO;
                Map map52 = (Map) this.f95327OooOoO;
                NoteMeta noteMeta13 = (NoteMeta) this.f95328OooOoO0;
                C32446OooOOOo.OooO0O0(obj);
                map11 = map48;
                map14 = map50;
                str18 = ", cost: ";
                noteMeta6 = noteMeta13;
                enumC32485OooO00o4 = enumC32485OooO00o13;
                str20 = " size: ";
                str16 = str27;
                str19 = "NoteInFileUseCase";
                objOooO0o = obj;
                c27387o0000o04 = c27387o0000o07;
                j10 = j46;
                map4 = map49;
                map12 = map51;
                map9 = map52;
                map13 = map47;
                c34434OooOoO = c34434OooOoO2;
                c34436OooOoOO = c34436OooOoOO2;
                jCurrentTimeMillis2 = j45;
                file3 = (File) objOooO0o;
                map15 = map13;
                j11 = jCurrentTimeMillis2;
                file4 = new File(file3, "note_meta.json");
                str21 = this.f95334Oooo;
                if (str21 != null) {
                    String input2 = noteMeta6.getTitle();
                    Pattern patternCompile2 = Pattern.compile("[\\\\/:*?\"<>|]");
                    map16 = map11;
                    kotlin.jvm.internal.OooOOO0.OooO0o(patternCompile2, "compile(...)");
                    enumC32485OooO00o5 = enumC32485OooO00o4;
                    kotlin.jvm.internal.OooOOO0.OooO0oO(input2, "input");
                    String strReplaceAll2 = patternCompile2.matcher(input2).replaceAll(C18115b5.CONNECTOR);
                    kotlin.jvm.internal.OooOOO0.OooO0o(strReplaceAll2, "replaceAll(...)");
                    noteMetaCopy$default = NoteMeta.copy$default(noteMeta6, null, null, strReplaceAll2, null, null, false, null, 0, 0, false, null, 0, 0L, 0L, null, false, false, false, 0L, 524283, null);
                    String json6 = C28028OooO0o.OooO00o().toJson(noteMetaCopy$default);
                    kotlin.jvm.internal.OooOOO0.OooO0Oo(json6);
                    C32501OooO0oO.OooO(file4, json6);
                    long j312 = j10;
                    jCurrentTimeMillis3 = System.currentTimeMillis();
                    C34406OooO00o.C20358OooO00o c20358OooO00o82 = C34406OooO00o.f123390OooO00o;
                    str22 = str19;
                    c20358OooO00o82.OooOOO0(str22);
                    c20358OooO00o82.OooO0o0("getNoteInFile, convert noteMeta: " + noteMetaCopy$default + " to json file, cost: " + (jCurrentTimeMillis3 - j11) + " ms.", new Object[0]);
                    file5 = new File(file3, "note_in_flag.json");
                    String json22 = C28028OooO0o.OooO00o().toJson(this.f95345OoooO00);
                    c20358OooO00o82.OooOOO0(str22);
                    str23 = " ms.";
                    c20358OooO00o82.OooO0o0("getNoteInFileByPages, noteInFlagJson: " + json22, new Object[0]);
                    kotlin.jvm.internal.OooOOO0.OooO0Oo(json22);
                    C32501OooO0oO.OooO(file5, json22);
                    file6 = new File(file3, "note_extra.json");
                    String json32 = C28028OooO0o.OooO00o().toJson(new C27387o0000o0.OooO00o(45));
                    kotlin.jvm.internal.OooOOO0.OooO0Oo(json32);
                    C32501OooO0oO.OooO(file6, json32);
                    C27808OooOOo c27808OooOOoOooO0O02 = c27387o0000o04.f95448OooOo0o.OooO0O0(str16);
                    this.f95328OooOoO0 = file3;
                    this.f95327OooOoO = map9;
                    this.f95329OooOoOO = map12;
                    this.f95331OooOoo0 = map14;
                    this.f95330OooOoo = map4;
                    this.f95332OooOooO = map16;
                    this.f95333OooOooo = map15;
                    this.f95336Oooo000 = file3;
                    file7 = file4;
                    this.f95337Oooo00O = file7;
                    this.f95338Oooo00o = noteMetaCopy$default;
                    this.f95335Oooo0 = file5;
                    this.f95339Oooo0O0 = file6;
                    j12 = j312;
                    this.f95326OooOo0o = j12;
                    map17 = map9;
                    this.f95325OooOo = jCurrentTimeMillis3;
                    this.f95341Oooo0o = 8;
                    objOooOo00 = C25252OooO0Oo.OooOo00(c27808OooOOoOooO0O02, this);
                    enumC32485OooO00o3 = enumC32485OooO00o5;
                    if (objOooOo00 != enumC32485OooO00o3) {
                    }
                    return enumC32485OooO00o3;
                }
                C34406OooO00o.C20358OooO00o c20358OooO00o2222222222 = C34406OooO00o.f123390OooO00o;
                c20358OooO00o2222222222.OooOOO0(str);
                c20358OooO00o2222222222.OooO0Oo(e, "getNoteInFile error.", new Object[0]);
                if (file2 == null) {
                }
                break;
            case 8:
                long j47 = this.f95325OooOo;
                long j48 = this.f95326OooOo0o;
                File file43 = this.f95339Oooo0O0;
                File file44 = this.f95335Oooo0;
                NoteMeta noteMeta14 = this.f95338Oooo00o;
                File file45 = this.f95337Oooo00O;
                File file46 = this.f95336Oooo000;
                map21 = this.f95333OooOooo;
                Map map53 = this.f95332OooOooO;
                Map map54 = this.f95330OooOoo;
                Map map55 = (Map) this.f95331OooOoo0;
                Map map56 = (Map) this.f95329OooOoOO;
                Map map57 = (Map) this.f95327OooOoO;
                File file47 = (File) this.f95328OooOoO0;
                C32446OooOOOo.OooO0O0(obj);
                str20 = " size: ";
                file7 = file45;
                str18 = ", cost: ";
                file8 = file47;
                file10 = file43;
                map20 = map57;
                str19 = "NoteInFileUseCase";
                file9 = file44;
                map19 = map56;
                c27387o0000o05 = c27387o0000o07;
                file11 = file46;
                enumC32485OooO00o6 = enumC32485OooO00o13;
                str16 = str27;
                c34434OooOoO = c34434OooOoO2;
                c34436OooOoOO = c34436OooOoOO2;
                noteMeta7 = noteMeta14;
                j13 = j47;
                map18 = map55;
                str23 = " ms.";
                j12 = j48;
                map16 = map53;
                map4 = map54;
                List list62 = (List) obj;
                String str362 = str16;
                if (list62 != null) {
                }
                j14 = j13;
                InterfaceC27309OooOoO interfaceC27309OooOoO2 = c27387o0000o05.f95429OooO0Oo;
                this.f95328OooOoO0 = file8;
                this.f95327OooOoO = map20;
                this.f95329OooOoOO = map19;
                this.f95331OooOoo0 = map18;
                this.f95330OooOoo = map4;
                this.f95332OooOooO = map16;
                this.f95333OooOooo = map21;
                this.f95336Oooo000 = file11;
                this.f95337Oooo00O = file7;
                this.f95338Oooo00o = noteMeta7;
                this.f95335Oooo0 = file9;
                this.f95339Oooo0O0 = file10;
                this.f95340Oooo0OO = list;
                this.f95326OooOo0o = j12;
                file13 = file10;
                file12 = file8;
                this.f95325OooOo = j14;
                this.f95341Oooo0o = 9;
                str24 = str362;
                objOooOO0o = interfaceC27309OooOoO2.OooOO0o(str24, this);
                enumC32485OooO00o7 = enumC32485OooO00o6;
                if (objOooOO0o != enumC32485OooO00o7) {
                }
                return enumC32485OooO00o7;
            case 9:
                long j49 = this.f95325OooOo;
                long j50 = this.f95326OooOo0o;
                List list9 = (List) this.f95340Oooo0OO;
                File file48 = this.f95339Oooo0O0;
                File file49 = this.f95335Oooo0;
                NoteMeta noteMeta15 = this.f95338Oooo00o;
                File file50 = this.f95337Oooo00O;
                File file51 = this.f95336Oooo000;
                Map map58 = this.f95333OooOooo;
                Map map59 = this.f95332OooOooO;
                Map map60 = this.f95330OooOoo;
                Map map61 = (Map) this.f95331OooOoo0;
                Map map62 = (Map) this.f95329OooOoOO;
                Map map63 = (Map) this.f95327OooOoO;
                File file52 = (File) this.f95328OooOoO0;
                C32446OooOOOo.OooO0O0(obj);
                j15 = j49;
                c34434OooOoO = c34434OooOoO2;
                c34436OooOoOO = c34436OooOoOO2;
                noteMeta7 = noteMeta15;
                map23 = map61;
                str18 = ", cost: ";
                c27387o0000o05 = c27387o0000o07;
                list2 = list9;
                map20 = map63;
                str20 = " size: ";
                file16 = file52;
                str24 = str27;
                file17 = file51;
                map22 = map58;
                str23 = " ms.";
                file14 = file48;
                map19 = map62;
                str19 = "NoteInFileUseCase";
                file9 = file49;
                j16 = j50;
                map16 = map59;
                map4 = map60;
                enumC32485OooO00o8 = enumC32485OooO00o13;
                file15 = file50;
                objOooOO0o = obj;
                noteContent = (NoteContent) objOooOO0o;
                if (noteContent == null) {
                }
                C34406OooO00o.C20358OooO00o c20358OooO00o22222222222 = C34406OooO00o.f123390OooO00o;
                c20358OooO00o22222222222.OooOOO0(str);
                c20358OooO00o22222222222.OooO0Oo(e, "getNoteInFile error.", new Object[0]);
                if (file2 == null) {
                }
                break;
            case 10:
                long j51 = this.f95325OooOo;
                long j52 = this.f95326OooOo0o;
                List list10 = (List) this.f95340Oooo0OO;
                File file53 = this.f95339Oooo0O0;
                File file54 = this.f95335Oooo0;
                NoteMeta noteMeta16 = this.f95338Oooo00o;
                File file55 = this.f95337Oooo00O;
                File file56 = this.f95336Oooo000;
                Map map64 = this.f95333OooOooo;
                Map map65 = this.f95332OooOooO;
                Map map66 = this.f95330OooOoo;
                Map map67 = (Map) this.f95331OooOoo0;
                Map map68 = (Map) this.f95329OooOoOO;
                Map map69 = (Map) this.f95327OooOoO;
                File file57 = (File) this.f95328OooOoO0;
                C32446OooOOOo.OooO0O0(obj);
                str20 = " size: ";
                str19 = "NoteInFileUseCase";
                file9 = file54;
                file16 = file57;
                str24 = str27;
                file20 = file56;
                map16 = map65;
                map25 = map64;
                str18 = ", cost: ";
                noteMeta7 = noteMeta16;
                c27387o0000o06 = c27387o0000o07;
                map24 = map69;
                list4 = list10;
                file18 = file53;
                j19 = j52;
                map26 = map67;
                map19 = map68;
                enumC32485OooO00o9 = enumC32485OooO00o13;
                j18 = j51;
                file19 = file55;
                map4 = map66;
                c34436OooOoOO = c34436OooOoOO2;
                str23 = " ms.";
                Map map352 = (Map) obj;
                String str372 = str24;
                long j352 = j19;
                C27387o0000o0.C27388OooO0Oo c27388OooO0Oo2 = new C27387o0000o0.C27388OooO0Oo(list4, map352 != null ? c34436OooOoOO : map352);
                File file372 = new File(file20, "note_label.json");
                String json42 = C28028OooO0o.OooO00o().toJson(c27388OooO0Oo2);
                kotlin.jvm.internal.OooOOO0.OooO0Oo(json42);
                C32501OooO0oO.OooO(file372, json42);
                File file382 = new File(file20, "notepdf_lost_info.json");
                file382.createNewFile();
                InterfaceC27312OooOoo interfaceC27312OooOoo2 = c27387o0000o06.f95428OooO0OO;
                this.f95328OooOoO0 = file16;
                this.f95327OooOoO = map24;
                this.f95329OooOoOO = map19;
                this.f95331OooOoo0 = map26;
                this.f95330OooOoo = map4;
                this.f95332OooOooO = map16;
                this.f95333OooOooo = map25;
                this.f95336Oooo000 = file20;
                this.f95337Oooo00O = file19;
                this.f95338Oooo00o = noteMeta7;
                this.f95335Oooo0 = file9;
                this.f95339Oooo0O0 = file18;
                this.f95340Oooo0OO = file372;
                this.f95342Oooo0o0 = file382;
                File file392 = file18;
                file21 = file19;
                this.f95326OooOo0o = j352;
                long j362 = j18;
                this.f95325OooOo = j362;
                this.f95341Oooo0o = 11;
                objOooO0O0 = interfaceC27312OooOoo2.OooO0O0(str372, this);
                enumC32485OooO00o10 = enumC32485OooO00o9;
                if (objOooO0O0 != enumC32485OooO00o10) {
                }
                break;
            case 11:
                long j53 = this.f95325OooOo;
                long j54 = this.f95326OooOo0o;
                File file58 = this.f95342Oooo0o0;
                File file59 = (File) this.f95340Oooo0OO;
                File file60 = this.f95339Oooo0O0;
                j21 = j53;
                File file61 = this.f95335Oooo0;
                NoteMeta noteMeta17 = this.f95338Oooo00o;
                File file62 = this.f95337Oooo00O;
                File file63 = this.f95336Oooo000;
                Map map70 = this.f95333OooOooo;
                Map map71 = this.f95332OooOooO;
                Map map72 = this.f95330OooOoo;
                Map map73 = (Map) this.f95331OooOoo0;
                Map map74 = (Map) this.f95329OooOoOO;
                Map map75 = (Map) this.f95327OooOoO;
                File file64 = (File) this.f95328OooOoO0;
                C32446OooOOOo.OooO0O0(obj);
                str20 = " size: ";
                str19 = "NoteInFileUseCase";
                file9 = file61;
                file25 = file63;
                noteMeta8 = noteMeta17;
                c27387o0000o06 = c27387o0000o07;
                map24 = map75;
                file26 = file58;
                file23 = file60;
                map31 = map71;
                enumC32485OooO00o11 = enumC32485OooO00o13;
                map28 = map72;
                str23 = " ms.";
                file21 = file62;
                j20 = j54;
                map27 = map70;
                map30 = map74;
                str18 = ", cost: ";
                str25 = str27;
                file22 = file59;
                map29 = map73;
                file24 = file64;
                notePdfLostInfoEntity = (NotePdfLostInfoEntity) obj;
                if (notePdfLostInfoEntity == null) {
                }
                LinkedHashMap linkedHashMapOooOO02 = C34444Oooo0O0.OooOO0(C34444Oooo0O0.OooOO0(C34444Oooo0O0.OooOO0(C34444Oooo0O0.OooOO0(C34444Oooo0O0.OooOO0(map27, map24), map30), map29), map28), map31);
                arrayList2 = new ArrayList();
                it6 = linkedHashMapOooOO02.entrySet().iterator();
                while (it6.hasNext()) {
                    break;
                }
                str = str19;
                arrayListOooooOo = oOo000Oo.OooOo.OooooOo(oOo000Oo.OooOo.OooooOo(oOo000Oo.OooOo.OooooOo(oOo000Oo.OooOo.OooooOo(oOo000Oo.OooOo.OooooOo(arrayList2, file21), file9), file23), file26), file22);
                file24 = file27;
                this.f95328OooOoO0 = file24;
                this.f95327OooOoO = file25;
                noteMeta9 = noteMeta8;
                this.f95329OooOoOO = noteMeta9;
                this.f95331OooOoo0 = arrayListOooooOo;
                this.f95330OooOoo = null;
                this.f95332OooOooO = null;
                this.f95333OooOooo = null;
                this.f95336Oooo000 = null;
                this.f95337Oooo00O = null;
                this.f95338Oooo00o = null;
                this.f95335Oooo0 = null;
                this.f95339Oooo0O0 = null;
                this.f95340Oooo0OO = null;
                this.f95342Oooo0o0 = null;
                j22 = j20;
                this.f95326OooOo0o = j22;
                j23 = j21;
                this.f95325OooOo = j23;
                this.f95341Oooo0o = 12;
                objOooOoO0 = C27387o0000o0.OooOoO0(c27387o0000o06, arrayListOooooOo, str25, this);
                enumC32485OooO00o12 = enumC32485OooO00o11;
                if (objOooOoO0 != enumC32485OooO00o12) {
                }
                break;
            case 12:
                long j55 = this.f95325OooOo;
                j22 = this.f95326OooOo0o;
                List list11 = (List) this.f95331OooOoo0;
                noteMeta9 = (NoteMeta) this.f95329OooOoOO;
                File file65 = (File) this.f95327OooOoO;
                file = (File) this.f95328OooOoO0;
                try {
                    C32446OooOOOo.OooO0O0(obj);
                    objOooOoO0 = obj;
                    str18 = ", cost: ";
                    str20 = " size: ";
                    str23 = " ms.";
                    file29 = file65;
                    str = "NoteInFileUseCase";
                    c27387o0000o06 = c27387o0000o07;
                    j23 = j55;
                    list5 = list11;
                    file28 = file;
                    zBooleanValue = ((Boolean) objOooOoO0).booleanValue();
                    C34406OooO00o.C20358OooO00o c20358OooO00o102 = C34406OooO00o.f123390OooO00o;
                    c20358OooO00o102.OooOOO0(str);
                    c20358OooO00o102.OooO0o0("getNoteInFile, isToZipFileValid: " + zBooleanValue, new Object[0]);
                    if (zBooleanValue) {
                    }
                } catch (Exception e25) {
                    e = e25;
                    str = "NoteInFileUseCase";
                    file2 = file;
                    break;
                }
                break;
            default:
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }
}
