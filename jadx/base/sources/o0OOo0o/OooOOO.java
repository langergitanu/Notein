package o0OOo0o;

import android.net.Uri;
import androidx.fragment.app.C21904OooOoo0;
import com.aspose.words.StyleIdentifier;
import com.microsoft.identity.common.java.cache.CacheKeyValueDelegate;
import com.orion.notein.domain.models.backup.BackupException;
import com.orion.notein.domain.models.backup.BackupFile;
import com.orion.notein.domain.models.folder.Folder;
import com.orion.notein.domain.models.note.Note;
import com.orion.notein.domain.models.papertheme.MyTemplate;
import java.io.File;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.C24032OooOooO;
import kotlin.jvm.internal.C24033OooOooo;
import o000OoO.C24536OooO0Oo;
import o00o00O0.C25252OooO0Oo;
import o0OOOO00.C27095OooOo0O;
import o0oOo0o0.AbstractC30978OooO;
import o0oo000O.C31190OooO0oo;
import o0oo000O.C31193OooOOo;
import o0ooO0O0.C31430OooO00o;
import oO00ooO.C32446OooOOOo;
import oO00ooO.C32460OooOooO;
import oO00ooo.AbstractC32476OooO;
import oO00ooo.InterfaceC32482OooO0o0;
import oO00ooo0.EnumC32485OooO00o;
import oO0O000o.InterfaceC32508OooOOOo;
import oO0o0O0o.C33595OooOOo;
import oO0o0OO.InterfaceC33636Oooo00o;
import oOO00oo.C34406OooO00o;
import oOo000Oo.C34428OooOOo;
import oOo000Oo.C34429OooOOo0;
import oOo000Oo.C34431OooOo0;

/* JADX INFO: loaded from: classes9.dex */
@InterfaceC32482OooO0o0(m80622c = "com.orion.notein.domain.usecase.BackupUseCase$backup$2", m80623f = "BackupUseCase.kt", m80624l = {StyleIdentifier.COLORFUL_LIST_ACCENT_6, StyleIdentifier.INTENSE_EMPHASIS, StyleIdentifier.TOC_HEADING, 270, StyleIdentifier.GRID_TABLE_3_ACCENT_3, StyleIdentifier.GRID_TABLE_7_COLORFUL_ACCENT_5, StyleIdentifier.LIST_TABLE_4_ACCENT_2, StyleIdentifier.LIST_TABLE_6_COLORFUL_ACCENT_5, 413, 457, 468, 490}, m80625m = "invokeSuspend")
public final class OooOOO extends AbstractC32476OooO implements InterfaceC32508OooOOOo<InterfaceC33636Oooo00o, Continuation<? super C32460OooOooO>, Object> {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public Object f95104OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public File f95105OooOo0o;

    /* JADX INFO: renamed from: OooOoO, reason: collision with root package name */
    public Object f95106OooOoO;

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public Object f95107OooOoO0;

    /* JADX INFO: renamed from: OooOoOO, reason: collision with root package name */
    public Object f95108OooOoOO;

    /* JADX INFO: renamed from: OooOoo, reason: collision with root package name */
    public Object f95109OooOoo;

    /* JADX INFO: renamed from: OooOoo0, reason: collision with root package name */
    public Object f95110OooOoo0;

    /* JADX INFO: renamed from: OooOooO, reason: collision with root package name */
    public Object f95111OooOooO;

    /* JADX INFO: renamed from: OooOooo, reason: collision with root package name */
    public Object f95112OooOooo;

    /* JADX INFO: renamed from: Oooo, reason: collision with root package name */
    public final /* synthetic */ AbstractC30978OooO f95113Oooo;

    /* JADX INFO: renamed from: Oooo0, reason: collision with root package name */
    public float f95114Oooo0;

    /* JADX INFO: renamed from: Oooo000, reason: collision with root package name */
    public Iterator f95115Oooo000;

    /* JADX INFO: renamed from: Oooo00O, reason: collision with root package name */
    public Object f95116Oooo00O;

    /* JADX INFO: renamed from: Oooo00o, reason: collision with root package name */
    public Object f95117Oooo00o;

    /* JADX INFO: renamed from: Oooo0O0, reason: collision with root package name */
    public long f95118Oooo0O0;

    /* JADX INFO: renamed from: Oooo0OO, reason: collision with root package name */
    public int f95119Oooo0OO;

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    public final /* synthetic */ C27351Oooo0O0 f95120Oooo0o;

    /* JADX INFO: renamed from: Oooo0o0, reason: collision with root package name */
    public int f95121Oooo0o0;

    /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
    public final /* synthetic */ BackupFile.DiskVendor f95122Oooo0oO;

    /* JADX INFO: renamed from: Oooo0oo, reason: collision with root package name */
    public final /* synthetic */ Uri f95123Oooo0oo;

    public static final class OooO00o<T> implements Comparator {
        /* JADX WARN: Multi-variable type inference failed */
        @Override // java.util.Comparator
        public final int compare(T t, T t2) {
            return C24536OooO0Oo.OooO0O0(((Folder) t).getId(), ((Folder) t2).getId());
        }
    }

    public static final class OooO0O0<T> implements Comparator {
        /* JADX WARN: Multi-variable type inference failed */
        @Override // java.util.Comparator
        public final int compare(T t, T t2) {
            return C24536OooO0Oo.OooO0O0(Long.valueOf(((BackupFile) t2).getCreationTime()), Long.valueOf(((BackupFile) t).getCreationTime()));
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OooOOO(C27351Oooo0O0 c27351Oooo0O0, BackupFile.DiskVendor diskVendor, Uri uri, AbstractC30978OooO abstractC30978OooO, Continuation<? super OooOOO> continuation) {
        super(2, continuation);
        this.f95120Oooo0o = c27351Oooo0O0;
        this.f95122Oooo0oO = diskVendor;
        this.f95123Oooo0oo = uri;
        this.f95113Oooo = abstractC30978OooO;
    }

    @Override // oO00ooo.AbstractC32477OooO00o
    public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
        return new OooOOO(this.f95120Oooo0o, this.f95122Oooo0oO, this.f95123Oooo0oo, this.f95113Oooo, continuation);
    }

