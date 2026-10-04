package o0OOo0o;

import androidx.fragment.app.C21904OooOoo0;
import com.microsoft.identity.common.java.marker.PerfConstants;
import com.orion.notein.domain.models.note.NoteContent;
import com.orion.notein.domain.models.note.NoteInFile;
import com.orion.notein.domain.models.note.NoteMeta;
import com.orion.notein.domain.models.page.Page;
import com.orion.notein.domain.models.papertheme.PaperTheme;
import com.orion.notein.domain.models.papertheme.PdfPaperTheme;
import java.io.File;
import java.io.FileFilter;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.UUID;
import kotlin.coroutines.Continuation;
import o00ooO0.C25749OooOoO0;
import o0OOO0OO.C27020OooOoO0;
import o0OOo0Oo.InterfaceC27309OooOoO;
import o0OOo0Oo.InterfaceC27313OooOoo0;
import o0OOo0o.C27387o0000o0;
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
import oO0O000o.InterfaceC32507OooOO0o;
import oO0O000o.InterfaceC32508OooOOOo;
import oO0o0O0o.C33599OooOo0O;
import oO0o0OO.InterfaceC33636Oooo00o;
import oOO00oo.C34406OooO00o;
import oOo000Oo.C34428OooOOo;
import oOo000Oo.C34436OooOoOO;
import oOo000Oo.C34438OooOoo0;
import oOo000Oo.C34444Oooo0O0;
import oOo000Oo.C34449Oooo0oo;