    @Override // oO0O000o.InterfaceC32508OooOOOo
    public final Object invoke(InterfaceC33636Oooo00o interfaceC33636Oooo00o, Continuation<? super C32460OooOooO> continuation) {
        return ((OooOOO) create(interfaceC33636Oooo00o, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
    }

    /* JADX WARN: Code restructure failed: missing block: B:184:0x06f1, code lost:
    
        if (r2 == r3) goto L185;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Path cross not found for [B:420:0x0cfa, B:425:0x0d07], limit reached: 689 */
    /* JADX WARN: Removed duplicated region for block: B:112:0x0498 A[Catch: all -> 0x042f, Exception -> 0x0438, TRY_ENTER, TryCatch #71 {Exception -> 0x0438, all -> 0x042f, blocks: (B:112:0x0498, B:114:0x04a5, B:116:0x04ab, B:92:0x041e, B:94:0x042b), top: B:606:0x041e }] */
    /* JADX WARN: Removed duplicated region for block: B:135:0x050d A[Catch: all -> 0x04ff, Exception -> 0x0504, TRY_ENTER, TRY_LEAVE, TryCatch #45 {Exception -> 0x0504, all -> 0x04ff, blocks: (B:122:0x04d7, B:124:0x04dd, B:127:0x04e4, B:128:0x04fe, B:135:0x050d), top: B:655:0x04d7 }] */
    /* JADX WARN: Removed duplicated region for block: B:137:0x051a A[Catch: all -> 0x10ce, Exception -> 0x10d1, TRY_ENTER, TryCatch #51 {Exception -> 0x10d1, all -> 0x10ce, blocks: (B:120:0x04bf, B:133:0x0509, B:138:0x052a, B:140:0x0544, B:143:0x0560, B:137:0x051a), top: B:643:0x04bf }] */
    /* JADX WARN: Removed duplicated region for block: B:156:0x0603 A[Catch: all -> 0x0649, Exception -> 0x0653, TRY_ENTER, TRY_LEAVE, TryCatch #54 {Exception -> 0x0653, all -> 0x0649, blocks: (B:231:0x0831, B:233:0x083d, B:235:0x086f, B:236:0x0872, B:262:0x0927, B:263:0x092c, B:221:0x07f4, B:223:0x0808, B:224:0x080b, B:149:0x05b6, B:156:0x0603, B:160:0x060e, B:180:0x06ba), top: B:638:0x05b6 }] */
    /* JADX WARN: Removed duplicated region for block: B:173:0x0665  */
    /* JADX WARN: Removed duplicated region for block: B:210:0x0769  */
    /* JADX WARN: Removed duplicated region for block: B:221:0x07f4 A[Catch: all -> 0x0649, Exception -> 0x0653, TRY_ENTER, TryCatch #54 {Exception -> 0x0653, all -> 0x0649, blocks: (B:231:0x0831, B:233:0x083d, B:235:0x086f, B:236:0x0872, B:262:0x0927, B:263:0x092c, B:221:0x07f4, B:223:0x0808, B:224:0x080b, B:149:0x05b6, B:156:0x0603, B:160:0x060e, B:180:0x06ba), top: B:638:0x05b6 }] */
    /* JADX WARN: Removed duplicated region for block: B:226:0x080e  */
    /* JADX WARN: Removed duplicated region for block: B:231:0x0831 A[Catch: all -> 0x0649, Exception -> 0x0653, TRY_ENTER, TryCatch #54 {Exception -> 0x0653, all -> 0x0649, blocks: (B:231:0x0831, B:233:0x083d, B:235:0x086f, B:236:0x0872, B:262:0x0927, B:263:0x092c, B:221:0x07f4, B:223:0x0808, B:224:0x080b, B:149:0x05b6, B:156:0x0603, B:160:0x060e, B:180:0x06ba), top: B:638:0x05b6 }] */
    /* JADX WARN: Removed duplicated region for block: B:243:0x08b1 A[Catch: all -> 0x08e8, Exception -> 0x08ec, TRY_LEAVE, TryCatch #77 {Exception -> 0x08ec, all -> 0x08e8, blocks: (B:241:0x08ad, B:243:0x08b1), top: B:595:0x08ad }] */
    /* JADX WARN: Removed duplicated region for block: B:257:0x08f0  */
    /* JADX WARN: Removed duplicated region for block: B:260:0x0907 A[Catch: all -> 0x08cf, Exception -> 0x08da, TRY_LEAVE, TryCatch #66 {Exception -> 0x08da, all -> 0x08cf, blocks: (B:245:0x08bf, B:247:0x08cb, B:252:0x08e5, B:258:0x08fa, B:260:0x0907), top: B:616:0x08bf }] */
    /* JADX WARN: Removed duplicated region for block: B:264:0x092d  */
    /* JADX WARN: Removed duplicated region for block: B:285:0x09b1  */
    /* JADX WARN: Removed duplicated region for block: B:291:0x09c9  */
    /* JADX WARN: Removed duplicated region for block: B:304:0x09ec A[Catch: all -> 0x09a9, Exception -> 0x09ad, TRY_LEAVE, TryCatch #75 {Exception -> 0x09ad, all -> 0x09a9, blocks: (B:275:0x098e, B:278:0x0998, B:286:0x09b2, B:288:0x09b8, B:292:0x09ca, B:294:0x09d0, B:304:0x09ec, B:310:0x09fc, B:315:0x0a1d), top: B:599:0x098e }] */
    /* JADX WARN: Removed duplicated region for block: B:346:0x0ac8  */
    /* JADX WARN: Removed duplicated region for block: B:358:0x0b06 A[Catch: all -> 0x0aee, Exception -> 0x0af3, TRY_ENTER, TRY_LEAVE, TryCatch #72 {Exception -> 0x0af3, all -> 0x0aee, blocks: (B:347:0x0aca, B:349:0x0ae2, B:358:0x0b06), top: B:604:0x0aca }] */
    /* JADX WARN: Removed duplicated region for block: B:360:0x0b16  */
    /* JADX WARN: Removed duplicated region for block: B:380:0x0ba7 A[Catch: all -> 0x0b80, Exception -> 0x0b87, TRY_ENTER, TryCatch #46 {Exception -> 0x0b87, all -> 0x0b80, blocks: (B:366:0x0b60, B:368:0x0b77, B:375:0x0b8e, B:380:0x0ba7, B:382:0x0bba, B:387:0x0bd9, B:392:0x0c10, B:394:0x0c1f, B:400:0x0c44), top: B:653:0x0b60 }] */
    /* JADX WARN: Removed duplicated region for block: B:387:0x0bd9 A[Catch: all -> 0x0b80, Exception -> 0x0b87, LOOP:5: B:385:0x0bd3->B:387:0x0bd9, LOOP_END, TRY_ENTER, TRY_LEAVE, TryCatch #46 {Exception -> 0x0b87, all -> 0x0b80, blocks: (B:366:0x0b60, B:368:0x0b77, B:375:0x0b8e, B:380:0x0ba7, B:382:0x0bba, B:387:0x0bd9, B:392:0x0c10, B:394:0x0c1f, B:400:0x0c44), top: B:653:0x0b60 }] */
    /* JADX WARN: Removed duplicated region for block: B:392:0x0c10 A[Catch: all -> 0x0b80, Exception -> 0x0b87, TRY_ENTER, TryCatch #46 {Exception -> 0x0b87, all -> 0x0b80, blocks: (B:366:0x0b60, B:368:0x0b77, B:375:0x0b8e, B:380:0x0ba7, B:382:0x0bba, B:387:0x0bd9, B:392:0x0c10, B:394:0x0c1f, B:400:0x0c44), top: B:653:0x0b60 }] */
    /* JADX WARN: Removed duplicated region for block: B:400:0x0c44 A[Catch: all -> 0x0b80, Exception -> 0x0b87, TRY_ENTER, TRY_LEAVE, TryCatch #46 {Exception -> 0x0b87, all -> 0x0b80, blocks: (B:366:0x0b60, B:368:0x0b77, B:375:0x0b8e, B:380:0x0ba7, B:382:0x0bba, B:387:0x0bd9, B:392:0x0c10, B:394:0x0c1f, B:400:0x0c44), top: B:653:0x0b60 }] */
    /* JADX WARN: Removed duplicated region for block: B:435:0x0dd0  */
    /* JADX WARN: Removed duplicated region for block: B:436:0x0dd3  */
    /* JADX WARN: Removed duplicated region for block: B:439:0x0e4c  */
    /* JADX WARN: Removed duplicated region for block: B:469:0x0f13 A[Catch: all -> 0x0ed6, Exception -> 0x0ed8, TryCatch #48 {Exception -> 0x0ed8, all -> 0x0ed6, blocks: (B:467:0x0ef5, B:442:0x0e8d, B:444:0x0ea4, B:446:0x0ea9, B:449:0x0eb4, B:469:0x0f13, B:470:0x0f20), top: B:649:0x0ef5 }] */
    /* JADX WARN: Removed duplicated region for block: B:471:0x0f21  */
    /* JADX WARN: Removed duplicated region for block: B:495:0x100b  */
    /* JADX WARN: Removed duplicated region for block: B:589:0x0ca8 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:606:0x041e A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:624:0x05aa A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:649:0x0ef5 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:653:0x0b60 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:655:0x04d7 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:708:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:709:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:70:0x03ab  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x03be  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x040c  */
    /* JADX WARN: Type inference failed for: r2v1 */
    /* JADX WARN: Type inference failed for: r2v11 */
    /* JADX WARN: Type inference failed for: r2v116 */
    /* JADX WARN: Type inference failed for: r2v117 */
    /* JADX WARN: Type inference failed for: r2v119 */
    /* JADX WARN: Type inference failed for: r2v12 */
    /* JADX WARN: Type inference failed for: r2v126 */
    /* JADX WARN: Type inference failed for: r2v127 */
    /* JADX WARN: Type inference failed for: r2v128 */
    /* JADX WARN: Type inference failed for: r2v129 */
    /* JADX WARN: Type inference failed for: r2v13 */
    /* JADX WARN: Type inference failed for: r2v130, types: [java.io.File, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v132, types: [java.io.File] */
    /* JADX WARN: Type inference failed for: r2v133 */
    /* JADX WARN: Type inference failed for: r2v134 */
    /* JADX WARN: Type inference failed for: r2v135 */
    /* JADX WARN: Type inference failed for: r2v136 */
    /* JADX WARN: Type inference failed for: r2v137 */
    /* JADX WARN: Type inference failed for: r2v138 */
    /* JADX WARN: Type inference failed for: r2v139 */
    /* JADX WARN: Type inference failed for: r2v140 */
    /* JADX WARN: Type inference failed for: r2v141 */
    /* JADX WARN: Type inference failed for: r2v143 */
    /* JADX WARN: Type inference failed for: r2v2 */
    /* JADX WARN: Type inference failed for: r2v21 */
    /* JADX WARN: Type inference failed for: r2v22 */
    /* JADX WARN: Type inference failed for: r2v24 */
    /* JADX WARN: Type inference failed for: r2v3 */
    /* JADX WARN: Type inference failed for: r2v4 */
    /* JADX WARN: Type inference failed for: r2v5 */
    /* JADX WARN: Type inference failed for: r2v54 */
    /* JADX WARN: Type inference failed for: r2v56 */
    /* JADX WARN: Type inference failed for: r2v57 */
    /* JADX WARN: Type inference failed for: r2v6 */
    /* JADX WARN: Type inference failed for: r2v63 */
    /* JADX WARN: Type inference failed for: r2v7 */
    /* JADX WARN: Type inference failed for: r2v72 */
    /* JADX WARN: Type inference failed for: r2v8 */
    /* JADX WARN: Type inference failed for: r2v80 */
    /* JADX WARN: Type inference failed for: r2v81 */
    /* JADX WARN: Type inference failed for: r2v82 */
    /* JADX WARN: Type inference failed for: r2v83 */
    /* JADX WARN: Type inference failed for: r2v84 */
    /* JADX WARN: Type inference failed for: r2v87 */
    /* JADX WARN: Type inference failed for: r2v88 */
    /* JADX WARN: Type inference failed for: r2v89 */
    /* JADX WARN: Type inference failed for: r2v9, types: [java.io.File, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v93 */
    /* JADX WARN: Type inference failed for: r2v94 */
    /* JADX WARN: Type inference failed for: r2v95 */
    /* JADX WARN: Type inference failed for: r2v96 */
    /* JADX WARN: Type inference failed for: r3v0, types: [int] */
    /* JADX WARN: Type inference failed for: r4v78, types: [java.lang.StringBuilder] */
    /* JADX WARN: Type inference failed for: r5v1, types: [java.lang.StringBuilder] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:161:0x063b -> B:162:0x0644). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:184:0x06f1 -> B:660:0x06f6). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:240:0x089e -> B:595:0x08ad). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:431:0x0d5e -> B:466:0x0ef3). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:452:0x0ebb -> B:453:0x0ebd). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:465:0x0ee2 -> B:454:0x0ec1). Please report as a decompilation issue!!! */
    @Override // oO00ooo.AbstractC32477OooO00o
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) throws Throwable {
        ?? r2;
        ?? r22;
        String str;
        String str2;
        String str3;
        String str4;
        File fileOooO0oO;
        Object objOooO0oO;
        ArrayList arrayList;
        Iterator it;
        String str5;
        AbstractC30978OooO abstractC30978OooO;
        String str6;
        Object objOooO0o;
        List list;
        List listO00O0O;
        String str7;
        Object objOooOOo;
        File file;
        File file2;
        File file3;
        ArrayList arrayList2;
        C34406OooO00o.C20358OooO00o c20358OooO00o;
        float size;
        C24032OooOooO c24032OooOooO;
        Iterator it2;
        long j;
        BackupFile.DiskVendor diskVendor;
        Map map;
        C27351Oooo0O0 c27351Oooo0O0;
        String str8;
        AbstractC30978OooO abstractC30978OooO2;
        float f;
        String str9;
        Map map2;
        Map map3;
        List list2;
        C27351Oooo0O0 c27351Oooo0O02;
        List list3;
        String str10;
        float f2;
        String str11;
        Note note;
        long j2;
        Iterator it3;
        Map map4;
        Map map5;
        C27351Oooo0O0 c27351Oooo0O03;
        EnumC32485OooO00o enumC32485OooO00o;
        Object objOooOo;
        File file4;
        File file5;
        Note note2;
        File file6;
        Note note3;
        float f3;
        Iterator it4;
        long j3;
        Object objOooO0O0;
        EnumC32485OooO00o enumC32485OooO00o2;
        Note note4;
        String str12;
        EnumC32485OooO00o enumC32485OooO00o3;
        Map map6;
        String str13;
        String str14;
        List list4;
        Map map7;
        C27351Oooo0O0 c27351Oooo0O04;
        Iterator it5;
        long jCurrentTimeMillis;
        C34406OooO00o.C20358OooO00o c20358OooO00o2;
        String str15;
        String str16;
        String str17;
        String str18;
        C27351Oooo0O0 c27351Oooo0O05;
        Object objOooO00o;
        List list5;
        List list6;
        List list7;
        Note note5;
        File file7;
        BackupFile backupFile;
        String str19;
        String str20;
        Iterator it6;
        String str21;
        String str22;
        AbstractC30978OooO abstractC30978OooO3;
        long j4;
        int i;
        C27351Oooo0O0 c27351Oooo0O06;
        float f4;
        C27351Oooo0O0 c27351Oooo0O07;
        File file8;
        long jCurrentTimeMillis2;
        String str23;
        String str24;
        EnumC32485OooO00o enumC32485OooO00o4;
        String str25;
        String str26;
        BackupFile.DiskVendor diskVendor2;
        String str27;
        File file9;
        boolean z;
        boolean z2;
        String str28;
        AbstractC30978OooO abstractC30978OooO4;
        C27351Oooo0O0 c27351Oooo0O08;
        Object objOooOO0O;
        Map map8;
        EnumC32485OooO00o enumC32485OooO00o5;
        float f5;
        File file10;
        String str29;
        String str30;
        String str31;
        File file11;
        Object objOooO0OO;
        File file12;
        MyTemplate myTemplate;
        long j5;
        Map map9;
        C24032OooOooO c24032OooOooO2;
        AbstractC30978OooO abstractC30978OooO5;
        float f6;
        Iterator it7;
        Map map10;
        C27351Oooo0O0 c27351Oooo0O09;
        int i2;
        File file13;
        BackupFile backupFile2;
        MyTemplate myTemplate2;
        String str32;
        float f7;
        String str33;
        ArrayList arrayList3;
        String str34;
        ArrayList arrayList4;
        String str35;
        Iterator it8;
        Iterator it9;
        C27351Oooo0O0 c27351Oooo0O010;
        String str36;
        C24032OooOooO c24032OooOooO3;
        List list8;
        AbstractC30978OooO abstractC30978OooO6;
        C27351Oooo0O0 c27351Oooo0O011;
        BackupFile.DiskVendor diskVendor3;
        String str37;
        BackupFile.DiskVendor diskVendor4;
        Map map11;
        float f8;
        String str38;
        Map map12;
        C24033OooOooo c24033OooOooo;
        AbstractC30978OooO abstractC30978OooO7;
        ?? r23;
        Iterator it10;
        EnumC32485OooO00o enumC32485OooO00o6;
        float f9;
        Map map13;
        BackupFile backupFile3;
        AbstractC30978OooO abstractC30978OooO8;
        Map map14;
        BackupFile.DiskVendor diskVendor5;
        C27351Oooo0O0 c27351Oooo0O012;
        BackupFile backupFile4;
        String str39;
        long j6;
        File file14;
        int iIntValue;
        float f10;
        String str40;
        String str41;
        AbstractC30978OooO abstractC30978OooO9;
        Map map15;
        Iterator it11;
        C27351Oooo0O0 c27351Oooo0O013;
        C27351Oooo0O0 c27351Oooo0O014;
        Object objOooOOO0;
        BackupFile.DiskVendor diskVendor6;
        AbstractC30978OooO abstractC30978OooO10;
        boolean z3;
        BackupFile.DiskVendor diskVendor7;
        Map map16;
        C24033OooOooo c24033OooOooo2;
        Object objOooOOOO;
        ?? r24;
        Object objOooOOO02;
        C21904OooOoo0.OooO0Oo();
        EnumC32485OooO00o enumC32485OooO00o7 = EnumC32485OooO00o.f116726OooOo0o;
        ?? r3 = this.f95121Oooo0o0;
        String str42 = CacheKeyValueDelegate.CACHE_VALUE_SEPARATOR;
        AbstractC30978OooO abstractC30978OooO11 = this.f95113Oooo;
        BackupFile.DiskVendor diskVendor8 = this.f95122Oooo0oO;
        String str43 = BackupFile.FILE_PROPERTY_CONTENT_ID;
        C27351Oooo0O0 c27351Oooo0O015 = this.f95120Oooo0o;
        String str44 = "BackupUseCase";
        try {
            try {
            } catch (Exception e) {
                e = e;
                r2 = r3;
            } catch (Throwable th) {
                th = th;
                r2 = r3;
            }
        } catch (Exception e2) {
            e = e2;
            r22 = r3;
        } catch (Throwable th2) {
            th = th2;
            r2 = r3;
        }
        switch (r3) {
            case 0:
                str2 = ", deleteResult: ";
                str = "backup finally, delete outputDir, outputDir: ";
                C32446OooOOOo.OooO0O0(obj);
                fileOooO0oO = C27351Oooo0O0.OooO0oO(c27351Oooo0O015, diskVendor8);
                try {
                    this.f95105OooOo0o = fileOooO0oO;
                    this.f95121Oooo0o0 = 1;
                    if (c27351Oooo0O015.OooOOo0(false, this) == enumC32485OooO00o7) {
                        return enumC32485OooO00o7;
                    }
                    C27600o0ooOO0 c27600o0ooOO0 = c27351Oooo0O015.f95240OooO0o;
                    this.f95105OooOo0o = fileOooO0oO;
                    this.f95121Oooo0o0 = 2;
                    objOooO0oO = c27600o0ooOO0.OooO0oO(this);
                    if (objOooO0oO == enumC32485OooO00o7) {
                        return enumC32485OooO00o7;
                    }
                    arrayList = new ArrayList();
                    it = ((Iterable) objOooO0oO).iterator();
                    while (it.hasNext()) {
                        Iterator it12 = it;
                        Object next = it12.next();
                        if (!((Note) next).getInTrashBin()) {
                            arrayList.add(next);
                        }
                        it = it12;
                    }
                    C34406OooO00o.C20358OooO00o c20358OooO00o3 = C34406OooO00o.f123390OooO00o;
                    c20358OooO00o3.OooOOO0("BackupUseCase");
                    str5 = str2;
                } catch (Exception e3) {
                    e = e3;
                    str3 = "BackupUseCase";
                    str4 = str;
                    r2 = fileOooO0oO;
                    try {
                        C34406OooO00o.C20358OooO00o c20358OooO00o4 = C34406OooO00o.f123390OooO00o;
                        c20358OooO00o4.OooOOO0(str3);
                        c20358OooO00o4.OooO0Oo(e, "backup error final.", new Object[0]);
                        throw e;
                    } catch (Throwable th3) {
                        th = th3;
                        boolean zOooO0oo = C31190OooO0oo.OooO0oo(r2);
                        C34406OooO00o.C20358OooO00o c20358OooO00o5 = C34406OooO00o.f123390OooO00o;
                        c20358OooO00o5.OooOOO0(str3);
                        c20358OooO00o5.OooO0o0(str4 + r2 + str2 + zOooO0oo, new Object[0]);
                        throw th;
                    }
                } catch (Throwable th4) {
                    th = th4;
                    str3 = "BackupUseCase";
                    str4 = str;
                    r2 = fileOooO0oO;
                    boolean zOooO0oo2 = C31190OooO0oo.OooO0oo(r2);
                    C34406OooO00o.C20358OooO00o c20358OooO00o52 = C34406OooO00o.f123390OooO00o;
                    c20358OooO00o52.OooOOO0(str3);
                    c20358OooO00o52.OooO0o0(str4 + r2 + str2 + zOooO0oo2, new Object[0]);
                    throw th;
                }
                try {
                    int size2 = arrayList.size();
                    abstractC30978OooO = abstractC30978OooO11;
                    StringBuilder sb = new StringBuilder();
                    str6 = "folder_tree";
                    sb.append("backup, toBackupNotes.size = ");
                    sb.append(size2);
                    c20358OooO00o3.OooO0o0(sb.toString(), new Object[0]);
                    try {
                        C27600o0ooOO0 c27600o0ooOO02 = c27351Oooo0O015.f95240OooO0o;
                        this.f95105OooOo0o = fileOooO0oO;
                        this.f95104OooOo = arrayList;
                        this.f95121Oooo0o0 = 3;
                        objOooO0o = c27600o0ooOO02.OooO0o(null, this);
                    } catch (Exception e4) {
                        e = e4;
                        str3 = "BackupUseCase";
                        str4 = str;
                        str2 = str5;
                        r2 = fileOooO0oO;
                        C34406OooO00o.C20358OooO00o c20358OooO00o42 = C34406OooO00o.f123390OooO00o;
                        c20358OooO00o42.OooOOO0(str3);
                        c20358OooO00o42.OooO0Oo(e, "backup error final.", new Object[0]);
                        throw e;
                    } catch (Throwable th5) {
                        th = th5;
                        str3 = "BackupUseCase";
                        str4 = str;
                        str2 = str5;
                        r2 = fileOooO0oO;
                        boolean zOooO0oo22 = C31190OooO0oo.OooO0oo(r2);
                        C34406OooO00o.C20358OooO00o c20358OooO00o522 = C34406OooO00o.f123390OooO00o;
                        c20358OooO00o522.OooOOO0(str3);
                        c20358OooO00o522.OooO0o0(str4 + r2 + str2 + zOooO0oo22, new Object[0]);
                        throw th;
                    }
                } catch (Exception e5) {
                    e = e5;
                    str3 = str44;
                    str4 = str;
                    str2 = str5;
                    r2 = fileOooO0oO;
                    C34406OooO00o.C20358OooO00o c20358OooO00o422 = C34406OooO00o.f123390OooO00o;
                    c20358OooO00o422.OooOOO0(str3);
                    c20358OooO00o422.OooO0Oo(e, "backup error final.", new Object[0]);
                    throw e;
                } catch (Throwable th6) {
                    th = th6;
                    str3 = str44;
                    str4 = str;
                    str2 = str5;
                    r2 = fileOooO0oO;
                    boolean zOooO0oo222 = C31190OooO0oo.OooO0oo(r2);
                    C34406OooO00o.C20358OooO00o c20358OooO00o5222 = C34406OooO00o.f123390OooO00o;
                    c20358OooO00o5222.OooOOO0(str3);
                    c20358OooO00o5222.OooO0o0(str4 + r2 + str2 + zOooO0oo222, new Object[0]);
                    throw th;
                }
                if (objOooO0o == enumC32485OooO00o7) {
                    return enumC32485OooO00o7;
                }
                list = arrayList;
                ArrayList arrayList5 = new ArrayList();
                for (Object obj2 : (Iterable) objOooO0o) {
                    try {
                        if (!((Folder) obj2).getInTrashBin()) {
                            arrayList5.add(obj2);
                        }
                    } catch (Exception e6) {
                        e = e6;
                        file2 = fileOooO0oO;
                        str3 = "BackupUseCase";
                        file8 = file2;
                        str4 = str;
                        str2 = str5;
                        r2 = file8;
                        C34406OooO00o.C20358OooO00o c20358OooO00o4222 = C34406OooO00o.f123390OooO00o;
                        c20358OooO00o4222.OooOOO0(str3);
                        c20358OooO00o4222.OooO0Oo(e, "backup error final.", new Object[0]);
                        throw e;
                    } catch (Throwable th7) {
                        th = th7;
                        file = fileOooO0oO;
                        str3 = "BackupUseCase";
                        r2 = file;
                        str4 = str;
                        str2 = str5;
                        boolean zOooO0oo2222 = C31190OooO0oo.OooO0oo(r2);
                        C34406OooO00o.C20358OooO00o c20358OooO00o52222 = C34406OooO00o.f123390OooO00o;
                        c20358OooO00o52222.OooOOO0(str3);
                        c20358OooO00o52222.OooO0o0(str4 + r2 + str2 + zOooO0oo2222, new Object[0]);
                        throw th;
                    }
                }
                listO00O0O = oOo000Oo.OooOo.o00O0O(arrayList5, new OooO00o());
                C34406OooO00o.C20358OooO00o c20358OooO00o6 = C34406OooO00o.f123390OooO00o;
                c20358OooO00o6.OooOOO0("BackupUseCase");
                int size3 = listO00O0O.size();
                StringBuilder sb2 = new StringBuilder();
                str7 = ", cost ";
                sb2.append("backup, toBackupFolderTree.size = ");
                sb2.append(size3);
                c20358OooO00o6.OooO0o0(sb2.toString(), new Object[0]);
                o0OOOO00.OooOOO0 oooOOO0OooO0Oo = ((C27095OooOo0O) c27351Oooo0O015.f95244OooOO0).OooO0Oo();
                this.f95105OooOo0o = fileOooO0oO;
                this.f95104OooOo = list;
                this.f95107OooOoO0 = listO00O0O;
                this.f95121Oooo0o0 = 4;
                objOooOOo = C25252OooO0Oo.OooOOo(oooOOO0OooO0Oo, this);
                if (objOooOOo == enumC32485OooO00o7) {
                    return enumC32485OooO00o7;
                }
                try {
                    arrayList2 = new ArrayList();
                    for (Object obj3 : (Iterable) objOooOOo) {
                        MyTemplate myTemplate3 = (MyTemplate) obj3;
                        if (myTemplate3.getPaperTheme() != null && myTemplate3.getPaperSpec() != null) {
                            arrayList2.add(obj3);
                        }
                    }
                    c20358OooO00o = C34406OooO00o.f123390OooO00o;
                    c20358OooO00o.OooOOO0("BackupUseCase");
                    int size4 = arrayList2.size();
                    StringBuilder sb3 = new StringBuilder();
                    file3 = fileOooO0oO;
                } catch (Exception e7) {
                    e = e7;
                    file3 = fileOooO0oO;
                } catch (Throwable th8) {
                    th = th8;
                    file3 = fileOooO0oO;
                }
                try {
                    sb3.append("backup, toBackupTemplate.size = ");
                    sb3.append(size4);
                    c20358OooO00o.OooO0o0(sb3.toString(), new Object[0]);
                    if (list.isEmpty()) {
                        try {
                            if (arrayList2.isEmpty() && listO00O0O.isEmpty()) {
                                c20358OooO00o.OooOOO0("BackupUseCase");
                                c20358OooO00o.OooO0o0("backup, no data to backup.", new Object[0]);
                                throw new BackupException(null, -6, null, 4, null);
                            }
                        } catch (Exception e8) {
                            e = e8;
                            file2 = file3;
                            str3 = "BackupUseCase";
                            file8 = file2;
                            str4 = str;
                            str2 = str5;
                            r2 = file8;
                            C34406OooO00o.C20358OooO00o c20358OooO00o42222 = C34406OooO00o.f123390OooO00o;
                            c20358OooO00o42222.OooOOO0(str3);
                            c20358OooO00o42222.OooO0Oo(e, "backup error final.", new Object[0]);
                            throw e;
                        } catch (Throwable th9) {
                            th = th9;
                            file = file3;
                            str3 = "BackupUseCase";
                            r2 = file;
                            str4 = str;
                            str2 = str5;
                            boolean zOooO0oo22222 = C31190OooO0oo.OooO0oo(r2);
                            C34406OooO00o.C20358OooO00o c20358OooO00o522222 = C34406OooO00o.f123390OooO00o;
                            c20358OooO00o522222.OooOOO0(str3);
                            c20358OooO00o522222.OooO0o0(str4 + r2 + str2 + zOooO0oo22222, new Object[0]);
                            throw th;
                        }
                    }
                    size = diskVendor8 == BackupFile.DiskVendor.Local ? list.size() + arrayList2.size() + 1.0f : ((list.size() + arrayList2.size()) * 2.0f) + 1;
                    c24032OooOooO = new C24032OooOooO();
                    LinkedHashMap linkedHashMap = new LinkedHashMap();
                    LinkedHashMap linkedHashMap2 = new LinkedHashMap();
                    LinkedHashMap linkedHashMapOooOO0o = C27351Oooo0O0.OooOO0o(c27351Oooo0O015, list);
                    c20358OooO00o.OooOOO0("BackupUseCase");
                } catch (Exception e9) {
                    e = e9;
                    str3 = "BackupUseCase";
                    str4 = str;
                    str2 = str5;
                    r2 = file3;
                    C34406OooO00o.C20358OooO00o c20358OooO00o422222 = C34406OooO00o.f123390OooO00o;
                    c20358OooO00o422222.OooOOO0(str3);
                    c20358OooO00o422222.OooO0Oo(e, "backup error final.", new Object[0]);
                    throw e;
                } catch (Throwable th10) {
                    th = th10;
                    str3 = "BackupUseCase";
                    str4 = str;
                    str2 = str5;
                    r2 = file3;
                    boolean zOooO0oo222222 = C31190OooO0oo.OooO0oo(r2);
                    C34406OooO00o.C20358OooO00o c20358OooO00o5222222 = C34406OooO00o.f123390OooO00o;
                    c20358OooO00o5222222.OooOOO0(str3);
                    c20358OooO00o5222222.OooO0o0(str4 + r2 + str2 + zOooO0oo222222, new Object[0]);
                    throw th;
                }
                try {
                    float f11 = size;
                    List list9 = listO00O0O;
                    String strO000oOoO = oOo000Oo.OooOo.o000oOoO(linkedHashMapOooOO0o.values(), null, null, null, new OooOOO0(0), 31);
                    StringBuilder sb4 = new StringBuilder();
                    List list10 = list;
                    sb4.append("backup, resolvedNoteTitle is ");
                    sb4.append(strO000oOoO);
                    c20358OooO00o.OooO0o0(sb4.toString(), new Object[0]);
                    long jCurrentTimeMillis3 = System.currentTimeMillis();
                    fileOooO0oO = file3;
                    it2 = list10.iterator();
                    j = jCurrentTimeMillis3;
                    diskVendor = diskVendor8;
                    map = linkedHashMap2;
                    c27351Oooo0O0 = c27351Oooo0O015;
                    str8 = "";
                    abstractC30978OooO2 = abstractC30978OooO;
                    f = f11;
                    str9 = CacheKeyValueDelegate.CACHE_VALUE_SEPARATOR;
                    map2 = linkedHashMap;
                    map3 = linkedHashMapOooOO0o;
                    list2 = list9;
                    c27351Oooo0O02 = c27351Oooo0O0;
                    list4 = arrayList2;
                } catch (Exception e10) {
                    e = e10;
                    str3 = "BackupUseCase";
                    str4 = str;
                    str2 = str5;
                    r2 = file3;
                    C34406OooO00o.C20358OooO00o c20358OooO00o4222222 = C34406OooO00o.f123390OooO00o;
                    c20358OooO00o4222222.OooOOO0(str3);
                    c20358OooO00o4222222.OooO0Oo(e, "backup error final.", new Object[0]);
                    throw e;
                } catch (Throwable th11) {
                    th = th11;
                    str3 = "BackupUseCase";
                    str4 = str;
                    str2 = str5;
                    r2 = file3;
                    boolean zOooO0oo2222222 = C31190OooO0oo.OooO0oo(r2);
                    C34406OooO00o.C20358OooO00o c20358OooO00o52222222 = C34406OooO00o.f123390OooO00o;
                    c20358OooO00o52222222.OooOOO0(str3);
                    c20358OooO00o52222222.OooO0o0(str4 + r2 + str2 + zOooO0oo2222222, new Object[0]);
                    throw th;
                }
                if (it2.hasNext()) {
                    try {
                        try {
                            str11 = str43;
                            note = (Note) it2.next();
                            C27449o00O0OoO c27449o00O0OoO = c27351Oooo0O0.f95241OooO0o0;
                            EnumC32485OooO00o enumC32485OooO00o8 = enumC32485OooO00o7;
                            String id = note.getId();
                            this.f95105OooOo0o = fileOooO0oO;
                            this.f95104OooOo = list2;
                            this.f95107OooOoO0 = list4;
                            this.f95106OooOoO = c24032OooOooO;
                            this.f95108OooOoOO = map2;
                            this.f95110OooOoo0 = map;
                            this.f95109OooOoo = map3;
                            map7 = map3;
                            c27351Oooo0O04 = c27351Oooo0O0;
                            this.f95111OooOooO = c27351Oooo0O04;
                            this.f95112OooOooo = abstractC30978OooO2;
                            it5 = it2;
                            this.f95115Oooo000 = it5;
                            this.f95116Oooo00O = note;
                            this.f95117Oooo00o = null;
                            this.f95114Oooo0 = f;
                            this.f95118Oooo0O0 = j;
                            this.f95121Oooo0o0 = 5;
                            objOooOo = c27449o00O0OoO.OooOo(id, this);
                            enumC32485OooO00o = enumC32485OooO00o8;
                        } catch (Exception e11) {
                            e = e11;
                            str10 = str44;
                            file5 = fileOooO0oO;
                            str4 = str;
                            str2 = str5;
                            str3 = str10;
                            r2 = file5;
                            C34406OooO00o.C20358OooO00o c20358OooO00o42222222 = C34406OooO00o.f123390OooO00o;
                            c20358OooO00o42222222.OooOOO0(str3);
                            c20358OooO00o42222222.OooO0Oo(e, "backup error final.", new Object[0]);
                            throw e;
                        } catch (Throwable th12) {
                            th = th12;
                            str10 = str44;
                            r2 = fileOooO0oO;
                            str4 = str;
                            str2 = str5;
                            str3 = str10;
                            boolean zOooO0oo22222222 = C31190OooO0oo.OooO0oo(r2);
                            C34406OooO00o.C20358OooO00o c20358OooO00o522222222 = C34406OooO00o.f123390OooO00o;
                            c20358OooO00o522222222.OooOOO0(str3);
                            c20358OooO00o522222222.OooO0o0(str4 + r2 + str2 + zOooO0oo22222222, new Object[0]);
                            throw th;
                        }
                    } catch (Exception e12) {
                        e = e12;
                        file5 = fileOooO0oO;
                        str4 = str;
                        str2 = str5;
                        str3 = str10;
                        r2 = file5;
                        C34406OooO00o.C20358OooO00o c20358OooO00o422222222 = C34406OooO00o.f123390OooO00o;
                        c20358OooO00o422222222.OooOOO0(str3);
                        c20358OooO00o422222222.OooO0Oo(e, "backup error final.", new Object[0]);
                        throw e;
                    } catch (Throwable th13) {
                        th = th13;
                        r2 = fileOooO0oO;
                        str4 = str;
                        str2 = str5;
                        str3 = str10;
                        boolean zOooO0oo222222222 = C31190OooO0oo.OooO0oo(r2);
                        C34406OooO00o.C20358OooO00o c20358OooO00o5222222222 = C34406OooO00o.f123390OooO00o;
                        c20358OooO00o5222222222.OooOOO0(str3);
                        c20358OooO00o5222222222.OooO0o0(str4 + r2 + str2 + zOooO0oo222222222, new Object[0]);
                        throw th;
                    }
                    str10 = str44;
                    if (objOooOo == enumC32485OooO00o) {
                        return enumC32485OooO00o;
                    }
                    f2 = f;
                    j2 = j;
                    map5 = map7;
                    it3 = it5;
                    map4 = map2;
                    c27351Oooo0O03 = c27351Oooo0O04;
                    list3 = list4;
                    try {
                        note2 = (Note) objOooOo;
                    } catch (Exception e13) {
                        e = e13;
                        file4 = fileOooO0oO;
                        file5 = file4;
                        str4 = str;
                        str2 = str5;
                        str3 = str10;
                        r2 = file5;
                        C34406OooO00o.C20358OooO00o c20358OooO00o4222222222 = C34406OooO00o.f123390OooO00o;
                        c20358OooO00o4222222222.OooOOO0(str3);
                        c20358OooO00o4222222222.OooO0Oo(e, "backup error final.", new Object[0]);
                        throw e;
                    } catch (Throwable th14) {
                        th = th14;
                        file4 = fileOooO0oO;
                        r2 = file4;
                        str4 = str;
                        str2 = str5;
                        str3 = str10;
                        boolean zOooO0oo2222222222 = C31190OooO0oo.OooO0oo(r2);
                        C34406OooO00o.C20358OooO00o c20358OooO00o52222222222 = C34406OooO00o.f123390OooO00o;
                        c20358OooO00o52222222222.OooOOO0(str3);
                        c20358OooO00o52222222222.OooO0o0(str4 + r2 + str2 + zOooO0oo2222222222, new Object[0]);
                        throw th;
                    }
                    if (note2 == null) {
                        Iterator it13 = it3;
                        EnumC32485OooO00o enumC32485OooO00o9 = enumC32485OooO00o;
                        float f12 = f2;
                        String str45 = note2.getTitle() + ".in";
                        String str46 = (String) map5.get(note2.getId());
                        if (str46 != null) {
                            str45 = str46;
                        }
                        String strOooO0o0 = C27351Oooo0O0.OooO0o0(c27351Oooo0O03, str45);
                        file6 = new File(fileOooO0oO.getAbsolutePath(), "n_" + note2.getId());
                        if (!file6.exists()) {
                            file6.mkdirs();
                        }
                        this.f95105OooOo0o = fileOooO0oO;
                        this.f95104OooOo = list2;
                        this.f95107OooOoO0 = list3;
                        this.f95106OooOoO = c24032OooOooO;
                        this.f95108OooOoOO = map4;
                        this.f95110OooOoo0 = map;
                        this.f95109OooOoo = map5;
                        this.f95111OooOooO = c27351Oooo0O03;
                        this.f95112OooOooo = abstractC30978OooO2;
                        this.f95115Oooo000 = it13;
                        note3 = note2;
                        this.f95116Oooo00O = note3;
                        this.f95117Oooo00o = file6;
                        f3 = f12;
                        this.f95114Oooo0 = f3;
                        it4 = it13;
                        file4 = fileOooO0oO;
                        long j7 = j2;
                        this.f95118Oooo0O0 = j7;
                        j3 = j7;
                        this.f95121Oooo0o0 = 6;
                        objOooO0O0 = C27351Oooo0O0.OooO0O0(c27351Oooo0O03, note3, file6, strOooO0o0, this);
                        enumC32485OooO00o2 = enumC32485OooO00o9;
                        list7 = list3;
                    } else {
                        try {
                            C34406OooO00o.C20358OooO00o c20358OooO00o7 = C34406OooO00o.f123390OooO00o;
                            c20358OooO00o7.OooOOO0(str12);
                            str10 = str12;
                            String id2 = note4.getId();
                            enumC32485OooO00o3 = enumC32485OooO00o;
                            String title = note4.getTitle();
                            float f13 = f2;
                            StringBuilder sb5 = new StringBuilder();
                            it4 = it3;
                            sb5.append("backup, note not found, skip, noteId = ");
                            sb5.append(id2);
                            sb5.append(", title = ");
                            sb5.append(title);
                            c20358OooO00o7.OooO0OO(sb5.toString(), new Object[0]);
                            map6 = map5;
                            f = f13;
                            str13 = str8;
                            str14 = str11;
                            j3 = j2;
                            list6 = list3;
                            c27351Oooo0O0 = c27351Oooo0O03;
                            map2 = map4;
                            str8 = str13;
                            str43 = str14;
                            str44 = str10;
                            it2 = it4;
                            j = j3;
                            map3 = map6;
                            enumC32485OooO00o7 = enumC32485OooO00o3;
                            list4 = list6;
                        } catch (Exception e14) {
                            e = e14;
                            str10 = str12;
                            file5 = fileOooO0oO;
                            str4 = str;
                            str2 = str5;
                            str3 = str10;
                            r2 = file5;
                            C34406OooO00o.C20358OooO00o c20358OooO00o42222222222 = C34406OooO00o.f123390OooO00o;
                            c20358OooO00o42222222222.OooOOO0(str3);
                            c20358OooO00o42222222222.OooO0Oo(e, "backup error final.", new Object[0]);
                            throw e;
                        } catch (Throwable th15) {
                            th = th15;
                            str10 = str12;
                            r2 = fileOooO0oO;
                            str4 = str;
                            str2 = str5;
                            str3 = str10;
                            boolean zOooO0oo22222222222 = C31190OooO0oo.OooO0oo(r2);
                            C34406OooO00o.C20358OooO00o c20358OooO00o522222222222 = C34406OooO00o.f123390OooO00o;
                            c20358OooO00o522222222222.OooOOO0(str3);
                            c20358OooO00o522222222222.OooO0o0(str4 + r2 + str2 + zOooO0oo22222222222, new Object[0]);
                            throw th;
                        }
                        note4 = note;
                        str12 = str10;
                        if (it2.hasNext()) {
                            long j8 = j;
                            str10 = str44;
                            String str47 = str43;
                            String str48 = str8;
                            try {
                                jCurrentTimeMillis = System.currentTimeMillis();
                                c20358OooO00o2 = C34406OooO00o.f123390OooO00o;
                            } catch (Exception e15) {
                                e = e15;
                                str4 = str;
                                str2 = str5;
                                str3 = str10;
                                r2 = fileOooO0oO;
                                C34406OooO00o.C20358OooO00o c20358OooO00o422222222222 = C34406OooO00o.f123390OooO00o;
                                c20358OooO00o422222222222.OooOOO0(str3);
                                c20358OooO00o422222222222.OooO0Oo(e, "backup error final.", new Object[0]);
                                throw e;
                            } catch (Throwable th16) {
                                th = th16;
                                str4 = str;
                                str2 = str5;
                                str3 = str10;
                                r2 = fileOooO0oO;
                                boolean zOooO0oo222222222222 = C31190OooO0oo.OooO0oo(r2);
                                C34406OooO00o.C20358OooO00o c20358OooO00o5222222222222 = C34406OooO00o.f123390OooO00o;
                                c20358OooO00o5222222222222.OooOOO0(str3);
                                c20358OooO00o5222222222222.OooO0o0(str4 + r2 + str2 + zOooO0oo222222222222, new Object[0]);
                                throw th;
                            }
                            try {
                                c20358OooO00o2.OooOOO0(str10);
                                String strOooO0O0 = C31430OooO00o.OooO0O0(j8);
                                String strOooO0O02 = C31430OooO00o.OooO0O0(jCurrentTimeMillis);
                                str10 = str10;
                                String strOooO00o = C31430OooO00o.OooO00o(jCurrentTimeMillis - j8);
                                str15 = str48;
                                StringBuilder sb6 = new StringBuilder();
                                str16 = str47;
                                sb6.append("backup, convert all notes to backup files during ");
                                sb6.append(strOooO0O0);
                                str42 = str9;
                                sb6.append(str42);
                                sb6.append(strOooO0O02);
                                str17 = str7;
                                sb6.append(str17);
                                sb6.append(strOooO00o);
                                c20358OooO00o2.OooO0o0(sb6.toString(), new Object[0]);
                                str18 = str6;
                                File file15 = new File(fileOooO0oO.getAbsolutePath(), str18);
                                C31190OooO0oo.OooO0o(file15);
                                this.f95105OooOo0o = fileOooO0oO;
                                this.f95104OooOo = list4;
                                this.f95107OooOoO0 = c24032OooOooO;
                                this.f95106OooOoO = map2;
                                this.f95108OooOoOO = map;
                                this.f95110OooOoo0 = null;
                                this.f95109OooOoo = null;
                                this.f95111OooOooO = null;
                                this.f95112OooOooo = null;
                                this.f95115Oooo000 = null;
                                this.f95116Oooo00O = null;
                                this.f95117Oooo00o = null;
                                this.f95114Oooo0 = f;
                                this.f95121Oooo0o0 = 7;
                                c27351Oooo0O05 = c27351Oooo0O02;
                                objOooO00o = C27351Oooo0O0.OooO00o(c27351Oooo0O05, list2, file15, this);
                            } catch (Exception e16) {
                                e = e16;
                                str3 = str10;
                                str4 = str;
                                str2 = str5;
                                r2 = fileOooO0oO;
                                C34406OooO00o.C20358OooO00o c20358OooO00o4222222222222 = C34406OooO00o.f123390OooO00o;
                                c20358OooO00o4222222222222.OooOOO0(str3);
                                c20358OooO00o4222222222222.OooO0Oo(e, "backup error final.", new Object[0]);
                                throw e;
                            } catch (Throwable th17) {
                                th = th17;
                                str3 = str10;
                                str4 = str;
                                str2 = str5;
                                r2 = fileOooO0oO;
                                boolean zOooO0oo2222222222222 = C31190OooO0oo.OooO0oo(r2);
                                C34406OooO00o.C20358OooO00o c20358OooO00o52222222222222 = C34406OooO00o.f123390OooO00o;
                                c20358OooO00o52222222222222.OooOOO0(str3);
                                c20358OooO00o52222222222222.OooO0o0(str4 + r2 + str2 + zOooO0oo2222222222222, new Object[0]);
                                throw th;
                            }
                            if (objOooO00o == enumC32485OooO00o7) {
                                return enumC32485OooO00o7;
                            }
                            list5 = list4;
                            backupFile = (BackupFile) objOooO00o;
                            if (backupFile == null) {
                                str19 = str15;
                                str20 = str16;
                                String orDefault = backupFile.getContentProperties().getOrDefault(str20, str19);
                                if (orDefault.length() > 0) {
                                    map2.put(orDefault, backupFile);
                                }
                                C32460OooOooO c32460OooOooO = C32460OooOooO.f116667OooO00o;
                            } else {
                                str19 = str15;
                                str20 = str16;
                            }
                            long jCurrentTimeMillis4 = System.currentTimeMillis();
                            it6 = list5.iterator();
                            str21 = str17;
                            str22 = str18;
                            abstractC30978OooO3 = abstractC30978OooO;
                            j4 = jCurrentTimeMillis4;
                            i = 0;
                            c27351Oooo0O06 = c27351Oooo0O05;
                            f4 = f;
                            c27351Oooo0O07 = c27351Oooo0O06;
                            try {
                            } catch (Exception e17) {
                                e = e17;
                                file3 = fileOooO0oO;
                                str4 = str;
                                str2 = str5;
                                str3 = str10;
                            } catch (Throwable th18) {
                                th = th18;
                                file3 = fileOooO0oO;
                                str4 = str;
                                str2 = str5;
                                str3 = str10;
                                r2 = file3;
                                boolean zOooO0oo22222222222222 = C31190OooO0oo.OooO0oo(r2);
                                C34406OooO00o.C20358OooO00o c20358OooO00o522222222222222 = C34406OooO00o.f123390OooO00o;
                                c20358OooO00o522222222222222.OooOOO0(str3);
                                c20358OooO00o522222222222222.OooO0o0(str4 + r2 + str2 + zOooO0oo22222222222222, new Object[0]);
                                throw th;
                            }
                            if (!it6.hasNext()) {
                                Object next2 = it6.next();
                                str29 = str42;
                                int i3 = i + 1;
                                if (i < 0) {
                                    C34429OooOOo0.OooOOo();
                                    throw null;
                                }
                                str30 = str19;
                                MyTemplate myTemplate4 = (MyTemplate) next2;
                                str31 = str20;
                                EnumC32485OooO00o enumC32485OooO00o10 = enumC32485OooO00o7;
                                long j9 = j4;
                                file11 = new File(fileOooO0oO.getAbsolutePath(), "template_" + myTemplate4.getId());
                                if (!file11.exists()) {
                                    file11.mkdirs();
                                }
                                this.f95105OooOo0o = fileOooO0oO;
                                this.f95104OooOo = c24032OooOooO;
                                this.f95107OooOoO0 = map2;
                                this.f95106OooOoO = map;
                                this.f95108OooOoOO = c27351Oooo0O07;
                                this.f95110OooOoo0 = abstractC30978OooO3;
                                this.f95109OooOoo = it6;
                                this.f95111OooOooO = myTemplate4;
                                this.f95112OooOooo = file11;
                                this.f95114Oooo0 = f4;
                                this.f95118Oooo0O0 = j9;
                                this.f95119Oooo0OO = i3;
                                this.f95121Oooo0o0 = 8;
                                objOooO0OO = C27351Oooo0O0.OooO0OO(c27351Oooo0O07, myTemplate4, file11, this);
                                enumC32485OooO00o7 = enumC32485OooO00o10;
                                if (objOooO0OO == enumC32485OooO00o7) {
                                    return enumC32485OooO00o7;
                                }
                                C27351Oooo0O0 c27351Oooo0O016 = c27351Oooo0O07;
                                file12 = fileOooO0oO;
                                myTemplate = myTemplate4;
                                j5 = j9;
                                map9 = map;
                                c24032OooOooO2 = c24032OooOooO;
                                abstractC30978OooO5 = abstractC30978OooO3;
                                f6 = f4;
                                it7 = it6;
                                map10 = map2;
                                c27351Oooo0O09 = c27351Oooo0O016;
                                i2 = i3;
                                try {
                                    backupFile2 = (BackupFile) objOooO0OO;
                                    if (backupFile2 == null) {
                                        try {
                                            myTemplate2 = myTemplate;
                                            String orDefault2 = backupFile2.getContentProperties().getOrDefault(str33, str32);
                                            if (orDefault2.length() > 0) {
                                                map10.put(orDefault2, backupFile2);
                                            }
                                            C32460OooOooO c32460OooOooO2 = C32460OooOooO.f116667OooO00o;
                                        } catch (Exception e18) {
                                            e = e18;
                                            str4 = str;
                                            str2 = str5;
                                            str3 = str10;
                                            r2 = file13;
                                            C34406OooO00o.C20358OooO00o c20358OooO00o42222222222222 = C34406OooO00o.f123390OooO00o;
                                            c20358OooO00o42222222222222.OooOOO0(str3);
                                            c20358OooO00o42222222222222.OooO0Oo(e, "backup error final.", new Object[0]);
                                            throw e;
                                        } catch (Throwable th19) {
                                            th = th19;
                                            str4 = str;
                                            str2 = str5;
                                            str3 = str10;
                                            r2 = file13;
                                            boolean zOooO0oo222222222222222 = C31190OooO0oo.OooO0oo(r2);
                                            C34406OooO00o.C20358OooO00o c20358OooO00o5222222222222222 = C34406OooO00o.f123390OooO00o;
                                            c20358OooO00o5222222222222222.OooOOO0(str3);
                                            c20358OooO00o5222222222222222.OooO0o0(str4 + r2 + str2 + zOooO0oo222222222222222, new Object[0]);
                                            throw th;
                                        }
                                        file13 = file12;
                                        str32 = str30;
                                        f7 = f6;
                                        str33 = str31;
                                    } else {
                                        myTemplate2 = myTemplate;
                                        file13 = file12;
                                        str32 = str30;
                                        f7 = f6;
                                        str33 = str31;
                                    }
                                    map9.put(file11.getName(), myTemplate2.getId());
                                    if (abstractC30978OooO5 != null) {
                                        float f14 = c24032OooOooO2.f80939OooOo0o;
                                        c24032OooOooO2.f80939OooOo0o = f14 + 1.0f;
                                        abstractC30978OooO5.OooO00o(f14 / f7);
                                        C32460OooOooO c32460OooOooO3 = C32460OooOooO.f116667OooO00o;
                                    }
                                    str20 = str33;
                                    abstractC30978OooO3 = abstractC30978OooO5;
                                    c24032OooOooO = c24032OooOooO2;
                                    map = map9;
                                    j4 = j5;
                                    str42 = str29;
                                    fileOooO0oO = file13;
                                    str19 = str32;
                                    c27351Oooo0O07 = c27351Oooo0O09;
                                    map2 = map10;
                                    it6 = it7;
                                    f4 = f7;
                                    i = i2;
                                } catch (Exception e19) {
                                    e = e19;
                                    file13 = file12;
                                } catch (Throwable th20) {
                                    th = th20;
                                    file13 = file12;
                                }
                                if (!it6.hasNext()) {
                                    String str49 = str42;
                                    String str50 = str19;
                                    String str51 = str20;
                                    jCurrentTimeMillis2 = System.currentTimeMillis();
                                    C34406OooO00o.C20358OooO00o c20358OooO00o8 = C34406OooO00o.f123390OooO00o;
                                    str3 = str10;
                                    try {
                                        c20358OooO00o8.OooOOO0(str3);
                                        long j10 = j4;
                                        String strOooO0O03 = C31430OooO00o.OooO0O0(j10);
                                        String strOooO0O04 = C31430OooO00o.OooO0O0(jCurrentTimeMillis2);
                                        str23 = str50;
                                        String strOooO00o2 = C31430OooO00o.OooO00o(jCurrentTimeMillis2 - j10);
                                        str24 = str51;
                                        StringBuilder sb7 = new StringBuilder();
                                        enumC32485OooO00o4 = enumC32485OooO00o7;
                                        sb7.append("backup, convert all templates to backup files during ");
                                        sb7.append(strOooO0O03);
                                        str25 = str49;
                                        sb7.append(str25);
                                        sb7.append(strOooO0O04);
                                        str26 = str21;
                                        sb7.append(str26);
                                        sb7.append(strOooO00o2);
                                        c20358OooO00o8.OooO0o0(sb7.toString(), new Object[0]);
                                        diskVendor2 = diskVendor;
                                    } catch (Exception e20) {
                                        e = e20;
                                        file3 = fileOooO0oO;
                                        str4 = str;
                                        str2 = str5;
                                    } catch (Throwable th21) {
                                        th = th21;
                                        file3 = fileOooO0oO;
                                        str4 = str;
                                        str2 = str5;
                                        r2 = file3;
                                        boolean zOooO0oo2222222222222222 = C31190OooO0oo.OooO0oo(r2);
                                        C34406OooO00o.C20358OooO00o c20358OooO00o52222222222222222 = C34406OooO00o.f123390OooO00o;
                                        c20358OooO00o52222222222222222.OooOOO0(str3);
                                        c20358OooO00o52222222222222222.OooO0o0(str4 + r2 + str2 + zOooO0oo2222222222222222, new Object[0]);
                                        throw th;
                                    }
                                    if (diskVendor2 == BackupFile.DiskVendor.Local) {
                                        try {
                                            File[] fileArrListFiles = fileOooO0oO.listFiles();
                                            if (fileArrListFiles != null) {
                                                ArrayList arrayList6 = new ArrayList();
                                                int length = fileArrListFiles.length;
                                                int i4 = 0;
                                                while (i4 < length) {
                                                    try {
                                                        File file16 = fileArrListFiles[i4];
                                                        if (file16.isDirectory()) {
                                                            String name = file16.getName();
                                                            kotlin.jvm.internal.OooOOO0.OooO0o(name, "getName(...)");
                                                            z = C33595OooOOo.OooOoO0(name, BackupFile.PREFIX_NOTE_DIR, false);
                                                        }
                                                        if (file16.isDirectory()) {
                                                            String name2 = file16.getName();
                                                            kotlin.jvm.internal.OooOOO0.OooO0o(name2, "getName(...)");
                                                            z2 = C33595OooOOo.OooOoO0(name2, "template", false);
                                                        }
                                                        if (file16.isDirectory()) {
                                                            str28 = str22;
                                                            boolean z4 = C33595OooOOo.OooOOo(file16.getName(), str28, true);
                                                            if (!z || z2 || z4) {
                                                                arrayList6.add(file16);
                                                            }
                                                            i4++;
                                                            str22 = str28;
                                                        } else {
                                                            str28 = str22;
                                                        }
                                                        if (!z) {
                                                            arrayList6.add(file16);
                                                        }
                                                        i4++;
                                                        str22 = str28;
                                                    } catch (Exception e21) {
                                                        e = e21;
                                                        file8 = fileOooO0oO;
                                                        str4 = str;
                                                        str2 = str5;
                                                        r2 = file8;
                                                        C34406OooO00o.C20358OooO00o c20358OooO00o422222222222222 = C34406OooO00o.f123390OooO00o;
                                                        c20358OooO00o422222222222222.OooOOO0(str3);
                                                        c20358OooO00o422222222222222.OooO0Oo(e, "backup error final.", new Object[0]);
                                                        throw e;
                                                    } catch (Throwable th22) {
                                                        th = th22;
                                                        r2 = fileOooO0oO;
                                                        str4 = str;
                                                        str2 = str5;
                                                        boolean zOooO0oo22222222222222222 = C31190OooO0oo.OooO0oo(r2);
                                                        C34406OooO00o.C20358OooO00o c20358OooO00o522222222222222222 = C34406OooO00o.f123390OooO00o;
                                                        c20358OooO00o522222222222222222.OooOOO0(str3);
                                                        c20358OooO00o522222222222222222.OooO0o0(str4 + r2 + str2 + zOooO0oo22222222222222222, new Object[0]);
                                                        throw th;
                                                    }
                                                }
                                                System.currentTimeMillis();
                                                Uri uri = this.f95123Oooo0oo;
                                                if (uri != null) {
                                                    C31193OooOOo.OooO0oo(c27351Oooo0O06.f95236OooO00o, oOo000Oo.OooOo.o0ooOO0(arrayList6), uri, map);
                                                } else {
                                                    C31193OooOOo.OooO(oOo000Oo.OooOo.o0ooOO0(arrayList6), C27351Oooo0O0.OooO0oo(c27351Oooo0O06), map);
                                                }
                                                if (abstractC30978OooO != null) {
                                                    abstractC30978OooO.OooO00o(1.0f);
                                                    C32460OooOooO c32460OooOooO4 = C32460OooOooO.f116667OooO00o;
                                                    break;
                                                }
                                                C32460OooOooO c32460OooOooO5 = C32460OooOooO.f116667OooO00o;
                                                boolean zOooO0oo3 = C31190OooO0oo.OooO0oo(fileOooO0oO);
                                                C34406OooO00o.C20358OooO00o c20358OooO00o9 = C34406OooO00o.f123390OooO00o;
                                                c20358OooO00o9.OooOOO0(str3);
                                                c20358OooO00o9.OooO0o0(str + fileOooO0oO + str5 + zOooO0oo3, new Object[0]);
                                                return c32460OooOooO5;
                                            }
                                            str4 = str;
                                            str27 = str5;
                                            try {
                                                c20358OooO00o8.OooOOO0(str3);
                                                c20358OooO00o8.OooO0o0("backup to local failed, no files to backup.", new Object[0]);
                                                throw new BackupException(null, -999, null, 4, null);
                                            } catch (Exception e22) {
                                                e = e22;
                                            } catch (Throwable th23) {
                                                th = th23;
                                                r2 = fileOooO0oO;
                                                str2 = str27;
                                                boolean zOooO0oo222222222222222222 = C31190OooO0oo.OooO0oo(r2);
                                                C34406OooO00o.C20358OooO00o c20358OooO00o5222222222222222222 = C34406OooO00o.f123390OooO00o;
                                                c20358OooO00o5222222222222222222.OooOOO0(str3);
                                                c20358OooO00o5222222222222222222.OooO0o0(str4 + r2 + str2 + zOooO0oo222222222222222222, new Object[0]);
                                                throw th;
                                            }
                                        } catch (Exception e23) {
                                            e = e23;
                                            str4 = str;
                                            str27 = str5;
                                        } catch (Throwable th24) {
                                            th = th24;
                                            str4 = str;
                                            str27 = str5;
                                        }
                                        file9 = fileOooO0oO;
                                        str2 = str27;
                                        r2 = file9;
                                        C34406OooO00o.C20358OooO00o c20358OooO00o4222222222222222 = C34406OooO00o.f123390OooO00o;
                                        c20358OooO00o4222222222222222.OooOOO0(str3);
                                        c20358OooO00o4222222222222222.OooO0Oo(e, "backup error final.", new Object[0]);
                                        throw e;
                                    }
                                    str4 = str;
                                    str27 = str5;
                                    abstractC30978OooO4 = abstractC30978OooO;
                                    try {
                                        this.f95105OooOo0o = fileOooO0oO;
                                        try {
                                            this.f95104OooOo = c24032OooOooO;
                                            this.f95107OooOoO0 = map2;
                                            this.f95106OooOoO = null;
                                            this.f95108OooOoOO = null;
                                            this.f95110OooOoo0 = null;
                                            this.f95109OooOoo = null;
                                            this.f95111OooOooO = null;
                                            this.f95112OooOooo = null;
                                            this.f95114Oooo0 = f4;
                                            this.f95118Oooo0O0 = jCurrentTimeMillis2;
                                            this.f95121Oooo0o0 = 9;
                                            file3 = fileOooO0oO;
                                            c27351Oooo0O08 = c27351Oooo0O06;
                                            try {
                                                objOooOO0O = C27351Oooo0O0.OooOO0O(c27351Oooo0O08, diskVendor2, this);
                                                map8 = map2;
                                                enumC32485OooO00o5 = enumC32485OooO00o4;
                                                if (objOooOO0O == enumC32485OooO00o5) {
                                                    return enumC32485OooO00o5;
                                                }
                                                f5 = f4;
                                                file10 = file3;
                                                try {
                                                    Iterable iterable = (Iterable) objOooOO0O;
                                                    arrayList3 = new ArrayList();
                                                    for (Object obj4 : iterable) {
                                                        file3 = file10;
                                                        try {
                                                            C24032OooOooO c24032OooOooO4 = c24032OooOooO;
                                                            long j11 = jCurrentTimeMillis2;
                                                            String str52 = str24;
                                                            if (((BackupFile) obj4).getContentProperties().containsKey(str52)) {
                                                                arrayList3.add(obj4);
                                                            }
                                                            file10 = file3;
                                                            str24 = str52;
                                                            c24032OooOooO = c24032OooOooO4;
                                                            jCurrentTimeMillis2 = j11;
                                                        } catch (Exception e24) {
                                                            e = e24;
                                                            file9 = file3;
                                                        } catch (Throwable th25) {
                                                            th = th25;
                                                            r2 = file3;
                                                            str2 = str27;
                                                            boolean zOooO0oo2222222222222222222 = C31190OooO0oo.OooO0oo(r2);
                                                            C34406OooO00o.C20358OooO00o c20358OooO00o52222222222222222222 = C34406OooO00o.f123390OooO00o;
                                                            c20358OooO00o52222222222222222222.OooOOO0(str3);
                                                            c20358OooO00o52222222222222222222.OooO0o0(str4 + r2 + str2 + zOooO0oo2222222222222222222, new Object[0]);
                                                            throw th;
                                                        }
                                                        break;
                                                    }
                                                    file3 = file10;
                                                    C24032OooOooO c24032OooOooO5 = c24032OooOooO;
                                                    long j12 = jCurrentTimeMillis2;
                                                    str34 = str24;
                                                } catch (Exception e25) {
                                                    e = e25;
                                                    file3 = file10;
                                                } catch (Throwable th26) {
                                                    th = th26;
                                                    file3 = file10;
                                                }
                                                try {
                                                    if (!arrayList3.isEmpty()) {
                                                        C34406OooO00o.C20358OooO00o c20358OooO00o10 = C34406OooO00o.f123390OooO00o;
                                                        c20358OooO00o10.OooOOO0(str3);
                                                        arrayList4 = arrayList3;
                                                        c20358OooO00o10.OooO0o0("Perform a full backup, since no old data exists. ", new Object[0]);
                                                    } else {
                                                        arrayList4 = arrayList3;
                                                    }
                                                    long jCurrentTimeMillis5 = System.currentTimeMillis();
                                                    C34406OooO00o.C20358OooO00o c20358OooO00o11 = C34406OooO00o.f123390OooO00o;
                                                    c20358OooO00o11.OooOOO0(str3);
                                                    String strOooO00o3 = C31430OooO00o.OooO00o(jCurrentTimeMillis5 - j12);
                                                    int size5 = arrayList4.size();
                                                    StringBuilder sb8 = new StringBuilder();
                                                    str35 = str27;
                                                    try {
                                                        sb8.append("backup, getRemoteBackupFiles cost ");
                                                        sb8.append(strOooO00o3);
                                                        sb8.append(", remoteBackupFiles size: ");
                                                        sb8.append(size5);
                                                        sb8.append(".");
                                                        c20358OooO00o11.OooO0o0(sb8.toString(), new Object[0]);
                                                        LinkedHashMap linkedHashMap3 = new LinkedHashMap();
                                                        for (Object obj5 : arrayList4) {
                                                            try {
                                                                String str53 = ((BackupFile) obj5).getContentProperties().get(str34);
                                                                Object arrayList7 = linkedHashMap3.get(str53);
                                                                if (arrayList7 == null) {
                                                                    arrayList7 = new ArrayList();
                                                                    linkedHashMap3.put(str53, arrayList7);
                                                                }
                                                                ((List) arrayList7).add(obj5);
                                                            } catch (Exception e26) {
                                                                e = e26;
                                                                r23 = file3;
                                                                str2 = str35;
                                                                r2 = r23;
                                                                C34406OooO00o.C20358OooO00o c20358OooO00o42222222222222222 = C34406OooO00o.f123390OooO00o;
                                                                c20358OooO00o42222222222222222.OooOOO0(str3);
                                                                c20358OooO00o42222222222222222.OooO0Oo(e, "backup error final.", new Object[0]);
                                                                throw e;
                                                            } catch (Throwable th27) {
                                                                th = th27;
                                                                r2 = file3;
                                                                str2 = str35;
                                                                boolean zOooO0oo22222222222222222222 = C31190OooO0oo.OooO0oo(r2);
                                                                C34406OooO00o.C20358OooO00o c20358OooO00o522222222222222222222 = C34406OooO00o.f123390OooO00o;
                                                                c20358OooO00o522222222222222222222.OooOOO0(str3);
                                                                c20358OooO00o522222222222222222222.OooO0o0(str4 + r2 + str2 + zOooO0oo22222222222222222222, new Object[0]);
                                                                throw th;
                                                            }
                                                        }
                                                        LinkedHashMap linkedHashMap4 = new LinkedHashMap();
                                                        for (Map.Entry entry : linkedHashMap3.entrySet()) {
                                                            if (((List) entry.getValue()).size() > 1) {
                                                                linkedHashMap4.put(entry.getKey(), entry.getValue());
                                                            }
                                                        }
                                                        ArrayList arrayList8 = new ArrayList();
                                                        it8 = linkedHashMap4.entrySet().iterator();
                                                        while (it8.hasNext()) {
                                                            C34431OooOo0.OooOo0o(arrayList8, oOo000Oo.OooOo.Oooo0O0(oOo000Oo.OooOo.o00O0O((List) ((Map.Entry) it8.next()).getValue(), new OooO0O0())));
                                                        }
                                                        C24033OooOooo c24033OooOooo3 = new C24033OooOooo();
                                                        ArrayList arrayList9 = new ArrayList();
                                                        for (Object obj6 : arrayList4) {
                                                            C24033OooOooo c24033OooOooo4 = c24033OooOooo3;
                                                            if (!arrayList8.contains((BackupFile) obj6)) {
                                                                arrayList9.add(obj6);
                                                            }
                                                            c24033OooOooo3 = c24033OooOooo4;
                                                        }
                                                        C24033OooOooo c24033OooOooo5 = c24033OooOooo3;
                                                        LinkedHashMap linkedHashMap5 = new LinkedHashMap(oO0O00oo.OooOO0.OooO0OO(oOo000Oo.Oooo0.OooO0Oo(C34428OooOOo.OooOOoo(arrayList9, 10))));
                                                        for (Object obj7 : arrayList9) {
                                                            linkedHashMap5.put(((BackupFile) obj7).getContentProperties().get(str34), obj7);
                                                        }
                                                        C34406OooO00o.C20358OooO00o c20358OooO00o12 = C34406OooO00o.f123390OooO00o;
                                                        c20358OooO00o12.OooOOO0(str3);
                                                        c20358OooO00o12.OooO0o0("backup, contentIdToRemoteFileMap.size = " + linkedHashMap5.size(), new Object[0]);
                                                        it9 = map8.entrySet().iterator();
                                                        c27351Oooo0O010 = c27351Oooo0O08;
                                                        str36 = str34;
                                                        c24032OooOooO3 = c24032OooOooO5;
                                                        list8 = arrayList8;
                                                        fileOooO0oO = file3;
                                                        abstractC30978OooO6 = abstractC30978OooO4;
                                                        c27351Oooo0O011 = c27351Oooo0O010;
                                                        diskVendor3 = diskVendor2;
                                                        str37 = str26;
                                                        diskVendor4 = diskVendor3;
                                                        map11 = map8;
                                                        f8 = f5;
                                                        str38 = str4;
                                                        map12 = linkedHashMap5;
                                                        c24033OooOooo = c24033OooOooo5;
                                                        abstractC30978OooO7 = abstractC30978OooO6;
                                                    } catch (Exception e27) {
                                                        e = e27;
                                                        str2 = str35;
                                                    } catch (Throwable th28) {
                                                        th = th28;
                                                        str2 = str35;
                                                        r2 = file3;
                                                        boolean zOooO0oo222222222222222222222 = C31190OooO0oo.OooO0oo(r2);
                                                        C34406OooO00o.C20358OooO00o c20358OooO00o5222222222222222222222 = C34406OooO00o.f123390OooO00o;
                                                        c20358OooO00o5222222222222222222222.OooOOO0(str3);
                                                        c20358OooO00o5222222222222222222222.OooO0o0(str4 + r2 + str2 + zOooO0oo222222222222222222222, new Object[0]);
                                                        throw th;
                                                    }
                                                } catch (Exception e28) {
                                                    e = e28;
                                                    str2 = str27;
                                                } catch (Throwable th29) {
                                                    th = th29;
                                                    str2 = str27;
                                                    r2 = file3;
                                                    boolean zOooO0oo2222222222222222222222 = C31190OooO0oo.OooO0oo(r2);
                                                    C34406OooO00o.C20358OooO00o c20358OooO00o52222222222222222222222 = C34406OooO00o.f123390OooO00o;
                                                    c20358OooO00o52222222222222222222222.OooOOO0(str3);
                                                    c20358OooO00o52222222222222222222222.OooO0o0(str4 + r2 + str2 + zOooO0oo2222222222222222222222, new Object[0]);
                                                    throw th;
                                                }
                                                try {
                                                    if (it9.hasNext()) {
                                                        try {
                                                            Map.Entry entry2 = (Map.Entry) it9.next();
                                                            str39 = str25;
                                                            String str54 = (String) entry2.getKey();
                                                            EnumC32485OooO00o enumC32485OooO00o11 = enumC32485OooO00o5;
                                                            BackupFile backupFile5 = (BackupFile) entry2.getValue();
                                                            BackupFile backupFile6 = (BackupFile) map12.get(str54);
                                                            float f15 = f8;
                                                            Iterator it14 = it9;
                                                            String str55 = str23;
                                                            String orDefault3 = backupFile5.getContentProperties().getOrDefault(BackupFile.FILE_PROPERTY_CONTENT_CHECKSUM, str55);
                                                            if (backupFile6 != null) {
                                                                abstractC30978OooO10 = abstractC30978OooO6;
                                                                Map<String, String> contentProperties = backupFile6.getContentProperties();
                                                                String orDefault4 = contentProperties != null ? contentProperties.getOrDefault(BackupFile.FILE_PROPERTY_CONTENT_CHECKSUM, str55) : null;
                                                                if (backupFile6 == null && kotlin.jvm.internal.OooOOO0.OooO0O0(orDefault3, orDefault4)) {
                                                                    str23 = str55;
                                                                    z3 = false;
                                                                } else {
                                                                    str23 = str55;
                                                                    z3 = true;
                                                                }
                                                                diskVendor7 = diskVendor4;
                                                                C34406OooO00o.C20358OooO00o c20358OooO00o13 = C34406OooO00o.f123390OooO00o;
                                                                c20358OooO00o13.OooOOO0(str3);
                                                                c27351Oooo0O013 = c27351Oooo0O011;
                                                                int i5 = c24033OooOooo.f80940OooOo0o;
                                                                map16 = map12;
                                                                c24033OooOooo.f80940OooOo0o = i5 + 1;
                                                                StringBuilder sb9 = new StringBuilder();
                                                                c24033OooOooo2 = c24033OooOooo;
                                                                sb9.append("backup, index: ");
                                                                sb9.append(i5);
                                                                sb9.append(" shouldUpload = ");
                                                                sb9.append(z3);
                                                                sb9.append(", remoteBackupFile = ");
                                                                sb9.append(backupFile6);
                                                                sb9.append(", localChecksum = ");
                                                                sb9.append(orDefault3);
                                                                sb9.append(", remoteChecksum = ");
                                                                sb9.append(orDefault4);
                                                                c20358OooO00o13.OooO0o0(sb9.toString(), new Object[0]);
                                                                if (backupFile6 != null && kotlin.jvm.internal.OooOOO0.OooO0O0(orDefault3, orDefault4)) {
                                                                    it11 = it14;
                                                                    f8 = f15;
                                                                    str41 = str37;
                                                                    abstractC30978OooO9 = abstractC30978OooO10;
                                                                    diskVendor4 = diskVendor7;
                                                                    str40 = str39;
                                                                    map12 = map16;
                                                                    c24033OooOooo = c24033OooOooo2;
                                                                    file14 = fileOooO0oO;
                                                                    enumC32485OooO00o2 = enumC32485OooO00o11;
                                                                    if (abstractC30978OooO9 != null) {
                                                                        try {
                                                                            float f16 = c24032OooOooO3.f80939OooOo0o;
                                                                            c24032OooOooO3.f80939OooOo0o = f16 + 1.0f;
                                                                            abstractC30978OooO9.OooO00o(f16 / f8);
                                                                            C32460OooOooO c32460OooOooO6 = C32460OooOooO.f116667OooO00o;
                                                                        } catch (Exception e29) {
                                                                            e = e29;
                                                                            str4 = str38;
                                                                            str2 = str35;
                                                                            r2 = file14;
                                                                            C34406OooO00o.C20358OooO00o c20358OooO00o422222222222222222 = C34406OooO00o.f123390OooO00o;
                                                                            c20358OooO00o422222222222222222.OooOOO0(str3);
                                                                            c20358OooO00o422222222222222222.OooO0Oo(e, "backup error final.", new Object[0]);
                                                                            throw e;
                                                                        } catch (Throwable th30) {
                                                                            th = th30;
                                                                            str4 = str38;
                                                                            str2 = str35;
                                                                            r2 = file14;
                                                                            boolean zOooO0oo22222222222222222222222 = C31190OooO0oo.OooO0oo(r2);
                                                                            C34406OooO00o.C20358OooO00o c20358OooO00o522222222222222222222222 = C34406OooO00o.f123390OooO00o;
                                                                            c20358OooO00o522222222222222222222222.OooOOO0(str3);
                                                                            c20358OooO00o522222222222222222222222.OooO0o0(str4 + r2 + str2 + zOooO0oo22222222222222222222222, new Object[0]);
                                                                            throw th;
                                                                        }
                                                                    }
                                                                    Iterator it15 = it11;
                                                                    enumC32485OooO00o5 = enumC32485OooO00o2;
                                                                    fileOooO0oO = file14;
                                                                    str37 = str41;
                                                                    it9 = it15;
                                                                    str25 = str40;
                                                                    abstractC30978OooO6 = abstractC30978OooO9;
                                                                    c27351Oooo0O011 = c27351Oooo0O013;
                                                                    if (it9.hasNext()) {
                                                                        EnumC32485OooO00o enumC32485OooO00o12 = enumC32485OooO00o5;
                                                                        Map map17 = map12;
                                                                        Collection collectionValues = map11.values();
                                                                        ArrayList arrayList10 = new ArrayList(C34428OooOOo.OooOOoo(collectionValues, 10));
                                                                        Iterator it16 = collectionValues.iterator();
                                                                        while (it16.hasNext()) {
                                                                            String str56 = str36;
                                                                            arrayList10.add(((BackupFile) it16.next()).getContentProperties().get(str56));
                                                                            str36 = str56;
                                                                        }
                                                                        Set setO0OO00O = oOo000Oo.OooOo.o0OO00O(arrayList10);
                                                                        LinkedHashMap linkedHashMap6 = new LinkedHashMap();
                                                                        for (Map.Entry entry3 : map17.entrySet()) {
                                                                            if (!setO0OO00O.contains((String) entry3.getKey())) {
                                                                                linkedHashMap6.put(entry3.getKey(), entry3.getValue());
                                                                            }
                                                                        }
                                                                        List listO0ooOO0 = oOo000Oo.OooOo.o0ooOO0(linkedHashMap6.values());
                                                                        C34406OooO00o.C20358OooO00o c20358OooO00o14 = C34406OooO00o.f123390OooO00o;
                                                                        c20358OooO00o14.OooOOO0(str3);
                                                                        c20358OooO00o14.OooO0o0("backup, invalidRemoteFiles.size = " + listO0ooOO0.size() + ", remoteBackupFilesToBeDeleted.size = " + list8.size(), new Object[0]);
                                                                        ArrayList arrayListOooooOO = oOo000Oo.OooOo.OooooOO(listO0ooOO0, list8);
                                                                        this.f95105OooOo0o = fileOooO0oO;
                                                                        this.f95104OooOo = null;
                                                                        this.f95107OooOoO0 = null;
                                                                        this.f95106OooOoO = null;
                                                                        this.f95108OooOoOO = null;
                                                                        this.f95110OooOoo0 = null;
                                                                        this.f95109OooOoo = null;
                                                                        this.f95111OooOooO = null;
                                                                        this.f95112OooOooo = null;
                                                                        this.f95115Oooo000 = null;
                                                                        this.f95116Oooo00O = null;
                                                                        this.f95117Oooo00o = null;
                                                                        this.f95121Oooo0o0 = 12;
                                                                        c27351Oooo0O010.getClass();
                                                                        if (arrayListOooooOO.isEmpty() || (objOooOOO02 = c27351Oooo0O010.f95243OooO0oo.OooOOO0(arrayListOooooOO, diskVendor3, this)) != EnumC32485OooO00o.f116726OooOo0o) {
                                                                            objOooOOO02 = C32460OooOooO.f116667OooO00o;
                                                                        }
                                                                        if (objOooOOO02 == enumC32485OooO00o12) {
                                                                            return enumC32485OooO00o12;
                                                                        }
                                                                        r24 = fileOooO0oO;
                                                                        if (abstractC30978OooO7 != null) {
                                                                            try {
                                                                                abstractC30978OooO7.OooO00o(1.0f);
                                                                                C32460OooOooO c32460OooOooO7 = C32460OooOooO.f116667OooO00o;
                                                                            } catch (Exception e30) {
                                                                                e = e30;
                                                                                str4 = str38;
                                                                                r23 = r24;
                                                                                str2 = str35;
                                                                                r2 = r23;
                                                                                C34406OooO00o.C20358OooO00o c20358OooO00o4222222222222222222 = C34406OooO00o.f123390OooO00o;
                                                                                c20358OooO00o4222222222222222222.OooOOO0(str3);
                                                                                c20358OooO00o4222222222222222222.OooO0Oo(e, "backup error final.", new Object[0]);
                                                                                throw e;
                                                                            } catch (Throwable th31) {
                                                                                th = th31;
                                                                                str4 = str38;
                                                                                r2 = r24;
                                                                                str2 = str35;
                                                                                boolean zOooO0oo222222222222222222222222 = C31190OooO0oo.OooO0oo(r2);
                                                                                C34406OooO00o.C20358OooO00o c20358OooO00o5222222222222222222222222 = C34406OooO00o.f123390OooO00o;
                                                                                c20358OooO00o5222222222222222222222222.OooOOO0(str3);
                                                                                c20358OooO00o5222222222222222222222222.OooO0o0(str4 + r2 + str2 + zOooO0oo222222222222222222222222, new Object[0]);
                                                                                throw th;
                                                                            }
                                                                            break;
                                                                        }
                                                                        boolean zOooO0oo4 = C31190OooO0oo.OooO0oo(r24);
                                                                        C34406OooO00o.C20358OooO00o c20358OooO00o15 = C34406OooO00o.f123390OooO00o;
                                                                        c20358OooO00o15.OooOOO0(str3);
                                                                        c20358OooO00o15.OooO0o0(str38 + r24 + str35 + zOooO0oo4, new Object[0]);
                                                                        return C32460OooOooO.f116667OooO00o;
                                                                    }
                                                                }
                                                                c20358OooO00o13.OooOOO0(str3);
                                                                c20358OooO00o13.OooO0o0("start to upload " + backupFile5, new Object[0]);
                                                                long jCurrentTimeMillis6 = System.currentTimeMillis();
                                                                this.f95105OooOo0o = fileOooO0oO;
                                                                this.f95104OooOo = c24032OooOooO3;
                                                                this.f95107OooOoO0 = map11;
                                                                this.f95106OooOoO = list8;
                                                                this.f95108OooOoOO = c24033OooOooo2;
                                                                this.f95110OooOoo0 = map16;
                                                                c27351Oooo0O012 = c27351Oooo0O013;
                                                                this.f95109OooOoo = c27351Oooo0O012;
                                                                diskVendor5 = diskVendor7;
                                                                this.f95111OooOooO = diskVendor5;
                                                                AbstractC30978OooO abstractC30978OooO12 = abstractC30978OooO10;
                                                                this.f95112OooOooo = abstractC30978OooO12;
                                                                Map map18 = map11;
                                                                this.f95115Oooo000 = it14;
                                                                this.f95116Oooo00O = backupFile5;
                                                                this.f95117Oooo00o = backupFile6;
                                                                this.f95114Oooo0 = f15;
                                                                this.f95118Oooo0O0 = jCurrentTimeMillis6;
                                                                this.f95121Oooo0o0 = 10;
                                                                objOooOOOO = C27351Oooo0O0.OooOOOO(c27351Oooo0O012, backupFile5, diskVendor5, this);
                                                                enumC32485OooO00o6 = enumC32485OooO00o11;
                                                                if (objOooOOOO != enumC32485OooO00o6) {
                                                                    return enumC32485OooO00o6;
                                                                }
                                                                backupFile4 = backupFile6;
                                                                obj = objOooOOOO;
                                                                f9 = f15;
                                                                backupFile3 = backupFile5;
                                                                c24033OooOooo = c24033OooOooo2;
                                                                map14 = map18;
                                                                map13 = map16;
                                                                abstractC30978OooO8 = abstractC30978OooO12;
                                                                it10 = it14;
                                                                j6 = jCurrentTimeMillis6;
                                                                try {
                                                                    EnumC32485OooO00o enumC32485OooO00o13 = enumC32485OooO00o6;
                                                                    iIntValue = ((Number) obj).intValue();
                                                                    long jCurrentTimeMillis7 = System.currentTimeMillis();
                                                                    f10 = f9;
                                                                    C34406OooO00o.C20358OooO00o c20358OooO00o16 = C34406OooO00o.f123390OooO00o;
                                                                    c20358OooO00o16.OooOOO0(str3);
                                                                    Iterator it17 = it10;
                                                                    String strOooO0O05 = C31430OooO00o.OooO0O0(j6);
                                                                    AbstractC30978OooO abstractC30978OooO13 = abstractC30978OooO8;
                                                                    String strOooO0O06 = C31430OooO00o.OooO0O0(jCurrentTimeMillis7);
                                                                    long j13 = jCurrentTimeMillis7 - j6;
                                                                    BackupFile.DiskVendor diskVendor9 = diskVendor5;
                                                                    String strOooO00o4 = C31430OooO00o.OooO00o(j13);
                                                                    C27351Oooo0O0 c27351Oooo0O017 = c27351Oooo0O012;
                                                                    StringBuilder sb10 = new StringBuilder();
                                                                    Map map19 = map13;
                                                                    sb10.append("backup, uploadBackupFile during ");
                                                                    sb10.append(strOooO0O05);
                                                                    str40 = str39;
                                                                    sb10.append(str40);
                                                                    sb10.append(strOooO0O06);
                                                                    str41 = str37;
                                                                    sb10.append(str41);
                                                                    sb10.append(strOooO00o4);
                                                                    sb10.append(", result = ");
                                                                    sb10.append(iIntValue);
                                                                    c20358OooO00o16.OooO0o0(sb10.toString(), new Object[0]);
                                                                    if (iIntValue != 0) {
                                                                        file14 = fileOooO0oO;
                                                                        throw new BackupException(str23, iIntValue, backupFile3.getName());
                                                                    }
                                                                    if (backupFile4 != null) {
                                                                        c20358OooO00o16.OooOOO0(str3);
                                                                        c20358OooO00o16.OooO0o0("backup, delete remoteBackupFile = " + backupFile4, new Object[0]);
                                                                        List listOooO0oO = com.facebook.soloader.OooOo.OooO0oO(backupFile4);
                                                                        this.f95105OooOo0o = fileOooO0oO;
                                                                        this.f95104OooOo = c24032OooOooO3;
                                                                        this.f95107OooOoO0 = map14;
                                                                        this.f95106OooOoO = list8;
                                                                        this.f95108OooOoOO = c24033OooOooo;
                                                                        map15 = map19;
                                                                        this.f95110OooOoo0 = map15;
                                                                        c27351Oooo0O014 = c27351Oooo0O017;
                                                                        this.f95109OooOoo = c27351Oooo0O014;
                                                                        this.f95111OooOooO = diskVendor9;
                                                                        abstractC30978OooO9 = abstractC30978OooO13;
                                                                        this.f95112OooOooo = abstractC30978OooO9;
                                                                        it11 = it17;
                                                                        this.f95115Oooo000 = it11;
                                                                        file14 = fileOooO0oO;
                                                                        this.f95116Oooo00O = null;
                                                                        this.f95117Oooo00o = null;
                                                                        this.f95114Oooo0 = f10;
                                                                        f10 = f10;
                                                                        this.f95121Oooo0o0 = 11;
                                                                        c27351Oooo0O014.getClass();
                                                                        if (listOooO0oO.isEmpty() || (objOooOOO0 = c27351Oooo0O014.f95243OooO0oo.OooOOO0(listOooO0oO, diskVendor9, this)) != EnumC32485OooO00o.f116726OooOo0o) {
                                                                            objOooOOO0 = C32460OooOooO.f116667OooO00o;
                                                                        }
                                                                        enumC32485OooO00o2 = enumC32485OooO00o13;
                                                                        if (objOooOOO0 == enumC32485OooO00o2) {
                                                                            return enumC32485OooO00o2;
                                                                        }
                                                                        diskVendor6 = diskVendor9;
                                                                        c27351Oooo0O013 = c27351Oooo0O014;
                                                                        diskVendor4 = diskVendor6;
                                                                        map12 = map15;
                                                                        map11 = map14;
                                                                        f8 = f10;
                                                                        if (abstractC30978OooO9 != null) {
                                                                        }
                                                                        Iterator it152 = it11;
                                                                        enumC32485OooO00o5 = enumC32485OooO00o2;
                                                                        fileOooO0oO = file14;
                                                                        str37 = str41;
                                                                        it9 = it152;
                                                                        str25 = str40;
                                                                        abstractC30978OooO6 = abstractC30978OooO9;
                                                                        c27351Oooo0O011 = c27351Oooo0O013;
                                                                        if (it9.hasNext()) {
                                                                        }
                                                                    } else {
                                                                        abstractC30978OooO9 = abstractC30978OooO13;
                                                                        file14 = fileOooO0oO;
                                                                        diskVendor4 = diskVendor9;
                                                                        enumC32485OooO00o2 = enumC32485OooO00o13;
                                                                        map15 = map19;
                                                                        it11 = it17;
                                                                        c27351Oooo0O013 = c27351Oooo0O017;
                                                                        map12 = map15;
                                                                        map11 = map14;
                                                                        f8 = f10;
                                                                        if (abstractC30978OooO9 != null) {
                                                                        }
                                                                        Iterator it1522 = it11;
                                                                        enumC32485OooO00o5 = enumC32485OooO00o2;
                                                                        fileOooO0oO = file14;
                                                                        str37 = str41;
                                                                        it9 = it1522;
                                                                        str25 = str40;
                                                                        abstractC30978OooO6 = abstractC30978OooO9;
                                                                        c27351Oooo0O011 = c27351Oooo0O013;
                                                                        if (it9.hasNext()) {
                                                                        }
                                                                    }
                                                                } catch (Exception e31) {
                                                                    e = e31;
                                                                    file14 = fileOooO0oO;
                                                                    str4 = str38;
                                                                    str2 = str35;
                                                                    r2 = file14;
                                                                    C34406OooO00o.C20358OooO00o c20358OooO00o42222222222222222222 = C34406OooO00o.f123390OooO00o;
                                                                    c20358OooO00o42222222222222222222.OooOOO0(str3);
                                                                    c20358OooO00o42222222222222222222.OooO0Oo(e, "backup error final.", new Object[0]);
                                                                    throw e;
                                                                } catch (Throwable th32) {
                                                                    th = th32;
                                                                    file14 = fileOooO0oO;
                                                                    str4 = str38;
                                                                    str2 = str35;
                                                                    r2 = file14;
                                                                    boolean zOooO0oo2222222222222222222222222 = C31190OooO0oo.OooO0oo(r2);
                                                                    C34406OooO00o.C20358OooO00o c20358OooO00o52222222222222222222222222 = C34406OooO00o.f123390OooO00o;
                                                                    c20358OooO00o52222222222222222222222222.OooOOO0(str3);
                                                                    c20358OooO00o52222222222222222222222222.OooO0o0(str4 + r2 + str2 + zOooO0oo2222222222222222222222222, new Object[0]);
                                                                    throw th;
                                                                }
                                                            } else {
                                                                abstractC30978OooO10 = abstractC30978OooO6;
                                                            }
                                                            if (backupFile6 == null) {
                                                            }
                                                            str23 = str55;
                                                            z3 = true;
                                                            diskVendor7 = diskVendor4;
                                                            C34406OooO00o.C20358OooO00o c20358OooO00o132 = C34406OooO00o.f123390OooO00o;
                                                            c20358OooO00o132.OooOOO0(str3);
                                                            c27351Oooo0O013 = c27351Oooo0O011;
                                                            int i52 = c24033OooOooo.f80940OooOo0o;
                                                            map16 = map12;
                                                            c24033OooOooo.f80940OooOo0o = i52 + 1;
                                                            StringBuilder sb92 = new StringBuilder();
                                                            c24033OooOooo2 = c24033OooOooo;
                                                            sb92.append("backup, index: ");
                                                            sb92.append(i52);
                                                            sb92.append(" shouldUpload = ");
                                                            sb92.append(z3);
                                                            sb92.append(", remoteBackupFile = ");
                                                            sb92.append(backupFile6);
                                                            sb92.append(", localChecksum = ");
                                                            sb92.append(orDefault3);
                                                            sb92.append(", remoteChecksum = ");
                                                            sb92.append(orDefault4);
                                                            c20358OooO00o132.OooO0o0(sb92.toString(), new Object[0]);
                                                            if (backupFile6 != null) {
                                                                it11 = it14;
                                                                f8 = f15;
                                                                str41 = str37;
                                                                abstractC30978OooO9 = abstractC30978OooO10;
                                                                diskVendor4 = diskVendor7;
                                                                str40 = str39;
                                                                map12 = map16;
                                                                c24033OooOooo = c24033OooOooo2;
                                                                file14 = fileOooO0oO;
                                                                enumC32485OooO00o2 = enumC32485OooO00o11;
                                                                if (abstractC30978OooO9 != null) {
                                                                }
                                                                Iterator it15222 = it11;
                                                                enumC32485OooO00o5 = enumC32485OooO00o2;
                                                                fileOooO0oO = file14;
                                                                str37 = str41;
                                                                it9 = it15222;
                                                                str25 = str40;
                                                                abstractC30978OooO6 = abstractC30978OooO9;
                                                                c27351Oooo0O011 = c27351Oooo0O013;
                                                                if (it9.hasNext()) {
                                                                }
                                                            }
                                                            c20358OooO00o132.OooOOO0(str3);
                                                            c20358OooO00o132.OooO0o0("start to upload " + backupFile5, new Object[0]);
                                                            long jCurrentTimeMillis62 = System.currentTimeMillis();
                                                            this.f95105OooOo0o = fileOooO0oO;
                                                            this.f95104OooOo = c24032OooOooO3;
                                                            this.f95107OooOoO0 = map11;
                                                            this.f95106OooOoO = list8;
                                                            this.f95108OooOoOO = c24033OooOooo2;
                                                            this.f95110OooOoo0 = map16;
                                                            c27351Oooo0O012 = c27351Oooo0O013;
                                                            this.f95109OooOoo = c27351Oooo0O012;
                                                            diskVendor5 = diskVendor7;
                                                            this.f95111OooOooO = diskVendor5;
                                                            AbstractC30978OooO abstractC30978OooO122 = abstractC30978OooO10;
                                                            this.f95112OooOooo = abstractC30978OooO122;
                                                            Map map182 = map11;
                                                            this.f95115Oooo000 = it14;
                                                            this.f95116Oooo00O = backupFile5;
                                                            this.f95117Oooo00o = backupFile6;
                                                            this.f95114Oooo0 = f15;
                                                            this.f95118Oooo0O0 = jCurrentTimeMillis62;
                                                            this.f95121Oooo0o0 = 10;
                                                            objOooOOOO = C27351Oooo0O0.OooOOOO(c27351Oooo0O012, backupFile5, diskVendor5, this);
                                                            enumC32485OooO00o6 = enumC32485OooO00o11;
                                                            if (objOooOOOO != enumC32485OooO00o6) {
                                                            }
                                                        } catch (Exception e32) {
                                                            e = e32;
                                                            r24 = fileOooO0oO;
                                                            str4 = str38;
                                                            r23 = r24;
                                                            str2 = str35;
                                                            r2 = r23;
                                                            C34406OooO00o.C20358OooO00o c20358OooO00o422222222222222222222 = C34406OooO00o.f123390OooO00o;
                                                            c20358OooO00o422222222222222222222.OooOOO0(str3);
                                                            c20358OooO00o422222222222222222222.OooO0Oo(e, "backup error final.", new Object[0]);
                                                            throw e;
                                                        } catch (Throwable th33) {
                                                            th = th33;
                                                            r24 = fileOooO0oO;
                                                            str4 = str38;
                                                            r2 = r24;
                                                            str2 = str35;
                                                            boolean zOooO0oo22222222222222222222222222 = C31190OooO0oo.OooO0oo(r2);
                                                            C34406OooO00o.C20358OooO00o c20358OooO00o522222222222222222222222222 = C34406OooO00o.f123390OooO00o;
                                                            c20358OooO00o522222222222222222222222222.OooOOO0(str3);
                                                            c20358OooO00o522222222222222222222222222.OooO0o0(str4 + r2 + str2 + zOooO0oo22222222222222222222222222, new Object[0]);
                                                            throw th;
                                                        }
                                                    }
                                                } catch (Exception e33) {
                                                    e = e33;
                                                    str4 = str38;
                                                    str2 = str35;
                                                    r2 = fileOooO0oO;
                                                    C34406OooO00o.C20358OooO00o c20358OooO00o4222222222222222222222 = C34406OooO00o.f123390OooO00o;
                                                    c20358OooO00o4222222222222222222222.OooOOO0(str3);
                                                    c20358OooO00o4222222222222222222222.OooO0Oo(e, "backup error final.", new Object[0]);
                                                    throw e;
                                                } catch (Throwable th34) {
                                                    th = th34;
                                                    str4 = str38;
                                                    str2 = str35;
                                                    r2 = fileOooO0oO;
                                                    boolean zOooO0oo222222222222222222222222222 = C31190OooO0oo.OooO0oo(r2);
                                                    C34406OooO00o.C20358OooO00o c20358OooO00o5222222222222222222222222222 = C34406OooO00o.f123390OooO00o;
                                                    c20358OooO00o5222222222222222222222222222.OooOOO0(str3);
                                                    c20358OooO00o5222222222222222222222222222.OooO0o0(str4 + r2 + str2 + zOooO0oo222222222222222222222222222, new Object[0]);
                                                    throw th;
                                                }
                                            } catch (Exception e34) {
                                                e = e34;
                                                str2 = str27;
                                                r2 = file3;
                                                C34406OooO00o.C20358OooO00o c20358OooO00o42222222222222222222222 = C34406OooO00o.f123390OooO00o;
                                                c20358OooO00o42222222222222222222222.OooOOO0(str3);
                                                c20358OooO00o42222222222222222222222.OooO0Oo(e, "backup error final.", new Object[0]);
                                                throw e;
                                            } catch (Throwable th35) {
                                                th = th35;
                                                str2 = str27;
                                                r2 = file3;
                                                boolean zOooO0oo2222222222222222222222222222 = C31190OooO0oo.OooO0oo(r2);
                                                C34406OooO00o.C20358OooO00o c20358OooO00o52222222222222222222222222222 = C34406OooO00o.f123390OooO00o;
                                                c20358OooO00o52222222222222222222222222222.OooOOO0(str3);
                                                c20358OooO00o52222222222222222222222222222.OooO0o0(str4 + r2 + str2 + zOooO0oo2222222222222222222222222222, new Object[0]);
                                                throw th;
                                            }
                                        } catch (Exception e35) {
                                            e = e35;
                                            file3 = fileOooO0oO;
                                        } catch (Throwable th36) {
                                            th = th36;
                                            file3 = fileOooO0oO;
                                        }
                                    } catch (Exception e36) {
                                        e = e36;
                                        file3 = fileOooO0oO;
                                    } catch (Throwable th37) {
                                        th = th37;
                                        file3 = fileOooO0oO;
                                    }
                                    break;
                                }
                            }
                            r2 = file3;
                            C34406OooO00o.C20358OooO00o c20358OooO00o422222222222222222222222 = C34406OooO00o.f123390OooO00o;
                            c20358OooO00o422222222222222222222222.OooOOO0(str3);
                            c20358OooO00o422222222222222222222222.OooO0Oo(e, "backup error final.", new Object[0]);
                            throw e;
                        }
                    }
                    break;
                }
                break;
                break;
            case 1:
                str2 = ", deleteResult: ";
                str = "backup finally, delete outputDir, outputDir: ";
                fileOooO0oO = this.f95105OooOo0o;
                C32446OooOOOo.OooO0O0(obj);
                C27600o0ooOO0 c27600o0ooOO03 = c27351Oooo0O015.f95240OooO0o;
                this.f95105OooOo0o = fileOooO0oO;
                this.f95121Oooo0o0 = 2;
                objOooO0oO = c27600o0ooOO03.OooO0oO(this);
                if (objOooO0oO == enumC32485OooO00o7) {
                }
                arrayList = new ArrayList();
                it = ((Iterable) objOooO0oO).iterator();
                while (it.hasNext()) {
                }
                C34406OooO00o.C20358OooO00o c20358OooO00o32 = C34406OooO00o.f123390OooO00o;
                c20358OooO00o32.OooOOO0("BackupUseCase");
                str5 = str2;
                int size22 = arrayList.size();
                abstractC30978OooO = abstractC30978OooO11;
                StringBuilder sb11 = new StringBuilder();
                str6 = "folder_tree";
                sb11.append("backup, toBackupNotes.size = ");
                sb11.append(size22);
                c20358OooO00o32.OooO0o0(sb11.toString(), new Object[0]);
                C27600o0ooOO0 c27600o0ooOO022 = c27351Oooo0O015.f95240OooO0o;
                this.f95105OooOo0o = fileOooO0oO;
                this.f95104OooOo = arrayList;
                this.f95121Oooo0o0 = 3;
                objOooO0o = c27600o0ooOO022.OooO0o(null, this);
                if (objOooO0o == enumC32485OooO00o7) {
                }
                break;
            case 2:
                str2 = ", deleteResult: ";
                str = "backup finally, delete outputDir, outputDir: ";
                fileOooO0oO = this.f95105OooOo0o;
                C32446OooOOOo.OooO0O0(obj);
                objOooO0oO = obj;
                arrayList = new ArrayList();
                it = ((Iterable) objOooO0oO).iterator();
                while (it.hasNext()) {
                }
                C34406OooO00o.C20358OooO00o c20358OooO00o322 = C34406OooO00o.f123390OooO00o;
                c20358OooO00o322.OooOOO0("BackupUseCase");
                str5 = str2;
                int size222 = arrayList.size();
                abstractC30978OooO = abstractC30978OooO11;
                StringBuilder sb112 = new StringBuilder();
                str6 = "folder_tree";
                sb112.append("backup, toBackupNotes.size = ");
                sb112.append(size222);
                c20358OooO00o322.OooO0o0(sb112.toString(), new Object[0]);
                C27600o0ooOO0 c27600o0ooOO0222 = c27351Oooo0O015.f95240OooO0o;
                this.f95105OooOo0o = fileOooO0oO;
                this.f95104OooOo = arrayList;
                this.f95121Oooo0o0 = 3;
                objOooO0o = c27600o0ooOO0222.OooO0o(null, this);
                if (objOooO0o == enumC32485OooO00o7) {
                }
                break;
            case 3:
                str2 = ", deleteResult: ";
                str = "backup finally, delete outputDir, outputDir: ";
                List list11 = (List) this.f95104OooOo;
                File file17 = this.f95105OooOo0o;
                try {
                    C32446OooOOOo.OooO0O0(obj);
                    list = list11;
                    fileOooO0oO = file17;
                    str6 = "folder_tree";
                    abstractC30978OooO = abstractC30978OooO11;
                    str5 = str2;
                    objOooO0o = obj;
                    ArrayList arrayList52 = new ArrayList();
                    while (r4.hasNext()) {
                    }
                    listO00O0O = oOo000Oo.OooOo.o00O0O(arrayList52, new OooO00o());
                    C34406OooO00o.C20358OooO00o c20358OooO00o62 = C34406OooO00o.f123390OooO00o;
                    c20358OooO00o62.OooOOO0("BackupUseCase");
                    int size32 = listO00O0O.size();
                    StringBuilder sb22 = new StringBuilder();
                    str7 = ", cost ";
                    sb22.append("backup, toBackupFolderTree.size = ");
                    sb22.append(size32);
                    c20358OooO00o62.OooO0o0(sb22.toString(), new Object[0]);
                    o0OOOO00.OooOOO0 oooOOO0OooO0Oo2 = ((C27095OooOo0O) c27351Oooo0O015.f95244OooOO0).OooO0Oo();
                    this.f95105OooOo0o = fileOooO0oO;
                    this.f95104OooOo = list;
                    this.f95107OooOoO0 = listO00O0O;
                    this.f95121Oooo0o0 = 4;
                    objOooOOo = C25252OooO0Oo.OooOOo(oooOOO0OooO0Oo2, this);
                    if (objOooOOo == enumC32485OooO00o7) {
                    }
                    arrayList2 = new ArrayList();
                    while (r7.hasNext()) {
                    }
                    c20358OooO00o = C34406OooO00o.f123390OooO00o;
                    c20358OooO00o.OooOOO0("BackupUseCase");
                    int size42 = arrayList2.size();
                    StringBuilder sb32 = new StringBuilder();
                    file3 = fileOooO0oO;
                    sb32.append("backup, toBackupTemplate.size = ");
                    sb32.append(size42);
                    c20358OooO00o.OooO0o0(sb32.toString(), new Object[0]);
                    if (list.isEmpty()) {
                    }
                    if (diskVendor8 == BackupFile.DiskVendor.Local) {
                    }
                    c24032OooOooO = new C24032OooOooO();
                    LinkedHashMap linkedHashMap7 = new LinkedHashMap();
                    LinkedHashMap linkedHashMap22 = new LinkedHashMap();
                    LinkedHashMap linkedHashMapOooOO0o2 = C27351Oooo0O0.OooOO0o(c27351Oooo0O015, list);
                    c20358OooO00o.OooOOO0("BackupUseCase");
                    float f112 = size;
                    List list92 = listO00O0O;
                    String strO000oOoO2 = oOo000Oo.OooOo.o000oOoO(linkedHashMapOooOO0o2.values(), null, null, null, new OooOOO0(0), 31);
                    StringBuilder sb42 = new StringBuilder();
                    List list102 = list;
                    sb42.append("backup, resolvedNoteTitle is ");
                    sb42.append(strO000oOoO2);
                    c20358OooO00o.OooO0o0(sb42.toString(), new Object[0]);
                    long jCurrentTimeMillis32 = System.currentTimeMillis();
                    fileOooO0oO = file3;
                    it2 = list102.iterator();
                    j = jCurrentTimeMillis32;
                    diskVendor = diskVendor8;
                    map = linkedHashMap22;
                    c27351Oooo0O0 = c27351Oooo0O015;
                    str8 = "";
                    abstractC30978OooO2 = abstractC30978OooO;
                    f = f112;
                    str9 = CacheKeyValueDelegate.CACHE_VALUE_SEPARATOR;
                    map2 = linkedHashMap7;
                    map3 = linkedHashMapOooOO0o2;
                    list2 = list92;
                    c27351Oooo0O02 = c27351Oooo0O0;
                    list4 = arrayList2;
                    if (it2.hasNext()) {
                    }
                } catch (Exception e37) {
                    e = e37;
                    r22 = file17;
                    str3 = "BackupUseCase";
                    str4 = str;
                    r2 = r22;
                    break;
                } catch (Throwable th38) {
                    th = th38;
                    r2 = file17;
                    str3 = "BackupUseCase";
                    str4 = str;
                    boolean zOooO0oo22222222222222222222222222222 = C31190OooO0oo.OooO0oo(r2);
                    C34406OooO00o.C20358OooO00o c20358OooO00o522222222222222222222222222222 = C34406OooO00o.f123390OooO00o;
                    c20358OooO00o522222222222222222222222222222.OooOOO0(str3);
                    c20358OooO00o522222222222222222222222222222.OooO0o0(str4 + r2 + str2 + zOooO0oo22222222222222222222222222222, new Object[0]);
                    throw th;
                }
                break;
            case 4:
                str2 = ", deleteResult: ";
                str = "backup finally, delete outputDir, outputDir: ";
                List list12 = (List) this.f95107OooOoO0;
                list = (List) this.f95104OooOo;
                File file18 = this.f95105OooOo0o;
                try {
                    C32446OooOOOo.OooO0O0(obj);
                    str6 = "folder_tree";
                    str7 = ", cost ";
                    abstractC30978OooO = abstractC30978OooO11;
                    str5 = str2;
                    listO00O0O = list12;
                    fileOooO0oO = file18;
                    objOooOOo = obj;
                    arrayList2 = new ArrayList();
                    while (r7.hasNext()) {
                    }
                    c20358OooO00o = C34406OooO00o.f123390OooO00o;
                    c20358OooO00o.OooOOO0("BackupUseCase");
                    int size422 = arrayList2.size();
                    StringBuilder sb322 = new StringBuilder();
                    file3 = fileOooO0oO;
                    sb322.append("backup, toBackupTemplate.size = ");
                    sb322.append(size422);
                    c20358OooO00o.OooO0o0(sb322.toString(), new Object[0]);
                    if (list.isEmpty()) {
                    }
                    if (diskVendor8 == BackupFile.DiskVendor.Local) {
                    }
                    c24032OooOooO = new C24032OooOooO();
                    LinkedHashMap linkedHashMap72 = new LinkedHashMap();
                    LinkedHashMap linkedHashMap222 = new LinkedHashMap();
                    LinkedHashMap linkedHashMapOooOO0o22 = C27351Oooo0O0.OooOO0o(c27351Oooo0O015, list);
                    c20358OooO00o.OooOOO0("BackupUseCase");
                    float f1122 = size;
                    List list922 = listO00O0O;
                    String strO000oOoO22 = oOo000Oo.OooOo.o000oOoO(linkedHashMapOooOO0o22.values(), null, null, null, new OooOOO0(0), 31);
                    StringBuilder sb422 = new StringBuilder();
                    List list1022 = list;
                    sb422.append("backup, resolvedNoteTitle is ");
                    sb422.append(strO000oOoO22);
                    c20358OooO00o.OooO0o0(sb422.toString(), new Object[0]);
                    long jCurrentTimeMillis322 = System.currentTimeMillis();
                    fileOooO0oO = file3;
                    it2 = list1022.iterator();
                    j = jCurrentTimeMillis322;
                    diskVendor = diskVendor8;
                    map = linkedHashMap222;
                    c27351Oooo0O0 = c27351Oooo0O015;
                    str8 = "";
                    abstractC30978OooO2 = abstractC30978OooO;
                    f = f1122;
                    str9 = CacheKeyValueDelegate.CACHE_VALUE_SEPARATOR;
                    map2 = linkedHashMap72;
                    map3 = linkedHashMapOooOO0o22;
                    list2 = list922;
                    c27351Oooo0O02 = c27351Oooo0O0;
                    list4 = arrayList2;
                    if (it2.hasNext()) {
                    }
                } catch (Exception e38) {
                    e = e38;
                    r22 = file18;
                    str3 = "BackupUseCase";
                    str4 = str;
                    r2 = r22;
                    break;
                } catch (Throwable th39) {
                    th = th39;
                    r2 = file18;
                    str3 = "BackupUseCase";
                    str4 = str;
                    boolean zOooO0oo222222222222222222222222222222 = C31190OooO0oo.OooO0oo(r2);
                    C34406OooO00o.C20358OooO00o c20358OooO00o5222222222222222222222222222222 = C34406OooO00o.f123390OooO00o;
                    c20358OooO00o5222222222222222222222222222222.OooOOO0(str3);
                    c20358OooO00o5222222222222222222222222222222.OooO0o0(str4 + r2 + str2 + zOooO0oo222222222222222222222222222222, new Object[0]);
                    throw th;
                }
                break;
            case 5:
                str = "backup finally, delete outputDir, outputDir: ";
                long j14 = this.f95118Oooo0O0;
                float f17 = this.f95114Oooo0;
                Note note6 = (Note) this.f95116Oooo00O;
                Iterator it18 = this.f95115Oooo000;
                AbstractC30978OooO abstractC30978OooO14 = (AbstractC30978OooO) this.f95112OooOooo;
                C27351Oooo0O0 c27351Oooo0O018 = (C27351Oooo0O0) this.f95111OooOooO;
                Map map20 = (Map) this.f95109OooOoo;
                Map map21 = (Map) this.f95110OooOoo0;
                Map map22 = (Map) this.f95108OooOoOO;
                C24032OooOooO c24032OooOooO6 = (C24032OooOooO) this.f95106OooOoO;
                List list13 = (List) this.f95107OooOoO0;
                List list14 = (List) this.f95104OooOo;
                fileOooO0oO = this.f95105OooOo0o;
                C32446OooOOOo.OooO0O0(obj);
                str7 = ", cost ";
                list3 = list13;
                str10 = "BackupUseCase";
                f2 = f17;
                str5 = ", deleteResult: ";
                list2 = list14;
                str11 = BackupFile.FILE_PROPERTY_CONTENT_ID;
                note = note6;
                abstractC30978OooO = abstractC30978OooO11;
                c24032OooOooO = c24032OooOooO6;
                str8 = "";
                abstractC30978OooO2 = abstractC30978OooO14;
                j2 = j14;
                it3 = it18;
                map4 = map22;
                str6 = "folder_tree";
                map5 = map20;
                c27351Oooo0O02 = c27351Oooo0O015;
                c27351Oooo0O03 = c27351Oooo0O018;
                diskVendor = diskVendor8;
                map = map21;
                str9 = CacheKeyValueDelegate.CACHE_VALUE_SEPARATOR;
                enumC32485OooO00o = enumC32485OooO00o7;
                objOooOo = obj;
                note2 = (Note) objOooOo;
                if (note2 == null) {
                }
                break;
            case 6:
                str = "backup finally, delete outputDir, outputDir: ";
                long j15 = this.f95118Oooo0O0;
                float f18 = this.f95114Oooo0;
                File file19 = (File) this.f95117Oooo00o;
                Note note7 = (Note) this.f95116Oooo00O;
                Iterator it19 = this.f95115Oooo000;
                AbstractC30978OooO abstractC30978OooO15 = (AbstractC30978OooO) this.f95112OooOooo;
                C27351Oooo0O0 c27351Oooo0O019 = (C27351Oooo0O0) this.f95111OooOooO;
                Map map23 = (Map) this.f95109OooOoo;
                Map map24 = (Map) this.f95110OooOoo0;
                Map map25 = (Map) this.f95108OooOoOO;
                C24032OooOooO c24032OooOooO7 = (C24032OooOooO) this.f95106OooOoO;
                List list15 = (List) this.f95107OooOoO0;
                List list16 = (List) this.f95104OooOo;
                File file20 = this.f95105OooOo0o;
                C32446OooOOOo.OooO0O0(obj);
                c27351Oooo0O02 = c27351Oooo0O015;
                c27351Oooo0O03 = c27351Oooo0O019;
                j3 = j15;
                note3 = note7;
                it4 = it19;
                map4 = map25;
                str6 = "folder_tree";
                str7 = ", cost ";
                str8 = "";
                abstractC30978OooO2 = abstractC30978OooO15;
                map5 = map23;
                list7 = list15;
                str9 = CacheKeyValueDelegate.CACHE_VALUE_SEPARATOR;
                diskVendor = diskVendor8;
                str11 = BackupFile.FILE_PROPERTY_CONTENT_ID;
                file6 = file19;
                map = map24;
                file4 = file20;
                abstractC30978OooO = abstractC30978OooO11;
                c24032OooOooO = c24032OooOooO7;
                enumC32485OooO00o2 = enumC32485OooO00o7;
                str10 = "BackupUseCase";
                f3 = f18;
                objOooO0O0 = obj;
                str5 = ", deleteResult: ";
                list2 = list16;
                try {
                    BackupFile backupFile7 = (BackupFile) objOooO0O0;
                    if (backupFile7 != null) {
                        enumC32485OooO00o3 = enumC32485OooO00o2;
                        note5 = note3;
                        file7 = file6;
                        str13 = str8;
                        str14 = str11;
                        String orDefault5 = backupFile7.getContentProperties().getOrDefault(str14, str13);
                        if (orDefault5.length() > 0) {
                            map4.put(orDefault5, backupFile7);
                        }
                        C32460OooOooO c32460OooOooO8 = C32460OooOooO.f116667OooO00o;
                    } else {
                        enumC32485OooO00o3 = enumC32485OooO00o2;
                        note5 = note3;
                        file7 = file6;
                        str13 = str8;
                        str14 = str11;
                    }
                    map.put(file7.getName(), note5.getId());
                    if (abstractC30978OooO2 != null) {
                        float f19 = c24032OooOooO.f80939OooOo0o;
                        c24032OooOooO.f80939OooOo0o = f19 + 1.0f;
                        abstractC30978OooO2.OooO00o(f19 / f3);
                        C32460OooOooO c32460OooOooO9 = C32460OooOooO.f116667OooO00o;
                    }
                    map6 = map5;
                    f = f3;
                    fileOooO0oO = file4;
                    list6 = list7;
                    c27351Oooo0O0 = c27351Oooo0O03;
                    map2 = map4;
                    str8 = str13;
                    str43 = str14;
                    str44 = str10;
                    it2 = it4;
                    j = j3;
                    map3 = map6;
                    enumC32485OooO00o7 = enumC32485OooO00o3;
                    list4 = list6;
                    if (it2.hasNext()) {
                    }
                } catch (Exception e39) {
                    e = e39;
                    file5 = file4;
                    str4 = str;
                    str2 = str5;
                    str3 = str10;
                    r2 = file5;
                    C34406OooO00o.C20358OooO00o c20358OooO00o4222222222222222222222222 = C34406OooO00o.f123390OooO00o;
                    c20358OooO00o4222222222222222222222222.OooOOO0(str3);
                    c20358OooO00o4222222222222222222222222.OooO0Oo(e, "backup error final.", new Object[0]);
                    throw e;
                } catch (Throwable th40) {
                    th = th40;
                    r2 = file4;
                    str4 = str;
                    str2 = str5;
                    str3 = str10;
                    boolean zOooO0oo2222222222222222222222222222222 = C31190OooO0oo.OooO0oo(r2);
                    C34406OooO00o.C20358OooO00o c20358OooO00o52222222222222222222222222222222 = C34406OooO00o.f123390OooO00o;
                    c20358OooO00o52222222222222222222222222222222.OooOOO0(str3);
                    c20358OooO00o52222222222222222222222222222222.OooO0o0(str4 + r2 + str2 + zOooO0oo2222222222222222222222222222222, new Object[0]);
                    throw th;
                }
                break;
            case 7:
                str = "backup finally, delete outputDir, outputDir: ";
                float f20 = this.f95114Oooo0;
                Map map26 = (Map) this.f95108OooOoOO;
                Map map27 = (Map) this.f95106OooOoO;
                C24032OooOooO c24032OooOooO8 = (C24032OooOooO) this.f95107OooOoO0;
                list5 = (List) this.f95104OooOo;
                fileOooO0oO = this.f95105OooOo0o;
                C32446OooOOOo.OooO0O0(obj);
                c27351Oooo0O05 = c27351Oooo0O015;
                map2 = map27;
                abstractC30978OooO = abstractC30978OooO11;
                c24032OooOooO = c24032OooOooO8;
                diskVendor = diskVendor8;
                str15 = "";
                str10 = "BackupUseCase";
                str16 = BackupFile.FILE_PROPERTY_CONTENT_ID;
                str18 = "folder_tree";
                map = map26;
                str17 = ", cost ";
                f = f20;
                objOooO00o = obj;
                str5 = ", deleteResult: ";
                backupFile = (BackupFile) objOooO00o;
                if (backupFile == null) {
                }
                long jCurrentTimeMillis42 = System.currentTimeMillis();
                it6 = list5.iterator();
                str21 = str17;
                str22 = str18;
                abstractC30978OooO3 = abstractC30978OooO;
                j4 = jCurrentTimeMillis42;
                i = 0;
                c27351Oooo0O06 = c27351Oooo0O05;
                f4 = f;
                c27351Oooo0O07 = c27351Oooo0O06;
                if (!it6.hasNext()) {
                }
                r2 = file3;
                C34406OooO00o.C20358OooO00o c20358OooO00o42222222222222222222222222 = C34406OooO00o.f123390OooO00o;
                c20358OooO00o42222222222222222222222222.OooOOO0(str3);
                c20358OooO00o42222222222222222222222222.OooO0Oo(e, "backup error final.", new Object[0]);
                throw e;
            case 8:
                int i6 = this.f95119Oooo0OO;
                str = "backup finally, delete outputDir, outputDir: ";
                long j16 = this.f95118Oooo0O0;
                float f21 = this.f95114Oooo0;
                File file21 = (File) this.f95112OooOooo;
                MyTemplate myTemplate5 = (MyTemplate) this.f95111OooOooO;
                Iterator it20 = (Iterator) this.f95109OooOoo;
                AbstractC30978OooO abstractC30978OooO16 = (AbstractC30978OooO) this.f95110OooOoo0;
                C27351Oooo0O0 c27351Oooo0O020 = (C27351Oooo0O0) this.f95108OooOoOO;
                Map map28 = (Map) this.f95106OooOoO;
                Map map29 = (Map) this.f95107OooOoO0;
                C24032OooOooO c24032OooOooO9 = (C24032OooOooO) this.f95104OooOo;
                File file22 = this.f95105OooOo0o;
                C32446OooOOOo.OooO0O0(obj);
                file12 = file22;
                myTemplate = myTemplate5;
                str21 = ", cost ";
                f6 = f21;
                abstractC30978OooO = abstractC30978OooO11;
                abstractC30978OooO5 = abstractC30978OooO16;
                c27351Oooo0O06 = c27351Oooo0O015;
                c27351Oooo0O09 = c27351Oooo0O020;
                str30 = "";
                map9 = map28;
                i2 = i6;
                str5 = ", deleteResult: ";
                file11 = file21;
                str22 = "folder_tree";
                str31 = BackupFile.FILE_PROPERTY_CONTENT_ID;
                objOooO0OO = obj;
                str29 = CacheKeyValueDelegate.CACHE_VALUE_SEPARATOR;
                diskVendor = diskVendor8;
                c24032OooOooO2 = c24032OooOooO9;
                str10 = "BackupUseCase";
                j5 = j16;
                it7 = it20;
                map10 = map29;
                backupFile2 = (BackupFile) objOooO0OO;
                if (backupFile2 == null) {
                }
                map9.put(file11.getName(), myTemplate2.getId());
                if (abstractC30978OooO5 != null) {
                }
                str20 = str33;
                abstractC30978OooO3 = abstractC30978OooO5;
                c24032OooOooO = c24032OooOooO2;
                map = map9;
                j4 = j5;
                str42 = str29;
                fileOooO0oO = file13;
                str19 = str32;
                c27351Oooo0O07 = c27351Oooo0O09;
                map2 = map10;
                it6 = it7;
                f4 = f7;
                i = i2;
                if (!it6.hasNext()) {
                }
                r2 = file3;
                C34406OooO00o.C20358OooO00o c20358OooO00o422222222222222222222222222 = C34406OooO00o.f123390OooO00o;
                c20358OooO00o422222222222222222222222222.OooOOO0(str3);
                c20358OooO00o422222222222222222222222222.OooO0Oo(e, "backup error final.", new Object[0]);
                throw e;
            case 9:
                long j17 = this.f95118Oooo0O0;
                float f22 = this.f95114Oooo0;
                Map map30 = (Map) this.f95107OooOoO0;
                C24032OooOooO c24032OooOooO10 = (C24032OooOooO) this.f95104OooOo;
                File file23 = this.f95105OooOo0o;
                C32446OooOOOo.OooO0O0(obj);
                enumC32485OooO00o5 = enumC32485OooO00o7;
                str25 = CacheKeyValueDelegate.CACHE_VALUE_SEPARATOR;
                str3 = "BackupUseCase";
                str27 = ", deleteResult: ";
                c27351Oooo0O08 = c27351Oooo0O015;
                c24032OooOooO = c24032OooOooO10;
                abstractC30978OooO4 = abstractC30978OooO11;
                str23 = "";
                str24 = BackupFile.FILE_PROPERTY_CONTENT_ID;
                str26 = ", cost ";
                diskVendor2 = diskVendor8;
                str4 = "backup finally, delete outputDir, outputDir: ";
                file10 = file23;
                objOooOO0O = obj;
                f5 = f22;
                jCurrentTimeMillis2 = j17;
                map8 = map30;
                Iterable iterable2 = (Iterable) objOooOO0O;
                arrayList3 = new ArrayList();
                while (r21.hasNext()) {
                    break;
                }
                file3 = file10;
                C24032OooOooO c24032OooOooO52 = c24032OooOooO;
                long j122 = jCurrentTimeMillis2;
                str34 = str24;
                if (!arrayList3.isEmpty()) {
                }
                long jCurrentTimeMillis52 = System.currentTimeMillis();
                C34406OooO00o.C20358OooO00o c20358OooO00o112 = C34406OooO00o.f123390OooO00o;
                c20358OooO00o112.OooOOO0(str3);
                String strOooO00o32 = C31430OooO00o.OooO00o(jCurrentTimeMillis52 - j122);
                int size52 = arrayList4.size();
                StringBuilder sb82 = new StringBuilder();
                str35 = str27;
                sb82.append("backup, getRemoteBackupFiles cost ");
                sb82.append(strOooO00o32);
                sb82.append(", remoteBackupFiles size: ");
                sb82.append(size52);
                sb82.append(".");
                c20358OooO00o112.OooO0o0(sb82.toString(), new Object[0]);
                LinkedHashMap linkedHashMap32 = new LinkedHashMap();
                while (r7.hasNext()) {
                }
                LinkedHashMap linkedHashMap42 = new LinkedHashMap();
                while (r3.hasNext()) {
                }
                ArrayList arrayList82 = new ArrayList();
                it8 = linkedHashMap42.entrySet().iterator();
                while (it8.hasNext()) {
                }
                C24033OooOooo c24033OooOooo32 = new C24033OooOooo();
                ArrayList arrayList92 = new ArrayList();
                while (r13.hasNext()) {
                }
                C24033OooOooo c24033OooOooo52 = c24033OooOooo32;
                LinkedHashMap linkedHashMap52 = new LinkedHashMap(oO0O00oo.OooOO0.OooO0OO(oOo000Oo.Oooo0.OooO0Oo(C34428OooOOo.OooOOoo(arrayList92, 10))));
                while (r7.hasNext()) {
                }
                C34406OooO00o.C20358OooO00o c20358OooO00o122 = C34406OooO00o.f123390OooO00o;
                c20358OooO00o122.OooOOO0(str3);
                c20358OooO00o122.OooO0o0("backup, contentIdToRemoteFileMap.size = " + linkedHashMap52.size(), new Object[0]);
                it9 = map8.entrySet().iterator();
                c27351Oooo0O010 = c27351Oooo0O08;
                str36 = str34;
                c24032OooOooO3 = c24032OooOooO52;
                list8 = arrayList82;
                fileOooO0oO = file3;
                abstractC30978OooO6 = abstractC30978OooO4;
                c27351Oooo0O011 = c27351Oooo0O010;
                diskVendor3 = diskVendor2;
                str37 = str26;
                diskVendor4 = diskVendor3;
                map11 = map8;
                f8 = f5;
                str38 = str4;
                map12 = linkedHashMap52;
                c24033OooOooo = c24033OooOooo52;
                abstractC30978OooO7 = abstractC30978OooO6;
                if (it9.hasNext()) {
                }
                break;
            case 10:
                long j18 = this.f95118Oooo0O0;
                float f23 = this.f95114Oooo0;
                BackupFile backupFile8 = (BackupFile) this.f95117Oooo00o;
                BackupFile backupFile9 = (BackupFile) this.f95116Oooo00O;
                Iterator it21 = this.f95115Oooo000;
                AbstractC30978OooO abstractC30978OooO17 = (AbstractC30978OooO) this.f95112OooOooo;
                BackupFile.DiskVendor diskVendor10 = (BackupFile.DiskVendor) this.f95111OooOooO;
                C27351Oooo0O0 c27351Oooo0O021 = (C27351Oooo0O0) this.f95109OooOoo;
                Map map31 = (Map) this.f95110OooOoo0;
                C24033OooOooo c24033OooOooo6 = (C24033OooOooo) this.f95108OooOoOO;
                List list17 = (List) this.f95106OooOoO;
                Map map32 = (Map) this.f95107OooOoO0;
                C24032OooOooO c24032OooOooO11 = (C24032OooOooO) this.f95104OooOo;
                fileOooO0oO = this.f95105OooOo0o;
                C32446OooOOOo.OooO0O0(obj);
                str35 = ", deleteResult: ";
                it10 = it21;
                enumC32485OooO00o6 = enumC32485OooO00o7;
                f9 = f23;
                c24032OooOooO3 = c24032OooOooO11;
                str36 = BackupFile.FILE_PROPERTY_CONTENT_ID;
                map13 = map31;
                backupFile3 = backupFile9;
                str38 = "backup finally, delete outputDir, outputDir: ";
                abstractC30978OooO8 = abstractC30978OooO17;
                str37 = ", cost ";
                map14 = map32;
                str23 = "";
                diskVendor5 = diskVendor10;
                diskVendor3 = diskVendor8;
                c27351Oooo0O012 = c27351Oooo0O021;
                c27351Oooo0O010 = c27351Oooo0O015;
                backupFile4 = backupFile8;
                abstractC30978OooO7 = abstractC30978OooO11;
                list8 = list17;
                str39 = CacheKeyValueDelegate.CACHE_VALUE_SEPARATOR;
                str3 = "BackupUseCase";
                c24033OooOooo = c24033OooOooo6;
                j6 = j18;
                EnumC32485OooO00o enumC32485OooO00o132 = enumC32485OooO00o6;
                iIntValue = ((Number) obj).intValue();
                long jCurrentTimeMillis72 = System.currentTimeMillis();
                f10 = f9;
                C34406OooO00o.C20358OooO00o c20358OooO00o162 = C34406OooO00o.f123390OooO00o;
                c20358OooO00o162.OooOOO0(str3);
                Iterator it172 = it10;
                String strOooO0O052 = C31430OooO00o.OooO0O0(j6);
                AbstractC30978OooO abstractC30978OooO132 = abstractC30978OooO8;
                String strOooO0O062 = C31430OooO00o.OooO0O0(jCurrentTimeMillis72);
                long j132 = jCurrentTimeMillis72 - j6;
                BackupFile.DiskVendor diskVendor92 = diskVendor5;
                String strOooO00o42 = C31430OooO00o.OooO00o(j132);
                C27351Oooo0O0 c27351Oooo0O0172 = c27351Oooo0O012;
                StringBuilder sb102 = new StringBuilder();
                Map map192 = map13;
                sb102.append("backup, uploadBackupFile during ");
                sb102.append(strOooO0O052);
                str40 = str39;
                sb102.append(str40);
                sb102.append(strOooO0O062);
                str41 = str37;
                sb102.append(str41);
                sb102.append(strOooO00o42);
                sb102.append(", result = ");
                sb102.append(iIntValue);
                c20358OooO00o162.OooO0o0(sb102.toString(), new Object[0]);
                if (iIntValue != 0) {
                }
                break;
            case 11:
                float f24 = this.f95114Oooo0;
                Iterator it22 = this.f95115Oooo000;
                AbstractC30978OooO abstractC30978OooO18 = (AbstractC30978OooO) this.f95112OooOooo;
                diskVendor6 = (BackupFile.DiskVendor) this.f95111OooOooO;
                C27351Oooo0O0 c27351Oooo0O022 = (C27351Oooo0O0) this.f95109OooOoo;
                Map map33 = (Map) this.f95110OooOoo0;
                C24033OooOooo c24033OooOooo7 = (C24033OooOooo) this.f95108OooOoOO;
                List list18 = (List) this.f95106OooOoO;
                Map map34 = (Map) this.f95107OooOoO0;
                C24032OooOooO c24032OooOooO12 = (C24032OooOooO) this.f95104OooOo;
                File file24 = this.f95105OooOo0o;
                C32446OooOOOo.OooO0O0(obj);
                abstractC30978OooO7 = abstractC30978OooO11;
                list8 = list18;
                diskVendor3 = diskVendor8;
                c27351Oooo0O014 = c27351Oooo0O022;
                str23 = "";
                str36 = BackupFile.FILE_PROPERTY_CONTENT_ID;
                abstractC30978OooO9 = abstractC30978OooO18;
                f10 = f24;
                c24032OooOooO3 = c24032OooOooO12;
                str38 = "backup finally, delete outputDir, outputDir: ";
                str41 = ", cost ";
                map14 = map34;
                c27351Oooo0O010 = c27351Oooo0O015;
                it11 = it22;
                map15 = map33;
                str35 = ", deleteResult: ";
                str40 = CacheKeyValueDelegate.CACHE_VALUE_SEPARATOR;
                str3 = "BackupUseCase";
                c24033OooOooo = c24033OooOooo7;
                file14 = file24;
                enumC32485OooO00o2 = enumC32485OooO00o7;
                c27351Oooo0O013 = c27351Oooo0O014;
                diskVendor4 = diskVendor6;
                map12 = map15;
                map11 = map14;
                f8 = f10;
                if (abstractC30978OooO9 != null) {
                }
                Iterator it152222 = it11;
                enumC32485OooO00o5 = enumC32485OooO00o2;
                fileOooO0oO = file14;
                str37 = str41;
                it9 = it152222;
                str25 = str40;
                abstractC30978OooO6 = abstractC30978OooO9;
                c27351Oooo0O011 = c27351Oooo0O013;
                if (it9.hasNext()) {
                }
                break;
            case 12:
                r2 = this.f95105OooOo0o;
                try {
                    C32446OooOOOo.OooO0O0(obj);
                    str35 = ", deleteResult: ";
                    str38 = "backup finally, delete outputDir, outputDir: ";
                    abstractC30978OooO7 = abstractC30978OooO11;
                    str3 = "BackupUseCase";
                    r24 = r2;
                    if (abstractC30978OooO7 != null) {
                    }
                    boolean zOooO0oo42 = C31190OooO0oo.OooO0oo(r24);
                    C34406OooO00o.C20358OooO00o c20358OooO00o152 = C34406OooO00o.f123390OooO00o;
                    c20358OooO00o152.OooOOO0(str3);
                    c20358OooO00o152.OooO0o0(str38 + r24 + str35 + zOooO0oo42, new Object[0]);
                    return C32460OooOooO.f116667OooO00o;
                } catch (Exception e40) {
                    e = e40;
                    str2 = ", deleteResult: ";
                    str4 = "backup finally, delete outputDir, outputDir: ";
                    str3 = "BackupUseCase";
                    r2 = r2;
                    C34406OooO00o.C20358OooO00o c20358OooO00o4222222222222222222222222222 = C34406OooO00o.f123390OooO00o;
                    c20358OooO00o4222222222222222222222222222.OooOOO0(str3);
                    c20358OooO00o4222222222222222222222222222.OooO0Oo(e, "backup error final.", new Object[0]);
                    throw e;
                } catch (Throwable th41) {
                    th = th41;
                    str2 = ", deleteResult: ";
                    str4 = "backup finally, delete outputDir, outputDir: ";
                    str3 = "BackupUseCase";
                    boolean zOooO0oo22222222222222222222222222222222 = C31190OooO0oo.OooO0oo(r2);
                    C34406OooO00o.C20358OooO00o c20358OooO00o522222222222222222222222222222222 = C34406OooO00o.f123390OooO00o;
                    c20358OooO00o522222222222222222222222222222222.OooOOO0(str3);
                    c20358OooO00o522222222222222222222222222222222.OooO0o0(str4 + r2 + str2 + zOooO0oo22222222222222222222222222222222, new Object[0]);
                    throw th;
                }
            default:
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }
}