/* JADX INFO: renamed from: o0OOo0o.o000O0o, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
@InterfaceC32482OooO0o0(m80622c = "com.orion.notein.domain.usecase.NoteInFileUseCase$createNoteInFileByPages$2", m80623f = "NoteInFileUseCase.kt", m80624l = {464, 466, 478, 482, 484, 486, 492, 494, 496, 515, 525, 536, 558, 567}, m80625m = "invokeSuspend")
public final class C27399o000O0o extends AbstractC32476OooO implements InterfaceC32508OooOOOo<InterfaceC33636Oooo00o, Continuation<? super NoteInFile>, Object> {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public Object f95560OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public InterfaceC32507OooOO0o f95561OooOo0o;

    /* JADX INFO: renamed from: OooOoO, reason: collision with root package name */
    public Object f95562OooOoO;

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public NoteMeta f95563OooOoO0;

    /* JADX INFO: renamed from: OooOoOO, reason: collision with root package name */
    public Object f95564OooOoOO;

    /* JADX INFO: renamed from: OooOoo, reason: collision with root package name */
    public Object f95565OooOoo;

    /* JADX INFO: renamed from: OooOoo0, reason: collision with root package name */
    public Object f95566OooOoo0;

    /* JADX INFO: renamed from: OooOooO, reason: collision with root package name */
    public Map f95567OooOooO;

    /* JADX INFO: renamed from: OooOooo, reason: collision with root package name */
    public Map f95568OooOooo;

    /* JADX INFO: renamed from: Oooo0, reason: collision with root package name */
    public int f95569Oooo0;

    /* JADX INFO: renamed from: Oooo000, reason: collision with root package name */
    public LinkedHashMap f95570Oooo000;

    /* JADX INFO: renamed from: Oooo00O, reason: collision with root package name */
    public long f95571Oooo00O;

    /* JADX INFO: renamed from: Oooo00o, reason: collision with root package name */
    public long f95572Oooo00o;

    /* JADX INFO: renamed from: Oooo0O0, reason: collision with root package name */
    public final /* synthetic */ C27387o0000o0 f95573Oooo0O0;

    /* JADX INFO: renamed from: Oooo0OO, reason: collision with root package name */
    public final /* synthetic */ String f95574Oooo0OO;

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    public final /* synthetic */ String f95575Oooo0o;

    /* JADX INFO: renamed from: Oooo0o0, reason: collision with root package name */
    public final /* synthetic */ Set<String> f95576Oooo0o0;

    /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
    public final /* synthetic */ C27387o0000o0.OooO0OO f95577Oooo0oO;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C27399o000O0o(C27387o0000o0 c27387o0000o0, String str, Set<String> set, String str2, C27387o0000o0.OooO0OO oooO0OO, Continuation<? super C27399o000O0o> continuation) {
        super(2, continuation);
        this.f95573Oooo0O0 = c27387o0000o0;
        this.f95574Oooo0OO = str;
        this.f95576Oooo0o0 = set;
        this.f95575Oooo0o = str2;
        this.f95577Oooo0oO = oooO0OO;
    }

    @Override // oO00ooo.AbstractC32477OooO00o
    public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
        return new C27399o000O0o(this.f95573Oooo0O0, this.f95574Oooo0OO, this.f95576Oooo0o0, this.f95575Oooo0o, this.f95577Oooo0oO, continuation);
    }

    @Override // oO0O000o.InterfaceC32508OooOOOo
    public final Object invoke(InterfaceC33636Oooo00o interfaceC33636Oooo00o, Continuation<? super NoteInFile> continuation) {
        return ((C27399o000O0o) create(interfaceC33636Oooo00o, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
    }

    /* JADX WARN: Can't wrap try/catch for region: R(14:141|(5:484|142|(2:144|593)|145|146)|(2:494|147)|(8:532|149|(1:151)(2:152|(1:603)(8:155|461|156|(4:159|(3:577|161|581)(1:580)|579|157)|578|165|(1:167)(3:168|(3:171|(11:583|173|480|179|180|549|181|(13:496|183|(2:185|190)(1:186)|187|191|192|552|193|194|543|195|196|(2:198|594)(16:199|26|564|200|(4:474|203|204|201)|576|207|208|209|556|210|211|530|212|213|(2:215|595)(18:216|528|217|(6:220|554|221|(2:223|573)(1:574)|224|218)|572|227|228|(3:231|232|229)|575|233|234|235|526|236|237|238|239|(2:241|596)(39:242|537|243|(3:246|247|244)|569|248|249|250|504|251|252|508|253|(4:255|(1:257)|258|263)|570|264|(2:267|265)|571|268|269|522|270|271|510|272|273|498|274|520|275|276|277|278|279|280|524|281|282|(1:604)(26:285|518|286|(4:469|289|290|287)|568|293|294|295|516|296|297|298|467|299|300|301|302|303|304|472|305|306|463|307|308|(1:597)(13:311|486|312|492|313|314|476|315|316|482|317|(15:541|319|(1:321)(1:322)|323|326|327|560|328|(6:535|331|(3:567|336|337)|340|341|329)|566|342|343|534|(4:345|346|347|348)(2:354|355)|350)(12:323|326|327|560|328|(1:329)|566|342|343|534|(0)(0)|350)|351))))))(0)|454|(1:456)|(2:458|459)(1:605))(1:584)|169)|582)|174))|164|11|454|(0)|(0)(0))|178|480|179|180|549|181|(0)(0)|454|(0)|(0)(0)) */
    /* JADX WARN: Can't wrap try/catch for region: R(19:141|484|142|(2:144|593)|145|146|494|147|(8:532|149|(1:151)(2:152|(1:603)(8:155|461|156|(4:159|(3:577|161|581)(1:580)|579|157)|578|165|(1:167)(3:168|(3:171|(11:583|173|480|179|180|549|181|(13:496|183|(2:185|190)(1:186)|187|191|192|552|193|194|543|195|196|(2:198|594)(16:199|26|564|200|(4:474|203|204|201)|576|207|208|209|556|210|211|530|212|213|(2:215|595)(18:216|528|217|(6:220|554|221|(2:223|573)(1:574)|224|218)|572|227|228|(3:231|232|229)|575|233|234|235|526|236|237|238|239|(2:241|596)(39:242|537|243|(3:246|247|244)|569|248|249|250|504|251|252|508|253|(4:255|(1:257)|258|263)|570|264|(2:267|265)|571|268|269|522|270|271|510|272|273|498|274|520|275|276|277|278|279|280|524|281|282|(1:604)(26:285|518|286|(4:469|289|290|287)|568|293|294|295|516|296|297|298|467|299|300|301|302|303|304|472|305|306|463|307|308|(1:597)(13:311|486|312|492|313|314|476|315|316|482|317|(15:541|319|(1:321)(1:322)|323|326|327|560|328|(6:535|331|(3:567|336|337)|340|341|329)|566|342|343|534|(4:345|346|347|348)(2:354|355)|350)(12:323|326|327|560|328|(1:329)|566|342|343|534|(0)(0)|350)|351))))))(0)|454|(1:456)|(2:458|459)(1:605))(1:584)|169)|582)|174))|164|11|454|(0)|(0)(0))|178|480|179|180|549|181|(0)(0)|454|(0)|(0)(0)) */
    /* JADX WARN: Code restructure failed: missing block: B:407:0x0fd6, code lost:
    
        r0 = e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:408:0x0fd7, code lost:
    
        r22 = r4;
        r10 = r14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:409:0x0fdb, code lost:
    
        r0 = e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:410:0x0fdc, code lost:
    
        r22 = r4;
        r10 = r23;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Not initialized variable reg: 21, insn: 0x02b3: MOVE (r2 I:??[OBJECT, ARRAY]) = (r21 I:??[OBJECT, ARRAY]), block:B:48:0x02b1 */
    /* JADX WARN: Not initialized variable reg: 22, insn: 0x0078: MOVE (r2 I:??[OBJECT, ARRAY]) = (r22 I:??[OBJECT, ARRAY]), block:B:10:0x0076 */
    /* JADX WARN: Not initialized variable reg: 23, insn: 0x00d5: MOVE (r2 I:??[OBJECT, ARRAY]) = (r23 I:??[OBJECT, ARRAY]), block:B:16:0x00d3 */
    /* JADX WARN: Path cross not found for [B:81:0x03c6, B:89:0x03fc], limit reached: 590 */
    /* JADX WARN: Removed duplicated region for block: B:100:0x0431 A[Catch: Exception -> 0x101a, TRY_LEAVE, TryCatch #41 {Exception -> 0x101a, blocks: (B:79:0x03c2, B:91:0x0404, B:92:0x0410, B:98:0x042b, B:100:0x0431, B:90:0x0402), top: B:539:0x03c2 }] */
    /* JADX WARN: Removed duplicated region for block: B:120:0x0502  */
    /* JADX WARN: Removed duplicated region for block: B:127:0x0566  */
    /* JADX WARN: Removed duplicated region for block: B:130:0x056e A[Catch: Exception -> 0x0fed, TryCatch #2 {Exception -> 0x0fed, blocks: (B:128:0x0568, B:130:0x056e, B:131:0x057d, B:138:0x05c0, B:125:0x052a, B:109:0x04c2, B:121:0x0506), top: B:465:0x04c2 }] */
    /* JADX WARN: Removed duplicated region for block: B:144:0x05f6  */
    /* JADX WARN: Removed duplicated region for block: B:159:0x065c A[Catch: Exception -> 0x066f, TryCatch #0 {Exception -> 0x066f, blocks: (B:156:0x064b, B:157:0x0656, B:159:0x065c, B:161:0x066b, B:165:0x0676, B:168:0x067d, B:169:0x0681, B:171:0x0687), top: B:461:0x064b }] */
    /* JADX WARN: Removed duplicated region for block: B:167:0x067c  */
    /* JADX WARN: Removed duplicated region for block: B:168:0x067d A[Catch: Exception -> 0x066f, TryCatch #0 {Exception -> 0x066f, blocks: (B:156:0x064b, B:157:0x0656, B:159:0x065c, B:161:0x066b, B:165:0x0676, B:168:0x067d, B:169:0x0681, B:171:0x0687), top: B:461:0x064b }] */
    /* JADX WARN: Removed duplicated region for block: B:185:0x06e4  */
    /* JADX WARN: Removed duplicated region for block: B:215:0x0882  */
    /* JADX WARN: Removed duplicated region for block: B:216:0x0885  */
    /* JADX WARN: Removed duplicated region for block: B:220:0x08aa  */
    /* JADX WARN: Removed duplicated region for block: B:231:0x08e4 A[Catch: Exception -> 0x08bf, TRY_ENTER, TRY_LEAVE, TryCatch #51 {Exception -> 0x08bf, blocks: (B:246:0x09ce, B:221:0x08ac, B:223:0x08b9, B:231:0x08e4), top: B:554:0x08ac }] */
    /* JADX WARN: Removed duplicated region for block: B:241:0x09a1  */
    /* JADX WARN: Removed duplicated region for block: B:242:0x09a4  */
    /* JADX WARN: Removed duplicated region for block: B:246:0x09ce A[Catch: Exception -> 0x08bf, TRY_ENTER, TRY_LEAVE, TryCatch #51 {Exception -> 0x08bf, blocks: (B:246:0x09ce, B:221:0x08ac, B:223:0x08b9, B:231:0x08e4), top: B:554:0x08ac }] */
    /* JADX WARN: Removed duplicated region for block: B:255:0x0a84 A[Catch: Exception -> 0x0a95, TryCatch #24 {Exception -> 0x0a95, blocks: (B:253:0x0a39, B:255:0x0a84, B:257:0x0a8f, B:263:0x0a9d, B:264:0x0aa0, B:265:0x0ab7, B:267:0x0abd, B:268:0x0b01), top: B:508:0x0a39 }] */
    /* JADX WARN: Removed duplicated region for block: B:267:0x0abd A[Catch: Exception -> 0x0a95, LOOP:4: B:265:0x0ab7->B:267:0x0abd, LOOP_END, TryCatch #24 {Exception -> 0x0a95, blocks: (B:253:0x0a39, B:255:0x0a84, B:257:0x0a8f, B:263:0x0a9d, B:264:0x0aa0, B:265:0x0ab7, B:267:0x0abd, B:268:0x0b01), top: B:508:0x0a39 }] */
    /* JADX WARN: Removed duplicated region for block: B:285:0x0b85  */
    /* JADX WARN: Removed duplicated region for block: B:311:0x0c91  */
    /* JADX WARN: Removed duplicated region for block: B:323:0x0d1c A[PHI: r53
      0x0d1c: PHI (r53v2 com.orion.notein.domain.models.note.NoteMeta) = 
      (r53v0 com.orion.notein.domain.models.note.NoteMeta)
      (r53v1 com.orion.notein.domain.models.note.NoteMeta)
      (r53v0 com.orion.notein.domain.models.note.NoteMeta)
     binds: [B:318:0x0ce2, B:322:0x0ceb, B:321:0x0cea] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:345:0x0eb3 A[Catch: Exception -> 0x0f3a, TRY_LEAVE, TryCatch #54 {Exception -> 0x0f3a, blocks: (B:328:0x0d41, B:329:0x0de4, B:343:0x0e44, B:345:0x0eb3), top: B:560:0x0d41 }] */
    /* JADX WARN: Removed duplicated region for block: B:354:0x0f3e A[Catch: Exception -> 0x0f32, TryCatch #38 {Exception -> 0x0f32, blocks: (B:347:0x0f27, B:354:0x0f3e, B:355:0x0f58), top: B:534:0x0eb1 }] */
    /* JADX WARN: Removed duplicated region for block: B:420:0x0ff0  */
    /* JADX WARN: Removed duplicated region for block: B:435:0x101f  */
    /* JADX WARN: Removed duplicated region for block: B:443:0x1040  */
    /* JADX WARN: Removed duplicated region for block: B:456:0x1075  */
    /* JADX WARN: Removed duplicated region for block: B:458:0x107a  */
    /* JADX WARN: Removed duplicated region for block: B:469:0x0bb7 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:474:0x07b3 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:496:0x06de A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:514:0x04c8 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:532:0x061e A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:535:0x0dea A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:541:0x0ce4 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:597:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:604:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:605:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:75:0x03a8 A[Catch: Exception -> 0x103b, TRY_LEAVE, TryCatch #53 {Exception -> 0x103b, blocks: (B:73:0x03a4, B:75:0x03a8), top: B:558:0x03a4 }] */
    /* JADX WARN: Removed duplicated region for block: B:94:0x0416 A[Catch: Exception -> 0x0354, TRY_ENTER, TryCatch #48 {Exception -> 0x0354, blocks: (B:56:0x0342, B:81:0x03c6, B:83:0x03cc, B:84:0x03e3, B:86:0x03e9, B:87:0x03f7, B:94:0x0416, B:96:0x0425, B:62:0x035f), top: B:471:0x001f }] */
    /* JADX WARN: Type inference failed for: r15v59, types: [java.lang.StringBuilder] */
    /* JADX WARN: Type inference failed for: r16v5, types: [oO0O000o.OooOO0o] */
    /* JADX WARN: Type inference failed for: r19v30 */
    /* JADX WARN: Type inference failed for: r19v31 */
    /* JADX WARN: Type inference failed for: r19v32 */
    /* JADX WARN: Type inference failed for: r19v33 */
    /* JADX WARN: Type inference failed for: r22v20 */
    /* JADX WARN: Type inference failed for: r22v21 */
    /* JADX WARN: Type inference failed for: r22v22 */
    /* JADX WARN: Type inference failed for: r22v23 */
    /* JADX WARN: Type inference failed for: r22v24 */
    /* JADX WARN: Type inference failed for: r22v25 */
    /* JADX WARN: Type inference failed for: r22v36 */
    /* JADX WARN: Type inference failed for: r22v37 */
    /* JADX WARN: Type inference failed for: r22v38, types: [oO0O000o.OooOO0o] */
    /* JADX WARN: Type inference failed for: r22v39 */
    /* JADX WARN: Type inference failed for: r22v40 */
    /* JADX WARN: Type inference failed for: r22v41 */
    /* JADX WARN: Type inference failed for: r22v42 */
    /* JADX WARN: Type inference failed for: r22v43 */
    /* JADX WARN: Type inference failed for: r22v44 */
    /* JADX WARN: Type inference failed for: r22v45 */
    /* JADX WARN: Type inference failed for: r22v50 */
    /* JADX WARN: Type inference failed for: r22v51 */
    /* JADX WARN: Type inference failed for: r2v100 */
    /* JADX WARN: Type inference failed for: r2v103 */
    /* JADX WARN: Type inference failed for: r2v183 */
    /* JADX WARN: Type inference failed for: r2v184 */
    /* JADX WARN: Type inference failed for: r2v186 */
    /* JADX WARN: Type inference failed for: r2v187 */
    /* JADX WARN: Type inference failed for: r2v188 */
    /* JADX WARN: Type inference failed for: r2v189 */
    /* JADX WARN: Type inference failed for: r2v194 */
    /* JADX WARN: Type inference failed for: r2v210, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r2v227 */
    /* JADX WARN: Type inference failed for: r2v228 */
    /* JADX WARN: Type inference failed for: r2v229 */
    /* JADX WARN: Type inference failed for: r2v230 */
    /* JADX WARN: Type inference failed for: r2v231 */
    /* JADX WARN: Type inference failed for: r2v232 */
    /* JADX WARN: Type inference failed for: r2v233 */
    /* JADX WARN: Type inference failed for: r2v234 */
    /* JADX WARN: Type inference failed for: r2v78 */
    /* JADX WARN: Type inference failed for: r2v83, types: [oO0O000o.OooOO0o] */
    /* JADX WARN: Type inference failed for: r2v87 */
    /* JADX WARN: Type inference failed for: r2v89 */
    /* JADX WARN: Type inference failed for: r2v90, types: [oO0O000o.OooOO0o] */
    /* JADX WARN: Type inference failed for: r4v0, types: [int] */
    /* JADX WARN: Type inference failed for: r4v1 */
    /* JADX WARN: Type inference failed for: r4v107 */
    /* JADX WARN: Type inference failed for: r4v108 */
    /* JADX WARN: Type inference failed for: r4v109 */
    /* JADX WARN: Type inference failed for: r4v13 */
    /* JADX WARN: Type inference failed for: r4v16, types: [oO0O000o.OooOO0o] */
    /* JADX WARN: Type inference failed for: r4v18 */
    /* JADX WARN: Type inference failed for: r4v26 */
    /* JADX WARN: Type inference failed for: r4v43 */
    /* JADX WARN: Type inference failed for: r4v46, types: [oO0O000o.OooOO0o] */
    /* JADX WARN: Type inference failed for: r4v49 */
    /* JADX WARN: Type inference failed for: r4v50 */
    /* JADX WARN: Type inference failed for: r4v54 */
    /* JADX WARN: Type inference failed for: r4v83 */
    /* JADX WARN: Type inference failed for: r4v92, types: [oO0O000o.OooOO0o] */
    /* JADX WARN: Type inference failed for: r4v96 */
    /* JADX WARN: Type inference failed for: r5v10, types: [oO0O000o.OooOO0o] */
    /* JADX WARN: Type inference failed for: r5v11 */
    /* JADX WARN: Type inference failed for: r5v12 */
    /* JADX WARN: Type inference failed for: r5v13, types: [oO0O000o.OooOO0o] */
    /* JADX WARN: Type inference failed for: r5v14 */
    /* JADX WARN: Type inference failed for: r5v15 */
    /* JADX WARN: Type inference failed for: r5v16 */
    /* JADX WARN: Type inference failed for: r5v17 */
    /* JADX WARN: Type inference failed for: r5v18, types: [oO0O000o.OooOO0o] */
    /* JADX WARN: Type inference failed for: r5v19 */
    /* JADX WARN: Type inference failed for: r5v8 */
    /* JADX WARN: Type inference failed for: r5v86 */
    /* JADX WARN: Type inference failed for: r5v87 */
    /* JADX WARN: Type inference failed for: r5v88 */
    /* JADX WARN: Type inference failed for: r5v89 */
    /* JADX WARN: Type inference failed for: r6v39 */
    /* JADX WARN: Type inference failed for: r6v43, types: [oO0O000o.OooOO0o] */
    /* JADX WARN: Type inference failed for: r6v46 */
    /* JADX WARN: Type inference failed for: r7v1 */
    /* JADX WARN: Type inference failed for: r7v10 */
    /* JADX WARN: Type inference failed for: r7v103 */
    /* JADX WARN: Type inference failed for: r7v108 */
    /* JADX WARN: Type inference failed for: r7v109 */
    /* JADX WARN: Type inference failed for: r7v11 */
    /* JADX WARN: Type inference failed for: r7v110 */
    /* JADX WARN: Type inference failed for: r7v111 */
    /* JADX WARN: Type inference failed for: r7v112 */
    /* JADX WARN: Type inference failed for: r7v113 */
    /* JADX WARN: Type inference failed for: r7v114 */
    /* JADX WARN: Type inference failed for: r7v115 */
    /* JADX WARN: Type inference failed for: r7v116 */
    /* JADX WARN: Type inference failed for: r7v117 */
    /* JADX WARN: Type inference failed for: r7v118 */
    /* JADX WARN: Type inference failed for: r7v119 */
    /* JADX WARN: Type inference failed for: r7v12 */
    /* JADX WARN: Type inference failed for: r7v120 */
    /* JADX WARN: Type inference failed for: r7v121 */
    /* JADX WARN: Type inference failed for: r7v122 */
    /* JADX WARN: Type inference failed for: r7v123 */
    /* JADX WARN: Type inference failed for: r7v124 */
    /* JADX WARN: Type inference failed for: r7v13 */
    /* JADX WARN: Type inference failed for: r7v15 */
    /* JADX WARN: Type inference failed for: r7v2 */
    /* JADX WARN: Type inference failed for: r7v23 */
    /* JADX WARN: Type inference failed for: r7v24 */
    /* JADX WARN: Type inference failed for: r7v3 */
    /* JADX WARN: Type inference failed for: r7v30 */
    /* JADX WARN: Type inference failed for: r7v31 */
    /* JADX WARN: Type inference failed for: r7v35 */
    /* JADX WARN: Type inference failed for: r7v4 */
    /* JADX WARN: Type inference failed for: r7v42 */
    /* JADX WARN: Type inference failed for: r7v43 */
    /* JADX WARN: Type inference failed for: r7v45 */
    /* JADX WARN: Type inference failed for: r7v46 */
    /* JADX WARN: Type inference failed for: r7v5 */
    /* JADX WARN: Type inference failed for: r7v50 */
    /* JADX WARN: Type inference failed for: r7v57 */
    /* JADX WARN: Type inference failed for: r7v6 */
    /* JADX WARN: Type inference failed for: r7v60 */
    /* JADX WARN: Type inference failed for: r7v61 */
    /* JADX WARN: Type inference failed for: r7v62 */
    /* JADX WARN: Type inference failed for: r7v64, types: [oO0O000o.OooOO0o] */
    /* JADX WARN: Type inference failed for: r7v65 */
    /* JADX WARN: Type inference failed for: r7v66 */
    /* JADX WARN: Type inference failed for: r7v67 */
    /* JADX WARN: Type inference failed for: r7v68 */
    /* JADX WARN: Type inference failed for: r7v7 */
    /* JADX WARN: Type inference failed for: r7v70 */
    /* JADX WARN: Type inference failed for: r7v78 */
    /* JADX WARN: Type inference failed for: r7v8 */
    /* JADX WARN: Type inference failed for: r7v80 */
    /* JADX WARN: Type inference failed for: r7v81 */
    /* JADX WARN: Type inference failed for: r7v82 */
    /* JADX WARN: Type inference failed for: r7v86 */
    /* JADX WARN: Type inference failed for: r7v89 */
    /* JADX WARN: Type inference failed for: r7v9, types: [oO0O000o.OooOO0o] */
    /* JADX WARN: Type inference failed for: r7v90 */
    /* JADX WARN: Type inference failed for: r7v91 */
    /* JADX WARN: Type inference failed for: r7v97 */
    /* JADX WARN: Type inference failed for: r7v99 */
    /* JADX WARN: Type inference failed for: r83v10 */
    /* JADX WARN: Type inference failed for: r83v8 */
    /* JADX WARN: Type inference failed for: r83v9 */
    /* JADX WARN: Type inference failed for: r8v56, types: [java.lang.StringBuilder] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:114:0x04f5 -> B:115:0x04f7). Please report as a decompilation issue!!! */
    @Override // oO00ooo.AbstractC32477OooO00o
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) throws Throwable {
        ?? r7;
        String str;
        String str2;
        String str3;
        ?? r72;
        ?? r73;
        String str4;
        String str5;
        File file;
        ?? r74;
        String str6;
        String str7;
        InterfaceC32507OooOO0o interfaceC32507OooOO0o;
        long jCurrentTimeMillis;
        InterfaceC27313OooOoo0 interfaceC27313OooOoo0;
        String strOooO0Oo;
        Object objOooO0oo;
        InterfaceC32507OooOO0o interfaceC32507OooOO0o2;
        NoteMeta noteMeta;
        Object objOooOO0o;
        NoteMeta noteMeta2;
        NoteContent noteContent;
        String str8;
        String str9;
        String str10;
        Set setO0OO00O;
        ArrayList arrayList;
        Iterator it;
        String string;
        ?? r75;
        Set<String> set;
        String str11;
        Set set2;
        String str12;
        List<Page> pages;
        ?? r4;
        ?? r83;
        String str13;
        Set set3;
        Iterator it2;
        ?? r5;
        C27387o0000o0 c27387o0000o0;
        String str14;
        String str15;
        String str16;
        C27387o0000o0 c27387o0000o02;
        C27449o00O0OoO c27449o00O0OoO;
        Iterator it3;
        String str17;
        C27387o0000o0 c27387o0000o03;
        Set set4;
        String str18;
        ?? r52;
        ?? r53;
        Object objOooOO0o2;
        ?? r76;
        NoteContent noteContent2;
        Set<String> set5;
        ?? r2;
        C27387o0000o0 c27387o0000o04;
        String str19;
        Object objOoooOO0;
        ?? r22;
        String str20;
        C27387o0000o0 c27387o0000o05;
        String str21;
        String str22;
        ?? r77;
        Object objOooO;
        ?? r42;
        String str23;
        NoteMeta noteMeta3;
        String str24;
        boolean z;
        String str25;
        ?? r43;
        ?? r222;
        Set<String> set6;
        Map mapOooO0o0;
        String str26;
        String str27;
        String str28;
        C27387o0000o0 c27387o0000o06;
        String str29;
        EnumC32485OooO00o enumC32485OooO00o;
        Object obj2;
        long j;
        Map map;
        String str30;
        ?? r6;
        long j2;
        String str31;
        String str32;
        ?? r23;
        ArrayList arrayList2;
        ?? r19;
        Set<String> set7;
        LinkedHashMap linkedHashMap;
        Iterator it4;
        long j3;
        String str33;
        String str34;
        long j4;
        String str35;
        C27387o0000o0 c27387o0000o07;
        Object objOooOOOo;
        EnumC32485OooO00o enumC32485OooO00o2;
        Set<String> set8;
        EnumC32485OooO00o enumC32485OooO00o3;
        Map map2;
        long j5;
        Map map3;
        String str36;
        NoteMeta noteMeta4;
        String str37;
        ?? r78;
        long j6;
        LinkedHashMap linkedHashMap2;
        Iterator it5;
        Map map4;
        String str38;
        long j7;
        Set<String> set9;
        C27387o0000o0 c27387o0000o08;
        Object objOooOOoo;
        EnumC32485OooO00o enumC32485OooO00o4;
        long j8;
        Map map5;
        Map map6;
        Map map7;
        String str39;
        ?? r79;
        Set<String> set10;
        LinkedHashMap linkedHashMap3;
        Iterator it6;
        Map map8;
        String str40;
        ?? r223;
        ?? r224;
        Map map9;
        LinkedHashMap linkedHashMap4;
        long jCurrentTimeMillis2;
        String str41;
        String str42;
        String str43;
        Map map10;
        long j9;
        Object objOooO0OO;
        long j10;
        long j11;
        Map map11;
        ?? r44;
        Map map12;
        Map map13;
        Map map14;
        String str44;
        ?? r710;
        ?? r711;
        Map map15;
        LinkedHashMap linkedHashMap5;
        Iterator it7;
        EnumC32485OooO00o enumC32485OooO00o5;
        long jCurrentTimeMillis3;
        Map map16;
        String str45;
        String str46;
        long j12;
        C27387o0000o0 c27387o0000o09;
        Object objOooO0o;
        Map map17;
        LinkedHashMap linkedHashMap6;
        Map map18;
        long j13;
        NoteMeta noteMeta5;
        String str47;
        Map map19;
        Map map20;
        ?? r712;
        String str48;
        ?? r24;
        File file2;
        ?? r25;
        String str49;
        File file3;
        NoteMeta noteMetaCopy$default;
        NoteMeta noteMeta6;
        String str50;
        ?? r16;
        String str51;
        String str52;
        final File file4;
        C21904OooOoo0.OooO0Oo();
        EnumC32485OooO00o enumC32485OooO00o6 = EnumC32485OooO00o.f116726OooOo0o;
        ?? r45 = this.f95569Oooo0;
        Set<String> set11 = this.f95576Oooo0o0;
        String str53 = this.f95574Oooo0OO;
        String str54 = "NoteInFileUseCase";
        final C27387o0000o0 c27387o0000o010 = this.f95573Oooo0O0;
        try {
            try {
                try {
                    try {
                        try {
                        } catch (Exception e) {
                            e = e;
                            r7 = "noteMeta is null, noteId: ";
                            str = "NoteInFileUseCase";
                            str3 = str5;
                        }
                    } catch (Exception e2) {
                        e = e2;
                        r7 = "noteMeta is null, noteId: ";
                        str = "NoteInFileUseCase";
                        str3 = str4;
                    }
                } catch (Exception e3) {
                    e = e3;
                    r73 = "noteMeta is null, noteId: ";
                    str3 = " size: ";
                }
            } catch (Exception e4) {
                e = e4;
                r72 = r45;
                str = "NoteInFileUseCase";
            }
        } catch (Exception e5) {
            e = e5;
            r7 = "noteMeta is null, noteId: ";
            str = "NoteInFileUseCase";
            str3 = str2;
        }
        switch (r45) {
            case 0:
                C32446OooOOOo.OooO0O0(obj);
                InterfaceC32507OooOO0o interfaceC32507OooOO0o3 = new InterfaceC32507OooOO0o() { // from class: o0OOo0o.o000O000
                    @Override // oO0O000o.InterfaceC32507OooOO0o
                    public final Object invoke(Object obj3) {
                        c27387o0000o010.f95446OooOo00.OooO0Oo((String) obj3);
                        return C32460OooOooO.f116667OooO00o;
                    }
                };
                str6 = " size: ";
                str7 = " ms.";
                try {
                    jCurrentTimeMillis = System.currentTimeMillis();
                    try {
                        interfaceC27313OooOoo0 = c27387o0000o010.f95427OooO0O0;
                        strOooO0Oo = c27387o0000o010.f95426OooO00o.OooO0Oo();
                        this.f95561OooOo0o = interfaceC32507OooOO0o3;
                        this.f95571Oooo00O = jCurrentTimeMillis;
                        this.f95569Oooo0 = 1;
                        interfaceC32507OooOO0o = interfaceC32507OooOO0o3;
                    } catch (Exception e6) {
                        e = e6;
                        interfaceC32507OooOO0o = interfaceC32507OooOO0o3;
                    }
                } catch (Exception e7) {
                    e = e7;
                    interfaceC32507OooOO0o = interfaceC32507OooOO0o3;
                }
                try {
                    objOooO0oo = interfaceC27313OooOoo0.OooO0oo(str53, strOooO0Oo, this);
                } catch (Exception e8) {
                    e = e8;
                    str = "NoteInFileUseCase";
                    r72 = interfaceC32507OooOO0o;
                }
                if (objOooO0oo == enumC32485OooO00o6) {
                    return enumC32485OooO00o6;
                }
                interfaceC32507OooOO0o2 = interfaceC32507OooOO0o;
                try {
                    noteMeta = (NoteMeta) objOooO0oo;
                } catch (Exception e9) {
                    e = e9;
                    str = "NoteInFileUseCase";
                }
                if (noteMeta == null) {
                    InterfaceC27309OooOoO interfaceC27309OooOoO = c27387o0000o010.f95429OooO0Oo;
                    this.f95561OooOo0o = interfaceC32507OooOO0o2;
                    this.f95560OooOo = noteMeta;
                    this.f95571Oooo00O = jCurrentTimeMillis;
                    this.f95569Oooo0 = 2;
                    objOooOO0o = interfaceC27309OooOoO.OooOO0o(str53, this);
                    if (objOooOO0o == enumC32485OooO00o6) {
                        return enumC32485OooO00o6;
                    }
                    r45 = interfaceC32507OooOO0o2;
                    noteMeta2 = noteMeta;
                    try {
                        noteContent = (NoteContent) objOooOO0o;
                        if (noteContent != null || (pages = noteContent.getPages()) == null) {
                            str8 = "getNoteInFileByPages, getPdfPathByNoteId: ";
                            str9 = str7;
                            str10 = ", cost: ";
                            setO0OO00O = C34438OooOoo0.f123458OooOo0o;
                        } else {
                            List<Page> list = pages;
                            str9 = str7;
                            str8 = "getNoteInFileByPages, getPdfPathByNoteId: ";
                            str10 = ", cost: ";
                            ArrayList arrayList3 = new ArrayList(C34428OooOOo.OooOOoo(list, 10));
                            Iterator it8 = list.iterator();
                            while (it8.hasNext()) {
                                arrayList3.add(((Page) it8.next()).getId());
                            }
                            setO0OO00O = oOo000Oo.OooOo.o0OO00O(arrayList3);
                        }
                        arrayList = new ArrayList();
                        it = set11.iterator();
                        while (it.hasNext()) {
                            Object next = it.next();
                            Iterator it9 = it;
                            if (!setO0OO00O.contains((String) next)) {
                                arrayList.add(next);
                            }
                            it = it9;
                        }
                    } catch (Exception e10) {
                        e = e10;
                        str = "NoteInFileUseCase";
                    }
                    if (arrayList.isEmpty()) {
                        str = "NoteInFileUseCase";
                        try {
                            throw new C27387o0000o0.OooO0O0("10012", "pageIds is invalid, allPageIds not contains pageIds, invalidPageIds: " + arrayList);
                        } catch (Exception e11) {
                            e = e11;
                        }
                    } else {
                        string = UUID.randomUUID().toString();
                        kotlin.jvm.internal.OooOOO0.OooO0o(string, "toString(...)");
                        try {
                            c27387o0000o010.f95446OooOo00.OooO0o0(str53, string);
                            C34406OooO00o.C20358OooO00o c20358OooO00o = C34406OooO00o.f123390OooO00o;
                            c20358OooO00o.OooOOO0("NoteInFileUseCase");
                            StringBuilder sb = new StringBuilder();
                            set = set11;
                            sb.append("getNoteInFileByPages, duplicateDatabaseToNewNoteId done, srcNoteId: ");
                            sb.append(str53);
                            sb.append(", dstNoteId: ");
                            sb.append(string);
                            str11 = ", dstNoteId: ";
                            c20358OooO00o.OooO0o0(sb.toString(), new Object[0]);
                            this.f95561OooOo0o = r45;
                            this.f95560OooOo = string;
                            this.f95563OooOoO0 = noteMeta2;
                            this.f95562OooOoO = setO0OO00O;
                            this.f95564OooOoOO = string;
                            this.f95571Oooo00O = jCurrentTimeMillis;
                            this.f95569Oooo0 = 3;
                            break;
                        } catch (Exception e12) {
                            e = e12;
                            str = "NoteInFileUseCase";
                            r75 = r45;
                            str3 = string;
                            r7 = r75;
                            file = null;
                            r74 = r7;
                            C34406OooO00o.C20358OooO00o c20358OooO00o2 = C34406OooO00o.f123390OooO00o;
                            c20358OooO00o2.OooOOO0(str);
                            c20358OooO00o2.OooO0Oo(e, "getNoteInFileByPages, error.", new Object[0]);
                            if (file != null) {
                            }
                            if (str3 != null) {
                            }
                        }
                        if (C27387o0000o0.OooOoOO(c27387o0000o010, str53, string, this) == enumC32485OooO00o6) {
                            return enumC32485OooO00o6;
                        }
                        set2 = setO0OO00O;
                        str12 = string;
                        r4 = r45;
                        try {
                            C34406OooO00o.C20358OooO00o c20358OooO00o3 = C34406OooO00o.f123390OooO00o;
                            c20358OooO00o3.OooOOO0("NoteInFileUseCase");
                            StringBuilder sb2 = new StringBuilder();
                            sb2.append("getNoteInFileByPages, renameSrcNoteIdToDst done, srcNoteId: ");
                            sb2.append(str53);
                            str13 = str11;
                            sb2.append(str13);
                            sb2.append(str12);
                            String str55 = str12;
                            r83 = r4;
                            try {
                                c20358OooO00o3.OooO0o0(sb2.toString(), new Object[0]);
                                Set setOooO0oO = C34449Oooo0oo.OooO0oO(set2, set);
                                set3 = setOooO0oO;
                                it2 = setOooO0oO.iterator();
                                r5 = r83;
                                c27387o0000o0 = c27387o0000o010;
                                str14 = str55;
                                try {
                                } catch (Exception e13) {
                                    e = e13;
                                    str = "NoteInFileUseCase";
                                    r75 = r5;
                                    str3 = string;
                                    r7 = r75;
                                    file = null;
                                    r74 = r7;
                                    C34406OooO00o.C20358OooO00o c20358OooO00o22 = C34406OooO00o.f123390OooO00o;
                                    c20358OooO00o22.OooOOO0(str);
                                    c20358OooO00o22.OooO0Oo(e, "getNoteInFileByPages, error.", new Object[0]);
                                    if (file != null) {
                                    }
                                    if (str3 != null) {
                                    }
                                }
                            } catch (Exception e14) {
                                e = e14;
                                str = "NoteInFileUseCase";
                                r75 = r83;
                                str3 = string;
                                r7 = r75;
                            }
                        } catch (Exception e15) {
                            e = e15;
                            r83 = r4;
                        }
                        if (!it2.hasNext()) {
                            try {
                                str15 = str53;
                                str16 = (String) it2.next();
                                c27387o0000o02 = c27387o0000o010;
                                c27449o00O0OoO = c27387o0000o0.f95447OooOo0O;
                                this.f95561OooOo0o = r5;
                                this.f95560OooOo = string;
                                this.f95563OooOoO0 = noteMeta2;
                                this.f95562OooOoO = str14;
                                this.f95564OooOoOO = set3;
                                this.f95566OooOoo0 = c27387o0000o0;
                                this.f95565OooOoo = it2;
                                this.f95571Oooo00O = jCurrentTimeMillis;
                                it3 = it2;
                                this.f95569Oooo0 = 4;
                            } catch (Exception e16) {
                                e = e16;
                                r76 = r5;
                                str3 = string;
                                r73 = r76;
                                str = str54;
                                r7 = r73;
                                file = null;
                                r74 = r7;
                                C34406OooO00o.C20358OooO00o c20358OooO00o222 = C34406OooO00o.f123390OooO00o;
                                c20358OooO00o222.OooOOO0(str);
                                c20358OooO00o222.OooO0Oo(e, "getNoteInFileByPages, error.", new Object[0]);
                                if (file != null) {
                                }
                                if (str3 != null) {
                                }
                            }
                            if (c27449o00O0OoO.OooOOO0(str16, str14, this) == enumC32485OooO00o6) {
                                return enumC32485OooO00o6;
                            }
                            it2 = it3;
                            r52 = r5;
                            c27387o0000o010 = c27387o0000o02;
                            str53 = str15;
                            r5 = r52;
                            if (!it2.hasNext()) {
                                str17 = str53;
                                c27387o0000o03 = c27387o0000o010;
                                o0OOo0Oo.Oooo0 oooo0 = c27387o0000o03.f95430OooO0o;
                                this.f95561OooOo0o = r5;
                                this.f95560OooOo = string;
                                this.f95563OooOoO0 = noteMeta2;
                                this.f95562OooOoO = str14;
                                this.f95564OooOoOO = set3;
                                this.f95566OooOoo0 = null;
                                this.f95565OooOoo = null;
                                this.f95571Oooo00O = jCurrentTimeMillis;
                                this.f95569Oooo0 = 5;
                                if (((C27020OooOoO0) oooo0).OooO0O0(str14, set3, this) == enumC32485OooO00o6) {
                                    return enumC32485OooO00o6;
                                }
                                set4 = set3;
                                str18 = str14;
                                r53 = r5;
                                C34406OooO00o.C20358OooO00o c20358OooO00o4 = C34406OooO00o.f123390OooO00o;
                                c20358OooO00o4.OooOOO0("NoteInFileUseCase");
                                c20358OooO00o4.OooO0o0("getNoteInFileByPages, deletePagesPermanently done, toDeletePageIds: " + set4 + str13 + str18, new Object[0]);
                                InterfaceC27309OooOoO interfaceC27309OooOoO2 = c27387o0000o03.f95429OooO0Oo;
                                this.f95561OooOo0o = r53;
                                this.f95560OooOo = string;
                                this.f95563OooOoO0 = noteMeta2;
                                this.f95562OooOoO = str18;
                                this.f95564OooOoOO = null;
                                this.f95571Oooo00O = jCurrentTimeMillis;
                                this.f95569Oooo0 = 6;
                                objOooOO0o2 = interfaceC27309OooOoO2.OooOO0o(str18, this);
                                r5 = r53;
                                if (objOooOO0o2 == enumC32485OooO00o6) {
                                    return enumC32485OooO00o6;
                                }
                                noteContent2 = (NoteContent) objOooOO0o2;
                                if (noteContent2 != null) {
                                    List<Page> pages2 = noteContent2.getPages();
                                    ArrayList arrayList4 = new ArrayList();
                                    for (Object obj3 : pages2) {
                                        Set<String> set12 = set;
                                        if (set12.contains(((Page) obj3).getId())) {
                                            arrayList4.add(obj3);
                                        }
                                        set = set12;
                                    }
                                    set5 = set;
                                    NoteContent noteContentCopy = noteContent2.copy((24571 & 1) != 0 ? noteContent2.id : null, (24571 & 2) != 0 ? noteContent2.defaultPage : null, (24571 & 4) != 0 ? noteContent2.pages : arrayList4, (24571 & 8) != 0 ? noteContent2.pageLayerIds : null, (24571 & 16) != 0 ? noteContent2.outlines : null, (24571 & 32) != 0 ? noteContent2.pdfInfo : null, (24571 & 64) != 0 ? noteContent2.savedPageIndex : 0, (24571 & 128) != 0 ? noteContent2.activatedPageLayerId : null, (24571 & 256) != 0 ? noteContent2.zoom : 0.0f, (24571 & 512) != 0 ? noteContent2.unboundedPageOffsetX : 0.0f, (24571 & 1024) != 0 ? noteContent2.unboundedPageOffsetY : 0.0f, (24571 & 2048) != 0 ? noteContent2.unboundedNote : false, (24571 & 4096) != 0 ? noteContent2.creationTime : 0L, (24571 & 8192) != 0 ? noteContent2.lastModificationTime : 0L, (24571 & 16384) != 0 ? noteContent2.extras : null);
                                    InterfaceC27309OooOoO interfaceC27309OooOoO3 = c27387o0000o03.f95429OooO0Oo;
                                    this.f95561OooOo0o = r5;
                                    this.f95560OooOo = string;
                                    this.f95563OooOoO0 = noteMeta2;
                                    this.f95562OooOoO = str18;
                                    this.f95571Oooo00O = jCurrentTimeMillis;
                                    this.f95569Oooo0 = 7;
                                    if (interfaceC27309OooOoO3.OooO0oO(noteContentCopy, this) == enumC32485OooO00o6) {
                                        return enumC32485OooO00o6;
                                    }
                                    r2 = r5;
                                    try {
                                        this.f95561OooOo0o = r2;
                                        this.f95560OooOo = string;
                                        this.f95563OooOoO0 = noteMeta2;
                                        this.f95562OooOoO = str18;
                                        this.f95571Oooo00O = jCurrentTimeMillis;
                                        this.f95569Oooo0 = 8;
                                        c27387o0000o04 = c27387o0000o03;
                                        str19 = str17;
                                        objOoooOO0 = c27387o0000o04.OoooOO0(str19, this);
                                        r2 = r2;
                                        if (objOoooOO0 == enumC32485OooO00o6) {
                                            return enumC32485OooO00o6;
                                        }
                                        str20 = (String) objOoooOO0;
                                        C34406OooO00o.C20358OooO00o c20358OooO00o5 = C34406OooO00o.f123390OooO00o;
                                        c20358OooO00o5.OooOOO0("NoteInFileUseCase");
                                        StringBuilder sb3 = new StringBuilder();
                                        c27387o0000o05 = c27387o0000o04;
                                        String str56 = str8;
                                        sb3.append(str56);
                                        sb3.append(str20);
                                        str21 = str56;
                                        str22 = "NoteInFileUseCase";
                                    } catch (Exception e17) {
                                        e = e17;
                                        str = "NoteInFileUseCase";
                                        r22 = r2;
                                        r75 = r22;
                                        str3 = string;
                                        r7 = r75;
                                        file = null;
                                        r74 = r7;
                                        C34406OooO00o.C20358OooO00o c20358OooO00o2222 = C34406OooO00o.f123390OooO00o;
                                        c20358OooO00o2222.OooOOO0(str);
                                        c20358OooO00o2222.OooO0Oo(e, "getNoteInFileByPages, error.", new Object[0]);
                                        if (file != null) {
                                        }
                                        if (str3 != null) {
                                        }
                                    }
                                    try {
                                        c20358OooO00o5.OooO0o0(sb3.toString(), new Object[0]);
                                        r23 = r2;
                                    } catch (Exception e18) {
                                        e = e18;
                                        str = str22;
                                        r22 = r2;
                                        r75 = r22;
                                        str3 = string;
                                        r7 = r75;
                                    }
                                    if (str20 != null) {
                                        try {
                                        } catch (Exception e19) {
                                            e = e19;
                                            r77 = r2;
                                        }
                                        if (str20.length() == 0) {
                                            r23 = r2;
                                        } else {
                                            o0OOo0Oo.Oooo0 oooo02 = c27387o0000o05.f95430OooO0o;
                                            this.f95561OooOo0o = r2;
                                            this.f95560OooOo = string;
                                            this.f95563OooOoO0 = noteMeta2;
                                            this.f95562OooOoO = str18;
                                            this.f95564OooOoOO = str20;
                                            this.f95571Oooo00O = jCurrentTimeMillis;
                                            this.f95569Oooo0 = 9;
                                            objOooO = ((C27020OooOoO0) oooo02).OooO(str19, set5, this);
                                            if (objOooO == enumC32485OooO00o6) {
                                                return enumC32485OooO00o6;
                                            }
                                            String str57 = str18;
                                            r42 = r2;
                                            str23 = str20;
                                            noteMeta3 = noteMeta2;
                                            str24 = str57;
                                            try {
                                                arrayList2 = new ArrayList();
                                                for (Object obj4 : (Iterable) objOooO) {
                                                    if (((Page) obj4).getPaperTheme() instanceof PdfPaperTheme) {
                                                        arrayList2.add(obj4);
                                                    }
                                                }
                                            } catch (Exception e20) {
                                                e = e20;
                                                r77 = r42;
                                                str3 = string;
                                                str = str22;
                                                r7 = r77;
                                            }
                                            if (arrayList2.isEmpty()) {
                                                Iterator it10 = arrayList2.iterator();
                                                while (it10.hasNext()) {
                                                    PaperTheme paperTheme = ((Page) it10.next()).getPaperTheme();
                                                    kotlin.jvm.internal.OooOOO0.OooO0o0(paperTheme, "null cannot be cast to non-null type com.orion.notein.domain.models.papertheme.PdfPaperTheme");
                                                    if (kotlin.jvm.internal.OooOOO0.OooO0O0(((PdfPaperTheme) paperTheme).getPdfInfo().getPdfPath(), str23)) {
                                                        str25 = str24;
                                                        noteMeta2 = noteMeta3;
                                                        z = true;
                                                        r43 = r42;
                                                        C34406OooO00o.C20358OooO00o c20358OooO00o6 = C34406OooO00o.f123390OooO00o;
                                                        str54 = str22;
                                                        c20358OooO00o6.OooOOO0(str54);
                                                        String str58 = str19;
                                                        c20358OooO00o6.OooO0o0("getNoteInFileByPages, shouldZipPdfFile: " + z, new Object[0]);
                                                        if (str23 != null) {
                                                            try {
                                                                if (str23.length() != 0) {
                                                                    File file5 = new File(str23);
                                                                    String name = file5.getName();
                                                                    StringBuilder sb4 = new StringBuilder();
                                                                    set6 = set5;
                                                                    sb4.append("note_pdf_");
                                                                    sb4.append(name);
                                                                    mapOooO0o0 = oOo000Oo.Oooo0.OooO0o0(C25749OooOoO0.OooO0Oo(sb4.toString(), file5));
                                                                } else {
                                                                    set6 = set5;
                                                                    mapOooO0o0 = C34436OooOoOO.f123455OooOo0o;
                                                                }
                                                                long j14 = jCurrentTimeMillis;
                                                                long jCurrentTimeMillis4 = System.currentTimeMillis();
                                                                c20358OooO00o6.OooOOO0(str54);
                                                                long j15 = jCurrentTimeMillis4 - j14;
                                                                try {
                                                                    StringBuilder sb5 = new StringBuilder();
                                                                    str26 = str54;
                                                                    try {
                                                                        sb5.append(str21);
                                                                        sb5.append(str23);
                                                                        sb5.append(", shouldZipPdfFile: ");
                                                                        sb5.append(z);
                                                                        str27 = str10;
                                                                        sb5.append(str27);
                                                                        sb5.append(j15);
                                                                        str28 = str9;
                                                                        sb5.append(str28);
                                                                        c20358OooO00o6.OooO0o0(sb5.toString(), new Object[0]);
                                                                        this.f95561OooOo0o = r43;
                                                                        this.f95560OooOo = string;
                                                                        this.f95563OooOoO0 = noteMeta2;
                                                                        this.f95562OooOoO = str25;
                                                                        this.f95564OooOoOO = str23;
                                                                        this.f95566OooOoo0 = mapOooO0o0;
                                                                        this.f95571Oooo00O = j14;
                                                                        this.f95572Oooo00o = jCurrentTimeMillis4;
                                                                        this.f95569Oooo0 = 10;
                                                                        String str59 = str23;
                                                                        Map map21 = mapOooO0o0;
                                                                        c27387o0000o06 = c27387o0000o05;
                                                                        str29 = str58;
                                                                        set11 = set6;
                                                                        Object objOooOO0O = C27387o0000o0.OooOO0O(str29, set11, c27387o0000o06, this);
                                                                        ?? r225 = r43;
                                                                        if (objOooOO0O == enumC32485OooO00o6) {
                                                                            return enumC32485OooO00o6;
                                                                        }
                                                                        enumC32485OooO00o = enumC32485OooO00o6;
                                                                        obj2 = objOooOO0O;
                                                                        j = j14;
                                                                        map = map21;
                                                                        String str60 = str25;
                                                                        str30 = string;
                                                                        r6 = r225;
                                                                        j2 = jCurrentTimeMillis4;
                                                                        str31 = str60;
                                                                        str32 = str59;
                                                                        long j16 = j2;
                                                                        try {
                                                                            Iterable iterable = (Iterable) obj2;
                                                                            set7 = set11;
                                                                            linkedHashMap = new LinkedHashMap(oO0O00oo.OooOO0.OooO0OO(oOo000Oo.Oooo0.OooO0Oo(C34428OooOOo.OooOOoo(iterable, 10))));
                                                                            it4 = iterable.iterator();
                                                                            while (it4.hasNext()) {
                                                                                try {
                                                                                    Iterator it11 = it4;
                                                                                    String str61 = str29;
                                                                                    File file6 = new File((String) it4.next());
                                                                                    long j17 = j;
                                                                                    C32443OooOOO c32443OooOOOOooO0Oo = C25749OooOoO0.OooO0Oo("note_image_" + file6.getName(), file6);
                                                                                    linkedHashMap.put(c32443OooOOOOooO0Oo.OooO0O0(), c32443OooOOOOooO0Oo.OooO0OO());
                                                                                    it4 = it11;
                                                                                    str29 = str61;
                                                                                    j = j17;
                                                                                } catch (Exception e21) {
                                                                                    e = e21;
                                                                                    str = str26;
                                                                                    str3 = str30;
                                                                                    file = null;
                                                                                    r74 = r6;
                                                                                }
                                                                            }
                                                                            j3 = j;
                                                                            String str62 = str29;
                                                                            long jOooo00O = C27387o0000o0.Oooo00O(c27387o0000o06, linkedHashMap.values());
                                                                            long jCurrentTimeMillis5 = System.currentTimeMillis();
                                                                            C34406OooO00o.C20358OooO00o c20358OooO00o7 = C34406OooO00o.f123390OooO00o;
                                                                            str = str26;
                                                                            try {
                                                                                c20358OooO00o7.OooOOO0(str);
                                                                                str33 = str;
                                                                                try {
                                                                                    int size = linkedHashMap.size();
                                                                                    C27387o0000o0 c27387o0000o011 = c27387o0000o06;
                                                                                    String strOooO0OO = C31430OooO00o.OooO0OO(jOooo00O);
                                                                                    long j18 = jCurrentTimeMillis5 - j16;
                                                                                    StringBuilder sb6 = new StringBuilder();
                                                                                    Map map22 = map;
                                                                                    sb6.append("getNoteInFileByPages, getImageUrisByNoteId, num: ");
                                                                                    sb6.append(size);
                                                                                    str34 = str6;
                                                                                    sb6.append(str34);
                                                                                    sb6.append(strOooO0OO);
                                                                                    sb6.append(str27);
                                                                                    sb6.append(j18);
                                                                                    sb6.append(str28);
                                                                                    c20358OooO00o7.OooO0o0(sb6.toString(), new Object[0]);
                                                                                    this.f95561OooOo0o = r6;
                                                                                    this.f95560OooOo = str30;
                                                                                    this.f95563OooOoO0 = noteMeta2;
                                                                                    this.f95562OooOoO = str31;
                                                                                    this.f95564OooOoOO = str32;
                                                                                    this.f95566OooOoo0 = map22;
                                                                                    this.f95565OooOoo = linkedHashMap;
                                                                                    this.f95571Oooo00O = j3;
                                                                                    this.f95572Oooo00o = jCurrentTimeMillis5;
                                                                                    this.f95569Oooo0 = 11;
                                                                                    j4 = jCurrentTimeMillis5;
                                                                                    str35 = str62;
                                                                                    c27387o0000o07 = c27387o0000o011;
                                                                                    objOooOOOo = C27387o0000o0.OooOOOo(str35, set7, c27387o0000o07, this);
                                                                                    ?? r192 = r6;
                                                                                    enumC32485OooO00o2 = enumC32485OooO00o;
                                                                                    if (objOooOOOo != enumC32485OooO00o2) {
                                                                                        return enumC32485OooO00o2;
                                                                                    }
                                                                                    set8 = set7;
                                                                                    enumC32485OooO00o3 = enumC32485OooO00o2;
                                                                                    map2 = linkedHashMap;
                                                                                    obj = objOooOOOo;
                                                                                    j5 = j3;
                                                                                    map3 = map22;
                                                                                    str36 = str31;
                                                                                    noteMeta4 = noteMeta2;
                                                                                    str37 = str30;
                                                                                    r78 = r192;
                                                                                    try {
                                                                                        String str63 = str35;
                                                                                        ArrayList arrayList5 = new ArrayList();
                                                                                        for (Object obj5 : (Iterable) obj) {
                                                                                            long j19 = j5;
                                                                                            try {
                                                                                                if (!kotlin.jvm.internal.OooOOO0.OooO0O0((String) obj5, str32)) {
                                                                                                    arrayList5.add(obj5);
                                                                                                }
                                                                                                j5 = j19;
                                                                                            } catch (Exception e22) {
                                                                                                e = e22;
                                                                                                str3 = str37;
                                                                                                str = str33;
                                                                                                r7 = r78;
                                                                                            }
                                                                                        }
                                                                                        j6 = j5;
                                                                                        linkedHashMap2 = new LinkedHashMap(oO0O00oo.OooOO0.OooO0OO(oOo000Oo.Oooo0.OooO0Oo(C34428OooOOo.OooOOoo(arrayList5, 10))));
                                                                                        it5 = arrayList5.iterator();
                                                                                        while (it5.hasNext()) {
                                                                                            File file7 = new File((String) it5.next());
                                                                                            String name2 = file7.getName();
                                                                                            Iterator it12 = it5;
                                                                                            StringBuilder sb7 = new StringBuilder();
                                                                                            Map map23 = map2;
                                                                                            sb7.append("note_local_uri_theme_");
                                                                                            sb7.append(name2);
                                                                                            C32443OooOOO c32443OooOOOOooO0Oo2 = C25749OooOoO0.OooO0Oo(sb7.toString(), file7);
                                                                                            linkedHashMap2.put(c32443OooOOOOooO0Oo2.OooO0O0(), c32443OooOOOOooO0Oo2.OooO0OO());
                                                                                            it5 = it12;
                                                                                            map2 = map23;
                                                                                        }
                                                                                        map4 = map2;
                                                                                        long jOooo00O2 = C27387o0000o0.Oooo00O(c27387o0000o07, linkedHashMap2.values());
                                                                                        long jCurrentTimeMillis6 = System.currentTimeMillis();
                                                                                        C34406OooO00o.C20358OooO00o c20358OooO00o8 = C34406OooO00o.f123390OooO00o;
                                                                                        str38 = str33;
                                                                                        try {
                                                                                            c20358OooO00o8.OooOOO0(str38);
                                                                                            str33 = str38;
                                                                                            int size2 = linkedHashMap2.size();
                                                                                            C27387o0000o0 c27387o0000o012 = c27387o0000o07;
                                                                                            String strOooO0OO2 = C31430OooO00o.OooO0OO(jOooo00O2);
                                                                                            StringBuilder sb8 = new StringBuilder();
                                                                                            Map map24 = map3;
                                                                                            sb8.append("getNoteInFileByPages, getPaperThemeUrisByNoteId, num: ");
                                                                                            sb8.append(size2);
                                                                                            sb8.append(str34);
                                                                                            sb8.append(strOooO0OO2);
                                                                                            sb8.append(str27);
                                                                                            sb8.append(jCurrentTimeMillis6 - j4);
                                                                                            sb8.append(str28);
                                                                                            c20358OooO00o8.OooO0o0(sb8.toString(), new Object[0]);
                                                                                            this.f95561OooOo0o = r78;
                                                                                            this.f95560OooOo = str37;
                                                                                            this.f95563OooOoO0 = noteMeta4;
                                                                                            this.f95562OooOoO = str36;
                                                                                            this.f95564OooOoOO = map24;
                                                                                            this.f95566OooOoo0 = map4;
                                                                                            this.f95565OooOoo = linkedHashMap2;
                                                                                            this.f95571Oooo00O = j6;
                                                                                            this.f95572Oooo00o = jCurrentTimeMillis6;
                                                                                            this.f95569Oooo0 = 12;
                                                                                            j7 = jCurrentTimeMillis6;
                                                                                            set9 = set8;
                                                                                            c27387o0000o08 = c27387o0000o012;
                                                                                            objOooOOoo = C27387o0000o0.OooOOoo(str63, set9, c27387o0000o08, this);
                                                                                            enumC32485OooO00o4 = enumC32485OooO00o3;
                                                                                            if (objOooOOoo != enumC32485OooO00o4) {
                                                                                                return enumC32485OooO00o4;
                                                                                            }
                                                                                            j8 = j6;
                                                                                            map5 = map4;
                                                                                            map6 = map24;
                                                                                            map7 = linkedHashMap2;
                                                                                            r78 = r78;
                                                                                            try {
                                                                                                Iterable iterable2 = (Iterable) objOooOOoo;
                                                                                                set10 = set9;
                                                                                                linkedHashMap3 = new LinkedHashMap(oO0O00oo.OooOO0.OooO0OO(oOo000Oo.Oooo0.OooO0Oo(C34428OooOOo.OooOOoo(iterable2, 10))));
                                                                                                it6 = iterable2.iterator();
                                                                                                while (it6.hasNext()) {
                                                                                                    Iterator it13 = it6;
                                                                                                    EnumC32485OooO00o enumC32485OooO00o7 = enumC32485OooO00o4;
                                                                                                    File file8 = new File((String) it6.next());
                                                                                                    String name3 = file8.getName();
                                                                                                    Map map25 = map7;
                                                                                                    StringBuilder sb9 = new StringBuilder();
                                                                                                    Map map26 = map5;
                                                                                                    sb9.append("note_pdf_set_uri_theme_");
                                                                                                    sb9.append(name3);
                                                                                                    C32443OooOOO c32443OooOOOOooO0Oo3 = C25749OooOoO0.OooO0Oo(sb9.toString(), file8);
                                                                                                    linkedHashMap3.put(c32443OooOOOOooO0Oo3.OooO0O0(), c32443OooOOOOooO0Oo3.OooO0OO());
                                                                                                    it6 = it13;
                                                                                                    enumC32485OooO00o4 = enumC32485OooO00o7;
                                                                                                    map7 = map25;
                                                                                                    map5 = map26;
                                                                                                }
                                                                                                map8 = map7;
                                                                                                Map map27 = map5;
                                                                                                EnumC32485OooO00o enumC32485OooO00o8 = enumC32485OooO00o4;
                                                                                                long jOooo00O3 = C27387o0000o0.Oooo00O(c27387o0000o08, linkedHashMap3.values());
                                                                                                long jCurrentTimeMillis7 = System.currentTimeMillis();
                                                                                                C34406OooO00o.C20358OooO00o c20358OooO00o9 = C34406OooO00o.f123390OooO00o;
                                                                                                str40 = str33;
                                                                                                try {
                                                                                                    c20358OooO00o9.OooOOO0(str40);
                                                                                                    int size3 = linkedHashMap3.size();
                                                                                                    String strOooO0OO3 = C31430OooO00o.OooO0OO(jOooo00O3);
                                                                                                    r223 = r78;
                                                                                                    str39 = str37;
                                                                                                    long j20 = jCurrentTimeMillis7 - j7;
                                                                                                    try {
                                                                                                        StringBuilder sb10 = new StringBuilder();
                                                                                                        map9 = map6;
                                                                                                        sb10.append("getNoteInFileByPages, getPdfSetPaperThemeUrisByNoteId, num: ");
                                                                                                        sb10.append(size3);
                                                                                                        sb10.append(str34);
                                                                                                        sb10.append(strOooO0OO3);
                                                                                                        sb10.append(str27);
                                                                                                        sb10.append(j20);
                                                                                                        sb10.append(str28);
                                                                                                        c20358OooO00o9.OooO0o0(sb10.toString(), new Object[0]);
                                                                                                        File dataDir = c27387o0000o08.f95452OooOoo0.getDataDir();
                                                                                                        kotlin.jvm.internal.OooOOO0.OooO0o(dataDir, "getDataDir(...)");
                                                                                                        String[] strArrDatabaseList = c27387o0000o08.f95452OooOoo0.databaseList();
                                                                                                        kotlin.jvm.internal.OooOOO0.OooO0o(strArrDatabaseList, "databaseList(...)");
                                                                                                        ArrayList<String> arrayList6 = new ArrayList();
                                                                                                        for (String str64 : strArrDatabaseList) {
                                                                                                            kotlin.jvm.internal.OooOOO0.OooO0Oo(str64);
                                                                                                            if (C33599OooOo0O.OooOoOO(str64, str36, false)) {
                                                                                                                arrayList6.add(str64);
                                                                                                            }
                                                                                                        }
                                                                                                        linkedHashMap4 = new LinkedHashMap(oO0O00oo.OooOO0.OooO0OO(oOo000Oo.Oooo0.OooO0Oo(C34428OooOOo.OooOOoo(arrayList6, 10))));
                                                                                                        for (String str65 : arrayList6) {
                                                                                                            StringBuilder sb11 = new StringBuilder();
                                                                                                            sb11.append(dataDir);
                                                                                                            File file9 = dataDir;
                                                                                                            sb11.append("/databases/");
                                                                                                            sb11.append(str65);
                                                                                                            C32443OooOOO c32443OooOOOOooO0Oo4 = C25749OooOoO0.OooO0Oo("note_database_" + str65, new File(sb11.toString()));
                                                                                                            linkedHashMap4.put(c32443OooOOOOooO0Oo4.OooO0O0(), c32443OooOOOOooO0Oo4.OooO0OO());
                                                                                                            dataDir = file9;
                                                                                                        }
                                                                                                        long jOooo00O4 = C27387o0000o0.Oooo00O(c27387o0000o08, linkedHashMap4.values());
                                                                                                        jCurrentTimeMillis2 = System.currentTimeMillis();
                                                                                                        C34406OooO00o.C20358OooO00o c20358OooO00o10 = C34406OooO00o.f123390OooO00o;
                                                                                                        c20358OooO00o10.OooOOO0(str40);
                                                                                                        int size4 = linkedHashMap4.size();
                                                                                                        String strOooO0OO4 = C31430OooO00o.OooO0OO(jOooo00O4);
                                                                                                        String str66 = str27;
                                                                                                        str41 = str34;
                                                                                                        long j21 = jCurrentTimeMillis2 - jCurrentTimeMillis7;
                                                                                                        str42 = str66;
                                                                                                        StringBuilder sb12 = new StringBuilder();
                                                                                                        str43 = str40;
                                                                                                        try {
                                                                                                            sb12.append("getNoteInFileByPages, getDatabaseList, num: ");
                                                                                                            sb12.append(size4);
                                                                                                            sb12.append(", size: ");
                                                                                                            sb12.append(strOooO0OO4);
                                                                                                            sb12.append(" cost: ");
                                                                                                            sb12.append(j21);
                                                                                                            sb12.append(str28);
                                                                                                            c20358OooO00o10.OooO0o0(sb12.toString(), new Object[0]);
                                                                                                            try {
                                                                                                                this.f95561OooOo0o = r223;
                                                                                                                try {
                                                                                                                    this.f95560OooOo = str39;
                                                                                                                    try {
                                                                                                                        this.f95563OooOoO0 = noteMeta4;
                                                                                                                        this.f95562OooOoO = str36;
                                                                                                                        this.f95564OooOoOO = map9;
                                                                                                                        map10 = map27;
                                                                                                                        this.f95566OooOoo0 = map10;
                                                                                                                        this.f95565OooOoo = map8;
                                                                                                                        this.f95567OooOooO = linkedHashMap3;
                                                                                                                        this.f95568OooOooo = linkedHashMap4;
                                                                                                                        r223 = r223;
                                                                                                                        str39 = str39;
                                                                                                                        j9 = j8;
                                                                                                                        this.f95571Oooo00O = j9;
                                                                                                                        this.f95572Oooo00o = jCurrentTimeMillis2;
                                                                                                                        this.f95569Oooo0 = 13;
                                                                                                                    } catch (Exception e23) {
                                                                                                                        e = e23;
                                                                                                                        r223 = r223;
                                                                                                                        str39 = str39;
                                                                                                                    }
                                                                                                                } catch (Exception e24) {
                                                                                                                    e = e24;
                                                                                                                    r223 = r223;
                                                                                                                    str39 = str39;
                                                                                                                }
                                                                                                            } catch (Exception e25) {
                                                                                                                e = e25;
                                                                                                                r223 = r223;
                                                                                                            }
                                                                                                        } catch (Exception e26) {
                                                                                                            e = e26;
                                                                                                        }
                                                                                                    } catch (Exception e27) {
                                                                                                        e = e27;
                                                                                                        str = str40;
                                                                                                        r224 = r223;
                                                                                                    }
                                                                                                } catch (Exception e28) {
                                                                                                    e = e28;
                                                                                                    str39 = str37;
                                                                                                    str = str40;
                                                                                                    r79 = r78;
                                                                                                }
                                                                                                try {
                                                                                                    objOooO0OO = C27387o0000o0.OooO0OO(c27387o0000o08, str36, this);
                                                                                                    enumC32485OooO00o6 = enumC32485OooO00o8;
                                                                                                    if (objOooO0OO != enumC32485OooO00o6) {
                                                                                                        return enumC32485OooO00o6;
                                                                                                    }
                                                                                                    j10 = jCurrentTimeMillis2;
                                                                                                    j11 = j9;
                                                                                                    map11 = linkedHashMap3;
                                                                                                    r44 = r223;
                                                                                                    map12 = map8;
                                                                                                    map13 = linkedHashMap4;
                                                                                                    map14 = map9;
                                                                                                    str44 = str39;
                                                                                                    try {
                                                                                                        Iterable iterable3 = (Iterable) objOooO0OO;
                                                                                                        map15 = map13;
                                                                                                        linkedHashMap5 = new LinkedHashMap(oO0O00oo.OooOO0.OooO0OO(oOo000Oo.Oooo0.OooO0Oo(C34428OooOOo.OooOOoo(iterable3, 10))));
                                                                                                        it7 = iterable3.iterator();
                                                                                                        while (it7.hasNext()) {
                                                                                                            try {
                                                                                                                Iterator it14 = it7;
                                                                                                                EnumC32485OooO00o enumC32485OooO00o9 = enumC32485OooO00o6;
                                                                                                                File file10 = new File((String) it7.next());
                                                                                                                long j22 = j11;
                                                                                                                C32443OooOOO c32443OooOOOOooO0Oo5 = C25749OooOoO0.OooO0Oo("note_audio_" + file10.getName(), file10);
                                                                                                                linkedHashMap5.put(c32443OooOOOOooO0Oo5.OooO0O0(), c32443OooOOOOooO0Oo5.OooO0OO());
                                                                                                                enumC32485OooO00o6 = enumC32485OooO00o9;
                                                                                                                it7 = it14;
                                                                                                                j11 = j22;
                                                                                                            } catch (Exception e29) {
                                                                                                                e = e29;
                                                                                                                r7 = r44;
                                                                                                                str3 = str44;
                                                                                                                str = str43;
                                                                                                            }
                                                                                                        }
                                                                                                        enumC32485OooO00o5 = enumC32485OooO00o6;
                                                                                                        long j23 = j11;
                                                                                                        long jOooo00O5 = C27387o0000o0.Oooo00O(c27387o0000o08, linkedHashMap5.values());
                                                                                                        jCurrentTimeMillis3 = System.currentTimeMillis();
                                                                                                        C34406OooO00o.C20358OooO00o c20358OooO00o11 = C34406OooO00o.f123390OooO00o;
                                                                                                        str = str43;
                                                                                                        try {
                                                                                                            c20358OooO00o11.OooOOO0(str);
                                                                                                            str43 = str;
                                                                                                            int size5 = linkedHashMap5.size();
                                                                                                            C27387o0000o0 c27387o0000o013 = c27387o0000o08;
                                                                                                            String strOooO0OO5 = C31430OooO00o.OooO0OO(jOooo00O5);
                                                                                                            StringBuilder sb13 = new StringBuilder();
                                                                                                            map16 = map12;
                                                                                                            sb13.append("getNoteInFileByPages, getAudioPathsByNoteId, num: ");
                                                                                                            sb13.append(size5);
                                                                                                            str45 = str41;
                                                                                                            sb13.append(str45);
                                                                                                            sb13.append(strOooO0OO5);
                                                                                                            str46 = str42;
                                                                                                            sb13.append(str46);
                                                                                                            sb13.append(jCurrentTimeMillis3 - j10);
                                                                                                            sb13.append(str28);
                                                                                                            c20358OooO00o11.OooO0o0(sb13.toString(), new Object[0]);
                                                                                                            try {
                                                                                                                this.f95561OooOo0o = r44;
                                                                                                                this.f95560OooOo = str44;
                                                                                                                this.f95563OooOoO0 = noteMeta4;
                                                                                                                this.f95562OooOoO = str36;
                                                                                                                this.f95564OooOoOO = map14;
                                                                                                                this.f95566OooOoo0 = map10;
                                                                                                                this.f95565OooOoo = map16;
                                                                                                                this.f95567OooOooO = map11;
                                                                                                                this.f95568OooOooo = map15;
                                                                                                                this.f95570Oooo000 = linkedHashMap5;
                                                                                                                r710 = r44;
                                                                                                                try {
                                                                                                                    this.f95571Oooo00O = j23;
                                                                                                                    j12 = j23;
                                                                                                                    this.f95572Oooo00o = jCurrentTimeMillis3;
                                                                                                                    this.f95569Oooo0 = 14;
                                                                                                                    c27387o0000o09 = c27387o0000o013;
                                                                                                                    try {
                                                                                                                        objOooO0o = C27387o0000o0.OooO0o(c27387o0000o09, str36, this);
                                                                                                                        if (objOooO0o != enumC32485OooO00o5) {
                                                                                                                            return enumC32485OooO00o5;
                                                                                                                        }
                                                                                                                        map17 = map14;
                                                                                                                        linkedHashMap6 = linkedHashMap5;
                                                                                                                        map18 = map11;
                                                                                                                        j13 = jCurrentTimeMillis3;
                                                                                                                        noteMeta5 = noteMeta4;
                                                                                                                        str47 = str36;
                                                                                                                        map19 = map16;
                                                                                                                        map20 = map15;
                                                                                                                        r712 = r710;
                                                                                                                        try {
                                                                                                                            file2 = (File) objOooO0o;
                                                                                                                            try {
                                                                                                                                str48 = str44;
                                                                                                                                try {
                                                                                                                                    file3 = new File(file2, "note_meta.json");
                                                                                                                                    noteMetaCopy$default = NoteMeta.copy$default(noteMeta5, str47, null, null, null, null, false, null, 0, 0, false, null, set10.size(), 0L, 0L, null, false, false, false, 0L, 522238, null);
                                                                                                                                    noteMeta6 = noteMeta5;
                                                                                                                                    str50 = str47;
                                                                                                                                    r16 = r712;
                                                                                                                                } catch (Exception e30) {
                                                                                                                                    e = e30;
                                                                                                                                    r25 = r712;
                                                                                                                                    str49 = str43;
                                                                                                                                    str = str49;
                                                                                                                                    file = file2;
                                                                                                                                    r24 = r25;
                                                                                                                                    r74 = r24;
                                                                                                                                    str3 = str48;
                                                                                                                                    C34406OooO00o.C20358OooO00o c20358OooO00o22222 = C34406OooO00o.f123390OooO00o;
                                                                                                                                    c20358OooO00o22222.OooOOO0(str);
                                                                                                                                    c20358OooO00o22222.OooO0Oo(e, "getNoteInFileByPages, error.", new Object[0]);
                                                                                                                                    if (file != null) {
                                                                                                                                    }
                                                                                                                                    if (str3 != null) {
                                                                                                                                    }
                                                                                                                                }
                                                                                                                                try {
                                                                                                                                    str51 = this.f95575Oooo0o;
                                                                                                                                } catch (Exception e31) {
                                                                                                                                    e = e31;
                                                                                                                                    r25 = r16;
                                                                                                                                    str49 = str43;
                                                                                                                                }
                                                                                                                            } catch (Exception e32) {
                                                                                                                                e = e32;
                                                                                                                                str48 = str44;
                                                                                                                            }
                                                                                                                            if (str51 == null) {
                                                                                                                                try {
                                                                                                                                    if (str51.length() != 0) {
                                                                                                                                        noteMetaCopy$default = NoteMeta.copy$default(noteMetaCopy$default, null, null, this.f95575Oooo0o, null, null, false, null, 0, 0, false, null, 0, 0L, 0L, null, false, false, false, 0L, 524283, null);
                                                                                                                                        break;
                                                                                                                                    }
                                                                                                                                    str52 = str46;
                                                                                                                                    String json = C28028OooO0o.OooO00o().toJson(noteMetaCopy$default);
                                                                                                                                    kotlin.jvm.internal.OooOOO0.OooO0Oo(json);
                                                                                                                                    C32501OooO0oO.OooO(file3, json);
                                                                                                                                    long jCurrentTimeMillis8 = System.currentTimeMillis();
                                                                                                                                    C34406OooO00o.C20358OooO00o c20358OooO00o12 = C34406OooO00o.f123390OooO00o;
                                                                                                                                    str49 = str43;
                                                                                                                                    try {
                                                                                                                                        c20358OooO00o12.OooOOO0(str49);
                                                                                                                                        String str67 = str45;
                                                                                                                                        Map map28 = map19;
                                                                                                                                        StringBuilder sb14 = new StringBuilder();
                                                                                                                                        C27387o0000o0 c27387o0000o014 = c27387o0000o09;
                                                                                                                                        sb14.append("getNoteInFileByPages, convert noteMeta: ");
                                                                                                                                        sb14.append(noteMeta6);
                                                                                                                                        sb14.append(" to json file, cost: ");
                                                                                                                                        sb14.append(jCurrentTimeMillis8 - j13);
                                                                                                                                        sb14.append(str28);
                                                                                                                                        c20358OooO00o12.OooO0o0(sb14.toString(), new Object[0]);
                                                                                                                                        File file11 = new File(file2, "note_in_flag.json");
                                                                                                                                        String json2 = C28028OooO0o.OooO00o().toJson(this.f95577Oooo0oO);
                                                                                                                                        c20358OooO00o12.OooOOO0(str49);
                                                                                                                                        c20358OooO00o12.OooO0o0("getNoteInFileByPages, noteInFlagJson: " + json2, new Object[0]);
                                                                                                                                        kotlin.jvm.internal.OooOOO0.OooO0Oo(json2);
                                                                                                                                        C32501OooO0oO.OooO(file11, json2);
                                                                                                                                        File file12 = new File(file2, "note_extra.json");
                                                                                                                                        String json3 = C28028OooO0o.OooO00o().toJson(new C27387o0000o0.OooO00o(52));
                                                                                                                                        kotlin.jvm.internal.OooOOO0.OooO0Oo(json3);
                                                                                                                                        C32501OooO0oO.OooO(file12, json3);
                                                                                                                                        LinkedHashMap linkedHashMapOooOO0 = C34444Oooo0O0.OooOO0(C34444Oooo0O0.OooOO0(C34444Oooo0O0.OooOO0(C34444Oooo0O0.OooOO0(C34444Oooo0O0.OooOO0(map20, map17), map10), map28), map18), linkedHashMap6);
                                                                                                                                        ArrayList arrayList7 = new ArrayList(linkedHashMapOooOO0.size());
                                                                                                                                        for (Map.Entry entry : linkedHashMapOooOO0.entrySet()) {
                                                                                                                                            try {
                                                                                                                                                String str68 = (String) entry.getKey();
                                                                                                                                                File file13 = (File) entry.getValue();
                                                                                                                                                File file14 = new File(file2, str68);
                                                                                                                                                C27387o0000o0 c27387o0000o015 = c27387o0000o014;
                                                                                                                                                if (!C27387o0000o0.Oooo00o(c27387o0000o015, file13, file14) && file13.exists()) {
                                                                                                                                                    throw new C27387o0000o0.OooO0O0("10000", "copy file to zip dir failed, srcFile: " + file13 + ", dstFile: " + file14);
                                                                                                                                                }
                                                                                                                                                arrayList7.add(file14);
                                                                                                                                                c27387o0000o014 = c27387o0000o015;
                                                                                                                                            } catch (Exception e33) {
                                                                                                                                                e = e33;
                                                                                                                                                str3 = str48;
                                                                                                                                                str = str49;
                                                                                                                                                file = file2;
                                                                                                                                                r74 = r16;
                                                                                                                                            }
                                                                                                                                        }
                                                                                                                                        C27387o0000o0 c27387o0000o016 = c27387o0000o014;
                                                                                                                                        ArrayList arrayListOooooOo = oOo000Oo.OooOo.OooooOo(oOo000Oo.OooOo.OooooOo(oOo000Oo.OooOo.OooooOo(arrayList7, file3), file11), file12);
                                                                                                                                        long jOooo00O6 = C27387o0000o0.Oooo00O(c27387o0000o016, arrayListOooooOo);
                                                                                                                                        long jCurrentTimeMillis9 = System.currentTimeMillis();
                                                                                                                                        C34406OooO00o.C20358OooO00o c20358OooO00o13 = C34406OooO00o.f123390OooO00o;
                                                                                                                                        c20358OooO00o13.OooOOO0(str49);
                                                                                                                                        int size6 = arrayListOooooOo.size();
                                                                                                                                        String strOooO0OO6 = C31430OooO00o.OooO0OO(jOooo00O6);
                                                                                                                                        ?? sb15 = new StringBuilder();
                                                                                                                                        sb15.append("getNoteInFileByPages, copy files to zip dir, num: ");
                                                                                                                                        sb15.append(size6);
                                                                                                                                        r25 = str67;
                                                                                                                                        sb15.append(r25);
                                                                                                                                        sb15.append(strOooO0OO6);
                                                                                                                                        sb15.append(str52);
                                                                                                                                        sb15.append(jCurrentTimeMillis9 - jCurrentTimeMillis8);
                                                                                                                                        sb15.append(str28);
                                                                                                                                        c20358OooO00o13.OooO0o0(sb15.toString(), new Object[0]);
                                                                                                                                        file4 = new File(file2, noteMeta6.getTitle() + ".in");
                                                                                                                                        try {
                                                                                                                                            if (C31190OooO0oo.OooO0oO(file4)) {
                                                                                                                                                throw new C27387o0000o0.OooO0O0("10009", "createOrExistFile zipFile failed, zipFile: " + file4);
                                                                                                                                            }
                                                                                                                                            C31193OooOOo.OooO0o(arrayListOooooOo, file4);
                                                                                                                                            long jCurrentTimeMillis10 = System.currentTimeMillis();
                                                                                                                                            c20358OooO00o13.OooOOO0(str49);
                                                                                                                                            c20358OooO00o13.OooO0o0("getNoteInFileByPages, zip files, toZipFiles: " + arrayListOooooOo.size() + r25 + C31430OooO00o.OooO0OO(jOooo00O6) + ", zipFile: " + file4 + str52 + (jCurrentTimeMillis10 - jCurrentTimeMillis9) + str28, new Object[0]);
                                                                                                                                            C31190OooO0oo.OooOO0O(file2, new FileFilter() { // from class: o0OOo0o.o000OoO
                                                                                                                                                @Override // java.io.FileFilter
                                                                                                                                                public final boolean accept(File file15) {
                                                                                                                                                    return !kotlin.jvm.internal.OooOOO0.OooO0O0(file15, file4);
                                                                                                                                                }
                                                                                                                                            });
                                                                                                                                            c20358OooO00o13.OooOOO0(str49);
                                                                                                                                            String strOooO00o = C31430OooO00o.OooO00o(System.currentTimeMillis() - j12);
                                                                                                                                            StringBuilder sb16 = new StringBuilder();
                                                                                                                                            sb16.append("getNoteInFileByPages done, cost: ");
                                                                                                                                            sb16.append(strOooO00o);
                                                                                                                                            sb16.append(".");
                                                                                                                                            c20358OooO00o13.OooO0o0(sb16.toString(), new Object[0]);
                                                                                                                                            r16.invoke(str50);
                                                                                                                                            return new NoteInFile("", file4);
                                                                                                                                        } catch (Exception e34) {
                                                                                                                                            e = e34;
                                                                                                                                        }
                                                                                                                                    } catch (Exception e35) {
                                                                                                                                        e = e35;
                                                                                                                                        r25 = r16;
                                                                                                                                    }
                                                                                                                                } catch (Exception e36) {
                                                                                                                                    e = e36;
                                                                                                                                    str3 = str48;
                                                                                                                                    file = file2;
                                                                                                                                    r74 = r16;
                                                                                                                                    str = str43;
                                                                                                                                }
                                                                                                                                str = str49;
                                                                                                                                file = file2;
                                                                                                                                r24 = r25;
                                                                                                                            } else {
                                                                                                                                str52 = str46;
                                                                                                                                String json4 = C28028OooO0o.OooO00o().toJson(noteMetaCopy$default);
                                                                                                                                kotlin.jvm.internal.OooOOO0.OooO0Oo(json4);
                                                                                                                                C32501OooO0oO.OooO(file3, json4);
                                                                                                                                long jCurrentTimeMillis82 = System.currentTimeMillis();
                                                                                                                                C34406OooO00o.C20358OooO00o c20358OooO00o122 = C34406OooO00o.f123390OooO00o;
                                                                                                                                str49 = str43;
                                                                                                                                c20358OooO00o122.OooOOO0(str49);
                                                                                                                                String str672 = str45;
                                                                                                                                Map map282 = map19;
                                                                                                                                StringBuilder sb142 = new StringBuilder();
                                                                                                                                C27387o0000o0 c27387o0000o0142 = c27387o0000o09;
                                                                                                                                sb142.append("getNoteInFileByPages, convert noteMeta: ");
                                                                                                                                sb142.append(noteMeta6);
                                                                                                                                sb142.append(" to json file, cost: ");
                                                                                                                                sb142.append(jCurrentTimeMillis82 - j13);
                                                                                                                                sb142.append(str28);
                                                                                                                                c20358OooO00o122.OooO0o0(sb142.toString(), new Object[0]);
                                                                                                                                File file112 = new File(file2, "note_in_flag.json");
                                                                                                                                String json22 = C28028OooO0o.OooO00o().toJson(this.f95577Oooo0oO);
                                                                                                                                c20358OooO00o122.OooOOO0(str49);
                                                                                                                                c20358OooO00o122.OooO0o0("getNoteInFileByPages, noteInFlagJson: " + json22, new Object[0]);
                                                                                                                                kotlin.jvm.internal.OooOOO0.OooO0Oo(json22);
                                                                                                                                C32501OooO0oO.OooO(file112, json22);
                                                                                                                                File file122 = new File(file2, "note_extra.json");
                                                                                                                                String json32 = C28028OooO0o.OooO00o().toJson(new C27387o0000o0.OooO00o(52));
                                                                                                                                kotlin.jvm.internal.OooOOO0.OooO0Oo(json32);
                                                                                                                                C32501OooO0oO.OooO(file122, json32);
                                                                                                                                LinkedHashMap linkedHashMapOooOO02 = C34444Oooo0O0.OooOO0(C34444Oooo0O0.OooOO0(C34444Oooo0O0.OooOO0(C34444Oooo0O0.OooOO0(C34444Oooo0O0.OooOO0(map20, map17), map10), map282), map18), linkedHashMap6);
                                                                                                                                ArrayList arrayList72 = new ArrayList(linkedHashMapOooOO02.size());
                                                                                                                                while (r2.hasNext()) {
                                                                                                                                }
                                                                                                                                C27387o0000o0 c27387o0000o0162 = c27387o0000o0142;
                                                                                                                                ArrayList arrayListOooooOo2 = oOo000Oo.OooOo.OooooOo(oOo000Oo.OooOo.OooooOo(oOo000Oo.OooOo.OooooOo(arrayList72, file3), file112), file122);
                                                                                                                                long jOooo00O62 = C27387o0000o0.Oooo00O(c27387o0000o0162, arrayListOooooOo2);
                                                                                                                                long jCurrentTimeMillis92 = System.currentTimeMillis();
                                                                                                                                C34406OooO00o.C20358OooO00o c20358OooO00o132 = C34406OooO00o.f123390OooO00o;
                                                                                                                                c20358OooO00o132.OooOOO0(str49);
                                                                                                                                int size62 = arrayListOooooOo2.size();
                                                                                                                                String strOooO0OO62 = C31430OooO00o.OooO0OO(jOooo00O62);
                                                                                                                                ?? sb152 = new StringBuilder();
                                                                                                                                sb152.append("getNoteInFileByPages, copy files to zip dir, num: ");
                                                                                                                                sb152.append(size62);
                                                                                                                                r25 = str672;
                                                                                                                                sb152.append(r25);
                                                                                                                                sb152.append(strOooO0OO62);
                                                                                                                                sb152.append(str52);
                                                                                                                                sb152.append(jCurrentTimeMillis92 - jCurrentTimeMillis82);
                                                                                                                                sb152.append(str28);
                                                                                                                                c20358OooO00o132.OooO0o0(sb152.toString(), new Object[0]);
                                                                                                                                file4 = new File(file2, noteMeta6.getTitle() + ".in");
                                                                                                                                if (C31190OooO0oo.OooO0oO(file4)) {
                                                                                                                                }
                                                                                                                                str = str49;
                                                                                                                                file = file2;
                                                                                                                                r24 = r25;
                                                                                                                            }
                                                                                                                        } catch (Exception e37) {
                                                                                                                            e = e37;
                                                                                                                            str48 = str44;
                                                                                                                            r24 = r712;
                                                                                                                            str = str43;
                                                                                                                            file = null;
                                                                                                                        }
                                                                                                                        r74 = r24;
                                                                                                                        str3 = str48;
                                                                                                                    } catch (Exception e38) {
                                                                                                                        e = e38;
                                                                                                                        str = str43;
                                                                                                                        r711 = r710;
                                                                                                                        str3 = str44;
                                                                                                                        r7 = r711;
                                                                                                                        file = null;
                                                                                                                        r74 = r7;
                                                                                                                    }
                                                                                                                } catch (Exception e39) {
                                                                                                                    e = e39;
                                                                                                                }
                                                                                                            } catch (Exception e40) {
                                                                                                                e = e40;
                                                                                                                r710 = r44;
                                                                                                            }
                                                                                                        } catch (Exception e41) {
                                                                                                            e = e41;
                                                                                                            r711 = r44;
                                                                                                            str3 = str44;
                                                                                                            r7 = r711;
                                                                                                            file = null;
                                                                                                            r74 = r7;
                                                                                                        }
                                                                                                    } catch (Exception e42) {
                                                                                                        e = e42;
                                                                                                        r710 = r44;
                                                                                                    }
                                                                                                } catch (Exception e43) {
                                                                                                    e = e43;
                                                                                                    str = str43;
                                                                                                    r224 = r223;
                                                                                                    r79 = r224;
                                                                                                    str3 = str39;
                                                                                                    r7 = r79;
                                                                                                }
                                                                                            } catch (Exception e44) {
                                                                                                e = e44;
                                                                                                str = str33;
                                                                                                str39 = str37;
                                                                                                r79 = r78;
                                                                                            }
                                                                                        } catch (Exception e45) {
                                                                                            e = e45;
                                                                                            str = str38;
                                                                                            str3 = str37;
                                                                                            r7 = r78;
                                                                                        }
                                                                                    } catch (Exception e46) {
                                                                                        e = e46;
                                                                                        str = str33;
                                                                                    }
                                                                                } catch (Exception e47) {
                                                                                    e = e47;
                                                                                    r19 = r6;
                                                                                    str = str33;
                                                                                    str3 = str30;
                                                                                    r7 = r19;
                                                                                }
                                                                                break;
                                                                            } catch (Exception e48) {
                                                                                e = e48;
                                                                                r19 = r6;
                                                                                str3 = str30;
                                                                                r7 = r19;
                                                                                file = null;
                                                                                r74 = r7;
                                                                                C34406OooO00o.C20358OooO00o c20358OooO00o222222 = C34406OooO00o.f123390OooO00o;
                                                                                c20358OooO00o222222.OooOOO0(str);
                                                                                c20358OooO00o222222.OooO0Oo(e, "getNoteInFileByPages, error.", new Object[0]);
                                                                                if (file != null) {
                                                                                }
                                                                                if (str3 != null) {
                                                                                }
                                                                            }
                                                                        } catch (Exception e49) {
                                                                            e = e49;
                                                                            str = str26;
                                                                        }
                                                                    } catch (Exception e50) {
                                                                        e = e50;
                                                                        str = str26;
                                                                        r222 = r43;
                                                                        str3 = string;
                                                                        r7 = r222;
                                                                    }
                                                                } catch (Exception e51) {
                                                                    e = e51;
                                                                    r222 = r43;
                                                                    str = str54;
                                                                }
                                                            } catch (Exception e52) {
                                                                e = e52;
                                                                r76 = r43;
                                                                str3 = string;
                                                                r73 = r76;
                                                                str = str54;
                                                                r7 = r73;
                                                            }
                                                            break;
                                                        }
                                                        C34406OooO00o.C20358OooO00o c20358OooO00o2222222 = C34406OooO00o.f123390OooO00o;
                                                        c20358OooO00o2222222.OooOOO0(str);
                                                        c20358OooO00o2222222.OooO0Oo(e, "getNoteInFileByPages, error.", new Object[0]);
                                                        if (file != null) {
                                                            C32501OooO0oO.OooO0Oo(file);
                                                        }
                                                        if (str3 != null) {
                                                            return null;
                                                        }
                                                        r74.invoke(str3);
                                                        C32460OooOooO c32460OooOooO = C32460OooOooO.f116667OooO00o;
                                                        return null;
                                                    }
                                                    break;
                                                }
                                            }
                                            NoteMeta noteMeta7 = noteMeta3;
                                            str20 = str23;
                                            r23 = r42;
                                            str18 = str24;
                                            noteMeta2 = noteMeta7;
                                        }
                                        str3 = string;
                                        str = str22;
                                        r7 = r77;
                                        file = null;
                                        r74 = r7;
                                        C34406OooO00o.C20358OooO00o c20358OooO00o22222222 = C34406OooO00o.f123390OooO00o;
                                        c20358OooO00o22222222.OooOOO0(str);
                                        c20358OooO00o22222222.OooO0Oo(e, "getNoteInFileByPages, error.", new Object[0]);
                                        if (file != null) {
                                        }
                                        if (str3 != null) {
                                        }
                                    }
                                    str25 = str18;
                                    r43 = r23;
                                    str23 = str20;
                                    z = false;
                                    C34406OooO00o.C20358OooO00o c20358OooO00o62 = C34406OooO00o.f123390OooO00o;
                                    str54 = str22;
                                    c20358OooO00o62.OooOOO0(str54);
                                    String str582 = str19;
                                    c20358OooO00o62.OooO0o0("getNoteInFileByPages, shouldZipPdfFile: " + z, new Object[0]);
                                    if (str23 != null) {
                                    }
                                    C34406OooO00o.C20358OooO00o c20358OooO00o222222222 = C34406OooO00o.f123390OooO00o;
                                    c20358OooO00o222222222.OooOOO0(str);
                                    c20358OooO00o222222222.OooO0Oo(e, "getNoteInFileByPages, error.", new Object[0]);
                                    if (file != null) {
                                    }
                                    if (str3 != null) {
                                    }
                                    break;
                                } else {
                                    str = "NoteInFileUseCase";
                                    try {
                                        throw new C27387o0000o0.OooO0O0(PerfConstants.CodeMarkerConstants.ACQUIRE_TOKEN_SILENT_COMMAND_EXECUTION_START, "noteContent is null, noteId: " + str18);
                                    } catch (Exception e53) {
                                        e = e53;
                                        r75 = r5;
                                        str3 = string;
                                        r7 = r75;
                                        file = null;
                                        r74 = r7;
                                        C34406OooO00o.C20358OooO00o c20358OooO00o2222222222 = C34406OooO00o.f123390OooO00o;
                                        c20358OooO00o2222222222.OooOOO0(str);
                                        c20358OooO00o2222222222.OooO0Oo(e, "getNoteInFileByPages, error.", new Object[0]);
                                        if (file != null) {
                                        }
                                        if (str3 != null) {
                                        }
                                    }
                                }
                            }
                        }
                    }
                    r72 = r45;
                    str3 = null;
                    r7 = r72;
                    file = null;
                    r74 = r7;
                    C34406OooO00o.C20358OooO00o c20358OooO00o22222222222 = C34406OooO00o.f123390OooO00o;
                    c20358OooO00o22222222222.OooOOO0(str);
                    c20358OooO00o22222222222.OooO0Oo(e, "getNoteInFileByPages, error.", new Object[0]);
                    if (file != null) {
                    }
                    if (str3 != null) {
                    }
                } else {
                    str = "NoteInFileUseCase";
                    try {
                        throw new C27387o0000o0.OooO0O0(PerfConstants.CodeMarkerConstants.ACQUIRE_TOKEN_SILENT_START, "noteMeta is null, noteId: " + str53);
                    } catch (Exception e54) {
                        e = e54;
                    }
                }
                r72 = interfaceC32507OooOO0o2;
                str3 = null;
                r7 = r72;
                file = null;
                r74 = r7;
                C34406OooO00o.C20358OooO00o c20358OooO00o222222222222 = C34406OooO00o.f123390OooO00o;
                c20358OooO00o222222222222.OooOOO0(str);
                c20358OooO00o222222222222.OooO0Oo(e, "getNoteInFileByPages, error.", new Object[0]);
                if (file != null) {
                }
                if (str3 != null) {
                }
                break;
            case 1:
                long j24 = this.f95571Oooo00O;
                InterfaceC32507OooOO0o interfaceC32507OooOO0o4 = this.f95561OooOo0o;
                C32446OooOOOo.OooO0O0(obj);
                str6 = " size: ";
                objOooO0oo = obj;
                interfaceC32507OooOO0o2 = interfaceC32507OooOO0o4;
                str7 = " ms.";
                jCurrentTimeMillis = j24;
                noteMeta = (NoteMeta) objOooO0oo;
                if (noteMeta == null) {
                }
                r72 = interfaceC32507OooOO0o2;
                str3 = null;
                r7 = r72;
                file = null;
                r74 = r7;
                C34406OooO00o.C20358OooO00o c20358OooO00o2222222222222 = C34406OooO00o.f123390OooO00o;
                c20358OooO00o2222222222222.OooOOO0(str);
                c20358OooO00o2222222222222.OooO0Oo(e, "getNoteInFileByPages, error.", new Object[0]);
                if (file != null) {
                }
                if (str3 != null) {
                }
                break;
            case 2:
                long j25 = this.f95571Oooo00O;
                NoteMeta noteMeta8 = (NoteMeta) this.f95560OooOo;
                InterfaceC32507OooOO0o interfaceC32507OooOO0o5 = this.f95561OooOo0o;
                C32446OooOOOo.OooO0O0(obj);
                str6 = " size: ";
                objOooOO0o = obj;
                noteMeta2 = noteMeta8;
                str7 = " ms.";
                jCurrentTimeMillis = j25;
                r45 = interfaceC32507OooOO0o5;
                noteContent = (NoteContent) objOooOO0o;
                if (noteContent != null) {
                }
                str8 = "getNoteInFileByPages, getPdfPathByNoteId: ";
                str9 = str7;
                str10 = ", cost: ";
                setO0OO00O = C34438OooOoo0.f123458OooOo0o;
                arrayList = new ArrayList();
                it = set11.iterator();
                while (it.hasNext()) {
                }
                if (arrayList.isEmpty()) {
                }
                r72 = r45;
                str3 = null;
                r7 = r72;
                file = null;
                r74 = r7;
                C34406OooO00o.C20358OooO00o c20358OooO00o22222222222222 = C34406OooO00o.f123390OooO00o;
                c20358OooO00o22222222222222.OooOOO0(str);
                c20358OooO00o22222222222222.OooO0Oo(e, "getNoteInFileByPages, error.", new Object[0]);
                if (file != null) {
                }
                if (str3 != null) {
                }
                break;
            case 3:
                long j26 = this.f95571Oooo00O;
                String str69 = (String) this.f95564OooOoOO;
                Set set13 = (Set) this.f95562OooOoO;
                NoteMeta noteMeta9 = this.f95563OooOoO0;
                String str70 = (String) this.f95560OooOo;
                InterfaceC32507OooOO0o interfaceC32507OooOO0o6 = this.f95561OooOo0o;
                C32446OooOOOo.OooO0O0(obj);
                set = set11;
                str8 = "getNoteInFileByPages, getPdfPathByNoteId: ";
                str11 = ", dstNoteId: ";
                string = str70;
                set2 = set13;
                str10 = ", cost: ";
                r4 = interfaceC32507OooOO0o6;
                str12 = str69;
                str6 = " size: ";
                str9 = " ms.";
                jCurrentTimeMillis = j26;
                noteMeta2 = noteMeta9;
                C34406OooO00o.C20358OooO00o c20358OooO00o32 = C34406OooO00o.f123390OooO00o;
                c20358OooO00o32.OooOOO0("NoteInFileUseCase");
                StringBuilder sb22 = new StringBuilder();
                sb22.append("getNoteInFileByPages, renameSrcNoteIdToDst done, srcNoteId: ");
                sb22.append(str53);
                str13 = str11;
                sb22.append(str13);
                sb22.append(str12);
                String str552 = str12;
                r83 = r4;
                c20358OooO00o32.OooO0o0(sb22.toString(), new Object[0]);
                Set setOooO0oO2 = C34449Oooo0oo.OooO0oO(set2, set);
                set3 = setOooO0oO2;
                it2 = setOooO0oO2.iterator();
                r5 = r83;
                c27387o0000o0 = c27387o0000o010;
                str14 = str552;
                if (!it2.hasNext()) {
                }
                break;
            case 4:
                long j27 = this.f95571Oooo00O;
                Iterator it15 = (Iterator) this.f95565OooOoo;
                C27387o0000o0 c27387o0000o017 = (C27387o0000o0) this.f95566OooOoo0;
                Set set14 = (Set) this.f95564OooOoOO;
                String str71 = (String) this.f95562OooOoO;
                NoteMeta noteMeta10 = this.f95563OooOoO0;
                String str72 = (String) this.f95560OooOo;
                InterfaceC32507OooOO0o interfaceC32507OooOO0o7 = this.f95561OooOo0o;
                C32446OooOOOo.OooO0O0(obj);
                str13 = ", dstNoteId: ";
                str14 = str71;
                str10 = ", cost: ";
                str15 = str53;
                c27387o0000o02 = c27387o0000o010;
                r52 = interfaceC32507OooOO0o7;
                it2 = it15;
                str6 = " size: ";
                c27387o0000o0 = c27387o0000o017;
                set3 = set14;
                noteMeta2 = noteMeta10;
                str8 = "getNoteInFileByPages, getPdfPathByNoteId: ";
                str9 = " ms.";
                string = str72;
                set = set11;
                jCurrentTimeMillis = j27;
                c27387o0000o010 = c27387o0000o02;
                str53 = str15;
                r5 = r52;
                if (!it2.hasNext()) {
                }
                break;
            case 5:
                long j28 = this.f95571Oooo00O;
                Set set15 = (Set) this.f95564OooOoOO;
                str18 = (String) this.f95562OooOoO;
                NoteMeta noteMeta11 = this.f95563OooOoO0;
                String str73 = (String) this.f95560OooOo;
                InterfaceC32507OooOO0o interfaceC32507OooOO0o8 = this.f95561OooOo0o;
                C32446OooOOOo.OooO0O0(obj);
                set = set11;
                str8 = "getNoteInFileByPages, getPdfPathByNoteId: ";
                str17 = str53;
                c27387o0000o03 = c27387o0000o010;
                string = str73;
                r53 = interfaceC32507OooOO0o8;
                str10 = ", cost: ";
                set4 = set15;
                str13 = ", dstNoteId: ";
                str6 = " size: ";
                str9 = " ms.";
                jCurrentTimeMillis = j28;
                noteMeta2 = noteMeta11;
                C34406OooO00o.C20358OooO00o c20358OooO00o42 = C34406OooO00o.f123390OooO00o;
                c20358OooO00o42.OooOOO0("NoteInFileUseCase");
                c20358OooO00o42.OooO0o0("getNoteInFileByPages, deletePagesPermanently done, toDeletePageIds: " + set4 + str13 + str18, new Object[0]);
                InterfaceC27309OooOoO interfaceC27309OooOoO22 = c27387o0000o03.f95429OooO0Oo;
                this.f95561OooOo0o = r53;
                this.f95560OooOo = string;
                this.f95563OooOoO0 = noteMeta2;
                this.f95562OooOoO = str18;
                this.f95564OooOoOO = null;
                this.f95571Oooo00O = jCurrentTimeMillis;
                this.f95569Oooo0 = 6;
                objOooOO0o2 = interfaceC27309OooOoO22.OooOO0o(str18, this);
                r5 = r53;
                if (objOooOO0o2 == enumC32485OooO00o6) {
                }
                noteContent2 = (NoteContent) objOooOO0o2;
                if (noteContent2 != null) {
                }
                break;
            case 6:
                long j29 = this.f95571Oooo00O;
                String str74 = (String) this.f95562OooOoO;
                NoteMeta noteMeta12 = this.f95563OooOoO0;
                String str75 = (String) this.f95560OooOo;
                InterfaceC32507OooOO0o interfaceC32507OooOO0o9 = this.f95561OooOo0o;
                C32446OooOOOo.OooO0O0(obj);
                set = set11;
                str8 = "getNoteInFileByPages, getPdfPathByNoteId: ";
                string = str75;
                str10 = ", cost: ";
                str9 = " ms.";
                str17 = str53;
                c27387o0000o03 = c27387o0000o010;
                r5 = interfaceC32507OooOO0o9;
                objOooOO0o2 = obj;
                noteMeta2 = noteMeta12;
                str18 = str74;
                str6 = " size: ";
                jCurrentTimeMillis = j29;
                noteContent2 = (NoteContent) objOooOO0o2;
                if (noteContent2 != null) {
                }
                break;
            case 7:
                long j30 = this.f95571Oooo00O;
                String str76 = (String) this.f95562OooOoO;
                NoteMeta noteMeta13 = this.f95563OooOoO0;
                String str77 = (String) this.f95560OooOo;
                InterfaceC32507OooOO0o interfaceC32507OooOO0o10 = this.f95561OooOo0o;
                C32446OooOOOo.OooO0O0(obj);
                str8 = "getNoteInFileByPages, getPdfPathByNoteId: ";
                string = str77;
                str10 = ", cost: ";
                str9 = " ms.";
                str17 = str53;
                c27387o0000o03 = c27387o0000o010;
                set5 = set11;
                noteMeta2 = noteMeta13;
                str18 = str76;
                str6 = " size: ";
                jCurrentTimeMillis = j30;
                r2 = interfaceC32507OooOO0o10;
                this.f95561OooOo0o = r2;
                this.f95560OooOo = string;
                this.f95563OooOoO0 = noteMeta2;
                this.f95562OooOoO = str18;
                this.f95571Oooo00O = jCurrentTimeMillis;
                this.f95569Oooo0 = 8;
                c27387o0000o04 = c27387o0000o03;
                str19 = str17;
                objOoooOO0 = c27387o0000o04.OoooOO0(str19, this);
                r2 = r2;
                if (objOoooOO0 == enumC32485OooO00o6) {
                }
                str20 = (String) objOoooOO0;
                C34406OooO00o.C20358OooO00o c20358OooO00o52 = C34406OooO00o.f123390OooO00o;
                c20358OooO00o52.OooOOO0("NoteInFileUseCase");
                StringBuilder sb32 = new StringBuilder();
                c27387o0000o05 = c27387o0000o04;
                String str562 = str8;
                sb32.append(str562);
                sb32.append(str20);
                str21 = str562;
                str22 = "NoteInFileUseCase";
                c20358OooO00o52.OooO0o0(sb32.toString(), new Object[0]);
                r23 = r2;
                if (str20 != null) {
                }
                str25 = str18;
                r43 = r23;
                str23 = str20;
                z = false;
                C34406OooO00o.C20358OooO00o c20358OooO00o622 = C34406OooO00o.f123390OooO00o;
                str54 = str22;
                c20358OooO00o622.OooOOO0(str54);
                String str5822 = str19;
                c20358OooO00o622.OooO0o0("getNoteInFileByPages, shouldZipPdfFile: " + z, new Object[0]);
                if (str23 != null) {
                }
                C34406OooO00o.C20358OooO00o c20358OooO00o222222222222222 = C34406OooO00o.f123390OooO00o;
                c20358OooO00o222222222222222.OooOOO0(str);
                c20358OooO00o222222222222222.OooO0Oo(e, "getNoteInFileByPages, error.", new Object[0]);
                if (file != null) {
                }
                if (str3 != null) {
                }
                break;
            case 8:
                long j31 = this.f95571Oooo00O;
                String str78 = (String) this.f95562OooOoO;
                NoteMeta noteMeta14 = this.f95563OooOoO0;
                String str79 = (String) this.f95560OooOo;
                InterfaceC32507OooOO0o interfaceC32507OooOO0o11 = this.f95561OooOo0o;
                C32446OooOOOo.OooO0O0(obj);
                set5 = set11;
                str19 = str53;
                str8 = "getNoteInFileByPages, getPdfPathByNoteId: ";
                string = str79;
                str10 = ", cost: ";
                str9 = " ms.";
                objOoooOO0 = obj;
                noteMeta2 = noteMeta14;
                c27387o0000o04 = c27387o0000o010;
                str18 = str78;
                str6 = " size: ";
                jCurrentTimeMillis = j31;
                r2 = interfaceC32507OooOO0o11;
                str20 = (String) objOoooOO0;
                C34406OooO00o.C20358OooO00o c20358OooO00o522 = C34406OooO00o.f123390OooO00o;
                c20358OooO00o522.OooOOO0("NoteInFileUseCase");
                StringBuilder sb322 = new StringBuilder();
                c27387o0000o05 = c27387o0000o04;
                String str5622 = str8;
                sb322.append(str5622);
                sb322.append(str20);
                str21 = str5622;
                str22 = "NoteInFileUseCase";
                c20358OooO00o522.OooO0o0(sb322.toString(), new Object[0]);
                r23 = r2;
                if (str20 != null) {
                }
                str25 = str18;
                r43 = r23;
                str23 = str20;
                z = false;
                C34406OooO00o.C20358OooO00o c20358OooO00o6222 = C34406OooO00o.f123390OooO00o;
                str54 = str22;
                c20358OooO00o6222.OooOOO0(str54);
                String str58222 = str19;
                c20358OooO00o6222.OooO0o0("getNoteInFileByPages, shouldZipPdfFile: " + z, new Object[0]);
                if (str23 != null) {
                }
                C34406OooO00o.C20358OooO00o c20358OooO00o2222222222222222 = C34406OooO00o.f123390OooO00o;
                c20358OooO00o2222222222222222.OooOOO0(str);
                c20358OooO00o2222222222222222.OooO0Oo(e, "getNoteInFileByPages, error.", new Object[0]);
                if (file != null) {
                }
                if (str3 != null) {
                }
                break;
            case 9:
                long j32 = this.f95571Oooo00O;
                String str80 = (String) this.f95564OooOoOO;
                String str81 = (String) this.f95562OooOoO;
                noteMeta3 = this.f95563OooOoO0;
                String str82 = (String) this.f95560OooOo;
                InterfaceC32507OooOO0o interfaceC32507OooOO0o12 = this.f95561OooOo0o;
                try {
                    C32446OooOOOo.OooO0O0(obj);
                    set5 = set11;
                    str19 = str53;
                    str21 = "getNoteInFileByPages, getPdfPathByNoteId: ";
                    str10 = ", cost: ";
                    str22 = "NoteInFileUseCase";
                    c27387o0000o05 = c27387o0000o010;
                    string = str82;
                    str9 = " ms.";
                    objOooO = obj;
                    str24 = str81;
                    r42 = interfaceC32507OooOO0o12;
                    str23 = str80;
                    str6 = " size: ";
                    jCurrentTimeMillis = j32;
                    arrayList2 = new ArrayList();
                    while (r7.hasNext()) {
                    }
                    if (arrayList2.isEmpty()) {
                    }
                    NoteMeta noteMeta72 = noteMeta3;
                    str20 = str23;
                    r23 = r42;
                    str18 = str24;
                    noteMeta2 = noteMeta72;
                    str25 = str18;
                    r43 = r23;
                    str23 = str20;
                    z = false;
                    C34406OooO00o.C20358OooO00o c20358OooO00o62222 = C34406OooO00o.f123390OooO00o;
                    str54 = str22;
                    c20358OooO00o62222.OooOOO0(str54);
                    String str582222 = str19;
                    c20358OooO00o62222.OooO0o0("getNoteInFileByPages, shouldZipPdfFile: " + z, new Object[0]);
                    if (str23 != null) {
                    }
                } catch (Exception e55) {
                    e = e55;
                    r7 = interfaceC32507OooOO0o12;
                    str = "NoteInFileUseCase";
                    str3 = str82;
                    break;
                }
                C34406OooO00o.C20358OooO00o c20358OooO00o22222222222222222 = C34406OooO00o.f123390OooO00o;
                c20358OooO00o22222222222222222.OooOOO0(str);
                c20358OooO00o22222222222222222.OooO0Oo(e, "getNoteInFileByPages, error.", new Object[0]);
                if (file != null) {
                }
                if (str3 != null) {
                }
                break;
            case 10:
                long j33 = this.f95572Oooo00o;
                long j34 = this.f95571Oooo00O;
                Map map29 = (Map) this.f95566OooOoo0;
                String str83 = (String) this.f95564OooOoOO;
                String str84 = (String) this.f95562OooOoO;
                NoteMeta noteMeta15 = this.f95563OooOoO0;
                String str85 = (String) this.f95560OooOo;
                InterfaceC32507OooOO0o interfaceC32507OooOO0o13 = this.f95561OooOo0o;
                C32446OooOOOo.OooO0O0(obj);
                enumC32485OooO00o = enumC32485OooO00o6;
                obj2 = obj;
                str26 = "NoteInFileUseCase";
                map = map29;
                str6 = " size: ";
                str31 = str84;
                j2 = j33;
                r6 = interfaceC32507OooOO0o13;
                c27387o0000o06 = c27387o0000o010;
                str30 = str85;
                str32 = str83;
                j = j34;
                str27 = ", cost: ";
                str29 = str53;
                noteMeta2 = noteMeta15;
                str28 = " ms.";
                long j162 = j2;
                Iterable iterable4 = (Iterable) obj2;
                set7 = set11;
                linkedHashMap = new LinkedHashMap(oO0O00oo.OooOO0.OooO0OO(oOo000Oo.Oooo0.OooO0Oo(C34428OooOOo.OooOOoo(iterable4, 10))));
                it4 = iterable4.iterator();
                while (it4.hasNext()) {
                }
                j3 = j;
                String str622 = str29;
                long jOooo00O7 = C27387o0000o0.Oooo00O(c27387o0000o06, linkedHashMap.values());
                long jCurrentTimeMillis52 = System.currentTimeMillis();
                C34406OooO00o.C20358OooO00o c20358OooO00o72 = C34406OooO00o.f123390OooO00o;
                str = str26;
                c20358OooO00o72.OooOOO0(str);
                str33 = str;
                int size7 = linkedHashMap.size();
                C27387o0000o0 c27387o0000o0112 = c27387o0000o06;
                String strOooO0OO7 = C31430OooO00o.OooO0OO(jOooo00O7);
                long j182 = jCurrentTimeMillis52 - j162;
                StringBuilder sb62 = new StringBuilder();
                Map map222 = map;
                sb62.append("getNoteInFileByPages, getImageUrisByNoteId, num: ");
                sb62.append(size7);
                str34 = str6;
                sb62.append(str34);
                sb62.append(strOooO0OO7);
                sb62.append(str27);
                sb62.append(j182);
                sb62.append(str28);
                c20358OooO00o72.OooO0o0(sb62.toString(), new Object[0]);
                this.f95561OooOo0o = r6;
                this.f95560OooOo = str30;
                this.f95563OooOoO0 = noteMeta2;
                this.f95562OooOoO = str31;
                this.f95564OooOoOO = str32;
                this.f95566OooOoo0 = map222;
                this.f95565OooOoo = linkedHashMap;
                this.f95571Oooo00O = j3;
                this.f95572Oooo00o = jCurrentTimeMillis52;
                this.f95569Oooo0 = 11;
                j4 = jCurrentTimeMillis52;
                str35 = str622;
                c27387o0000o07 = c27387o0000o0112;
                objOooOOOo = C27387o0000o0.OooOOOo(str35, set7, c27387o0000o07, this);
                ?? r1922 = r6;
                enumC32485OooO00o2 = enumC32485OooO00o;
                if (objOooOOOo != enumC32485OooO00o2) {
                }
                break;
            case 11:
                long j35 = this.f95572Oooo00o;
                long j36 = this.f95571Oooo00O;
                Map map30 = (Map) this.f95565OooOoo;
                Map map31 = (Map) this.f95566OooOoo0;
                String str86 = (String) this.f95564OooOoOO;
                String str87 = (String) this.f95562OooOoO;
                NoteMeta noteMeta16 = this.f95563OooOoO0;
                String str88 = (String) this.f95560OooOo;
                InterfaceC32507OooOO0o interfaceC32507OooOO0o14 = this.f95561OooOo0o;
                C32446OooOOOo.OooO0O0(obj);
                map3 = map31;
                c27387o0000o07 = c27387o0000o010;
                set8 = set11;
                j4 = j35;
                j5 = j36;
                str27 = ", cost: ";
                str34 = " size: ";
                str33 = "NoteInFileUseCase";
                str36 = str87;
                noteMeta4 = noteMeta16;
                str37 = str88;
                r78 = interfaceC32507OooOO0o14;
                enumC32485OooO00o3 = enumC32485OooO00o6;
                str35 = str53;
                map2 = map30;
                str28 = " ms.";
                str32 = str86;
                String str632 = str35;
                ArrayList arrayList52 = new ArrayList();
                while (r19.hasNext()) {
                }
                j6 = j5;
                linkedHashMap2 = new LinkedHashMap(oO0O00oo.OooOO0.OooO0OO(oOo000Oo.Oooo0.OooO0Oo(C34428OooOOo.OooOOoo(arrayList52, 10))));
                it5 = arrayList52.iterator();
                while (it5.hasNext()) {
                }
                map4 = map2;
                long jOooo00O22 = C27387o0000o0.Oooo00O(c27387o0000o07, linkedHashMap2.values());
                long jCurrentTimeMillis62 = System.currentTimeMillis();
                C34406OooO00o.C20358OooO00o c20358OooO00o82 = C34406OooO00o.f123390OooO00o;
                str38 = str33;
                c20358OooO00o82.OooOOO0(str38);
                str33 = str38;
                int size22 = linkedHashMap2.size();
                C27387o0000o0 c27387o0000o0122 = c27387o0000o07;
                String strOooO0OO22 = C31430OooO00o.OooO0OO(jOooo00O22);
                StringBuilder sb82 = new StringBuilder();
                Map map242 = map3;
                sb82.append("getNoteInFileByPages, getPaperThemeUrisByNoteId, num: ");
                sb82.append(size22);
                sb82.append(str34);
                sb82.append(strOooO0OO22);
                sb82.append(str27);
                sb82.append(jCurrentTimeMillis62 - j4);
                sb82.append(str28);
                c20358OooO00o82.OooO0o0(sb82.toString(), new Object[0]);
                this.f95561OooOo0o = r78;
                this.f95560OooOo = str37;
                this.f95563OooOoO0 = noteMeta4;
                this.f95562OooOoO = str36;
                this.f95564OooOoOO = map242;
                this.f95566OooOoo0 = map4;
                this.f95565OooOoo = linkedHashMap2;
                this.f95571Oooo00O = j6;
                this.f95572Oooo00o = jCurrentTimeMillis62;
                this.f95569Oooo0 = 12;
                j7 = jCurrentTimeMillis62;
                set9 = set8;
                c27387o0000o08 = c27387o0000o0122;
                objOooOOoo = C27387o0000o0.OooOOoo(str632, set9, c27387o0000o08, this);
                enumC32485OooO00o4 = enumC32485OooO00o3;
                if (objOooOOoo != enumC32485OooO00o4) {
                }
                break;
            case 12:
                long j37 = this.f95572Oooo00o;
                long j38 = this.f95571Oooo00O;
                Map map32 = (Map) this.f95565OooOoo;
                Map map33 = (Map) this.f95566OooOoo0;
                Map map34 = (Map) this.f95564OooOoOO;
                String str89 = (String) this.f95562OooOoO;
                NoteMeta noteMeta17 = this.f95563OooOoO0;
                String str90 = (String) this.f95560OooOo;
                InterfaceC32507OooOO0o interfaceC32507OooOO0o15 = this.f95561OooOo0o;
                C32446OooOOOo.OooO0O0(obj);
                j7 = j37;
                j8 = j38;
                str27 = ", cost: ";
                str34 = " size: ";
                map5 = map33;
                str33 = "NoteInFileUseCase";
                str36 = str89;
                noteMeta4 = noteMeta17;
                str37 = str90;
                r78 = interfaceC32507OooOO0o15;
                str28 = " ms.";
                c27387o0000o08 = c27387o0000o010;
                enumC32485OooO00o4 = enumC32485OooO00o6;
                set9 = set11;
                objOooOOoo = obj;
                map6 = map34;
                map7 = map32;
                Iterable iterable22 = (Iterable) objOooOOoo;
                set10 = set9;
                linkedHashMap3 = new LinkedHashMap(oO0O00oo.OooOO0.OooO0OO(oOo000Oo.Oooo0.OooO0Oo(C34428OooOOo.OooOOoo(iterable22, 10))));
                it6 = iterable22.iterator();
                while (it6.hasNext()) {
                }
                map8 = map7;
                Map map272 = map5;
                EnumC32485OooO00o enumC32485OooO00o82 = enumC32485OooO00o4;
                long jOooo00O32 = C27387o0000o0.Oooo00O(c27387o0000o08, linkedHashMap3.values());
                long jCurrentTimeMillis72 = System.currentTimeMillis();
                C34406OooO00o.C20358OooO00o c20358OooO00o92 = C34406OooO00o.f123390OooO00o;
                str40 = str33;
                c20358OooO00o92.OooOOO0(str40);
                int size32 = linkedHashMap3.size();
                String strOooO0OO32 = C31430OooO00o.OooO0OO(jOooo00O32);
                r223 = r78;
                str39 = str37;
                long j202 = jCurrentTimeMillis72 - j7;
                StringBuilder sb102 = new StringBuilder();
                map9 = map6;
                sb102.append("getNoteInFileByPages, getPdfSetPaperThemeUrisByNoteId, num: ");
                sb102.append(size32);
                sb102.append(str34);
                sb102.append(strOooO0OO32);
                sb102.append(str27);
                sb102.append(j202);
                sb102.append(str28);
                c20358OooO00o92.OooO0o0(sb102.toString(), new Object[0]);
                File dataDir2 = c27387o0000o08.f95452OooOoo0.getDataDir();
                kotlin.jvm.internal.OooOOO0.OooO0o(dataDir2, "getDataDir(...)");
                String[] strArrDatabaseList2 = c27387o0000o08.f95452OooOoo0.databaseList();
                kotlin.jvm.internal.OooOOO0.OooO0o(strArrDatabaseList2, "databaseList(...)");
                ArrayList<String> arrayList62 = new ArrayList();
                while (i < r6) {
                }
                linkedHashMap4 = new LinkedHashMap(oO0O00oo.OooOO0.OooO0OO(oOo000Oo.Oooo0.OooO0Oo(C34428OooOOo.OooOOoo(arrayList62, 10))));
                while (r4.hasNext()) {
                }
                long jOooo00O42 = C27387o0000o0.Oooo00O(c27387o0000o08, linkedHashMap4.values());
                jCurrentTimeMillis2 = System.currentTimeMillis();
                C34406OooO00o.C20358OooO00o c20358OooO00o102 = C34406OooO00o.f123390OooO00o;
                c20358OooO00o102.OooOOO0(str40);
                int size42 = linkedHashMap4.size();
                String strOooO0OO42 = C31430OooO00o.OooO0OO(jOooo00O42);
                String str662 = str27;
                str41 = str34;
                long j212 = jCurrentTimeMillis2 - jCurrentTimeMillis72;
                str42 = str662;
                StringBuilder sb122 = new StringBuilder();
                str43 = str40;
                sb122.append("getNoteInFileByPages, getDatabaseList, num: ");
                sb122.append(size42);
                sb122.append(", size: ");
                sb122.append(strOooO0OO42);
                sb122.append(" cost: ");
                sb122.append(j212);
                sb122.append(str28);
                c20358OooO00o102.OooO0o0(sb122.toString(), new Object[0]);
                this.f95561OooOo0o = r223;
                this.f95560OooOo = str39;
                this.f95563OooOoO0 = noteMeta4;
                this.f95562OooOoO = str36;
                this.f95564OooOoOO = map9;
                map10 = map272;
                this.f95566OooOoo0 = map10;
                this.f95565OooOoo = map8;
                this.f95567OooOooO = linkedHashMap3;
                this.f95568OooOooo = linkedHashMap4;
                r223 = r223;
                str39 = str39;
                j9 = j8;
                this.f95571Oooo00O = j9;
                this.f95572Oooo00o = jCurrentTimeMillis2;
                this.f95569Oooo0 = 13;
                objOooO0OO = C27387o0000o0.OooO0OO(c27387o0000o08, str36, this);
                enumC32485OooO00o6 = enumC32485OooO00o82;
                if (objOooO0OO != enumC32485OooO00o6) {
                }
                break;
            case 13:
                long j39 = this.f95572Oooo00o;
                long j40 = this.f95571Oooo00O;
                Map map35 = this.f95568OooOooo;
                Map map36 = this.f95567OooOooO;
                Map map37 = (Map) this.f95565OooOoo;
                Map map38 = (Map) this.f95566OooOoo0;
                Map map39 = (Map) this.f95564OooOoOO;
                String str91 = (String) this.f95562OooOoO;
                NoteMeta noteMeta18 = this.f95563OooOoO0;
                String str92 = (String) this.f95560OooOo;
                InterfaceC32507OooOO0o interfaceC32507OooOO0o16 = this.f95561OooOo0o;
                C32446OooOOOo.OooO0O0(obj);
                set10 = set11;
                str44 = str92;
                map12 = map37;
                j11 = j40;
                map14 = map39;
                str28 = " ms.";
                str42 = ", cost: ";
                str43 = "NoteInFileUseCase";
                map13 = map35;
                str36 = str91;
                map11 = map36;
                j10 = j39;
                r44 = interfaceC32507OooOO0o16;
                str41 = " size: ";
                map10 = map38;
                c27387o0000o08 = c27387o0000o010;
                noteMeta4 = noteMeta18;
                objOooO0OO = obj;
                Iterable iterable32 = (Iterable) objOooO0OO;
                map15 = map13;
                linkedHashMap5 = new LinkedHashMap(oO0O00oo.OooOO0.OooO0OO(oOo000Oo.Oooo0.OooO0Oo(C34428OooOOo.OooOOoo(iterable32, 10))));
                it7 = iterable32.iterator();
                while (it7.hasNext()) {
                }
                enumC32485OooO00o5 = enumC32485OooO00o6;
                long j232 = j11;
                long jOooo00O52 = C27387o0000o0.Oooo00O(c27387o0000o08, linkedHashMap5.values());
                jCurrentTimeMillis3 = System.currentTimeMillis();
                C34406OooO00o.C20358OooO00o c20358OooO00o112 = C34406OooO00o.f123390OooO00o;
                str = str43;
                c20358OooO00o112.OooOOO0(str);
                str43 = str;
                int size52 = linkedHashMap5.size();
                C27387o0000o0 c27387o0000o0132 = c27387o0000o08;
                String strOooO0OO52 = C31430OooO00o.OooO0OO(jOooo00O52);
                StringBuilder sb132 = new StringBuilder();
                map16 = map12;
                sb132.append("getNoteInFileByPages, getAudioPathsByNoteId, num: ");
                sb132.append(size52);
                str45 = str41;
                sb132.append(str45);
                sb132.append(strOooO0OO52);
                str46 = str42;
                sb132.append(str46);
                sb132.append(jCurrentTimeMillis3 - j10);
                sb132.append(str28);
                c20358OooO00o112.OooO0o0(sb132.toString(), new Object[0]);
                this.f95561OooOo0o = r44;
                this.f95560OooOo = str44;
                this.f95563OooOoO0 = noteMeta4;
                this.f95562OooOoO = str36;
                this.f95564OooOoOO = map14;
                this.f95566OooOoo0 = map10;
                this.f95565OooOoo = map16;
                this.f95567OooOooO = map11;
                this.f95568OooOooo = map15;
                this.f95570Oooo000 = linkedHashMap5;
                r710 = r44;
                this.f95571Oooo00O = j232;
                j12 = j232;
                this.f95572Oooo00o = jCurrentTimeMillis3;
                this.f95569Oooo0 = 14;
                c27387o0000o09 = c27387o0000o0132;
                objOooO0o = C27387o0000o0.OooO0o(c27387o0000o09, str36, this);
                if (objOooO0o != enumC32485OooO00o5) {
                }
                break;
            case 14:
                long j41 = this.f95572Oooo00o;
                long j42 = this.f95571Oooo00O;
                linkedHashMap6 = this.f95570Oooo000;
                map20 = this.f95568OooOooo;
                Map map40 = this.f95567OooOooO;
                map19 = (Map) this.f95565OooOoo;
                j13 = j41;
                Map map41 = (Map) this.f95566OooOoo0;
                map17 = (Map) this.f95564OooOoOO;
                String str93 = (String) this.f95562OooOoO;
                NoteMeta noteMeta19 = this.f95563OooOoO0;
                String str94 = (String) this.f95560OooOo;
                InterfaceC32507OooOO0o interfaceC32507OooOO0o17 = this.f95561OooOo0o;
                C32446OooOOOo.OooO0O0(obj);
                set10 = set11;
                j12 = j42;
                map18 = map40;
                str43 = "NoteInFileUseCase";
                str47 = str93;
                noteMeta5 = noteMeta19;
                str44 = str94;
                r712 = interfaceC32507OooOO0o17;
                str46 = ", cost: ";
                str28 = " ms.";
                c27387o0000o09 = c27387o0000o010;
                objOooO0o = obj;
                str45 = " size: ";
                map10 = map41;
                file2 = (File) objOooO0o;
                str48 = str44;
                file3 = new File(file2, "note_meta.json");
                noteMetaCopy$default = NoteMeta.copy$default(noteMeta5, str47, null, null, null, null, false, null, 0, 0, false, null, set10.size(), 0L, 0L, null, false, false, false, 0L, 522238, null);
                noteMeta6 = noteMeta5;
                str50 = str47;
                r16 = r712;
                str51 = this.f95575Oooo0o;
                if (str51 == null) {
                }
                r74 = r24;
                str3 = str48;
                C34406OooO00o.C20358OooO00o c20358OooO00o222222222222222222 = C34406OooO00o.f123390OooO00o;
                c20358OooO00o222222222222222222.OooOOO0(str);
                c20358OooO00o222222222222222222.OooO0Oo(e, "getNoteInFileByPages, error.", new Object[0]);
                if (file != null) {
                }
                if (str3 != null) {
                }
                break;
            default:
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }
}
