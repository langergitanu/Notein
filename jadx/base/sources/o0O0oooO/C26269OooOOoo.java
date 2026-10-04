package o0O0oooO;

import Oooo.C20813OooO0o0;
import Oooo0oO.C21023OooO0Oo;
import android.content.Context;
import android.util.Log;
import androidx.work.ListenableWorker;
import androidx.work.WorkerParameters;
import com.alibaba.sdk.android.oss.OSS;
import com.alibaba.sdk.android.oss.OSSClient;
import com.alibaba.sdk.android.oss.common.auth.OSSCredentialProvider;
import com.alibaba.sdk.android.oss.common.auth.OSSPlainTextAKSKCredentialProvider;
import com.aspose.slides.C22230OoooO0O;
import com.aspose.slides.internal.p332p7.C22238OooO0oO;
import com.aspose.words.StyleIdentifier;
import com.google.common.collect.ImmutableMap;
import com.google.common.collect.ImmutableSet;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.orion.notein.App;
import com.orion.notein.data.p602db.CloudSyncDatabase;
import com.orion.notein.data.p602db.NoteAiDatabase;
import com.orion.notein.data.p602db.NoteCacheDatabase;
import com.orion.notein.data.p602db.NoteDatabase;
import com.orion.notein.data.p602db.PlayFlavorDatabase;
import com.orion.notein.data.repo.backup.BackupBaiduDatasource;
import com.orion.notein.data.repo.backup.C22907OooOooO;
import com.orion.notein.data.repo.backup.C22912Oooo0O0;
import com.orion.notein.data.repo.backup.C22913Oooo0OO;
import com.orion.notein.data.repo.cloudsync.onedrive.OneDriveApiService;
import com.orion.notein.data.repo.transactions.C22949Oooo0oO;
import com.orion.notein.data.repo.transactions.GoogleBillingDataSource;
import com.orion.notein.data.service.user.NoteinFirebaseUserApiService;
import com.orion.notein.domain.mapper.AdMapper;
import com.orion.notein.domain.mapper.AiOcrSessionMapper;
import com.orion.notein.domain.mapper.AiOcrTextPageMapper;
import com.orion.notein.domain.mapper.AudioMapper;
import com.orion.notein.domain.mapper.ColorSetMapper;
import com.orion.notein.domain.mapper.CommentMapper;
import com.orion.notein.domain.mapper.CouponMapper;
import com.orion.notein.domain.mapper.DualLinkRefMapper;
import com.orion.notein.domain.mapper.DualLinkSourceMapper;
import com.orion.notein.domain.mapper.FolderMapper;
import com.orion.notein.domain.mapper.HandWritingTextCacheMapper;
import com.orion.notein.domain.mapper.HyperLinkMapper;
import com.orion.notein.domain.mapper.ImageMapper;
import com.orion.notein.domain.mapper.LabelMapper;
import com.orion.notein.domain.mapper.LabelRefMapper;
import com.orion.notein.domain.mapper.LatestOpenedNoteMapper;
import com.orion.notein.domain.mapper.MaterialMapper;
import com.orion.notein.domain.mapper.MyTemplateMapper;
import com.orion.notein.domain.mapper.NoteAiContentMapper;
import com.orion.notein.domain.mapper.NoteContentMapper;
import com.orion.notein.domain.mapper.NoteFileMapper;
import com.orion.notein.domain.mapper.NoteHistoryVersionMapper;
import com.orion.notein.domain.mapper.NoteMapper;
import com.orion.notein.domain.mapper.NoteMetaMapper;
import com.orion.notein.domain.mapper.NotePlaceholderMapper;
import com.orion.notein.domain.mapper.NoteinAiQuotaRecordMapper;
import com.orion.notein.domain.mapper.NoteinFirebaseUserMapper;
import com.orion.notein.domain.mapper.NoteinGoogleOfferMapper;
import com.orion.notein.domain.mapper.NoteinGooglePurchaseMapper;
import com.orion.notein.domain.mapper.NoteinMessageMapper;
import com.orion.notein.domain.mapper.OutlineMapper;
import com.orion.notein.domain.mapper.PageGridModificationRecordMapper;
import com.orion.notein.domain.mapper.PageLayerMapper;
import com.orion.notein.domain.mapper.PageMapper;
import com.orion.notein.domain.mapper.PdfInfoMapper;
import com.orion.notein.domain.mapper.PdfTextCacheMapper;
import com.orion.notein.domain.mapper.PenInfoMapper;
import com.orion.notein.domain.mapper.QuoteMapper;
import com.orion.notein.domain.mapper.ShapeMapper;
import com.orion.notein.domain.mapper.StickerMapper;
import com.orion.notein.domain.mapper.StrokeMapper;
import com.orion.notein.domain.mapper.TextBoxMapper;
import com.orion.notein.domain.mapper.ToolBoxInfoMapper;
import com.orion.notein.domain.mapper.UserMapper;
import com.orion.notein.domain.mapper.cloudsync.CloudMetaMapper;
import com.orion.notein.domain.models.cloudsync.CloudMetaType;
import com.orion.notein.domain.workmanager.PageTextCacheUpdateWorker;
import com.orion.notein.p607ui.backup.netdisk.CloudBackupWorker;
import com.orion.notein.p607ui.feedback.FeedbackWorker;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import o0000o0o.C24306OooO0O0;
import o0000oO0.C24323OooO;
import o0000oOO.AbstractC24338OooO0o0;
import o0000oOO.C24336OooO0Oo;
import o000O00.C24378OooOoO0;
import o000O0o0.C24408OooO00o;
import o000oo0.AbstractC24673OooOo0O;
import o000oo0.C24668OooOOOo;
import o000oo0.C24690Oooo0o0;
import o000ooO0.AbstractC24732OooO00o;
import o00OO0oO.C25003OooO0O0;
import o00Oo0oO.C25051OooO0OO;
import o00Ooo.C25086OooOo0O;
import o00oo0Oo.C25707OooOoO0;
import o00oo0Oo.C25708OooOoOO;
import o00oo0Oo.C25709OooOoo;
import o00oo0Oo.C25712OooOooo;
import o0O0OoO0.C25898OooO0Oo;
import o0O0Ooo.C25903OooO00o;
import o0OO.C26412OooOOo0;
import o0OO.C26414OooOo0;
import o0OO.C26415OooOo0O;
import o0OO.C26417OooOoO;
import o0OO.C26424Oooo;
import o0OO.C26427Oooo0O0;
import o0OO.C26429Oooo0o;
import o0OO.C26433OoooO0;
import o0OO0.C26436OooO0Oo;
import o0OO0.C26437OooO0o0;
import o0OO000.InterfaceC26441OooO0oo;
import o0OO000o.C26454OooO0Oo;
import o0OO00o.C26470OooO00o;
import o0OO00o.C26471OooO0Oo;
import o0OO00o.C26474OooO0oo;
import o0OO00o0.C26479OooOO0o;
import o0OO00o0.C26490OooOoo;
import o0OO00o0.C26501Oooo0oO;
import o0OO00o0.C26515OooooO0;
import o0OO00o0.C26577o000oo0O;
import o0OO00o0.C26582o000ooo;
import o0OO00o0.C26585o000oooo;
import o0OO00o0.C26588o00O00oO;
import o0OO00o0.C26596o00O0o0;
import o0OO00o0.C26613o00OOOoO;
import o0OO00o0.C26620o00Oo00o;
import o0OO00o0.C26629o00OoO0;
import o0OO00o0.C26647o00OooOO;
import o0OO00o0.C26649o00OoooO;
import o0OO00o0.C26660o00o00o0;
import o0OO00o0.C26665o00o0O00;
import o0OO00o0.C26676o00o0o00;
import o0OO00o0.C26681o00o0oOO;
import o0OO00o0.C26691ooOO;
import o0OO00o0.o00O;
import o0OO00o0.o00OO0O;
import o0OO00oo.C26693OooO00o;
import o0OO0OoO.C26732Oooo;
import o0OO0OoO.C26740Oooo0oo;
import o0OO0Ooo.C26759OooOOoo;
import o0OO0Ooo.C26762OooOo00;
import o0OO0Ooo.C26773Oooo0;
import o0OO0Ooo.C26791OoooOoO;
import o0OO0o0.C26800OooO;
import o0OO0o0.C26836Oooo0O0;
import o0OO0o0.C26837Oooo0OO;
import o0OO0o00.C26884OooOoOO;
import o0OO0o00.C26889Oooo;
import o0OO0o00.C26913Oooooo;
import o0OO0o0o.C26928OooO0OO;
import o0OO0o0o.C26929OooO0Oo;
import o0OO0oO.C26932OooO0oO;
import o0OO0oO.C26933OooO0oo;
import o0OO0oO.C26938OooOOoo;
import o0OO0oOO.C26942OooO0O0;
import o0OO0oOo.C26944OooO0O0;
import o0OO0oo0.C26945OooO00o;
import o0OO0oo0.C26947OooO0OO;
import o0OO0oo0.C26948OooO0Oo;
import o0OO0oo0.C26951OooO0oO;
import o0OO0ooO.C26952OooO;
import o0OO0ooO.C26962OooOO0O;
import o0OO0ooO.C26971OooOo0;
import o0OO0ooO.C26972OooOo00;
import o0OO0ooo.C26979OooO0o0;
import o0OO0ooo.C26981OooO0oo;
import o0OO0ooo.C26983OooOO0O;
import o0OOO0.C26984OooO0Oo;
import o0OOO00o.C26990OooO0o0;
import o0OOO0O.C26999OooO0o0;
import o0OOO0O0.C27002OooO0oO;
import o0OOO0O0.C27003OooO0oo;
import o0OOO0O0.C27004OooOO0o;
import o0OOO0O0.C27006OooOOo0;
import o0OOO0OO.C27015OooOOoo;
import o0OOO0OO.C27017OooOo0O;
import o0OOO0OO.C27020OooOoO0;
import o0OOO0Oo.C27040OooOOOo;
import o0OOO0Oo.C27044OooOo0;
import o0OOO0o0.C27051OooO0O0;
import o0OOO0o0.C27052OooO0OO;
import o0OOO0oO.C27053OooO;
import o0OOO0oO.C27060OooO0oO;
import o0OOO0oO.C27061OooO0oo;
import o0OOO0oo.C27073OooOO0o;
import o0OOO0oo.C27076OooOOOO;
import o0OOOO.C27081OooOO0o;
import o0OOOO.C27082OooOOOo;
import o0OOOO0.C27084OooO0o0;
import o0OOOO00.C27095OooOo0O;
import o0OOOO0o.C27099OooO0oo;
import o0OOOO0o.C27111OooOoo;
import o0OOOO0o.C27119Oooo0OO;
import o0OOOO0o.C27129OoooOOO;
import o0OOOOO0.InterfaceC27150OooO0Oo;
import o0OOOOO0.InterfaceC27151OooO0o0;
import o0OOOOO0.InterfaceC27152OooO0oO;
import o0OOOOO0.InterfaceC27153OooO0oo;
import o0OOOOO0.InterfaceC27154OooOO0o;
import o0OOOOOo.InterfaceC27155OooO00o;
import o0OOOOo.InterfaceC27159OooO00o;
import o0OOOOoO.C27168OooOOOo;
import o0OOOo0o.InterfaceC27186OooO00o;
import o0OOOoO0.C27191OooO;
import o0OOOoO0.InterfaceC27198OooO0oO;
import o0OOOoo0.C27212OooO;
import o0OOOoo0.C27213OooO00o;
import o0OOOoo0.C27214OooO0O0;
import o0OOOoo0.C27216OooO0Oo;
import o0OOOoo0.C27217OooO0o;
import o0OOOoo0.C27218OooO0o0;
import o0OOOoo0.C27219OooO0oO;
import o0OOOoo0.C27220OooO0oo;
import o0OOOoo0.C27221OooOO0;
import o0OOOoo0.C27222OooOO0O;
import o0OOOoo0.C27223OooOO0o;
import o0OOOoo0.C27224OooOOO;
import o0OOOoo0.C27225OooOOO0;
import o0OOOoo0.C27226OooOOOo;
import o0OOOoo0.C27227OooOOo;
import o0OOOoo0.C27228OooOOo0;
import o0OOOoo0.C27229OooOOoo;
import o0OOOoo0.C27230OooOo0;
import o0OOOoo0.C27231OooOo0O;
import o0OOOoo0.C27232OooOo0o;
import o0OOOoo0.C27233OooOoO;
import o0OOOoo0.C27234OooOoO0;
import o0OOOoo0.C27235OooOoOO;
import o0OOOoo0.C27236OooOoo;
import o0OOOoo0.C27237OooOoo0;
import o0OOOoo0.C27238OooOooO;
import o0OOOoo0.C27239OooOooo;
import o0OOOoo0.C27240Oooo;
import o0OOOoo0.C27241Oooo00O;
import o0OOOoo0.C27242Oooo00o;
import o0OOOoo0.C27243Oooo0O0;
import o0OOOoo0.C27244Oooo0OO;
import o0OOOoo0.C27245Oooo0o;
import o0OOOoo0.C27246Oooo0o0;
import o0OOOoo0.C27247Oooo0oO;
import o0OOOoo0.C27248Oooo0oo;
import o0OOOoo0.C27249OoooO;
import o0OOOoo0.C27250OoooO0;
import o0OOOoo0.C27251OoooO00;
import o0OOOoo0.C27252OoooO0O;
import o0OOOoo0.C27253OoooOO0;
import o0OOOoo0.C27254OoooOOO;
import o0OOOoo0.C27255OoooOOo;
import o0OOOoo0.C27256OoooOo0;
import o0OOOoo0.C27257OoooOoO;
import o0OOOoo0.C27258OoooOoo;
import o0OOOoo0.C27259Ooooo00;
import o0OOOoo0.C27260Ooooo0o;
import o0OOOoo0.C27261OooooO0;
import o0OOOoo0.C27262OooooOO;
import o0OOOoo0.C27263OooooOo;
import o0OOOoo0.C27264Oooooo;
import o0OOOoo0.C27265Oooooo0;
import o0OOOoo0.C27266OoooooO;
import o0OOo0Oo.InterfaceC27286OooO00o;
import o0OOo0Oo.InterfaceC27290OooO0o;
import o0OOo0Oo.InterfaceC27291OooO0o0;
import o0OOo0Oo.InterfaceC27292OooO0oO;
import o0OOo0Oo.InterfaceC27295OooOO0O;
import o0OOo0Oo.InterfaceC27297OooOOO;
import o0OOo0Oo.InterfaceC27301OooOOo;
import o0OOo0Oo.InterfaceC27302OooOOo0;
import o0OOo0Oo.InterfaceC27304OooOo;
import o0OOo0Oo.InterfaceC27305OooOo0;
import o0OOo0Oo.InterfaceC27306OooOo00;
import o0OOo0Oo.InterfaceC27307OooOo0O;
import o0OOo0Oo.InterfaceC27309OooOoO;
import o0OOo0Oo.InterfaceC27311OooOoOO;
import o0OOo0Oo.InterfaceC27312OooOoo;
import o0OOo0Oo.InterfaceC27313OooOoo0;
import o0OOo0Oo.InterfaceC27315OooOooo;
import o0OOo0Oo.InterfaceC27317Oooo00O;
import o0OOo0Oo.InterfaceC27318Oooo00o;
import o0OOo0Oo.InterfaceC27320Oooo0OO;
import o0OOo0Oo.InterfaceC27321Oooo0o;
import o0OOo0Oo.InterfaceC27324Oooo0oo;
import o0OOo0Oo.InterfaceC27325OoooO00;
import o0OOo0o.C27328OooO0OO;
import o0OOo0o.C27351Oooo0O0;
import o0OOo0o.C27366OoooOoo;
import o0OOo0o.C27377o00000Oo;
import o0OOo0o.C27387o0000o0;
import o0OOo0o.C27428o000oOoO;
import o0OOo0o.C27449o00O0OoO;
import o0OOo0o.C27499o00Ooo0;
import o0OOo0o.C27514o00o000;
import o0OOo0o.C27515o00o0000;
import o0OOo0o.C27538o00o0o0O;
import o0OOo0o.C27540o00o0oO;
import o0OOo0o.C27545o00o0oo0;
import o0OOo0o.C27585o00ooO0;
import o0OOo0o.C27596o00ooo;
import o0OOo0o.C27597o00ooo00;
import o0OOo0o.C27600o0ooOO0;
import o0OOo0o.oo00oO;
import o0OOo0oo.C27616OooO0o;
import o0OOo0oo.C27618OooO0oO;
import o0OOo0oo.C27629OooOOoo;
import o0OOo0oo.C27635OooOoO;
import o0OOo0oo.C27639OooOoo0;
import o0OOo0oo.C27641OooOooo;
import o0OOo0oo.C27643Oooo0;
import o0OOo0oo.C27647Oooo0O0;
import o0OOo0oo.C27657OoooOO0;
import o0OOo0oo.C27659OoooOOo;
import o0OOo0oo.C27665OooooO0;
import o0OOo0oo.C27670OoooooO;
import o0OOo0oo.C27671Ooooooo;
import o0OOo0oo.C27677o00000oo;
import o0OOo0oo.C27684o0000o0;
import o0OOo0oo.C27685o0000o0O;
import o0OOo0oo.C27694o000O0o;
import o0OOo0oo.C27696o000Ooo;
import o0OOo0oo.C27700o0ooOO0;
import o0OOo0oo.InterfaceC27660OoooOo0;
import o0OOo0oo.InterfaceC27661OoooOoO;
import o0OOoO.C27710OooO0oo;
import o0OOoO0.C27715OooO0o;
import o0OOoO0.C27718OooO0oo;
import o0OOoO0.C27721OooOOo0;
import o0OOoO00.C27723OooO0O0;
import o0OOoO0O.C27750OooOoO0;
import o0OOoO0o.C27755OooO0Oo;
import o0OOoOo.C27786OooO0OO;
import o0OOoOo.C27788OooO0o;
import o0OOoOo0.C27798OooO0o0;
import o0OOoOo0.C27799OooO0oO;
import o0OOoOo0.C27819OooOoo;
import o0OOoo0o.C27869OooOOO;
import o0OOooO.C27881OooOO0O;
import o0OOooO0.C27956o00000oo;
import o0OOooOo.C27976OooO0o0;
import o0OOooo0.C27994OooOOOO;
import o0OOoooO.C27996OooO00o;
import o0OOoooO.C28009OooOOOO;
import o0Oo0O00.C28051OooO00o;
import o0Oo0OoO.C28101OooO0O0;
import o0Oo0OoO.C28108OooOO0;
import o0Oo0OoO.C28110OooOO0o;
import o0Oo0OoO.C28111OooOOO;
import o0Oo0OoO.C28114OooOOOo;
import o0Oo0OoO.C28117OooOOoo;
import o0Oo0OoO.C28119OooOo0;
import o0Oo0OoO.C28122OooOo0o;
import o0Oo0OoO.C28124OooOoO0;
import o0Oo0OoO.C28125OooOoOO;
import o0Oo0OoO.C28126OooOoo;
import o0Oo0OoO.C28129OooOooo;
import o0Oo0OoO.C28130Oooo0;
import o0Oo0OoO.C28132Oooo00O;
import o0OoOoO.C29211OooO00o;
import o0oOo0o0.C30982OooO0Oo;
import o0oOooO0.C31150OooO00o;
import o0oOooO0.C31151OooO0O0;
import o0oo00O0.C31197OooO00o;
import o0oo00OO.C31198OooO00o;
import o0oo00o0.C31207OooO00o;
import o0oo00oO.C31210OooO0OO;
import o0oo00oO.InterfaceC31213OooO0oO;
import oO00ooO.C32443OooOOO;
import oO0OO0oo.C32929OooO00o;
import oO0OO0oo.C32932OooO0Oo;
import oO0OO0oo.InterfaceC32931OooO0OO;
import oO0o0OO.C33609OooO0oo;
import oO0o0OO.C33633Oooo0;
import oO0o0OO.C33649OoooOOo;
import oO0o0Oo.C33784o00ooo;
import oO0o0o0o.C33874OooO0OO;
import oO0o0o0o.ExecutorC33873OooO0O0;
import oO0o0oOo.C33900OooO0o0;
import oOO00oo.C34406OooO00o;
import oOo000Oo.C34444Oooo0O0;
import oOo00O0O.C34467OooOo0;
import okhttp3.OkHttpClient;
import oo0oO0.AbstractC34938o00oOoo;
import oo0oO0.InterfaceC34701OooO00o;
import oo0oO0.InterfaceC34703OooO0OO;
import oo0oO0.InterfaceC34708OooOO0o;
import oo0oO0.InterfaceC34723Oooo;
import oo0oO0.InterfaceC34783o000OoOO;
import oo0oO0.InterfaceC34791o000o00O;
import oo0oO0.InterfaceC34797o000o0o;
import oo0oO0.InterfaceC34808o000ooO;
import oo0oO0.InterfaceC34824o00O0o;
import oo0oO0.InterfaceC34847o00Oo0;
import oo0oO0.InterfaceC34848o00Oo000;
import oo0oO0.InterfaceC34854o00Oo0o0;
import oo0oO0.InterfaceC34865o00OoOo;
import oo0oO0.InterfaceC34899o00o0OOO;
import oo0oO0.InterfaceC34927o00oOOo;
import oo0oO0.InterfaceC34937o00oOoOo;
import oo0oO0.InterfaceC34947o00oo0O0;
import oo0oO0.InterfaceC34952o00oo0oO;
import oo0oO0.InterfaceC34975o00ooooO;
import oo0oO0.InterfaceC34994oOooo0o;
import oo0oO0.o00OO;
import oo0oO0.o0O000;
import oo0oO0.o0O00oO0;
import oo0oO0.o0O0O0Oo;
import oo0oO0.o0o0Oo;
import oo0oO0.o0oO0O0o;
import oo0oO0.o0oOO;
import oo0ooO.InterfaceC35006OooO00o;
import oo0ooO.InterfaceC35015OooOO0O;
import oo0ooO.InterfaceC35021OooOOo;
import ooooO0oo.C35204OooO00o;
import ooooOOo0.C35240OooOoOO;

/* JADX INFO: renamed from: o0O0oooO.OooOOoo, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C26269OooOOoo extends AbstractC26261OooOO0O {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final o0O000o.OooO0O0 f89731OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final C26269OooOOoo f89732OooO0O0 = this;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public final InterfaceC32931OooO0OO<C26454OooO0Oo> f89733OooO0OO = C22230OoooO0O.OooO0O0(this, 4);

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final InterfaceC32931OooO0OO<o0OO.OooOOO> f89734OooO0Oo = C22230OoooO0O.OooO0O0(this, 3);

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final InterfaceC32931OooO0OO<NoteContentMapper> f89736OooO0o0 = C22230OoooO0O.OooO0O0(this, 5);

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public final InterfaceC32931OooO0OO<InterfaceC27309OooOoO> f89735OooO0o = C32929OooO00o.OooO00o(new OooO00o(this, 2));

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public final InterfaceC32931OooO0OO<C27015OooOOoo> f89737OooO0oO = C22230OoooO0O.OooO0O0(this, 6);

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    public final InterfaceC32931OooO0OO<PageMapper> f89738OooO0oo = C22230OoooO0O.OooO0O0(this, 7);

    /* JADX INFO: renamed from: OooO, reason: collision with root package name */
    public final InterfaceC32931OooO0OO<C27017OooOo0O> f89730OooO = C22230OoooO0O.OooO0O0(this, 8);

    /* JADX INFO: renamed from: OooOO0, reason: collision with root package name */
    public final InterfaceC32931OooO0OO<C26613o00OOOoO> f89739OooOO0 = C22230OoooO0O.OooO0O0(this, 9);

    /* JADX INFO: renamed from: OooOO0O, reason: collision with root package name */
    public final InterfaceC32931OooO0OO<o0000o0O.OooOO0<AbstractC24338OooO0o0>> f89740OooOO0O = C22230OoooO0O.OooO0O0(this, 10);

    /* JADX INFO: renamed from: OooOO0o, reason: collision with root package name */
    public final InterfaceC32931OooO0OO<OutlineMapper> f89741OooOO0o = C22230OoooO0O.OooO0O0(this, 11);

    /* JADX INFO: renamed from: OooOOO0, reason: collision with root package name */
    public final InterfaceC32931OooO0OO<o0000o0O.OooOO0<AbstractC24338OooO0o0>> f89743OooOOO0 = C22230OoooO0O.OooO0O0(this, 13);

    /* JADX INFO: renamed from: OooOOO, reason: collision with root package name */
    public final InterfaceC32931OooO0OO<o0OOOO00.OooOO0O> f89742OooOOO = C22230OoooO0O.OooO0O0(this, 12);

    /* JADX INFO: renamed from: OooOOOO, reason: collision with root package name */
    public final InterfaceC32931OooO0OO<NoteDatabase> f89744OooOOOO = C22230OoooO0O.OooO0O0(this, 15);

    /* JADX INFO: renamed from: OooOOOo, reason: collision with root package name */
    public final InterfaceC32931OooO0OO<InterfaceC34797o000o0o> f89745OooOOOo = C22230OoooO0O.OooO0O0(this, 14);

    /* JADX INFO: renamed from: OooOOo0, reason: collision with root package name */
    public final InterfaceC32931OooO0OO<MyTemplateMapper> f89747OooOOo0 = C22230OoooO0O.OooO0O0(this, 16);

    /* JADX INFO: renamed from: OooOOo, reason: collision with root package name */
    public final InterfaceC32931OooO0OO<o0OO.Oooo000> f89746OooOOo = C22230OoooO0O.OooO0O0(this, 17);

    /* JADX INFO: renamed from: OooOOoo, reason: collision with root package name */
    public final InterfaceC32931OooO0OO<PdfInfoMapper> f89748OooOOoo = C22230OoooO0O.OooO0O0(this, 18);

    /* JADX INFO: renamed from: OooOo00, reason: collision with root package name */
    public final InterfaceC32931OooO0OO<NoteMapper> f89751OooOo00 = C22230OoooO0O.OooO0O0(this, 19);

    /* JADX INFO: renamed from: OooOo0, reason: collision with root package name */
    public final InterfaceC32931OooO0OO<C27040OooOOOo> f89750OooOo0 = C22230OoooO0O.OooO0O0(this, 21);

    /* JADX INFO: renamed from: OooOo0O, reason: collision with root package name */
    public final InterfaceC32931OooO0OO<PageLayerMapper> f89752OooOo0O = C22230OoooO0O.OooO0O0(this, 22);

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public final InterfaceC32931OooO0OO<InterfaceC27318Oooo00o> f89753OooOo0o = C32929OooO00o.OooO00o(new OooO00o(this, 20));

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public final InterfaceC32931OooO0OO<C26479OooOO0o> f89749OooOo = C22230OoooO0O.OooO0O0(this, 23);

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public final InterfaceC32931OooO0OO<CommentMapper> f89755OooOoO0 = C22230OoooO0O.OooO0O0(this, 24);

    /* JADX INFO: renamed from: OooOoO, reason: collision with root package name */
    public final InterfaceC32931OooO0OO<C26588o00O00oO> f89754OooOoO = C32929OooO00o.OooO00o(new OooO00o(this, 25));

    /* JADX INFO: renamed from: OooOoOO, reason: collision with root package name */
    public final InterfaceC32931OooO0OO<ImageMapper> f89756OooOoOO = C32929OooO00o.OooO00o(new OooO00o(this, 26));

    /* JADX INFO: renamed from: OooOoo0, reason: collision with root package name */
    public final InterfaceC32931OooO0OO<C26691ooOO> f89758OooOoo0 = C32929OooO00o.OooO00o(new OooO00o(this, 27));

    /* JADX INFO: renamed from: OooOoo, reason: collision with root package name */
    public final InterfaceC32931OooO0OO<C26501Oooo0oO> f89757OooOoo = C32929OooO00o.OooO00o(new OooO00o(this, 28));

    /* JADX INFO: renamed from: OooOooO, reason: collision with root package name */
    public final InterfaceC32931OooO0OO<DualLinkSourceMapper> f89759OooOooO = C32929OooO00o.OooO00o(new OooO00o(this, 29));

    /* JADX INFO: renamed from: OooOooo, reason: collision with root package name */
    public final InterfaceC32931OooO0OO<DualLinkRefMapper> f89760OooOooo = C32929OooO00o.OooO00o(new OooO00o(this, 30));

    /* JADX INFO: renamed from: Oooo000, reason: collision with root package name */
    public final InterfaceC32931OooO0OO<C26660o00o00o0> f89763Oooo000 = C32929OooO00o.OooO00o(new OooO00o(this, 32));

    /* JADX INFO: renamed from: Oooo00O, reason: collision with root package name */
    public final InterfaceC32931OooO0OO<StrokeMapper> f89764Oooo00O = C32929OooO00o.OooO00o(new OooO00o(this, 33));

    /* JADX INFO: renamed from: Oooo00o, reason: collision with root package name */
    public final InterfaceC32931OooO0OO<C26665o00o0O00> f89765Oooo00o = C32929OooO00o.OooO00o(new OooO00o(this, 31));

    /* JADX INFO: renamed from: Oooo0, reason: collision with root package name */
    public final InterfaceC32931OooO0OO<C26647o00OooOO> f89762Oooo0 = C32929OooO00o.OooO00o(new OooO00o(this, 34));

    /* JADX INFO: renamed from: Oooo0O0, reason: collision with root package name */
    public final InterfaceC32931OooO0OO<ShapeMapper> f89766Oooo0O0 = C32929OooO00o.OooO00o(new OooO00o(this, 35));

    /* JADX INFO: renamed from: Oooo0OO, reason: collision with root package name */
    public final InterfaceC32931OooO0OO<C26676o00o0o00> f89767Oooo0OO = C32929OooO00o.OooO00o(new OooO00o(this, 36));

    /* JADX INFO: renamed from: Oooo0o0, reason: collision with root package name */
    public final InterfaceC32931OooO0OO<TextBoxMapper> f89769Oooo0o0 = C32929OooO00o.OooO00o(new OooO00o(this, 37));

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    public final InterfaceC32931OooO0OO<C26629o00OoO0> f89768Oooo0o = C32929OooO00o.OooO00o(new OooO00o(this, 38));

    /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
    public final InterfaceC32931OooO0OO<QuoteMapper> f89770Oooo0oO = C32929OooO00o.OooO00o(new OooO00o(this, 39));

    /* JADX INFO: renamed from: Oooo0oo, reason: collision with root package name */
    public final InterfaceC32931OooO0OO<C26582o000ooo> f89771Oooo0oo = C32929OooO00o.OooO00o(new OooO00o(this, 41));

    /* JADX INFO: renamed from: Oooo, reason: collision with root package name */
    public final InterfaceC32931OooO0OO<HyperLinkMapper> f89761Oooo = C32929OooO00o.OooO00o(new OooO00o(this, 42));

    /* JADX INFO: renamed from: OoooO00, reason: collision with root package name */
    public final InterfaceC32931OooO0OO<InterfaceC27301OooOOo> f89774OoooO00 = C32929OooO00o.OooO00o(new OooO00o(this, 40));

    /* JADX INFO: renamed from: OoooO0, reason: collision with root package name */
    public final InterfaceC32931OooO0OO<oo0oO0.o00000O0> f89773OoooO0 = C32929OooO00o.OooO00o(new OooO00o(this, 43));

    /* JADX INFO: renamed from: OoooO0O, reason: collision with root package name */
    public final InterfaceC32931OooO0OO<FolderMapper> f89775OoooO0O = C32929OooO00o.OooO00o(new OooO00o(this, 44));

    /* JADX INFO: renamed from: OoooO, reason: collision with root package name */
    public final InterfaceC32931OooO0OO<o0O0O0Oo> f89772OoooO = C32929OooO00o.OooO00o(new OooO00o(this, 45));

    /* JADX INFO: renamed from: OoooOO0, reason: collision with root package name */
    public final InterfaceC32931OooO0OO<UserMapper> f89776OoooOO0 = C32929OooO00o.OooO00o(new OooO00o(this, 46));

    /* JADX INFO: renamed from: o000oOoO, reason: collision with root package name */
    public final InterfaceC32931OooO0OO<OkHttpClient> f89870o000oOoO = C32929OooO00o.OooO00o(new OooO00o(this, 49));

    /* JADX INFO: renamed from: OoooOOO, reason: collision with root package name */
    public final InterfaceC32931OooO0OO<Gson> f89777OoooOOO = C32929OooO00o.OooO00o(new OooO00o(this, 50));

    /* JADX INFO: renamed from: OoooOOo, reason: collision with root package name */
    public final InterfaceC32931OooO0OO<C35240OooOoOO> f89778OoooOOo = C22230OoooO0O.OooO0O0(this, 48);

    /* JADX INFO: renamed from: OoooOo0, reason: collision with root package name */
    public final InterfaceC32931OooO0OO<InterfaceC27154OooOO0o> f89779OoooOo0 = C22230OoooO0O.OooO0O0(this, 47);

    /* JADX INFO: renamed from: OoooOoO, reason: collision with root package name */
    public final InterfaceC32931OooO0OO<InterfaceC27153OooO0oo> f89780OoooOoO = C22230OoooO0O.OooO0O0(this, 51);

    /* JADX INFO: renamed from: OoooOoo, reason: collision with root package name */
    public final InterfaceC32931OooO0OO<o0OOOOO0.OooOOO0> f89781OoooOoo = C22230OoooO0O.OooO0O0(this, 53);

    /* JADX INFO: renamed from: Ooooo00, reason: collision with root package name */
    public final InterfaceC32931OooO0OO<o0OOOO0o.o0O0O00> f89782Ooooo00 = C22230OoooO0O.OooO0O0(this, 52);

    /* JADX INFO: renamed from: Ooooo0o, reason: collision with root package name */
    public final InterfaceC32931OooO0OO<o0OOOOO0.OooO> f89783Ooooo0o = C22230OoooO0O.OooO0O0(this, 54);

    /* JADX INFO: renamed from: OooooO0, reason: collision with root package name */
    public final InterfaceC32931OooO0OO<o0OOOOO0.OooOOO> f89784OooooO0 = C22230OoooO0O.OooO0O0(this, 55);

    /* JADX INFO: renamed from: OooooOO, reason: collision with root package name */
    public final InterfaceC32931OooO0OO<C27996OooO00o> f89785OooooOO = C22230OoooO0O.OooO0O0(this, 56);

    /* JADX INFO: renamed from: OooooOo, reason: collision with root package name */
    public final InterfaceC32931OooO0OO<OkHttpClient> f89786OooooOo = C22230OoooO0O.OooO0O0(this, 60);

    /* JADX INFO: renamed from: Oooooo0, reason: collision with root package name */
    public final InterfaceC32931OooO0OO<C35240OooOoOO> f89788Oooooo0 = C22230OoooO0O.OooO0O0(this, 59);

    /* JADX INFO: renamed from: Oooooo, reason: collision with root package name */
    public final InterfaceC32931OooO0OO<o0OOOOOO.OooO00o> f89787Oooooo = C22230OoooO0O.OooO0O0(this, 58);

    /* JADX INFO: renamed from: OoooooO, reason: collision with root package name */
    public final InterfaceC32931OooO0OO<o0OOOOO0.OooO0OO> f89789OoooooO = C22230OoooO0O.OooO0O0(this, 61);

    /* JADX INFO: renamed from: Ooooooo, reason: collision with root package name */
    public final InterfaceC32931OooO0OO<C22913Oooo0OO> f89790Ooooooo = C22230OoooO0O.OooO0O0(this, 57);

    /* JADX INFO: renamed from: o0OoOo0, reason: collision with root package name */
    public final InterfaceC32931OooO0OO<InterfaceC34824o00O0o> f89979o0OoOo0 = C22230OoooO0O.OooO0O0(this, 63);

    /* JADX INFO: renamed from: ooOO, reason: collision with root package name */
    public final InterfaceC32931OooO0OO<NoteMetaMapper> f89993ooOO = C22230OoooO0O.OooO0O0(this, 64);

    /* JADX INFO: renamed from: o00O0O, reason: collision with root package name */
    public final InterfaceC32931OooO0OO<InterfaceC27313OooOoo0> f89895o00O0O = C32929OooO00o.OooO00o(new OooO00o(this, 62));

    /* JADX INFO: renamed from: o00Oo0, reason: collision with root package name */
    public final InterfaceC32931OooO0OO<AbstractC34938o00oOoo> f89945o00Oo0 = C22230OoooO0O.OooO0O0(this, 65);

    /* JADX INFO: renamed from: o00Ooo, reason: collision with root package name */
    public final InterfaceC32931OooO0OO<o0o0Oo> f89963o00Ooo = C22230OoooO0O.OooO0O0(this, 67);

    /* JADX INFO: renamed from: o00o0O, reason: collision with root package name */
    public final InterfaceC32931OooO0OO<NotePlaceholderMapper> f89967o00o0O = C22230OoooO0O.OooO0O0(this, 68);

    /* JADX INFO: renamed from: o00ooo, reason: collision with root package name */
    public final InterfaceC32931OooO0OO<C26415OooOo0O> f89972o00ooo = C22230OoooO0O.OooO0O0(this, 66);

    /* JADX INFO: renamed from: oo000o, reason: collision with root package name */
    public final InterfaceC32931OooO0OO<C30982OooO0Oo> f89987oo000o = C22230OoooO0O.OooO0O0(this, 69);

    /* JADX INFO: renamed from: o00oO0o, reason: collision with root package name */
    public final InterfaceC32931OooO0OO<o00OO> f89969o00oO0o = C22230OoooO0O.OooO0O0(this, 72);

    /* JADX INFO: renamed from: o00oO0O, reason: collision with root package name */
    public final InterfaceC32931OooO0OO<InterfaceC27312OooOoo> f89968o00oO0O = C32929OooO00o.OooO00o(new OooO00o(this, 71));

    /* JADX INFO: renamed from: o0ooOO0, reason: collision with root package name */
    public final InterfaceC32931OooO0OO<C27499o00Ooo0> f89982o0ooOO0 = C32929OooO00o.OooO00o(new OooO00o(this, 73));

    /* JADX INFO: renamed from: o0ooOOo, reason: collision with root package name */
    public final InterfaceC32931OooO0OO<AudioMapper> f89983o0ooOOo = C32929OooO00o.OooO00o(new OooO00o(this, 75));

    /* JADX INFO: renamed from: o0ooOoO, reason: collision with root package name */
    public final InterfaceC32931OooO0OO<InterfaceC27292OooO0oO> f89984o0ooOoO = C32929OooO00o.OooO00o(new OooO00o(this, 74));

    /* JADX INFO: renamed from: o0OOO0o, reason: collision with root package name */
    public final InterfaceC32931OooO0OO<oo0oO0.o000O0Oo> f89976o0OOO0o = C32929OooO00o.OooO00o(new OooO00o(this, 77));

    /* JADX INFO: renamed from: o0Oo0oo, reason: collision with root package name */
    public final InterfaceC32931OooO0OO<LabelMapper> f89977o0Oo0oo = C32929OooO00o.OooO00o(new OooO00o(this, 78));

    /* JADX INFO: renamed from: o0OO00O, reason: collision with root package name */
    public final InterfaceC32931OooO0OO<LabelRefMapper> f89975o0OO00O = C32929OooO00o.OooO00o(new OooO00o(this, 79));

    /* JADX INFO: renamed from: oo0o0Oo, reason: collision with root package name */
    public final InterfaceC32931OooO0OO<InterfaceC27306OooOo00> f89991oo0o0Oo = C32929OooO00o.OooO00o(new OooO00o(this, 76));

    /* JADX INFO: renamed from: o0O0O00, reason: collision with root package name */
    public final InterfaceC32931OooO0OO<InterfaceC34783o000OoOO> f89973o0O0O00 = C32929OooO00o.OooO00o(new OooO00o(this, 82));

    /* JADX INFO: renamed from: o000OOo, reason: collision with root package name */
    public final InterfaceC32931OooO0OO<LatestOpenedNoteMapper> f89843o000OOo = C32929OooO00o.OooO00o(new OooO00o(this, 83));

    /* JADX INFO: renamed from: o000000, reason: collision with root package name */
    public final InterfaceC32931OooO0OO<InterfaceC27305OooOo0> f89795o000000 = C32929OooO00o.OooO00o(new OooO00o(this, 81));

    /* JADX INFO: renamed from: o000000O, reason: collision with root package name */
    public final InterfaceC32931OooO0OO<C27788OooO0o> f89796o000000O = C32929OooO00o.OooO00o(new OooO00o(this, 80));

    /* JADX INFO: renamed from: o000000o, reason: collision with root package name */
    public final InterfaceC32931OooO0OO<C27387o0000o0> f89797o000000o = C32929OooO00o.OooO00o(new OooO00o(this, 70));

    /* JADX INFO: renamed from: o00000, reason: collision with root package name */
    public final InterfaceC32931OooO0OO<C27351Oooo0O0> f89794o00000 = C32929OooO00o.OooO00o(new OooO00o(this, 1));

    /* JADX INFO: renamed from: o00000O0, reason: collision with root package name */
    public final InterfaceC32931OooO0OO<Object> f89799o00000O0 = C32932OooO0Oo.OooO00o(new OooO00o(this, 0));

    /* JADX INFO: renamed from: o00000O, reason: collision with root package name */
    public final InterfaceC32931OooO0OO<Object> f89798o00000O = C32932OooO0Oo.OooO00o(new OooO00o(this, 84));

    /* JADX INFO: renamed from: o00000OO, reason: collision with root package name */
    public final InterfaceC32931OooO0OO<C27053OooO> f89800o00000OO = C32929OooO00o.OooO00o(new OooO00o(this, 87));

    /* JADX INFO: renamed from: o00000Oo, reason: collision with root package name */
    public final InterfaceC32931OooO0OO<o0OOo0o.o00000O> f89801o00000Oo = C32929OooO00o.OooO00o(new OooO00o(this, 86));

    /* JADX INFO: renamed from: o00000o0, reason: collision with root package name */
    public final InterfaceC32931OooO0OO<NoteCacheDatabase> f89802o00000o0 = C32929OooO00o.OooO00o(new OooO00o(this, 90));

    /* JADX INFO: renamed from: o0000Ooo, reason: collision with root package name */
    public final InterfaceC32931OooO0OO<InterfaceC34937o00oOoOo> f89815o0000Ooo = C32929OooO00o.OooO00o(new OooO00o(this, 89));

    /* JADX INFO: renamed from: o00000oO, reason: collision with root package name */
    public final InterfaceC32931OooO0OO<PdfTextCacheMapper> f89803o00000oO = C32929OooO00o.OooO00o(new OooO00o(this, 91));

    /* JADX INFO: renamed from: o00000oo, reason: collision with root package name */
    public final InterfaceC32931OooO0OO<InterfaceC27320Oooo0OO> f89804o00000oo = C32929OooO00o.OooO00o(new OooO00o(this, 88));

    /* JADX INFO: renamed from: o0000, reason: collision with root package name */
    public final InterfaceC32931OooO0OO<PlayFlavorDatabase> f89793o0000 = C22230OoooO0O.OooO0O0(this, 95);

    /* JADX INFO: renamed from: o0000O00, reason: collision with root package name */
    public final InterfaceC32931OooO0OO<InterfaceC34848o00Oo000> f89806o0000O00 = C22230OoooO0O.OooO0O0(this, 94);

    /* JADX INFO: renamed from: o0000oo, reason: collision with root package name */
    public final InterfaceC32931OooO0OO<OkHttpClient> f89823o0000oo = C22230OoooO0O.OooO0O0(this, 98);

    /* JADX INFO: renamed from: o0000oO, reason: collision with root package name */
    public final InterfaceC32931OooO0OO<C35240OooOoOO> f89819o0000oO = C22230OoooO0O.OooO0O0(this, 97);
    public final InterfaceC32931OooO0OO<NoteinFirebaseUserApiService> o0000O0 = C22230OoooO0O.OooO0O0(this, 96);

    /* JADX INFO: renamed from: o0000O0O, reason: collision with root package name */
    public final InterfaceC32931OooO0OO<NoteinFirebaseUserMapper> f89807o0000O0O = C22230OoooO0O.OooO0O0(this, 99);

    /* JADX INFO: renamed from: o000OO, reason: collision with root package name */
    public final InterfaceC32931OooO0OO<InterfaceC27315OooOooo> f89838o000OO = C32929OooO00o.OooO00o(new OooO00o(this, 93));

    /* JADX INFO: renamed from: o0000O, reason: collision with root package name */
    public final InterfaceC32931OooO0OO<C35240OooOoOO> f89805o0000O = C22230OoooO0O.OooO0O0(this, 102);

    /* JADX INFO: renamed from: o0000OO0, reason: collision with root package name */
    public final InterfaceC32931OooO0OO<InterfaceC27155OooO00o> f89809o0000OO0 = C22230OoooO0O.OooO0O0(this, 101);

    /* JADX INFO: renamed from: o0000OO, reason: collision with root package name */
    public final InterfaceC32931OooO0OO<InterfaceC34952o00oo0oO> f89808o0000OO = C22230OoooO0O.OooO0O0(this, 103);

    /* JADX INFO: renamed from: o0000OOO, reason: collision with root package name */
    public final InterfaceC32931OooO0OO<o0000o0O.OooOO0<AbstractC24338OooO0o0>> f89810o0000OOO = C22230OoooO0O.OooO0O0(this, 104);

    /* JADX INFO: renamed from: o0000OOo, reason: collision with root package name */
    public final InterfaceC32931OooO0OO<o0OOOOOo.OooO0O0> f89811o0000OOo = C22230OoooO0O.OooO0O0(this, 105);

    /* JADX INFO: renamed from: o0000Oo0, reason: collision with root package name */
    public final InterfaceC32931OooO0OO<o0oOO> f89813o0000Oo0 = C22230OoooO0O.OooO0O0(this, 106);

    /* JADX INFO: renamed from: o0000Oo, reason: collision with root package name */
    public final InterfaceC32931OooO0OO<InterfaceC34854o00Oo0o0> f89812o0000Oo = C22230OoooO0O.OooO0O0(this, 107);

    /* JADX INFO: renamed from: o0000OoO, reason: collision with root package name */
    public final InterfaceC32931OooO0OO<NoteinGooglePurchaseMapper> f89814o0000OoO = C22230OoooO0O.OooO0O0(this, 108);
    public final InterfaceC32931OooO0OO<NoteinGoogleOfferMapper> o0000o0 = C22230OoooO0O.OooO0O0(this, 109);

    /* JADX INFO: renamed from: o0000o0O, reason: collision with root package name */
    public final InterfaceC32931OooO0OO<C22949Oooo0oO> f89817o0000o0O = C22230OoooO0O.OooO0O0(this, 100);

    /* JADX INFO: renamed from: o0000o0o, reason: collision with root package name */
    public final InterfaceC32931OooO0OO<C27597o00ooo00> f89818o0000o0o = C22230OoooO0O.OooO0O0(this, 92);

    /* JADX INFO: renamed from: o0000o, reason: collision with root package name */
    public final InterfaceC32931OooO0OO<OkHttpClient> f89816o0000o = C22230OoooO0O.OooO0O0(this, 111);

    /* JADX INFO: renamed from: o0000oO0, reason: collision with root package name */
    public final InterfaceC32931OooO0OO<oo0oO0.o0000O0O> f89820o0000oO0 = C22230OoooO0O.OooO0O0(this, 112);

    /* JADX INFO: renamed from: o0000oOO, reason: collision with root package name */
    public final InterfaceC32931OooO0OO<HandWritingTextCacheMapper> f89821o0000oOO = C22230OoooO0O.OooO0O0(this, 113);

    /* JADX INFO: renamed from: o0000oOo, reason: collision with root package name */
    public final InterfaceC32931OooO0OO<InterfaceC27302OooOOo0> f89822o0000oOo = C32929OooO00o.OooO00o(new OooO00o(this, 110));

    /* JADX INFO: renamed from: o0000oo0, reason: collision with root package name */
    public final InterfaceC32931OooO0OO<InterfaceC34899o00o0OOO> f89824o0000oo0 = C22230OoooO0O.OooO0O0(this, 115);

    /* JADX INFO: renamed from: o0000ooO, reason: collision with root package name */
    public final InterfaceC32931OooO0OO<PageGridModificationRecordMapper> f89825o0000ooO = C32929OooO00o.OooO00o(new OooO00o(this, 116));

    /* JADX INFO: renamed from: o000, reason: collision with root package name */
    public final InterfaceC32931OooO0OO<InterfaceC27317Oooo00O> f89792o000 = C32929OooO00o.OooO00o(new OooO00o(this, 114));

    /* JADX INFO: renamed from: o000O000, reason: collision with root package name */
    public final InterfaceC32931OooO0OO<Object> f89829o000O000 = C32932OooO0Oo.OooO00o(new OooO00o(this, 85));

    /* JADX INFO: renamed from: o000OoO, reason: collision with root package name */
    public final InterfaceC32931OooO0OO<CloudSyncDatabase> f89851o000OoO = C32929OooO00o.OooO00o(new OooO00o(this, 121));

    /* JADX INFO: renamed from: o000O0o, reason: collision with root package name */
    public final InterfaceC32931OooO0OO<InterfaceC35006OooO00o> f89834o000O0o = C32929OooO00o.OooO00o(new OooO00o(this, 120));

    /* JADX INFO: renamed from: o000Ooo, reason: collision with root package name */
    public final InterfaceC32931OooO0OO<InterfaceC35015OooOO0O> f89854o000Ooo = C32929OooO00o.OooO00o(new OooO00o(this, 122));

    /* JADX INFO: renamed from: o000O0O, reason: collision with root package name */
    public final InterfaceC32931OooO0OO<InterfaceC35021OooOOo> f89831o000O0O = C32929OooO00o.OooO00o(new OooO00o(this, 123));

    /* JADX INFO: renamed from: o000Oo0, reason: collision with root package name */
    public final InterfaceC32931OooO0OO<o0OO0o00.OooO00o> f89847o000Oo0 = C32929OooO00o.OooO00o(new OooO00o(this, 126));

    /* JADX INFO: renamed from: o000O00, reason: collision with root package name */
    public final InterfaceC32931OooO0OO<C26889Oooo> f89828o000O00 = C32929OooO00o.OooO00o(new OooO00o(this, 125));

    /* JADX INFO: renamed from: o000O00O, reason: collision with root package name */
    public final InterfaceC32931OooO0OO<NoteHistoryVersionMapper> f89830o000O00O = C32929OooO00o.OooO00o(new OooO00o(this, 127));

    /* JADX INFO: renamed from: o000O0, reason: collision with root package name */
    public final InterfaceC32931OooO0OO<C26913Oooooo> f89827o000O0 = C32929OooO00o.OooO00o(new OooO00o(this, 124));

    /* JADX INFO: renamed from: o000O0Oo, reason: collision with root package name */
    public final InterfaceC32931OooO0OO<OkHttpClient> f89833o000O0Oo = C32929OooO00o.OooO00o(new OooO00o(this, 130));

    /* JADX INFO: renamed from: o000OO0O, reason: collision with root package name */
    public final InterfaceC32931OooO0OO<C35240OooOoOO> f89840o000OO0O = C32929OooO00o.OooO00o(new OooO00o(this, 129));

    /* JADX INFO: renamed from: o000O0O0, reason: collision with root package name */
    public final InterfaceC32931OooO0OO<InterfaceC26441OooO0oo> f89832o000O0O0 = C32929OooO00o.OooO00o(new OooO00o(this, 128));

    /* JADX INFO: renamed from: o000O0o0, reason: collision with root package name */
    public final InterfaceC32931OooO0OO<CloudMetaMapper> f89835o000O0o0 = C32929OooO00o.OooO00o(new OooO00o(this, 131));

    /* JADX INFO: renamed from: o000O0oO, reason: collision with root package name */
    public final InterfaceC32931OooO0OO<C27956o00000oo> f89836o000O0oO = C32929OooO00o.OooO00o(new OooO00o(this, 132));

    /* JADX INFO: renamed from: o000O0oo, reason: collision with root package name */
    public final InterfaceC32931OooO0OO<o0000o0O.OooOO0<AbstractC24338OooO0o0>> f89837o000O0oo = C32929OooO00o.OooO00o(new OooO00o(this, 133));

    /* JADX INFO: renamed from: o000O, reason: collision with root package name */
    public final InterfaceC32931OooO0OO<C26884OooOoOO> f89826o000O = C32929OooO00o.OooO00o(new OooO00o(this, 119));

    /* JADX INFO: renamed from: o000OO00, reason: collision with root package name */
    public final InterfaceC32931OooO0OO<OkHttpClient> f89839o000OO00 = C32929OooO00o.OooO00o(new OooO00o(this, 140));

    /* JADX INFO: renamed from: o0OoO0o, reason: collision with root package name */
    public final InterfaceC32931OooO0OO<C35240OooOoOO> f89978o0OoO0o = C32929OooO00o.OooO00o(new OooO00o(this, 139));

    /* JADX INFO: renamed from: o000OO0o, reason: collision with root package name */
    public final InterfaceC32931OooO0OO<OneDriveApiService> f89841o000OO0o = C32929OooO00o.OooO00o(new OooO00o(this, 138));

    /* JADX INFO: renamed from: o000OOO, reason: collision with root package name */
    public final InterfaceC32931OooO0OO<C26800OooO> f89842o000OOO = C32929OooO00o.OooO00o(new OooO00o(this, 137));

    /* JADX INFO: renamed from: o000OOo0, reason: collision with root package name */
    public final InterfaceC32931OooO0OO<C26837Oooo0OO> f89844o000OOo0 = C32929OooO00o.OooO00o(new OooO00o(this, 136));

    /* JADX INFO: renamed from: o000OOoO, reason: collision with root package name */
    public final InterfaceC32931OooO0OO<o0OO0o0.o00oO0O> f89845o000OOoO = C32929OooO00o.OooO00o(new OooO00o(this, 135));

    /* JADX INFO: renamed from: o000Oo00, reason: collision with root package name */
    public final InterfaceC32931OooO0OO<C26836Oooo0O0> f89848o000Oo00 = C22230OoooO0O.OooO0O0(this, 134);

    /* JADX INFO: renamed from: o000Oo0O, reason: collision with root package name */
    public final InterfaceC32931OooO0OO<C26759OooOOoo> f89849o000Oo0O = C22230OoooO0O.OooO0O0(this, 144);

    /* JADX INFO: renamed from: o000Oo0o, reason: collision with root package name */
    public final InterfaceC32931OooO0OO<C26773Oooo0> f89850o000Oo0o = C22230OoooO0O.OooO0O0(this, 143);

    /* JADX INFO: renamed from: o000Oo, reason: collision with root package name */
    public final InterfaceC32931OooO0OO<C26791OoooOoO> f89846o000Oo = C22230OoooO0O.OooO0O0(this, 142);

    /* JADX INFO: renamed from: o000OoOO, reason: collision with root package name */
    public final InterfaceC32931OooO0OO<C26762OooOo00> f89852o000OoOO = C22230OoooO0O.OooO0O0(this, 141);

    /* JADX INFO: renamed from: o000OoOo, reason: collision with root package name */
    public final InterfaceC32931OooO0OO<C26732Oooo> f89853o000OoOo = C22230OoooO0O.OooO0O0(this, 145);

    /* JADX INFO: renamed from: o000Ooo0, reason: collision with root package name */
    public final InterfaceC32931OooO0OO<C26740Oooo0oo> f89855o000Ooo0 = C22230OoooO0O.OooO0O0(this, 118);

    /* JADX INFO: renamed from: o000OooO, reason: collision with root package name */
    public final InterfaceC32931OooO0OO<o0OOo0oo.o000OOo> f89856o000OooO = C22230OoooO0O.OooO0O0(this, 148);

    /* JADX INFO: renamed from: o000Oooo, reason: collision with root package name */
    public final InterfaceC32931OooO0OO<C27639OooOoo0> f89857o000Oooo = C22230OoooO0O.OooO0O0(this, 149);

    /* JADX INFO: renamed from: o000o000, reason: collision with root package name */
    public final InterfaceC32931OooO0OO<C27755OooO0Oo> f89859o000o000 = C22230OoooO0O.OooO0O0(this, 147);

    /* JADX INFO: renamed from: o000o00, reason: collision with root package name */
    public final InterfaceC32931OooO0OO<o0OOo0oo.o0000> f89858o000o00 = C22230OoooO0O.OooO0O0(this, 152);

    /* JADX INFO: renamed from: o000o00O, reason: collision with root package name */
    public final InterfaceC32931OooO0OO<C27677o00000oo> f89860o000o00O = C22230OoooO0O.OooO0O0(this, 151);

    /* JADX INFO: renamed from: o000o00o, reason: collision with root package name */
    public final InterfaceC32931OooO0OO<C27684o0000o0> f89861o000o00o = C22230OoooO0O.OooO0O0(this, 153);

    /* JADX INFO: renamed from: oooo00o, reason: collision with root package name */
    public final InterfaceC32931OooO0OO<C27721OooOOo0> f89994oooo00o = C22230OoooO0O.OooO0O0(this, 156);

    /* JADX INFO: renamed from: o000o0O0, reason: collision with root package name */
    public final InterfaceC32931OooO0OO<o0OOoO0.OooOO0O> f89863o000o0O0 = C22230OoooO0O.OooO0O0(this, 155);

    /* JADX INFO: renamed from: o000o0O, reason: collision with root package name */
    public final InterfaceC32931OooO0OO<C27715OooO0o> f89862o000o0O = C22230OoooO0O.OooO0O0(this, 154);

    /* JADX INFO: renamed from: o000o0OO, reason: collision with root package name */
    public final InterfaceC32931OooO0OO<C27750OooOoO0> f89864o000o0OO = C22230OoooO0O.OooO0O0(this, 150);

    /* JADX INFO: renamed from: o000o0Oo, reason: collision with root package name */
    public final InterfaceC32931OooO0OO<o0OOo0oo.o0O0O00> f89865o000o0Oo = C22230OoooO0O.OooO0O0(this, 157);

    /* JADX INFO: renamed from: o000o0o0, reason: collision with root package name */
    public final InterfaceC32931OooO0OO<C27723OooO0O0> f89867o000o0o0 = C22230OoooO0O.OooO0O0(this, 146);

    /* JADX INFO: renamed from: o000o0o, reason: collision with root package name */
    public final InterfaceC32931OooO0OO<C27616OooO0o> f89866o000o0o = C22230OoooO0O.OooO0O0(this, 160);

    /* JADX INFO: renamed from: o000o0oO, reason: collision with root package name */
    public final InterfaceC32931OooO0OO<InterfaceC34927o00oOOo> f89868o000o0oO = C22230OoooO0O.OooO0O0(this, 162);

    /* JADX INFO: renamed from: o000o0oo, reason: collision with root package name */
    public final InterfaceC32931OooO0OO<NoteFileMapper> f89869o000o0oo = C22230OoooO0O.OooO0O0(this, 163);

    /* JADX INFO: renamed from: o000oOoo, reason: collision with root package name */
    public final InterfaceC32931OooO0OO<InterfaceC27311OooOoOO> f89871o000oOoo = C32929OooO00o.OooO00o(new OooO00o(this, 161));

    /* JADX INFO: renamed from: o000oo00, reason: collision with root package name */
    public final InterfaceC32931OooO0OO<C27665OooooO0> f89874o000oo00 = C22230OoooO0O.OooO0O0(this, 159);

    /* JADX INFO: renamed from: o000oo0, reason: collision with root package name */
    public final InterfaceC32931OooO0OO<o0OOo0oo.o0000OOO> f89873o000oo0 = C32929OooO00o.OooO00o(new OooO00o(this, 158));

    /* JADX INFO: renamed from: o000oo0O, reason: collision with root package name */
    public final InterfaceC32931OooO0OO<C27618OooO0oO> f89875o000oo0O = C32929OooO00o.OooO00o(new OooO00o(this, 117));

    /* JADX INFO: renamed from: o000oo0o, reason: collision with root package name */
    public final InterfaceC32931OooO0OO<C27428o000oOoO> f89876o000oo0o = C32929OooO00o.OooO00o(new OooO00o(this, 164));

    /* JADX INFO: renamed from: o000oo, reason: collision with root package name */
    public final InterfaceC32931OooO0OO<o000000O> f89872o000oo = C32929OooO00o.OooO00o(new OooO00o(this, 166));

    /* JADX INFO: renamed from: o000ooO0, reason: collision with root package name */
    public final InterfaceC32931OooO0OO<C25903OooO00o> f89878o000ooO0 = C32929OooO00o.OooO00o(new OooO00o(this, 165));

    /* JADX INFO: renamed from: o000ooO, reason: collision with root package name */
    public final InterfaceC32931OooO0OO<oo00oO> f89877o000ooO = C32929OooO00o.OooO00o(new OooO00o(this, 167));

    /* JADX INFO: renamed from: o000ooOO, reason: collision with root package name */
    public final InterfaceC32931OooO0OO<InterfaceC31213OooO0oO> f89879o000ooOO = C32929OooO00o.OooO00o(new OooO00o(this, 169));

    /* JADX INFO: renamed from: o000ooo0, reason: collision with root package name */
    public final InterfaceC32931OooO0OO<C31210OooO0OO> f89881o000ooo0 = C32929OooO00o.OooO00o(new OooO00o(this, 168));

    /* JADX INFO: renamed from: o000ooo, reason: collision with root package name */
    public final InterfaceC32931OooO0OO<o0OOOOO0.OooO00o> f89880o000ooo = C32929OooO00o.OooO00o(new OooO00o(this, 171));

    /* JADX INFO: renamed from: o000oooO, reason: collision with root package name */
    public final InterfaceC32931OooO0OO<InterfaceC34701OooO00o> f89882o000oooO = C32929OooO00o.OooO00o(new OooO00o(this, 172));

    /* JADX INFO: renamed from: o000oooo, reason: collision with root package name */
    public final InterfaceC32931OooO0OO<AdMapper> f89883o000oooo = C32929OooO00o.OooO00o(new OooO00o(this, 173));

    /* JADX INFO: renamed from: o00, reason: collision with root package name */
    public final InterfaceC32931OooO0OO<InterfaceC27286OooO00o> f89791o00 = C32929OooO00o.OooO00o(new OooO00o(this, 170));

    /* JADX INFO: renamed from: o00O0000, reason: collision with root package name */
    public final InterfaceC32931OooO0OO<C26999OooO0o0> f89887o00O0000 = C32929OooO00o.OooO00o(new OooO00o(this, 174));

    /* JADX INFO: renamed from: o0O0ooO, reason: collision with root package name */
    public final InterfaceC32931OooO0OO<InterfaceC34791o000o00O> f89974o0O0ooO = C32929OooO00o.OooO00o(new OooO00o(this, 176));

    /* JADX INFO: renamed from: o00oOoo, reason: collision with root package name */
    public final InterfaceC32931OooO0OO<InterfaceC34847o00Oo0> f89971o00oOoo = C32929OooO00o.OooO00o(new OooO00o(this, 177));

    /* JADX INFO: renamed from: o00O000, reason: collision with root package name */
    public final InterfaceC32931OooO0OO<InterfaceC27304OooOo> f89886o00O000 = C32929OooO00o.OooO00o(new OooO00o(this, 175));

    /* JADX INFO: renamed from: o00O000o, reason: collision with root package name */
    public final InterfaceC32931OooO0OO<o0OO0oO.OooO0o> f89888o00O000o = C32929OooO00o.OooO00o(new OooO00o(this, 179));
    public final InterfaceC32931OooO0OO<OkHttpClient> o00O00 = C32929OooO00o.OooO00o(new OooO00o(this, 182));

    /* JADX INFO: renamed from: o00O00O, reason: collision with root package name */
    public final InterfaceC32931OooO0OO<C35240OooOoOO> f89889o00O00O = C32929OooO00o.OooO00o(new OooO00o(this, 181));

    /* JADX INFO: renamed from: oOO00O, reason: collision with root package name */
    public final InterfaceC32931OooO0OO<InterfaceC27152OooO0oO> f89985oOO00O = C32929OooO00o.OooO00o(new OooO00o(this, 180));

    /* JADX INFO: renamed from: o00O00OO, reason: collision with root package name */
    public final InterfaceC32931OooO0OO<OkHttpClient> f89890o00O00OO = C32929OooO00o.OooO00o(new OooO00o(this, 185));

    /* JADX INFO: renamed from: o00O00Oo, reason: collision with root package name */
    public final InterfaceC32931OooO0OO<C35240OooOoOO> f89891o00O00Oo = C32929OooO00o.OooO00o(new OooO00o(this, 184));

    /* JADX INFO: renamed from: o00O00o0, reason: collision with root package name */
    public final InterfaceC32931OooO0OO<o0OOOOO0.OooO0o> f89893o00O00o0 = C32929OooO00o.OooO00o(new OooO00o(this, 183));

    /* JADX INFO: renamed from: o00O00o, reason: collision with root package name */
    public final InterfaceC32931OooO0OO<OkHttpClient> f89892o00O00o = C22230OoooO0O.OooO0O0(this, 188);

    /* JADX INFO: renamed from: o00O00oO, reason: collision with root package name */
    public final InterfaceC32931OooO0OO<C35240OooOoOO> f89894o00O00oO = C22230OoooO0O.OooO0O0(this, 187);

    /* JADX INFO: renamed from: oo00o, reason: collision with root package name */
    public final InterfaceC32931OooO0OO<o0OOOOO0.OooO0o> f89988oo00o = C22230OoooO0O.OooO0O0(this, 186);

    /* JADX INFO: renamed from: o00O0, reason: collision with root package name */
    public final InterfaceC32931OooO0OO<OkHttpClient> f89885o00O0 = C22230OoooO0O.OooO0O0(this, 192);

    /* JADX INFO: renamed from: o00O0O00, reason: collision with root package name */
    public final InterfaceC32931OooO0OO<C35240OooOoOO> f89897o00O0O00 = C22230OoooO0O.OooO0O0(this, 191);

    /* JADX INFO: renamed from: o00O0O0, reason: collision with root package name */
    public final InterfaceC32931OooO0OO<InterfaceC27150OooO0Oo> f89896o00O0O0 = C22230OoooO0O.OooO0O0(this, 190);

    /* JADX INFO: renamed from: o00O0O0O, reason: collision with root package name */
    public final InterfaceC32931OooO0OO<OkHttpClient> f89898o00O0O0O = C22230OoooO0O.OooO0O0(this, 193);

    /* JADX INFO: renamed from: o00O0O0o, reason: collision with root package name */
    public final InterfaceC32931OooO0OO<C26932OooO0oO> f89899o00O0O0o = C22230OoooO0O.OooO0O0(this, 189);

    /* JADX INFO: renamed from: o00O0OO0, reason: collision with root package name */
    public final InterfaceC32931OooO0OO<OkHttpClient> f89901o00O0OO0 = C22230OoooO0O.OooO0O0(this, 197);

    /* JADX INFO: renamed from: oo0o0O0, reason: collision with root package name */
    public final InterfaceC32931OooO0OO<C35240OooOoOO> f89990oo0o0O0 = C22230OoooO0O.OooO0O0(this, 196);

    /* JADX INFO: renamed from: o00O0OO, reason: collision with root package name */
    public final InterfaceC32931OooO0OO<InterfaceC27198OooO0oO> f89900o00O0OO = C22230OoooO0O.OooO0O0(this, 195);

    /* JADX INFO: renamed from: o00O0OOO, reason: collision with root package name */
    public final InterfaceC32931OooO0OO<OSSCredentialProvider> f89902o00O0OOO = C22230OoooO0O.OooO0O0(this, 200);

    /* JADX INFO: renamed from: o00O0OOo, reason: collision with root package name */
    public final InterfaceC32931OooO0OO<OSS> f89903o00O0OOo = C22230OoooO0O.OooO0O0(this, 199);

    /* JADX INFO: renamed from: o00O0Oo0, reason: collision with root package name */
    public final InterfaceC32931OooO0OO<o0OO00Oo.OooO0OO> f89905o00O0Oo0 = C22230OoooO0O.OooO0O0(this, 198);

    /* JADX INFO: renamed from: oo0oOO0, reason: collision with root package name */
    public final InterfaceC32931OooO0OO<C26938OooOOoo> f89992oo0oOO0 = C22230OoooO0O.OooO0O0(this, 194);

    /* JADX INFO: renamed from: o00O0Oo, reason: collision with root package name */
    public final InterfaceC32931OooO0OO<C26933OooO0oo> f89904o00O0Oo = C22230OoooO0O.OooO0O0(this, 178);

    /* JADX INFO: renamed from: o00O0OoO, reason: collision with root package name */
    public final InterfaceC32931OooO0OO<InterfaceC27297OooOOO> f89906o00O0OoO = C32929OooO00o.OooO00o(new OooO00o(this, 201));

    /* JADX INFO: renamed from: o00O0Ooo, reason: collision with root package name */
    public final InterfaceC32931OooO0OO<NoteAiDatabase> f89907o00O0Ooo = C22230OoooO0O.OooO0O0(this, 204);

    /* JADX INFO: renamed from: o00O0o00, reason: collision with root package name */
    public final InterfaceC32931OooO0OO<InterfaceC34994oOooo0o> f89910o00O0o00 = C22230OoooO0O.OooO0O0(this, 203);

    /* JADX INFO: renamed from: o00oOOo, reason: collision with root package name */
    public final InterfaceC32931OooO0OO<InterfaceC27159OooO00o> f89970o00oOOo = C22230OoooO0O.OooO0O0(this, 205);

    /* JADX INFO: renamed from: o00O0o0, reason: collision with root package name */
    public final InterfaceC32931OooO0OO<NoteinAiQuotaRecordMapper> f89909o00O0o0 = C22230OoooO0O.OooO0O0(this, 206);

    /* JADX INFO: renamed from: o00O0o0O, reason: collision with root package name */
    public final InterfaceC32931OooO0OO<InterfaceC27325OoooO00> f89911o00O0o0O = C32929OooO00o.OooO00o(new OooO00o(this, 202));

    /* JADX INFO: renamed from: o00O0o0o, reason: collision with root package name */
    public final InterfaceC32931OooO0OO<InterfaceC34703OooO0OO> f89912o00O0o0o = C22230OoooO0O.OooO0O0(this, 208);

    /* JADX INFO: renamed from: o00O0o, reason: collision with root package name */
    public final InterfaceC32931OooO0OO<AiOcrSessionMapper> f89908o00O0o = C32929OooO00o.OooO00o(new OooO00o(this, 209));

    /* JADX INFO: renamed from: o00O0oO, reason: collision with root package name */
    public final InterfaceC32931OooO0OO<C26984OooO0Oo> f89913o00O0oO = C32929OooO00o.OooO00o(new OooO00o(this, 207));

    /* JADX INFO: renamed from: o00O0oOO, reason: collision with root package name */
    public final InterfaceC32931OooO0OO<InterfaceC34708OooOO0o> f89914o00O0oOO = C32929OooO00o.OooO00o(new OooO00o(this, 212));

    /* JADX INFO: renamed from: o00O0oOo, reason: collision with root package name */
    public final InterfaceC32931OooO0OO<C27003OooO0oo> f89915o00O0oOo = C32929OooO00o.OooO00o(new OooO00o(this, 211));

    /* JADX INFO: renamed from: o00O0oo0, reason: collision with root package name */
    public final InterfaceC32931OooO0OO<AiOcrTextPageMapper> f89917o00O0oo0 = C32929OooO00o.OooO00o(new OooO00o(this, 213));

    /* JADX INFO: renamed from: o00O0oo, reason: collision with root package name */
    public final InterfaceC32931OooO0OO<o0OOO0.OooO0o> f89916o00O0oo = C32929OooO00o.OooO00o(new OooO00o(this, 210));

    /* JADX INFO: renamed from: o00O0ooo, reason: collision with root package name */
    public final InterfaceC32931OooO0OO<C26942OooO0O0> f89918o00O0ooo = C32929OooO00o.OooO00o(new OooO00o(this, 214));

    /* JADX INFO: renamed from: o00O, reason: collision with root package name */
    public final InterfaceC32931OooO0OO<InterfaceC27290OooO0o> f89884o00O = C32929OooO00o.OooO00o(new OooO00o(this, 216));

    /* JADX INFO: renamed from: o00OO000, reason: collision with root package name */
    public final InterfaceC32931OooO0OO<InterfaceC27291OooO0o0> f89921o00OO000 = C32929OooO00o.OooO00o(new OooO00o(this, 217));

    /* JADX INFO: renamed from: o00OO00O, reason: collision with root package name */
    public final InterfaceC32931OooO0OO<C27328OooO0OO> f89922o00OO00O = C32929OooO00o.OooO00o(new OooO00o(this, 215));

    /* JADX INFO: renamed from: o00OO00o, reason: collision with root package name */
    public final InterfaceC32931OooO0OO<C27659OoooOOo> f89923o00OO00o = C32929OooO00o.OooO00o(new OooO00o(this, 218));

    /* JADX INFO: renamed from: o00OO0, reason: collision with root package name */
    public final InterfaceC32931OooO0OO<C26928OooO0OO> f89920o00OO0 = C32929OooO00o.OooO00o(new OooO00o(this, 220));

    /* JADX INFO: renamed from: o00OO0O0, reason: collision with root package name */
    public final InterfaceC32931OooO0OO<C26929OooO0Oo> f89925o00OO0O0 = C32929OooO00o.OooO00o(new OooO00o(this, 219));

    /* JADX INFO: renamed from: o00OO0O, reason: collision with root package name */
    public final InterfaceC32931OooO0OO<OkHttpClient> f89924o00OO0O = C32929OooO00o.OooO00o(new OooO00o(this, 224));

    /* JADX INFO: renamed from: o00OO0OO, reason: collision with root package name */
    public final InterfaceC32931OooO0OO<C35240OooOoOO> f89926o00OO0OO = C32929OooO00o.OooO00o(new OooO00o(this, 223));

    /* JADX INFO: renamed from: o00OO0o0, reason: collision with root package name */
    public final InterfaceC32931OooO0OO<InterfaceC27151OooO0o0> f89928o00OO0o0 = C32929OooO00o.OooO00o(new OooO00o(this, 222));

    /* JADX INFO: renamed from: o00OO0o, reason: collision with root package name */
    public final InterfaceC32931OooO0OO<C26971OooOo0> f89927o00OO0o = C32929OooO00o.OooO00o(new OooO00o(this, 221));

    /* JADX INFO: renamed from: o00OO0oO, reason: collision with root package name */
    public final InterfaceC32931OooO0OO<InterfaceC34723Oooo> f89929o00OO0oO = C32929OooO00o.OooO00o(new OooO00o(this, 225));

    /* JADX INFO: renamed from: o00OO0oo, reason: collision with root package name */
    public final InterfaceC32931OooO0OO<ColorSetMapper> f89930o00OO0oo = C32929OooO00o.OooO00o(new OooO00o(this, 226));

    /* JADX INFO: renamed from: oo0O, reason: collision with root package name */
    public final InterfaceC32931OooO0OO<o0O000> f89989oo0O = C32929OooO00o.OooO00o(new OooO00o(this, 229));

    /* JADX INFO: renamed from: o00OO, reason: collision with root package name */
    public final InterfaceC32931OooO0OO<InterfaceC34975o00ooooO> f89919o00OO = C32929OooO00o.OooO00o(new OooO00o(this, 230));

    /* JADX INFO: renamed from: o00OOO00, reason: collision with root package name */
    public final InterfaceC32931OooO0OO<StickerMapper> f89933o00OOO00 = C32929OooO00o.OooO00o(new OooO00o(this, 231));

    /* JADX INFO: renamed from: o00OOO0, reason: collision with root package name */
    public final InterfaceC32931OooO0OO<InterfaceC27321Oooo0o> f89932o00OOO0 = C32929OooO00o.OooO00o(new OooO00o(this, 228));

    /* JADX INFO: renamed from: o00OOO0O, reason: collision with root package name */
    public final InterfaceC32931OooO0OO<o0OO00o0.o00O0O> f89934o00OOO0O = C22230OoooO0O.OooO0O0(this, 232);

    /* JADX INFO: renamed from: o0o0Oo, reason: collision with root package name */
    public final InterfaceC32931OooO0OO<C27538o00o0o0O> f89980o0o0Oo = C22230OoooO0O.OooO0O0(this, 227);

    /* JADX INFO: renamed from: o00OOO, reason: collision with root package name */
    public final InterfaceC32931OooO0OO<C26962OooOO0O> f89931o00OOO = C22230OoooO0O.OooO0O0(this, 233);

    /* JADX INFO: renamed from: o00OOOO0, reason: collision with root package name */
    public final InterfaceC32931OooO0OO<C35240OooOoOO> f89936o00OOOO0 = C22230OoooO0O.OooO0O0(this, 236);

    /* JADX INFO: renamed from: o00OOOO, reason: collision with root package name */
    public final InterfaceC32931OooO0OO<o0OOOOO.OooO00o> f89935o00OOOO = C22230OoooO0O.OooO0O0(this, 235);

    /* JADX INFO: renamed from: o00OOOOo, reason: collision with root package name */
    public final InterfaceC32931OooO0OO<o0oO0O0o> f89937o00OOOOo = C22230OoooO0O.OooO0O0(this, 237);

    /* JADX INFO: renamed from: oOooo0o, reason: collision with root package name */
    public final InterfaceC32931OooO0OO<InterfaceC34808o000ooO> f89986oOooo0o = C22230OoooO0O.OooO0O0(this, 238);

    /* JADX INFO: renamed from: o00OOOo0, reason: collision with root package name */
    public final InterfaceC32931OooO0OO<NoteAiContentMapper> f89939o00OOOo0 = C22230OoooO0O.OooO0O0(this, 239);

    /* JADX INFO: renamed from: o00OOOo, reason: collision with root package name */
    public final InterfaceC32931OooO0OO<C26471OooO0Oo> f89938o00OOOo = C22230OoooO0O.OooO0O0(this, 234);

    /* JADX INFO: renamed from: o00OOOoO, reason: collision with root package name */
    public final InterfaceC32931OooO0OO<OkHttpClient> f89940o00OOOoO = C22230OoooO0O.OooO0O0(this, 242);

    /* JADX INFO: renamed from: o00OOoo, reason: collision with root package name */
    public final InterfaceC32931OooO0OO<C35240OooOoOO> f89941o00OOoo = C22230OoooO0O.OooO0O0(this, 241);

    /* JADX INFO: renamed from: o00OOooO, reason: collision with root package name */
    public final InterfaceC32931OooO0OO<InterfaceC27186OooO00o> f89942o00OOooO = C22230OoooO0O.OooO0O0(this, 240);

    /* JADX INFO: renamed from: o00OOooo, reason: collision with root package name */
    public final InterfaceC32931OooO0OO<C27786OooO0OO> f89943o00OOooo = C22230OoooO0O.OooO0O0(this, 243);

    /* JADX INFO: renamed from: o00OoOoO, reason: collision with root package name */
    public final InterfaceC32931OooO0OO<InterfaceC27307OooOo0O> f89961o00OoOoO = C32929OooO00o.OooO00o(new OooO00o(this, 244));

    /* JADX INFO: renamed from: o00Oo000, reason: collision with root package name */
    public final InterfaceC32931OooO0OO<o0OOOOO0.OooOO0O> f89947o00Oo000 = C22230OoooO0O.OooO0O0(this, 245);

    /* JADX INFO: renamed from: o00Oo00, reason: collision with root package name */
    public final InterfaceC32931OooO0OO<o0000o0O.OooOO0<AbstractC24338OooO0o0>> f89946o00Oo00 = C22230OoooO0O.OooO0O0(this, 246);

    /* JADX INFO: renamed from: o00Oo00o, reason: collision with root package name */
    public final InterfaceC32931OooO0OO<InterfaceC27295OooOO0O> f89948o00Oo00o = C32929OooO00o.OooO00o(new OooO00o(this, StyleIdentifier.LIGHT_LIST_ACCENT_6));

    /* JADX INFO: renamed from: o00Oo0O0, reason: collision with root package name */
    public final InterfaceC32931OooO0OO<o0000o0O.OooOO0<AbstractC24338OooO0o0>> f89950o00Oo0O0 = C22230OoooO0O.OooO0O0(this, StyleIdentifier.LIGHT_GRID_ACCENT_6);

    /* JADX INFO: renamed from: o00Oo0O, reason: collision with root package name */
    public final InterfaceC32931OooO0OO<o0OO0O0O.OooO0O0> f89949o00Oo0O = C22230OoooO0O.OooO0O0(this, StyleIdentifier.MEDIUM_SHADING_1_ACCENT_6);

    /* JADX INFO: renamed from: o00Oo0Oo, reason: collision with root package name */
    public final InterfaceC32931OooO0OO<C27515o00o0000> f89951o00Oo0Oo = C22230OoooO0O.OooO0O0(this, 250);

    /* JADX INFO: renamed from: o00Oo0o0, reason: collision with root package name */
    public final InterfaceC32931OooO0OO<o0OOOOO0.OooO0O0> f89953o00Oo0o0 = C22230OoooO0O.OooO0O0(this, StyleIdentifier.MEDIUM_LIST_1_ACCENT_6);

    /* JADX INFO: renamed from: o00Oo0o, reason: collision with root package name */
    public final InterfaceC32931OooO0OO<C27377o00000Oo> f89952o00Oo0o = C22230OoooO0O.OooO0O0(this, StyleIdentifier.MEDIUM_LIST_2_ACCENT_6);

    /* JADX INFO: renamed from: o00Oo0oO, reason: collision with root package name */
    public final InterfaceC32931OooO0OO<InterfaceC34947o00oo0O0> f89954o00Oo0oO = C32929OooO00o.OooO00o(new OooO00o(this, StyleIdentifier.MEDIUM_GRID_1_ACCENT_6));

    /* JADX INFO: renamed from: o00Oo0oo, reason: collision with root package name */
    public final InterfaceC32931OooO0OO<PenInfoMapper> f89955o00Oo0oo = C32929OooO00o.OooO00o(new OooO00o(this, StyleIdentifier.MEDIUM_GRID_2_ACCENT_6));

    /* JADX INFO: renamed from: o0oOO, reason: collision with root package name */
    public final InterfaceC32931OooO0OO<o0O00oO0> f89981o0oOO = C32929OooO00o.OooO00o(new OooO00o(this, 255));

    /* JADX INFO: renamed from: o00Oo, reason: collision with root package name */
    public final InterfaceC32931OooO0OO<ToolBoxInfoMapper> f89944o00Oo = C32929OooO00o.OooO00o(new OooO00o(this, 256));
    public final InterfaceC32931OooO0OO<C27976OooO0o0> o00OoO00 = C32929OooO00o.OooO00o(new OooO00o(this, 257));

    /* JADX INFO: renamed from: o00OoO0, reason: collision with root package name */
    public final InterfaceC32931OooO0OO<C27366OoooOoo> f89957o00OoO0 = C32929OooO00o.OooO00o(new OooO00o(this, StyleIdentifier.COLORFUL_LIST_ACCENT_6));

    /* JADX INFO: renamed from: o00OoO0o, reason: collision with root package name */
    public final InterfaceC32931OooO0OO<o0000o0O.OooOO0<AbstractC24338OooO0o0>> f89958o00OoO0o = C32929OooO00o.OooO00o(new OooO00o(this, StyleIdentifier.COLORFUL_GRID_ACCENT_6));

    /* JADX INFO: renamed from: o00OoO, reason: collision with root package name */
    public final InterfaceC32931OooO0OO<C27670OoooooO> f89956o00OoO = C32929OooO00o.OooO00o(new OooO00o(this, StyleIdentifier.SUBTLE_EMPHASIS));
    public final InterfaceC32931OooO0OO<C27514o00o000> o00OoOO0 = C32929OooO00o.OooO00o(new OooO00o(this, StyleIdentifier.INTENSE_EMPHASIS));
    public final InterfaceC32931OooO0OO<o0OO0oO0.OooO00o> o00OoOO = C32929OooO00o.OooO00o(new OooO00o(this, StyleIdentifier.SUBTLE_REFERENCE));
    public final InterfaceC32931OooO0OO<C27540o00o0oO> o00OoOOO = C32929OooO00o.OooO00o(new OooO00o(this, StyleIdentifier.INTENSE_REFERENCE));
    public final InterfaceC32931OooO0OO<InterfaceC27324Oooo0oo> o00OoOOo = C32929OooO00o.OooO00o(new OooO00o(this, StyleIdentifier.BOOK_TITLE));

    /* JADX INFO: renamed from: o00OoOo0, reason: collision with root package name */
    public final InterfaceC32931OooO0OO<oo0oO0.o0OoOo0> f89960o00OoOo0 = C32929OooO00o.OooO00o(new OooO00o(this, StyleIdentifier.BIBLIOGRAPHY));

    /* JADX INFO: renamed from: o00OoOo, reason: collision with root package name */
    public final InterfaceC32931OooO0OO<CouponMapper> f89959o00OoOo = C32929OooO00o.OooO00o(new OooO00o(this, StyleIdentifier.TOC_HEADING));

    /* JADX INFO: renamed from: o00OoOoo, reason: collision with root package name */
    public final InterfaceC32931OooO0OO<InterfaceC34865o00OoOo> f89962o00OoOoo = C32929OooO00o.OooO00o(new OooO00o(this, StyleIdentifier.PLAIN_TABLE_1));

    /* JADX INFO: renamed from: o00Ooo00, reason: collision with root package name */
    public final InterfaceC32931OooO0OO<NoteinMessageMapper> f89965o00Ooo00 = C32929OooO00o.OooO00o(new OooO00o(this, StyleIdentifier.PLAIN_TABLE_2));

    /* JADX INFO: renamed from: o00Ooo0, reason: collision with root package name */
    public final InterfaceC32931OooO0OO<o0OOOOO0.OooOO0> f89964o00Ooo0 = C32929OooO00o.OooO00o(new OooO00o(this, StyleIdentifier.PLAIN_TABLE_3));

    /* JADX INFO: renamed from: o00Ooo0O, reason: collision with root package name */
    public final InterfaceC32931OooO0OO<o0OOo0o.o00000OO> f89966o00Ooo0O = C32929OooO00o.OooO00o(new OooO00o(this, 270));

    /* JADX INFO: renamed from: o0O0oooO.OooOOoo$OooO00o */
    public static final class OooO00o<T> implements InterfaceC32931OooO0OO<T> {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public final C26269OooOOoo f89995OooO00o;

        /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
        public final int f89996OooO0O0;

        /* JADX INFO: renamed from: o0O0oooO.OooOOoo$OooO00o$OooO00o, reason: collision with other inner class name */
        public class C19736OooO00o implements o000O0o0.OooO0O0 {
            public C19736OooO00o() {
            }

            @Override // o000O0o0.OooO0O0
            public final ListenableWorker OooO00o(Context context, WorkerParameters workerParameters) {
                return new CloudBackupWorker(context, workerParameters, OooO00o.this.f89995OooO00o.f89794o00000.get());
            }
        }

        /* JADX INFO: renamed from: o0O0oooO.OooOOoo$OooO00o$OooO0O0 */
        public class OooO0O0 implements o000O0o0.OooO0O0 {
            @Override // o000O0o0.OooO0O0
            public final ListenableWorker OooO00o(Context context, WorkerParameters workerParameters) {
                return new FeedbackWorker(context, workerParameters);
            }
        }

        /* JADX INFO: renamed from: o0O0oooO.OooOOoo$OooO00o$OooO0OO */
        public class OooO0OO implements o000O0o0.OooO0O0 {
            public OooO0OO() {
            }

            @Override // o000O0o0.OooO0O0
            public final ListenableWorker OooO00o(Context context, WorkerParameters workerParameters) {
                OooO00o oooO00o = OooO00o.this;
                o0OOo0o.o00000O o00000o = oooO00o.f89995OooO00o.f89801o00000Oo.get();
                C26269OooOOoo c26269OooOOoo = oooO00o.f89995OooO00o;
                return new PageTextCacheUpdateWorker(context, workerParameters, o00000o, c26269OooOOoo.f89765Oooo00o.get(), c26269OooOOoo.f89804o00000oo.get(), c26269OooOOoo.Oooo00o(), c26269OooOOoo.f89818o0000o0o.get(), c26269OooOOoo.OooOo0O());
            }
        }

        public OooO00o(C26269OooOOoo c26269OooOOoo, int i) {
            this.f89995OooO00o = c26269OooOOoo;
            this.f89996OooO0O0 = i;
        }

        public final T OooO00o() {
            C26269OooOOoo c26269OooOOoo = this.f89995OooO00o;
            int i = this.f89996OooO0O0;
            switch (i) {
                case 0:
                    return (T) new C19736OooO00o();
                case 1:
                    o0O000o.OooO0O0 oooO0O0 = c26269OooOOoo.f89731OooO00o;
                    AbstractApplicationC26277OooOoOO abstractApplicationC26277OooOoOO = (AbstractApplicationC26277OooOoOO) oooO0O0.f88129OooO00o;
                    InterfaceC27309OooOoO interfaceC27309OooOoO = c26269OooOOoo.f89735OooO0o.get();
                    C27020OooOoO0 c27020OooOoO0OooOoOO = c26269OooOOoo.OooOoOO();
                    C26620o00Oo00o c26620o00Oo00oOooOo = c26269OooOOoo.OooOo();
                    C27095OooOo0O c27095OooOo0OOooo0 = c26269OooOOoo.Oooo0();
                    C26427Oooo0O0 c26427Oooo0O0OooOoo0 = c26269OooOOoo.OooOoo0();
                    PageMapper pageMapper = c26269OooOOoo.f89738OooO0oo.get();
                    NoteMapper noteMapper = c26269OooOOoo.f89751OooOo00.get();
                    C28124OooOoO0 c28124OooOoO0 = new C28124OooOoO0(c26269OooOOoo.f89753OooOo0o.get(), c26269OooOOoo.f89752OooOo0O.get());
                    C28101OooO0O0 c28101OooO0O0 = new C28101OooO0O0(c26269OooOOoo.OooO(), c26269OooOOoo.f89755OooOoO0.get());
                    AbstractApplicationC26277OooOoOO abstractApplicationC26277OooOoOO2 = (AbstractApplicationC26277OooOoOO) oooO0O0.f88129OooO00o;
                    C28111OooOOO c28111OooOOO = new C28111OooOOO(abstractApplicationC26277OooOoOO2, c26269OooOOoo.OooOOoo(), c26269OooOOoo.f89756OooOoOO.get(), c26269OooOOoo.OooOOO0());
                    C28132Oooo00O c28132Oooo00O = new C28132Oooo00O(c26269OooOOoo.f89765Oooo00o.get(), c26269OooOOoo.f89764Oooo00O.get());
                    C28129OooOooo c28129OooOooo = new C28129OooOooo(c26269OooOOoo.Oooo000(), c26269OooOOoo.f89766Oooo0O0.get());
                    C28130Oooo0 c28130Oooo0 = new C28130Oooo0(abstractApplicationC26277OooOoOO2, c26269OooOOoo.Oooo00O(), c26269OooOOoo.f89769Oooo0o0.get());
                    C28126OooOoo c28126OooOoo = new C28126OooOoo(c26269OooOOoo.OooOooO(), c26269OooOOoo.f89770Oooo0oO.get());
                    o0O000o.OooO0O0 oooO0O02 = c26269OooOOoo.f89731OooO00o;
                    return (T) new C27351Oooo0O0(abstractApplicationC26277OooOoOO, new C28117OooOOoo(new C28122OooOo0o(abstractApplicationC26277OooOoOO, interfaceC27309OooOoO, c27020OooOoO0OooOoOO, c26620o00Oo00oOooOo, c27095OooOo0OOooo0, c26427Oooo0O0OooOoo0, pageMapper, noteMapper, c28124OooOoO0, c28101OooO0O0, c28111OooOOO, c28132Oooo00O, c28129OooOooo, c28130Oooo0, c28126OooOoo, new C28125OooOoOO((AbstractApplicationC26277OooOoOO) oooO0O02.f88129OooO00o, c26269OooOOoo.OooOoo0(), c26269OooOOoo.f89748OooOOoo.get()), new C28119OooOo0(c26269OooOOoo.OooOo(), c26269OooOOoo.f89741OooOO0o.get()), new C28110OooOO0o(c26269OooOOoo.f89774OoooO00.get(), c26269OooOOoo.f89761Oooo.get())), new C28119OooOo0(c26269OooOOoo.OooOo(), c26269OooOOoo.f89741OooOO0o.get()), new C28125OooOoOO((AbstractApplicationC26277OooOoOO) oooO0O02.f88129OooO00o, c26269OooOOoo.OooOoo0(), c26269OooOOoo.f89748OooOOoo.get()), c26269OooOOoo.OooOOO(), new C28124OooOoO0(c26269OooOOoo.f89753OooOo0o.get(), c26269OooOOoo.f89752OooOo0O.get()), c26269OooOOoo.Oooo0O0(), c26269OooOOoo.OooOo0O(), c26269OooOOoo.f89751OooOo00.get()), new C28114OooOOOo(c26269OooOOoo.Oooo0(), c26269OooOOoo.f89747OooOOo0.get()), c26269OooOOoo.OooOOO(), c26269OooOOoo.OooOo0O(), c26269OooOOoo.OooOOOo(), c26269OooOOoo.f89797o000000o.get(), c26269OooOOoo.f89790Ooooooo.get(), c26269OooOOoo.f89972o00ooo.get(), c26269OooOOoo.Oooo0());
                case 2:
                    return (T) new C26412OooOOo0(c26269OooOOoo.f89734OooO0Oo.get(), c26269OooOOoo.f89736OooO0o0.get());
                case 3:
                    return (T) new o0OO.OooOOO(c26269OooOOoo.f89733OooO0OO.get());
                case 4:
                    return (T) new C26454OooO0Oo((AbstractApplicationC26277OooOoOO) c26269OooOOoo.f89731OooO00o.f88129OooO00o);
                case 5:
                    return (T) ((NoteContentMapper) oOO00O0O.OooO00o.OooO0O0(NoteContentMapper.class));
                case 6:
                    return (T) new C27015OooOOoo(c26269OooOOoo.f89733OooO0OO.get());
                case 7:
                    return (T) ((PageMapper) oOO00O0O.OooO00o.OooO0O0(PageMapper.class));
                case 8:
                    return (T) new C27017OooOo0O();
                case 9:
                    return (T) new C26613o00OOOoO(c26269OooOOoo.f89733OooO0OO.get());
                case 10:
                    return (T) C28051OooO00o.OooO0O0((AbstractApplicationC26277OooOoOO) c26269OooOOoo.f89731OooO00o.f88129OooO00o);
                case 11:
                    return (T) ((OutlineMapper) oOO00O0O.OooO00o.OooO0O0(OutlineMapper.class));
                case 12:
                    return (T) new o0OOOO00.OooOO0O(c26269OooOOoo.f89743OooOOO0.get());
                case 13:
                    return (T) C28051OooO00o.OooO00o((AbstractApplicationC26277OooOoOO) c26269OooOOoo.f89731OooO00o.f88129OooO00o);
                case 14:
                    NoteDatabase database = c26269OooOOoo.f89744OooOOOO.get();
                    kotlin.jvm.internal.OooOOO0.OooO0oO(database, "database");
                    T t = (T) database.OooOoo();
                    C25898OooO0Oo.OooO0O0(t);
                    return t;
                case 15:
                    AbstractApplicationC26277OooOoOO abstractApplicationC26277OooOoOO3 = (AbstractApplicationC26277OooOoOO) c26269OooOOoo.f89731OooO00o.f88129OooO00o;
                    C27247Oooo0oO c27247Oooo0oO = new C27247Oooo0oO(3, 4);
                    C27256OoooOo0 c27256OoooOo0 = new C27256OoooOo0(4, 5);
                    C27258OoooOoo c27258OoooOoo = new C27258OoooOoo(5, 6);
                    C27259Ooooo00 c27259Ooooo00 = new C27259Ooooo00(6, 7);
                    C27260Ooooo0o c27260Ooooo0o = new C27260Ooooo0o(7, 8);
                    C27261OooooO0 c27261OooooO0 = new C27261OooooO0(8, 9);
                    C27262OooooOO c27262OooooOO = new C27262OooooOO(9, 10);
                    C27221OooOO0 c27221OooOO0 = new C27221OooOO0(10, 11);
                    C27222OooOO0O c27222OooOO0O = new C27222OooOO0O(11, 12);
                    C27223OooOO0o c27223OooOO0o = new C27223OooOO0o(12, 13);
                    C27225OooOOO0 c27225OooOOO0 = new C27225OooOOO0(13, 14);
                    C27224OooOOO c27224OooOOO = new C27224OooOOO(14, 15);
                    o0OOOoo0.OooOOOO oooOOOO = new o0OOOoo0.OooOOOO(15, 16);
                    C27226OooOOOo c27226OooOOOo = new C27226OooOOOo(16, 17);
                    C27228OooOOo0 c27228OooOOo0 = new C27228OooOOo0(17, 18);
                    C27227OooOOo c27227OooOOo = new C27227OooOOo(18, 19);
                    C27229OooOOoo c27229OooOOoo = new C27229OooOOoo(19, 20);
                    o0OOOoo0.OooOo00 oooOo00 = new o0OOOoo0.OooOo00(20, 21);
                    C27230OooOo0 c27230OooOo0 = new C27230OooOo0(21, 22);
                    C27231OooOo0O c27231OooOo0O = new C27231OooOo0O(22, 23);
                    C27232OooOo0o c27232OooOo0o = new C27232OooOo0o(23, 24);
                    o0OOOoo0.OooOo oooOo = new o0OOOoo0.OooOo(24, 25);
                    C27234OooOoO0 c27234OooOoO0 = new C27234OooOoO0(25, 26);
                    C27233OooOoO c27233OooOoO = new C27233OooOoO(26, 27);
                    C27235OooOoOO c27235OooOoOO = new C27235OooOoOO(27, 28);
                    C27237OooOoo0 c27237OooOoo0 = new C27237OooOoo0(28, 29);
                    C27236OooOoo c27236OooOoo = new C27236OooOoo(29, 30);
                    C27238OooOooO c27238OooOooO = new C27238OooOooO(30, 31);
                    C27239OooOooo c27239OooOooo = new C27239OooOooo(31, 32);
                    o0OOOoo0.Oooo000 oooo000 = new o0OOOoo0.Oooo000(32, 33);
                    C27241Oooo00O c27241Oooo00O = new C27241Oooo00O(33, 34);
                    C27242Oooo00o c27242Oooo00o = new C27242Oooo00o(34, 35);
                    o0OOOoo0.Oooo0 oooo0 = new o0OOOoo0.Oooo0(35, 36);
                    C27243Oooo0O0 c27243Oooo0O0 = new C27243Oooo0O0(36, 37);
                    C27244Oooo0OO c27244Oooo0OO = new C27244Oooo0OO(37, 38);
                    C27246Oooo0o0 c27246Oooo0o0 = new C27246Oooo0o0(38, 39);
                    C27245Oooo0o c27245Oooo0o = new C27245Oooo0o(39, 40);
                    C27248Oooo0oo c27248Oooo0oo = new C27248Oooo0oo(40, 41);
                    C27240Oooo c27240Oooo = new C27240Oooo(41, 42);
                    C27251OoooO00 c27251OoooO00 = new C27251OoooO00(42, 43);
                    C27250OoooO0 c27250OoooO0 = new C27250OoooO0(43, 44);
                    C27252OoooO0O c27252OoooO0O = new C27252OoooO0O(44, 45);
                    C27249OoooO c27249OoooO = new C27249OoooO(45, 46);
                    C27253OoooOO0 c27253OoooOO0 = new C27253OoooOO0(46, 47);
                    o0OOOoo0.o000oOoO o000oooo2 = new o0OOOoo0.o000oOoO(47, 48);
                    C27254OoooOOO c27254OoooOOO = new C27254OoooOOO(48, 49);
                    C27255OoooOOo c27255OoooOOo = new C27255OoooOOo(49, 50);
                    C27257OoooOoO c27257OoooOoO = new C27257OoooOoO(51, 52);
                    AbstractC24673OooOo0O.OooO00o OooO00o2 = C24668OooOOOo.OooO00o(abstractApplicationC26277OooOoOO3, "note-db", NoteDatabase.class);
                    OooO00o2.OooO00o(c27247Oooo0oO, c27256OoooOo0, c27258OoooOoo, c27259Ooooo00, c27260Ooooo0o, c27261OooooO0, c27262OooooOO, c27221OooOO0, c27222OooOO0O, c27223OooOO0o, c27225OooOOO0, c27224OooOOO, oooOOOO, c27226OooOOOo, c27228OooOOo0, c27227OooOOo, c27229OooOOoo, oooOo00, c27230OooOo0, c27231OooOo0O, c27232OooOo0o, oooOo, c27234OooOoO0, c27233OooOoO, c27235OooOoOO, c27237OooOoo0, c27236OooOoo, c27238OooOooO, c27239OooOooo, oooo000, c27241Oooo00O, c27242Oooo00o, oooo0, c27243Oooo0O0, c27244Oooo0OO, c27246Oooo0o0, c27245Oooo0o, c27248Oooo0oo, c27240Oooo, c27251OoooO00, c27250OoooO0, c27252OoooO0O, c27249OoooO, c27253OoooOO0, o000oooo2, c27254OoooOOO, c27255OoooOOo, C26693OooO00o.f92191OooO00o, c27257OoooOoO);
                    return (T) ((NoteDatabase) OooO00o2.OooO0O0());
                case 16:
                    return (T) ((MyTemplateMapper) oOO00O0O.OooO00o.OooO0O0(MyTemplateMapper.class));
                case 17:
                    return (T) new o0OO.Oooo000(c26269OooOOoo.f89733OooO0OO.get());
                case 18:
                    return (T) ((PdfInfoMapper) oOO00O0O.OooO00o.OooO0O0(PdfInfoMapper.class));
                case 19:
                    return (T) ((NoteMapper) oOO00O0O.OooO00o.OooO0O0(NoteMapper.class));
                case 20:
                    return (T) new C27044OooOo0(c26269OooOOoo.f89750OooOo0.get(), c26269OooOOoo.f89752OooOo0O.get());
                case 21:
                    return (T) new C27040OooOOOo(c26269OooOOoo.f89733OooO0OO.get());
                case 22:
                    return (T) ((PageLayerMapper) oOO00O0O.OooO00o.OooO0O0(PageLayerMapper.class));
                case 23:
                    return (T) new C26479OooOO0o(c26269OooOOoo.f89733OooO0OO.get());
                case 24:
                    return (T) ((CommentMapper) oOO00O0O.OooO00o.OooO0O0(CommentMapper.class));
                case 25:
                    return (T) new C26588o00O00oO(c26269OooOOoo.f89733OooO0OO.get());
                case 26:
                    return (T) ((ImageMapper) oOO00O0O.OooO00o.OooO0O0(ImageMapper.class));
                case 27:
                    return (T) new C26691ooOO(c26269OooOOoo.f89733OooO0OO.get());
                case 28:
                    return (T) new C26501Oooo0oO(c26269OooOOoo.f89733OooO0OO.get());
                case 29:
                    return (T) ((DualLinkSourceMapper) oOO00O0O.OooO00o.OooO0O0(DualLinkSourceMapper.class));
                case 30:
                    return (T) ((DualLinkRefMapper) oOO00O0O.OooO00o.OooO0O0(DualLinkRefMapper.class));
                case 31:
                    return (T) new C26665o00o0O00(c26269OooOOoo.f89763Oooo000.get(), c26269OooOOoo.f89764Oooo00O.get());
                case 32:
                    return (T) new C26660o00o00o0(c26269OooOOoo.f89733OooO0OO.get());
                case 33:
                    return (T) ((StrokeMapper) oOO00O0O.OooO00o.OooO0O0(StrokeMapper.class));
                case 34:
                    return (T) new C26647o00OooOO(c26269OooOOoo.f89733OooO0OO.get());
                case 35:
                    return (T) ((ShapeMapper) oOO00O0O.OooO00o.OooO0O0(ShapeMapper.class));
                case 36:
                    return (T) new C26676o00o0o00(c26269OooOOoo.f89733OooO0OO.get());
                case 37:
                    return (T) ((TextBoxMapper) oOO00O0O.OooO00o.OooO0O0(TextBoxMapper.class));
                case 38:
                    return (T) new C26629o00OoO0(c26269OooOOoo.f89733OooO0OO.get());
                case 39:
                    return (T) ((QuoteMapper) oOO00O0O.OooO00o.OooO0O0(QuoteMapper.class));
                case 40:
                    return (T) new C26585o000oooo(c26269OooOOoo.f89771Oooo0oo.get(), c26269OooOOoo.f89761Oooo.get());
                case 41:
                    return (T) new C26582o000ooo(c26269OooOOoo.f89733OooO0OO.get());
                case 42:
                    return (T) ((HyperLinkMapper) oOO00O0O.OooO00o.OooO0O0(HyperLinkMapper.class));
                case 43:
                    NoteDatabase database2 = c26269OooOOoo.f89744OooOOOO.get();
                    kotlin.jvm.internal.OooOOO0.OooO0oO(database2, "database");
                    T t2 = (T) database2.OooOoO0();
                    C25898OooO0Oo.OooO0O0(t2);
                    return t2;
                case 44:
                    return (T) ((FolderMapper) oOO00O0O.OooO00o.OooO0O0(FolderMapper.class));
                case 45:
                    NoteDatabase database3 = c26269OooOOoo.f89744OooOOOO.get();
                    kotlin.jvm.internal.OooOOO0.OooO0oO(database3, "database");
                    T t3 = (T) database3.Oooo0oO();
                    C25898OooO0Oo.OooO0O0(t3);
                    return t3;
                case 46:
                    return (T) ((UserMapper) oOO00O0O.OooO00o.OooO0O0(UserMapper.class));
                case 47:
                    C35240OooOoOO c35240OooOoOO = c26269OooOOoo.f89778OoooOOo.get();
                    C27213OooO00o c27213OooO00o = C27214OooO0O0.f95055OooO00o;
                    return (T) ((InterfaceC27154OooOO0o) C21023OooO0Oo.OooO0O0(c35240OooOoOO, "retrofit", InterfaceC27154OooOO0o.class, "create(...)"));
                case 48:
                    OkHttpClient okHttpClient = c26269OooOOoo.f89870o000oOoO.get();
                    Gson gson = c26269OooOOoo.f89777OoooOOO.get();
                    C27213OooO00o c27213OooO00o2 = C27214OooO0O0.f95055OooO00o;
                    kotlin.jvm.internal.OooOOO0.OooO0oO(okHttpClient, "okHttpClient");
                    kotlin.jvm.internal.OooOOO0.OooO0oO(gson, "gson");
                    C35240OooOoOO.OooO0O0 oooO0O03 = new C35240OooOoOO.OooO0O0();
                    oooO0O03.f126593OooO0Oo.add(new C35204OooO00o(gson));
                    Log.d("ApiModule", "baseUri is: https://service.note-in.com/");
                    oooO0O03.OooO00o("https://service.note-in.com/");
                    oooO0O03.f126591OooO0O0 = okHttpClient;
                    return (T) oooO0O03.OooO0O0();
                case 49:
                    o0000o0O.OooOO0<AbstractC24338OooO0o0> ds = c26269OooOOoo.f89743OooOOO0.get();
                    AbstractApplicationC26277OooOoOO abstractApplicationC26277OooOoOO4 = (AbstractApplicationC26277OooOoOO) c26269OooOOoo.f89731OooO00o.f88129OooO00o;
                    C27213OooO00o c27213OooO00o3 = C27214OooO0O0.f95055OooO00o;
                    kotlin.jvm.internal.OooOOO0.OooO0oO(ds, "ds");
                    OkHttpClient.Builder builder = new OkHttpClient.Builder();
                    TimeUnit timeUnit = TimeUnit.SECONDS;
                    builder.OooO0o0(30L, timeUnit);
                    builder.OooO0OO(30L, timeUnit);
                    builder.OooO0O0(C27214OooO0O0.f95055OooO00o);
                    C31150OooO00o c31150OooO00o = new C31150OooO00o(ds, abstractApplicationC26277OooOoOO4);
                    ArrayList arrayList = builder.f124204OooO0OO;
                    arrayList.add(c31150OooO00o);
                    arrayList.add(new C31197OooO00o());
                    arrayList.add(new C31151OooO0O0(ds, abstractApplicationC26277OooOoOO4));
                    return (T) new OkHttpClient(builder);
                case 50:
                    C27213OooO00o c27213OooO00o4 = C27214OooO0O0.f95055OooO00o;
                    T t4 = (T) new GsonBuilder().create();
                    kotlin.jvm.internal.OooOOO0.OooO0o(t4, "create(...)");
                    return t4;
                case 51:
                    C35240OooOoOO c35240OooOoOO2 = c26269OooOOoo.f89778OoooOOo.get();
                    C27213OooO00o c27213OooO00o5 = C27214OooO0O0.f95055OooO00o;
                    return (T) ((InterfaceC27153OooO0oo) C21023OooO0Oo.OooO0O0(c35240OooOoOO2, "retrofit", InterfaceC27153OooO0oo.class, "create(...)"));
                case 52:
                    return (T) new o0OOOO0o.o0O0O00(c26269OooOOoo.f89781OoooOoo.get(), (AbstractApplicationC26277OooOoOO) c26269OooOOoo.f89731OooO00o.f88129OooO00o);
                case 53:
                    C35240OooOoOO c35240OooOoOO3 = c26269OooOOoo.f89778OoooOOo.get();
                    C27213OooO00o c27213OooO00o6 = C27214OooO0O0.f95055OooO00o;
                    return (T) ((o0OOOOO0.OooOOO0) C21023OooO0Oo.OooO0O0(c35240OooOoOO3, "retrofit", o0OOOOO0.OooOOO0.class, "create(...)"));
                case 54:
                    C35240OooOoOO c35240OooOoOO4 = c26269OooOOoo.f89778OoooOOo.get();
                    C27213OooO00o c27213OooO00o7 = C27214OooO0O0.f95055OooO00o;
                    return (T) ((o0OOOOO0.OooO) C21023OooO0Oo.OooO0O0(c35240OooOoOO4, "retrofit", o0OOOOO0.OooO.class, "create(...)"));
                case 55:
                    C35240OooOoOO c35240OooOoOO5 = c26269OooOOoo.f89778OoooOOo.get();
                    C27213OooO00o c27213OooO00o8 = C27214OooO0O0.f95055OooO00o;
                    return (T) ((o0OOOOO0.OooOOO) C21023OooO0Oo.OooO0O0(c35240OooOoOO5, "retrofit", o0OOOOO0.OooOOO.class, "create(...)"));
                case 56:
                    return (T) new C27996OooO00o();
                case 57:
                    o0000o0O.OooOO0<AbstractC24338OooO0o0> oooOO02 = c26269OooOOoo.f89743OooOOO0.get();
                    o0O000o.OooO0O0 oooO0O04 = c26269OooOOoo.f89731OooO00o;
                    return (T) new C22913Oooo0OO(oooOO02, new C22912Oooo0O0((AbstractApplicationC26277OooOoOO) oooO0O04.f88129OooO00o), new BackupBaiduDatasource((AbstractApplicationC26277OooOoOO) oooO0O04.f88129OooO00o, c26269OooOOoo.f89787Oooooo.get(), c26269OooOOoo.f89789OoooooO.get()), new C22907OooOooO((AbstractApplicationC26277OooOoOO) oooO0O04.f88129OooO00o));
                case 58:
                    C35240OooOoOO c35240OooOoOO6 = c26269OooOOoo.f89788Oooooo0.get();
                    C27213OooO00o c27213OooO00o9 = C27214OooO0O0.f95055OooO00o;
                    return (T) ((o0OOOOOO.OooO00o) C21023OooO0Oo.OooO0O0(c35240OooOoOO6, "retrofit", o0OOOOOO.OooO00o.class, "create(...)"));
                case 59:
                    OkHttpClient okHttpClient2 = c26269OooOOoo.f89786OooooOo.get();
                    C27213OooO00o c27213OooO00o10 = C27214OooO0O0.f95055OooO00o;
                    kotlin.jvm.internal.OooOOO0.OooO0oO(okHttpClient2, "okHttpClient");
                    C35240OooOoOO.OooO0O0 oooO0O05 = new C35240OooOoOO.OooO0O0();
                    oooO0O05.f126593OooO0Oo.add(C35204OooO00o.OooO0OO());
                    oooO0O05.OooO00o("http://pan.baidu.com/");
                    oooO0O05.f126591OooO0O0 = okHttpClient2;
                    return (T) oooO0O05.OooO0O0();
                case 60:
                    o0000o0O.OooOO0<AbstractC24338OooO0o0> ds2 = c26269OooOOoo.f89743OooOOO0.get();
                    C27213OooO00o c27213OooO00o11 = C27214OooO0O0.f95055OooO00o;
                    kotlin.jvm.internal.OooOOO0.OooO0oO(ds2, "ds");
                    OkHttpClient.Builder builder2 = new OkHttpClient.Builder();
                    TimeUnit timeUnit2 = TimeUnit.SECONDS;
                    builder2.OooO00o(60L, timeUnit2);
                    builder2.OooO0o0(60L, timeUnit2);
                    builder2.OooO0OO(60L, timeUnit2);
                    builder2.f124206OooO0o = true;
                    builder2.OooO0O0(C27214OooO0O0.f95055OooO00o);
                    builder2.f124204OooO0OO.add(new C31197OooO00o());
                    return (T) new OkHttpClient(builder2);
                case 61:
                    C35240OooOoOO c35240OooOoOO7 = c26269OooOOoo.f89778OoooOOo.get();
                    C27213OooO00o c27213OooO00o12 = C27214OooO0O0.f95055OooO00o;
                    return (T) ((o0OOOOO0.OooO0OO) C21023OooO0Oo.OooO0O0(c35240OooOoOO7, "retrofit", o0OOOOO0.OooO0OO.class, "create(...)"));
                case 62:
                    return (T) new C26990OooO0o0(c26269OooOOoo.f89979o0OoOo0.get(), c26269OooOOoo.f89740OooOO0O.get(), c26269OooOOoo.f89993ooOO.get());
                case 63:
                    NoteDatabase database4 = c26269OooOOoo.f89744OooOOOO.get();
                    kotlin.jvm.internal.OooOOO0.OooO0oO(database4, "database");
                    T t5 = (T) database4.Oooo000();
                    C25898OooO0Oo.OooO0O0(t5);
                    return t5;
                case 64:
                    return (T) ((NoteMetaMapper) oOO00O0O.OooO00o.OooO0O0(NoteMetaMapper.class));
                case 65:
                    NoteDatabase database5 = c26269OooOOoo.f89744OooOOOO.get();
                    kotlin.jvm.internal.OooOOO0.OooO0oO(database5, "database");
                    T t6 = (T) database5.OooOooO();
                    C25898OooO0Oo.OooO0O0(t6);
                    return t6;
                case 66:
                    return (T) new C26415OooOo0O(c26269OooOOoo.f89963o00Ooo.get(), c26269OooOOoo.f89967o00o0O.get());
                case 67:
                    NoteDatabase database6 = c26269OooOOoo.f89744OooOOOO.get();
                    kotlin.jvm.internal.OooOOO0.OooO0oO(database6, "database");
                    T t7 = (T) database6.Oooo00o();
                    C25898OooO0Oo.OooO0O0(t7);
                    return t7;
                case 68:
                    return (T) ((NotePlaceholderMapper) oOO00O0O.OooO00o.OooO0O0(NotePlaceholderMapper.class));
                case 69:
                    return (T) new C30982OooO0Oo((AbstractApplicationC26277OooOoOO) c26269OooOOoo.f89731OooO00o.f88129OooO00o);
                case 70:
                    return (T) new C27387o0000o0(c26269OooOOoo.Oooo0o0(), c26269OooOOoo.f89895o00O0O.get(), c26269OooOOoo.f89968o00oO0O.get(), c26269OooOOoo.f89735OooO0o.get(), c26269OooOOoo.OooOoo0(), c26269OooOOoo.OooOoOO(), c26269OooOOoo.f89765Oooo00o.get(), c26269OooOOoo.OooOo(), c26269OooOOoo.OooOooO(), c26269OooOOoo.OooO(), c26269OooOOoo.f89753OooOo0o.get(), c26269OooOOoo.OooOOoo(), c26269OooOOoo.Oooo000(), c26269OooOOoo.Oooo00O(), c26269OooOOoo.f89774OoooO00.get(), c26269OooOOoo.OooOOO0(), c26269OooOOoo.f89982o0ooOO0.get(), c26269OooOOoo.Oooo0(), c26269OooOOoo.f89984o0ooOoO.get(), c26269OooOOoo.f89733OooO0OO.get(), c26269OooOOoo.Oooo0O0(), c26269OooOOoo.OooOo0O(), c26269OooOOoo.OooOOo0(), c26269OooOOoo.OooOO0o(), new C27799OooO0oO(c26269OooOOoo.f89991oo0o0Oo.get()), c26269OooOOoo.OooOOOO(), c26269OooOOoo.f89747OooOOo0.get(), (AbstractApplicationC26277OooOoOO) c26269OooOOoo.f89731OooO00o.f88129OooO00o);
                case 71:
                    return (T) new C26414OooOo0(c26269OooOOoo.f89969o00oO0o.get());
                case 72:
                    NoteDatabase database7 = c26269OooOOoo.f89744OooOOOO.get();
                    kotlin.jvm.internal.OooOOO0.OooO0oO(database7, "database");
                    T t8 = (T) database7.Oooo00O();
                    C25898OooO0Oo.OooO0O0(t8);
                    return t8;
                case 73:
                    return (T) new C27499o00Ooo0((AbstractApplicationC26277OooOoOO) c26269OooOOoo.f89731OooO00o.f88129OooO00o);
                case 74:
                    return (T) new o0OO0O0.Oooo000(new C26265OooOOOO(c26269OooOOoo.f89733OooO0OO.get()), c26269OooOOoo.f89983o0ooOOo.get(), (AbstractApplicationC26277OooOoOO) c26269OooOOoo.f89731OooO00o.f88129OooO00o);
                case 75:
                    return (T) ((AudioMapper) oOO00O0O.OooO00o.OooO0O0(AudioMapper.class));
                case 76:
                    return (T) new o00O(c26269OooOOoo.f89976o0OOO0o.get(), c26269OooOOoo.f89977o0Oo0oo.get(), c26269OooOOoo.f89975o0OO00O.get());
                case 77:
                    NoteDatabase database8 = c26269OooOOoo.f89744OooOOOO.get();
                    kotlin.jvm.internal.OooOOO0.OooO0oO(database8, "database");
                    T t9 = (T) database8.OooOoO();
                    C25898OooO0Oo.OooO0O0(t9);
                    return t9;
                case 78:
                    return (T) ((LabelMapper) oOO00O0O.OooO00o.OooO0O0(LabelMapper.class));
                case 79:
                    return (T) ((LabelRefMapper) oOO00O0O.OooO00o.OooO0O0(LabelRefMapper.class));
                case 80:
                    return (T) new C27788OooO0o(c26269OooOOoo.f89795o000000.get());
                case 81:
                    return (T) new o00OO0O(c26269OooOOoo.f89973o0O0O00.get(), c26269OooOOoo.f89843o000OOo.get());
                case 82:
                    NoteDatabase database9 = c26269OooOOoo.f89744OooOOOO.get();
                    kotlin.jvm.internal.OooOOO0.OooO0oO(database9, "database");
                    T t10 = (T) database9.OooOoOO();
                    C25898OooO0Oo.OooO0O0(t10);
                    return t10;
                case 83:
                    return (T) ((LatestOpenedNoteMapper) oOO00O0O.OooO00o.OooO0O0(LatestOpenedNoteMapper.class));
                case 84:
                    return (T) new OooO0O0();
                case 85:
                    return (T) new OooO0OO();
                case 86:
                    return (T) new o0OOo0o.o00000O(c26269OooOOoo.f89800o00000OO.get());
                case 87:
                    Object obj = c26269OooOOoo.f89731OooO00o.f88129OooO00o;
                    C27061OooO0oo c27061OooO0oo = new C27061OooO0oo();
                    C33784o00ooo.OooO00o(Boolean.FALSE);
                    return (T) new C27053OooO(c27061OooO0oo, new C27060OooO0oO((AbstractApplicationC26277OooOoOO) c26269OooOOoo.f89731OooO00o.f88129OooO00o));
                case 88:
                    C27052OooO0OO c27052OooO0OO = new C27052OooO0OO((AbstractApplicationC26277OooOoOO) c26269OooOOoo.f89731OooO00o.f88129OooO00o);
                    InterfaceC34937o00oOoOo dao = c26269OooOOoo.f89815o0000Ooo.get();
                    kotlin.jvm.internal.OooOOO0.OooO0oO(dao, "dao");
                    C25051OooO0OO c25051OooO0OO = new C25051OooO0OO();
                    c25051OooO0OO.f85053OooO00o = dao;
                    return (T) new C27051OooO0O0(c27052OooO0OO, c25051OooO0OO, c26269OooOOoo.f89803o00000oO.get());
                case 89:
                    NoteCacheDatabase database10 = c26269OooOOoo.f89802o00000o0.get();
                    kotlin.jvm.internal.OooOOO0.OooO0oO(database10, "database");
                    T t11 = (T) database10.OooOo0o();
                    C25898OooO0Oo.OooO0O0(t11);
                    return t11;
                case 90:
                    AbstractC24673OooOo0O.OooO00o OooO00o3 = C24668OooOOOo.OooO00o((AbstractApplicationC26277OooOoOO) c26269OooOOoo.f89731OooO00o.f88129OooO00o, "note-cache-db", NoteCacheDatabase.class);
                    OooO00o3.OooO00o(new AbstractC24732OooO00o[0]);
                    return (T) ((NoteCacheDatabase) OooO00o3.OooO0O0());
                case 91:
                    return (T) ((PdfTextCacheMapper) oOO00O0O.OooO00o.OooO0O0(PdfTextCacheMapper.class));
                case 92:
                    return (T) new C27597o00ooo00(c26269OooOOoo.Oooo0o0(), c26269OooOOoo.f89895o00O0O.get(), c26269OooOOoo.f89838o000OO.get(), c26269OooOOoo.f89817o0000o0O.get(), c26269OooOOoo.f89801o00000Oo.get());
                case 93:
                    return (T) new C27111OooOoo(new C27081OooOO0o(c26269OooOOoo.f89806o0000O00.get(), c26269OooOOoo.f89743OooOOO0.get(), (AbstractApplicationC26277OooOoOO) c26269OooOOoo.f89731OooO00o.f88129OooO00o), new C27082OooOOOo(c26269OooOOoo.o0000O0.get()), c26269OooOOoo.f89743OooOOO0.get(), c26269OooOOoo.f89807o0000O0O.get());
                case 94:
                    PlayFlavorDatabase database11 = c26269OooOOoo.f89793o0000.get();
                    kotlin.jvm.internal.OooOOO0.OooO0oO(database11, "database");
                    T t12 = (T) database11.OooOo0();
                    C25898OooO0Oo.OooO0O0(t12);
                    return t12;
                case 95:
                    AbstractApplicationC26277OooOoOO abstractApplicationC26277OooOoOO5 = (AbstractApplicationC26277OooOoOO) c26269OooOOoo.f89731OooO00o.f88129OooO00o;
                    C27265Oooooo0 c27265Oooooo0 = new C27265Oooooo0(1, 2);
                    C27264Oooooo c27264Oooooo = new C27264Oooooo(2, 3);
                    C27266OoooooO c27266OoooooO = new C27266OoooooO(3, 4);
                    AbstractC24673OooOo0O.OooO00o OooO00o4 = C24668OooOOOo.OooO00o(abstractApplicationC26277OooOoOO5, "play-flavor-db", PlayFlavorDatabase.class);
                    OooO00o4.OooO00o(c27265Oooooo0);
                    OooO00o4.OooO00o(c27264Oooooo);
                    OooO00o4.OooO00o(c27266OoooooO);
                    return (T) ((PlayFlavorDatabase) OooO00o4.OooO0O0());
                case 96:
                    C35240OooOoOO c35240OooOoOO8 = c26269OooOOoo.f89819o0000oO.get();
                    C27213OooO00o c27213OooO00o13 = C27214OooO0O0.f95055OooO00o;
                    return (T) ((NoteinFirebaseUserApiService) C21023OooO0Oo.OooO0O0(c35240OooOoOO8, "retrofit", NoteinFirebaseUserApiService.class, "create(...)"));
                case 97:
                    OkHttpClient okHttpClient3 = c26269OooOOoo.f89823o0000oo.get();
                    C27213OooO00o c27213OooO00o14 = C27214OooO0O0.f95055OooO00o;
                    kotlin.jvm.internal.OooOOO0.OooO0oO(okHttpClient3, "okHttpClient");
                    C35240OooOoOO.OooO0O0 oooO0O06 = new C35240OooOoOO.OooO0O0();
                    oOO00oOO.OooOO0O oooOO0O = new oOO00oOO.OooOO0O();
                    ArrayList arrayList2 = oooO0O06.f126593OooO0Oo;
                    arrayList2.add(oooOO0O);
                    arrayList2.add(C35204OooO00o.OooO0OO());
                    oooO0O06.OooO00o("https://notein-gl-server-73w2dfbxvq-uc.a.run.app/");
                    oooO0O06.f126591OooO0O0 = okHttpClient3;
                    return (T) oooO0O06.OooO0O0();
                case 98:
                    o0000o0O.OooOO0<AbstractC24338OooO0o0> ds3 = c26269OooOOoo.f89743OooOOO0.get();
                    AbstractApplicationC26277OooOoOO abstractApplicationC26277OooOoOO6 = (AbstractApplicationC26277OooOoOO) c26269OooOOoo.f89731OooO00o.f88129OooO00o;
                    C27213OooO00o c27213OooO00o15 = C27214OooO0O0.f95055OooO00o;
                    kotlin.jvm.internal.OooOOO0.OooO0oO(ds3, "ds");
                    OkHttpClient.Builder builder3 = new OkHttpClient.Builder();
                    builder3.OooO0O0(C27214OooO0O0.f95055OooO00o);
                    TimeUnit timeUnit3 = TimeUnit.SECONDS;
                    builder3.OooO00o(60L, timeUnit3);
                    builder3.OooO0o0(60L, timeUnit3);
                    builder3.OooO0OO(60L, timeUnit3);
                    C31197OooO00o c31197OooO00o = new C31197OooO00o();
                    ArrayList arrayList3 = builder3.f124204OooO0OO;
                    arrayList3.add(c31197OooO00o);
                    arrayList3.add(new C31150OooO00o(ds3, abstractApplicationC26277OooOoOO6));
                    arrayList3.add(new C31151OooO0O0(ds3, abstractApplicationC26277OooOoOO6));
                    return (T) new OkHttpClient(builder3);
                case 99:
                    return (T) ((NoteinFirebaseUserMapper) oOO00O0O.OooO00o.OooO0O0(NoteinFirebaseUserMapper.class));
                default:
                    throw new AssertionError(i);
            }
        }

        /* JADX WARN: Type inference failed for: r0v266, types: [T, java.lang.Object, o0OOO0O.OooO0o0] */
        /* JADX WARN: Type inference failed for: r5v32, types: [T, o0oo00oO.OooO0OO] */
        public final T OooO0O0() {
            C26269OooOOoo c26269OooOOoo = this.f89995OooO00o;
            int i = this.f89996OooO0O0;
            switch (i) {
                case 100:
                    c26269OooOOoo.getClass();
                    return (T) new C22949Oooo0oO(new GoogleBillingDataSource(c26269OooOOoo.f89809o0000OO0.get(), c26269OooOOoo.f89808o0000OO.get(), (AbstractApplicationC26277OooOoOO) c26269OooOOoo.f89731OooO00o.f88129OooO00o, c26269OooOOoo.f89810o0000OOO.get()), new com.orion.notein.data.repo.transactions.o0Oo0oo(c26269OooOOoo.f89811o0000OOo.get()), new com.orion.notein.data.repo.transactions.o00Ooo(c26269OooOOoo.f89813o0000Oo0.get(), c26269OooOOoo.f89812o0000Oo.get()), c26269OooOOoo.f89814o0000OoO.get(), c26269OooOOoo.o0000o0.get());
                case 101:
                    C35240OooOoOO c35240OooOoOO = c26269OooOOoo.f89805o0000O.get();
                    C27213OooO00o c27213OooO00o = C27214OooO0O0.f95055OooO00o;
                    return (T) ((InterfaceC27155OooO00o) C21023OooO0Oo.OooO0O0(c35240OooOoOO, "retrofit", InterfaceC27155OooO00o.class, "create(...)"));
                case 102:
                    OkHttpClient okHttpClient = c26269OooOOoo.f89823o0000oo.get();
                    C27213OooO00o c27213OooO00o2 = C27214OooO0O0.f95055OooO00o;
                    kotlin.jvm.internal.OooOOO0.OooO0oO(okHttpClient, "okHttpClient");
                    C35240OooOoOO.OooO0O0 oooO0O0 = new C35240OooOoOO.OooO0O0();
                    oOO00oOO.OooOO0O oooOO0O = new oOO00oOO.OooOO0O();
                    ArrayList arrayList = oooO0O0.f126593OooO0Oo;
                    arrayList.add(oooOO0O);
                    arrayList.add(C35204OooO00o.OooO0OO());
                    oooO0O0.OooO00o("https://service-img-73w2dfbxvq-as.a.run.app/");
                    oooO0O0.f126591OooO0O0 = okHttpClient;
                    return (T) oooO0O0.OooO0O0();
                case 103:
                    PlayFlavorDatabase database = c26269OooOOoo.f89793o0000.get();
                    kotlin.jvm.internal.OooOOO0.OooO0oO(database, "database");
                    T t = (T) database.OooOo();
                    C25898OooO0Oo.OooO0O0(t);
                    return t;
                case 104:
                    AbstractApplicationC26277OooOoOO abstractApplicationC26277OooOoOO = (AbstractApplicationC26277OooOoOO) c26269OooOOoo.f89731OooO00o.f88129OooO00o;
                    return (T) C24336OooO0Oo.OooO00o(new C24306OooO0O0(new C27219OooO0oO()), com.facebook.soloader.OooOo.OooO0oO(C24323OooO.OooO00o(abstractApplicationC26277OooOoOO, "notein-billing-sp")), new C25708OooOoOO(abstractApplicationC26277OooOoOO, 1));
                case 105:
                    C35240OooOoOO c35240OooOoOO2 = c26269OooOOoo.f89819o0000oO.get();
                    C27213OooO00o c27213OooO00o3 = C27214OooO0O0.f95055OooO00o;
                    return (T) ((o0OOOOOo.OooO0O0) C21023OooO0Oo.OooO0O0(c35240OooOoOO2, "retrofit", o0OOOOOo.OooO0O0.class, "create(...)"));
                case 106:
                    PlayFlavorDatabase database2 = c26269OooOOoo.f89793o0000.get();
                    kotlin.jvm.internal.OooOOO0.OooO0oO(database2, "database");
                    T t2 = (T) database2.OooOo0o();
                    C25898OooO0Oo.OooO0O0(t2);
                    return t2;
                case 107:
                    PlayFlavorDatabase database3 = c26269OooOOoo.f89793o0000.get();
                    kotlin.jvm.internal.OooOOO0.OooO0oO(database3, "database");
                    T t3 = (T) database3.OooOo0O();
                    C25898OooO0Oo.OooO0O0(t3);
                    return t3;
                case 108:
                    return (T) ((NoteinGooglePurchaseMapper) oOO00O0O.OooO00o.OooO0O0(NoteinGooglePurchaseMapper.class));
                case 109:
                    return (T) ((NoteinGoogleOfferMapper) oOO00O0O.OooO00o.OooO0O0(NoteinGoogleOfferMapper.class));
                case 110:
                    OkHttpClient okhttpClient = c26269OooOOoo.f89816o0000o.get();
                    kotlin.jvm.internal.OooOOO0.OooO0oO(okhttpClient, "okhttpClient");
                    C26945OooO00o c26945OooO00o = new C26945OooO00o();
                    C33900OooO0o0.OooO00o();
                    C34467OooOo0.OooO00o(new C24690Oooo0o0(1));
                    return (T) new C26951OooO0oO(c26945OooO00o, new C26947OooO0OO((AbstractApplicationC26277OooOoOO) c26269OooOOoo.f89731OooO00o.f88129OooO00o), new C26948OooO0Oo(c26269OooOOoo.f89820o0000oO0.get()), c26269OooOOoo.f89821o0000oOO.get());
                case 111:
                    C27213OooO00o c27213OooO00o4 = C27214OooO0O0.f95055OooO00o;
                    OkHttpClient.Builder builder = new OkHttpClient.Builder();
                    builder.OooO0O0(C27214OooO0O0.f95055OooO00o);
                    builder.f124204OooO0OO.add(new C31197OooO00o());
                    return (T) new OkHttpClient(builder);
                case 112:
                    NoteCacheDatabase database4 = c26269OooOOoo.f89802o00000o0.get();
                    kotlin.jvm.internal.OooOOO0.OooO0oO(database4, "database");
                    T t4 = (T) database4.OooOo0();
                    C25898OooO0Oo.OooO0O0(t4);
                    return t4;
                case 113:
                    return (T) ((HandWritingTextCacheMapper) oOO00O0O.OooO00o.OooO0O0(HandWritingTextCacheMapper.class));
                case 114:
                    return (T) new o0OOO0OO.OooO0OO(new o0OOO0OO.OooO00o(c26269OooOOoo.f89824o0000oo0.get()), c26269OooOOoo.f89825o0000ooO.get());
                case 115:
                    NoteCacheDatabase database5 = c26269OooOOoo.f89802o00000o0.get();
                    kotlin.jvm.internal.OooOOO0.OooO0oO(database5, "database");
                    T t5 = (T) database5.OooOo0O();
                    C25898OooO0Oo.OooO0O0(t5);
                    return t5;
                case 116:
                    return (T) ((PageGridModificationRecordMapper) oOO00O0O.OooO00o.OooO0O0(PageGridModificationRecordMapper.class));
                case 117:
                    return (T) new C27618OooO0oO((AbstractApplicationC26277OooOoOO) c26269OooOOoo.f89731OooO00o.f88129OooO00o, c26269OooOOoo.f89855o000Ooo0.get(), c26269OooOOoo.f89867o000o0o0.get(), c26269OooOOoo.OooO0o(), c26269OooOOoo.f89861o000o00o.get(), c26269OooOOoo.f89873o000oo0.get(), c26269OooOOoo.f89874o000oo00.get(), c26269OooOOoo.f89862o000o0O.get(), c26269OooOOoo.f89857o000Oooo.get());
                case 118:
                    return (T) new C26740Oooo0oo(ImmutableSet.m75157of((C26732Oooo) c26269OooOOoo.f89826o000O.get(), (C26732Oooo) c26269OooOOoo.f89848o000Oo00.get(), (C26732Oooo) c26269OooOOoo.f89852o000OoOO.get(), c26269OooOOoo.f89853o000OoOo.get()), c26269OooOOoo.f89743OooOOO0.get(), c26269OooOOoo.f89835o000O0o0.get());
                case 119:
                    AbstractApplicationC26277OooOoOO abstractApplicationC26277OooOoOO2 = (AbstractApplicationC26277OooOoOO) c26269OooOOoo.f89731OooO00o.f88129OooO00o;
                    InterfaceC35006OooO00o cloudMetaLocalDao = c26269OooOOoo.f89834o000O0o.get();
                    InterfaceC35015OooOO0O cloudMetaRemoteDao = c26269OooOOoo.f89854o000Ooo.get();
                    InterfaceC35021OooOOo driveSnapshotCacheDao = c26269OooOOoo.f89831o000O0O.get();
                    C26913Oooooo backend = c26269OooOOoo.f89827o000O0.get();
                    InterfaceC26441OooO0oo cloudMetaService = c26269OooOOoo.f89832o000O0O0.get();
                    CloudMetaMapper cloudMetaMapper = c26269OooOOoo.f89835o000O0o0.get();
                    C27956o00000oo syncCursorManager = c26269OooOOoo.f89836o000O0oO.get();
                    o0000o0O.OooOO0<AbstractC24338OooO0o0> preferences = c26269OooOOoo.f89837o000O0oo.get();
                    kotlin.jvm.internal.OooOOO0.OooO0oO(cloudMetaLocalDao, "cloudMetaLocalDao");
                    kotlin.jvm.internal.OooOOO0.OooO0oO(cloudMetaRemoteDao, "cloudMetaRemoteDao");
                    kotlin.jvm.internal.OooOOO0.OooO0oO(driveSnapshotCacheDao, "driveSnapshotCacheDao");
                    kotlin.jvm.internal.OooOOO0.OooO0oO(backend, "backend");
                    kotlin.jvm.internal.OooOOO0.OooO0oO(cloudMetaService, "cloudMetaService");
                    kotlin.jvm.internal.OooOOO0.OooO0oO(cloudMetaMapper, "cloudMetaMapper");
                    kotlin.jvm.internal.OooOOO0.OooO0oO(syncCursorManager, "syncCursorManager");
                    kotlin.jvm.internal.OooOOO0.OooO0oO(preferences, "preferences");
                    return (T) new C26884OooOoOO(backend, abstractApplicationC26277OooOoOO2, cloudMetaLocalDao, cloudMetaRemoteDao, driveSnapshotCacheDao, cloudMetaService, cloudMetaMapper, syncCursorManager, preferences);
                case 120:
                    CloudSyncDatabase db = c26269OooOOoo.f89851o000OoO.get();
                    kotlin.jvm.internal.OooOOO0.OooO0oO(db, "db");
                    T t6 = (T) db.OooOo0();
                    C25898OooO0Oo.OooO0O0(t6);
                    return t6;
                case 121:
                    AbstractC24673OooOo0O.OooO00o OooO00o2 = C24668OooOOOo.OooO00o((AbstractApplicationC26277OooOoOO) c26269OooOOoo.f89731OooO00o.f88129OooO00o, "cloud_sync.db", CloudSyncDatabase.class);
                    OooO00o2.OooO00o(new AbstractC24732OooO00o[0]);
                    return (T) ((CloudSyncDatabase) OooO00o2.OooO0O0());
                case 122:
                    CloudSyncDatabase db2 = c26269OooOOoo.f89851o000OoO.get();
                    kotlin.jvm.internal.OooOOO0.OooO0oO(db2, "db");
                    T t7 = (T) db2.OooOo0O();
                    C25898OooO0Oo.OooO0O0(t7);
                    return t7;
                case 123:
                    CloudSyncDatabase db3 = c26269OooOOoo.f89851o000OoO.get();
                    kotlin.jvm.internal.OooOOO0.OooO0oO(db3, "db");
                    T t8 = (T) db3.OooOo0o();
                    C25898OooO0Oo.OooO0O0(t8);
                    return t8;
                case 124:
                    return (T) new C26913Oooooo((AbstractApplicationC26277OooOoOO) c26269OooOOoo.f89731OooO00o.f88129OooO00o, c26269OooOOoo.f89828o000O00.get(), c26269OooOOoo.f89847o000Oo0.get(), c26269OooOOoo.f89830o000O00O.get());
                case 125:
                    return (T) new C26889Oooo((AbstractApplicationC26277OooOoOO) c26269OooOOoo.f89731OooO00o.f88129OooO00o, c26269OooOOoo.f89743OooOOO0.get(), c26269OooOOoo.f89847o000Oo0.get());
                case 126:
                    return (T) new o0OO0o00.OooO00o((AbstractApplicationC26277OooOoOO) c26269OooOOoo.f89731OooO00o.f88129OooO00o);
                case 127:
                    return (T) ((NoteHistoryVersionMapper) oOO00O0O.OooO00o.OooO0O0(NoteHistoryVersionMapper.class));
                case 128:
                    return (T) ((InterfaceC26441OooO0oo) C21023OooO0Oo.OooO0O0(c26269OooOOoo.f89840o000OO0O.get(), "retrofit", InterfaceC26441OooO0oo.class, "create(...)"));
                case 129:
                    OkHttpClient okHttpClient2 = c26269OooOOoo.f89833o000O0Oo.get();
                    kotlin.jvm.internal.OooOOO0.OooO0oO(okHttpClient2, "okHttpClient");
                    C35240OooOoOO.OooO0O0 oooO0O02 = new C35240OooOoOO.OooO0O0();
                    oooO0O02.f126593OooO0Oo.add(C35204OooO00o.OooO0OO());
                    oooO0O02.OooO00o("https://notein-cloudsync-server-657552601164.us-central1.run.app");
                    oooO0O02.f126591OooO0O0 = okHttpClient2;
                    return (T) oooO0O02.OooO0O0();
                case 130:
                    o0000o0O.OooOO0<AbstractC24338OooO0o0> dataStore = c26269OooOOoo.f89743OooOOO0.get();
                    AbstractApplicationC26277OooOoOO abstractApplicationC26277OooOoOO3 = (AbstractApplicationC26277OooOoOO) c26269OooOOoo.f89731OooO00o.f88129OooO00o;
                    kotlin.jvm.internal.OooOOO0.OooO0oO(dataStore, "dataStore");
                    OkHttpClient.Builder builder2 = new OkHttpClient.Builder();
                    TimeUnit timeUnit = TimeUnit.SECONDS;
                    builder2.OooO00o(30L, timeUnit);
                    builder2.OooO0o0(30L, timeUnit);
                    builder2.OooO0OO(30L, timeUnit);
                    builder2.OooO0O0(C27218OooO0o0.f95059OooO00o);
                    C31150OooO00o c31150OooO00o = new C31150OooO00o(dataStore, abstractApplicationC26277OooOoOO3);
                    ArrayList arrayList2 = builder2.f124204OooO0OO;
                    arrayList2.add(c31150OooO00o);
                    arrayList2.add(new C31151OooO0O0(dataStore, abstractApplicationC26277OooOoOO3));
                    arrayList2.add(new C31197OooO00o());
                    return (T) new OkHttpClient(builder2);
                case 131:
                    return (T) ((CloudMetaMapper) oOO00O0O.OooO00o.OooO0O0(CloudMetaMapper.class));
                case 132:
                    return (T) new C27956o00000oo(c26269OooOOoo.f89743OooOOO0.get());
                case 133:
                    AbstractApplicationC26277OooOoOO abstractApplicationC26277OooOoOO4 = (AbstractApplicationC26277OooOoOO) c26269OooOOoo.f89731OooO00o.f88129OooO00o;
                    return (T) C24336OooO0Oo.OooO00o(new C24306OooO0O0(new o0O0oOoo.OooOOO()), com.facebook.soloader.OooOo.OooO0oO(C24323OooO.OooO00o(abstractApplicationC26277OooOoOO4, "notein-cloudsync-sp")), new C27216OooO0Oo(abstractApplicationC26277OooOoOO4, 0));
                case 134:
                    AbstractApplicationC26277OooOoOO abstractApplicationC26277OooOoOO5 = (AbstractApplicationC26277OooOoOO) c26269OooOOoo.f89731OooO00o.f88129OooO00o;
                    InterfaceC35006OooO00o cloudMetaLocalDao2 = c26269OooOOoo.f89834o000O0o.get();
                    InterfaceC35015OooOO0O cloudMetaRemoteDao2 = c26269OooOOoo.f89854o000Ooo.get();
                    InterfaceC35021OooOOo driveSnapshotCacheDao2 = c26269OooOOoo.f89831o000O0O.get();
                    o0OO0o0.o00oO0O backend2 = c26269OooOOoo.f89845o000OOoO.get();
                    InterfaceC26441OooO0oo cloudMetaService2 = c26269OooOOoo.f89832o000O0O0.get();
                    CloudMetaMapper cloudMetaMapper2 = c26269OooOOoo.f89835o000O0o0.get();
                    C27956o00000oo syncCursorManager2 = c26269OooOOoo.f89836o000O0oO.get();
                    o0000o0O.OooOO0<AbstractC24338OooO0o0> preferences2 = c26269OooOOoo.f89837o000O0oo.get();
                    kotlin.jvm.internal.OooOOO0.OooO0oO(cloudMetaLocalDao2, "cloudMetaLocalDao");
                    kotlin.jvm.internal.OooOOO0.OooO0oO(cloudMetaRemoteDao2, "cloudMetaRemoteDao");
                    kotlin.jvm.internal.OooOOO0.OooO0oO(driveSnapshotCacheDao2, "driveSnapshotCacheDao");
                    kotlin.jvm.internal.OooOOO0.OooO0oO(backend2, "backend");
                    kotlin.jvm.internal.OooOOO0.OooO0oO(cloudMetaService2, "cloudMetaService");
                    kotlin.jvm.internal.OooOOO0.OooO0oO(cloudMetaMapper2, "cloudMetaMapper");
                    kotlin.jvm.internal.OooOOO0.OooO0oO(syncCursorManager2, "syncCursorManager");
                    kotlin.jvm.internal.OooOOO0.OooO0oO(preferences2, "preferences");
                    return (T) new C26836Oooo0O0(backend2, abstractApplicationC26277OooOoOO5, cloudMetaLocalDao2, cloudMetaRemoteDao2, driveSnapshotCacheDao2, cloudMetaService2, cloudMetaMapper2, syncCursorManager2, preferences2);
                case 135:
                    return (T) new o0OO0o0.o00oO0O((AbstractApplicationC26277OooOoOO) c26269OooOOoo.f89731OooO00o.f88129OooO00o, c26269OooOOoo.f89844o000OOo0.get(), c26269OooOOoo.f89842o000OOO.get());
                case 136:
                    return (T) new C26837Oooo0OO((AbstractApplicationC26277OooOoOO) c26269OooOOoo.f89731OooO00o.f88129OooO00o, c26269OooOOoo.f89743OooOOO0.get(), c26269OooOOoo.f89842o000OOO.get());
                case 137:
                    return (T) new C26800OooO(c26269OooOOoo.f89841o000OO0o.get());
                case 138:
                    C35240OooOoOO c35240OooOoOO3 = c26269OooOOoo.f89978o0OoO0o.get();
                    C27213OooO00o c27213OooO00o5 = C27214OooO0O0.f95055OooO00o;
                    return (T) ((OneDriveApiService) C21023OooO0Oo.OooO0O0(c35240OooOoOO3, "retrofit", OneDriveApiService.class, "create(...)"));
                case 139:
                    OkHttpClient okHttpClient3 = c26269OooOOoo.f89839o000OO00.get();
                    C27213OooO00o c27213OooO00o6 = C27214OooO0O0.f95055OooO00o;
                    kotlin.jvm.internal.OooOOO0.OooO0oO(okHttpClient3, "okHttpClient");
                    C35240OooOoOO.OooO0O0 oooO0O03 = new C35240OooOoOO.OooO0O0();
                    Gson gson = C27214OooO0O0.f95056OooO0O0;
                    if (gson == null) {
                        throw new NullPointerException("gson == null");
                    }
                    oooO0O03.f126593OooO0Oo.add(new C35204OooO00o(gson));
                    oooO0O03.OooO00o("https://graph.microsoft.com/v1.0/");
                    oooO0O03.f126591OooO0O0 = okHttpClient3;
                    return (T) oooO0O03.OooO0O0();
                case 140:
                    C27213OooO00o c27213OooO00o7 = C27214OooO0O0.f95055OooO00o;
                    OkHttpClient.Builder builder3 = new OkHttpClient.Builder();
                    TimeUnit timeUnit2 = TimeUnit.SECONDS;
                    builder3.OooO00o(30L, timeUnit2);
                    builder3.OooO0o0(120L, timeUnit2);
                    builder3.OooO0OO(30L, timeUnit2);
                    builder3.f124204OooO0OO.add(new C31197OooO00o());
                    return (T) new OkHttpClient(builder3);
                case 141:
                    AbstractApplicationC26277OooOoOO abstractApplicationC26277OooOoOO6 = (AbstractApplicationC26277OooOoOO) c26269OooOOoo.f89731OooO00o.f88129OooO00o;
                    InterfaceC35006OooO00o cloudMetaLocalDao3 = c26269OooOOoo.f89834o000O0o.get();
                    InterfaceC35015OooOO0O cloudMetaRemoteDao3 = c26269OooOOoo.f89854o000Ooo.get();
                    InterfaceC35021OooOOo driveSnapshotCacheDao3 = c26269OooOOoo.f89831o000O0O.get();
                    C26791OoooOoO backend3 = c26269OooOOoo.f89846o000Oo.get();
                    InterfaceC26441OooO0oo cloudMetaService3 = c26269OooOOoo.f89832o000O0O0.get();
                    CloudMetaMapper cloudMetaMapper3 = c26269OooOOoo.f89835o000O0o0.get();
                    C27956o00000oo syncCursorManager3 = c26269OooOOoo.f89836o000O0oO.get();
                    o0000o0O.OooOO0<AbstractC24338OooO0o0> preferences3 = c26269OooOOoo.f89837o000O0oo.get();
                    kotlin.jvm.internal.OooOOO0.OooO0oO(cloudMetaLocalDao3, "cloudMetaLocalDao");
                    kotlin.jvm.internal.OooOOO0.OooO0oO(cloudMetaRemoteDao3, "cloudMetaRemoteDao");
                    kotlin.jvm.internal.OooOOO0.OooO0oO(driveSnapshotCacheDao3, "driveSnapshotCacheDao");
                    kotlin.jvm.internal.OooOOO0.OooO0oO(backend3, "backend");
                    kotlin.jvm.internal.OooOOO0.OooO0oO(cloudMetaService3, "cloudMetaService");
                    kotlin.jvm.internal.OooOOO0.OooO0oO(cloudMetaMapper3, "cloudMetaMapper");
                    kotlin.jvm.internal.OooOOO0.OooO0oO(syncCursorManager3, "syncCursorManager");
                    kotlin.jvm.internal.OooOOO0.OooO0oO(preferences3, "preferences");
                    return (T) new C26762OooOo00(backend3, abstractApplicationC26277OooOoOO6, cloudMetaLocalDao3, cloudMetaRemoteDao3, driveSnapshotCacheDao3, cloudMetaService3, cloudMetaMapper3, syncCursorManager3, preferences3);
                case 142:
                    return (T) new C26791OoooOoO((AbstractApplicationC26277OooOoOO) c26269OooOOoo.f89731OooO00o.f88129OooO00o, c26269OooOOoo.f89850o000Oo0o.get(), c26269OooOOoo.f89849o000Oo0O.get());
                case 143:
                    return (T) new C26773Oooo0((AbstractApplicationC26277OooOoOO) c26269OooOOoo.f89731OooO00o.f88129OooO00o, c26269OooOOoo.f89837o000O0oo.get(), c26269OooOOoo.f89743OooOOO0.get(), c26269OooOOoo.f89849o000Oo0O.get());
                case 144:
                    return (T) new C26759OooOOoo();
                case 145:
                    AbstractApplicationC26277OooOoOO abstractApplicationC26277OooOoOO7 = (AbstractApplicationC26277OooOoOO) c26269OooOOoo.f89731OooO00o.f88129OooO00o;
                    InterfaceC35015OooOO0O cloudMetaRemoteDao4 = c26269OooOOoo.f89854o000Ooo.get();
                    InterfaceC35006OooO00o cloudMetaLocalDao4 = c26269OooOOoo.f89834o000O0o.get();
                    InterfaceC35021OooOOo driveSnapshotCacheDao4 = c26269OooOOoo.f89831o000O0O.get();
                    C26913Oooooo backend4 = c26269OooOOoo.f89827o000O0.get();
                    InterfaceC26441OooO0oo cloudMetaService4 = c26269OooOOoo.f89832o000O0O0.get();
                    CloudMetaMapper cloudMetaMapper4 = c26269OooOOoo.f89835o000O0o0.get();
                    C27956o00000oo syncCursorManager4 = c26269OooOOoo.f89836o000O0oO.get();
                    o0000o0O.OooOO0<AbstractC24338OooO0o0> preferences4 = c26269OooOOoo.f89837o000O0oo.get();
                    kotlin.jvm.internal.OooOOO0.OooO0oO(cloudMetaRemoteDao4, "cloudMetaRemoteDao");
                    kotlin.jvm.internal.OooOOO0.OooO0oO(cloudMetaLocalDao4, "cloudMetaLocalDao");
                    kotlin.jvm.internal.OooOOO0.OooO0oO(driveSnapshotCacheDao4, "driveSnapshotCacheDao");
                    kotlin.jvm.internal.OooOOO0.OooO0oO(backend4, "backend");
                    kotlin.jvm.internal.OooOOO0.OooO0oO(cloudMetaService4, "cloudMetaService");
                    kotlin.jvm.internal.OooOOO0.OooO0oO(cloudMetaMapper4, "cloudMetaMapper");
                    kotlin.jvm.internal.OooOOO0.OooO0oO(syncCursorManager4, "syncCursorManager");
                    kotlin.jvm.internal.OooOOO0.OooO0oO(preferences4, "preferences");
                    return (T) new C26732Oooo(backend4, abstractApplicationC26277OooOoOO7, cloudMetaLocalDao4, cloudMetaRemoteDao4, driveSnapshotCacheDao4, cloudMetaService4, cloudMetaMapper4, syncCursorManager4, preferences4);
                case 146:
                    return (T) new C27723OooO0O0(c26269OooOOoo.f89859o000o000.get(), c26269OooOOoo.f89864o000o0OO.get(), c26269OooOOoo.f89865o000o0Oo.get());
                case 147:
                    return (T) new C27755OooO0Oo(c26269OooOOoo.f89856o000OooO.get(), c26269OooOOoo.f89857o000Oooo.get());
                case 148:
                    return (T) new o0OOo0oo.o000OOo(c26269OooOOoo.f89855o000Ooo0.get(), c26269OooOOoo.OooOo0());
                case 149:
                    return (T) new C27639OooOoo0(c26269OooOOoo.f89800o00000OO.get());
                case 150:
                    C27641OooOooo c27641OooOooo = new C27641OooOooo(c26269OooOOoo.f89855o000Ooo0.get(), c26269OooOOoo.f89895o00O0O.get(), c26269OooOOoo.OooOOOO(), c26269OooOOoo.Oooo0(), c26269OooOOoo.Oooo0o0());
                    o0OOo0oo.o0OOO0o o0ooo0o2 = new o0OOo0oo.o0OOO0o(c26269OooOOoo.f89855o000Ooo0.get(), c26269OooOOoo.OooOo00());
                    C27696o000Ooo c27696o000Ooo = new C27696o000Ooo(c26269OooOOoo.f89855o000Ooo0.get());
                    o0O000o.OooO0O0 oooO0O04 = c26269OooOOoo.f89731OooO00o;
                    return (T) new C27750OooOoO0(c27641OooOooo, o0ooo0o2, c27696o000Ooo, new o0OOo0oo.o000OO((AbstractApplicationC26277OooOoOO) oooO0O04.f88129OooO00o, c26269OooOOoo.OooOo00()), c26269OooOOoo.f89860o000o00O.get(), new C27643Oooo0((AbstractApplicationC26277OooOoOO) oooO0O04.f88129OooO00o, c26269OooOOoo.f89855o000Ooo0.get(), c26269OooOOoo.OooOo00()), c26269OooOOoo.f89858o000o00.get(), new o0OOo0oo.o00000O(c26269OooOOoo.f89743OooOOO0.get()), c26269OooOOoo.f89855o000Ooo0.get(), c26269OooOOoo.f89861o000o00o.get(), c26269OooOOoo.OooO0oO(), c26269OooOOoo.f89862o000o0O.get());
                case 151:
                    C26740Oooo0oo c26740Oooo0oo = c26269OooOOoo.f89855o000Ooo0.get();
                    o0O000o.OooO0O0 oooO0O05 = c26269OooOOoo.f89731OooO00o;
                    return (T) new C27677o00000oo(c26740Oooo0oo, new C27643Oooo0((AbstractApplicationC26277OooOoOO) oooO0O05.f88129OooO00o, c26269OooOOoo.f89855o000Ooo0.get(), c26269OooOOoo.OooOo00()), new o0OOo0oo.o000OO((AbstractApplicationC26277OooOoOO) oooO0O05.f88129OooO00o, c26269OooOOoo.OooOo00()), new o0OOo0oo.o0OOO0o(c26269OooOOoo.f89855o000Ooo0.get(), c26269OooOOoo.OooOo00()), c26269OooOOoo.f89858o000o00.get(), c26269OooOOoo.OooOo00());
                case 152:
                    return (T) new o0OOo0oo.o0000(c26269OooOOoo.f89855o000Ooo0.get(), c26269OooOOoo.OooOo0());
                case 153:
                    return (T) new C27684o0000o0();
                case 154:
                    return (T) new C27715OooO0o(c26269OooOOoo.f89863o000o0O0.get(), c26269OooOOoo.f89855o000Ooo0.get());
                case 155:
                    T impl = (T) ((C27721OooOOo0) c26269OooOOoo.f89994oooo00o.get());
                    kotlin.jvm.internal.OooOOO0.OooO0oO(impl, "impl");
                    return impl;
                case 156:
                    return (T) new C27721OooOOo0(c26269OooOOoo.f89837o000O0oo.get());
                case 157:
                    return (T) new o0OOo0oo.o0O0O00(c26269OooOOoo.f89855o000Ooo0.get(), new o0OOo0oo.o00000O(c26269OooOOoo.f89743OooOOO0.get()), c26269OooOOoo.f89861o000o00o.get());
                case 158:
                    return (T) new o0OOo0oo.o0000OOO(c26269OooOOoo.f89867o000o0o0.get(), c26269OooOOoo.f89855o000Ooo0.get(), c26269OooOOoo.f89895o00O0O.get(), c26269OooOOoo.OooOOOO(), c26269OooOOoo.Oooo0(), c26269OooOOoo.Oooo0o0(), c26269OooOOoo.OooOo0(), c26269OooOOoo.f89862o000o0O.get(), c26269OooOOoo.f89874o000oo00.get(), c26269OooOOoo.f89857o000Oooo.get(), c26269OooOOoo.OooO0oO(), c26269OooOOoo.f89861o000o00o.get());
                case 159:
                    return (T) new C27665OooooO0(new C20813OooO0o0(c26269OooOOoo.f89855o000Ooo0.get()), c26269OooOOoo.f89865o000o0Oo.get(), c26269OooOOoo.f89866o000o0o.get(), c26269OooOOoo.f89863o000o0O0.get(), c26269OooOOoo.f89871o000oOoo.get(), c26269OooOOoo.f89895o00O0O.get(), c26269OooOOoo.Oooo0o0(), new C27718OooO0oo(c26269OooOOoo.OooOo00()), c26269OooOOoo.f89862o000o0O.get(), c26269OooOOoo.f89972o00ooo.get());
                case 160:
                    return (T) new C27616OooO0o(c26269OooOOoo.f89855o000Ooo0.get(), (AbstractApplicationC26277OooOoOO) c26269OooOOoo.f89731OooO00o.f88129OooO00o);
                case 161:
                    return (T) new o0OO.OooOo00(c26269OooOOoo.f89868o000o0oO.get(), c26269OooOOoo.f89869o000o0oo.get());
                case 162:
                    NoteDatabase database6 = c26269OooOOoo.f89744OooOOOO.get();
                    kotlin.jvm.internal.OooOOO0.OooO0oO(database6, "database");
                    T t9 = (T) database6.OooOooo();
                    C25898OooO0Oo.OooO0O0(t9);
                    return t9;
                case 163:
                    return (T) ((NoteFileMapper) oOO00O0O.OooO00o.OooO0O0(NoteFileMapper.class));
                case 164:
                    return (T) new C27428o000oOoO((AbstractApplicationC26277OooOoOO) c26269OooOOoo.f89731OooO00o.f88129OooO00o, c26269OooOOoo.f89801o00000Oo.get());
                case 165:
                    o000000O provider = c26269OooOOoo.f89872o000oo.get();
                    kotlin.jvm.internal.OooOOO0.OooO0oO(provider, "provider");
                    return (T) new C25903OooO00o(provider);
                case 166:
                    return (T) new o000000O(c26269OooOOoo.f89801o00000Oo.get());
                case 167:
                    return (T) new oo00oO(c26269OooOOoo.f89895o00O0O.get(), c26269OooOOoo.OooOOOo(), c26269OooOOoo.Oooo0o0());
                case 168:
                    AbstractApplicationC26277OooOoOO abstractApplicationC26277OooOoOO8 = (AbstractApplicationC26277OooOoOO) c26269OooOOoo.f89731OooO00o.f88129OooO00o;
                    InterfaceC31213OooO0oO configProvider = c26269OooOOoo.f89879o000ooOO.get();
                    kotlin.jvm.internal.OooOOO0.OooO0oO(configProvider, "configProvider");
                    ?? r5 = (T) new C31210OooO0OO();
                    boolean zOooO0OO = o0O0o000.OooO00o.OooO0OO();
                    LinkedHashMap linkedHashMap = r5.f111299OooO0OO;
                    if (zOooO0OO) {
                        try {
                            C31207OooO00o c31207OooO00o = new C31207OooO00o(abstractApplicationC26277OooOoOO8, configProvider);
                            linkedHashMap.put("xiaomi", c31207OooO00o);
                            if (!c31207OooO00o.initialize()) {
                                C34406OooO00o.C20358OooO00o c20358OooO00o = C34406OooO00o.f123390OooO00o;
                                c20358OooO00o.OooOOO0("PenCapabilityModule");
                                c20358OooO00o.OooOO0O("Xiaomi provider initialization failed", new Object[0]);
                                return r5;
                            }
                            r5.OooO0O0("xiaomi");
                            C34406OooO00o.C20358OooO00o c20358OooO00o2 = C34406OooO00o.f123390OooO00o;
                            c20358OooO00o2.OooOOO0("PenCapabilityModule");
                            c20358OooO00o2.OooO0o0("Xiaomi pen capability provider activated", new Object[0]);
                            return r5;
                        } catch (Exception e) {
                            C34406OooO00o.C20358OooO00o c20358OooO00o3 = C34406OooO00o.f123390OooO00o;
                            c20358OooO00o3.OooOOO0("PenCapabilityModule");
                            c20358OooO00o3.OooO0Oo(e, "Failed to create Xiaomi provider", new Object[0]);
                        }
                    } else {
                        if (!o0O0o000.OooO00o.OooO0O0()) {
                            o0O0o000.OooO0O0 oooO0O0OooO00o = o0O0o000.OooO00o.OooO00o();
                            C34406OooO00o.C20358OooO00o c20358OooO00o4 = C34406OooO00o.f123390OooO00o;
                            c20358OooO00o4.OooO00o(androidx.concurrent.futures.OooO00o.OooO0OO(C22238OooO0oO.OooO0O0(c20358OooO00o4, "PenCapabilityModule", "Device vendor: "), oooO0O0OooO00o.f88812OooOo0o, ", no specific pen provider available"), new Object[0]);
                            return r5;
                        }
                        try {
                            C31198OooO00o c31198OooO00o = new C31198OooO00o(abstractApplicationC26277OooOoOO8, configProvider);
                            linkedHashMap.put("lenovo", c31198OooO00o);
                            if (!c31198OooO00o.initialize()) {
                                C34406OooO00o.C20358OooO00o c20358OooO00o5 = C34406OooO00o.f123390OooO00o;
                                c20358OooO00o5.OooOOO0("PenCapabilityModule");
                                c20358OooO00o5.OooOO0O("Lenovo provider initialization failed", new Object[0]);
                                return r5;
                            }
                            r5.OooO0O0("lenovo");
                            C34406OooO00o.C20358OooO00o c20358OooO00o6 = C34406OooO00o.f123390OooO00o;
                            c20358OooO00o6.OooOOO0("PenCapabilityModule");
                            c20358OooO00o6.OooO0o0("Lenovo pen capability provider activated", new Object[0]);
                            return r5;
                        } catch (Exception e2) {
                            C34406OooO00o.C20358OooO00o c20358OooO00o7 = C34406OooO00o.f123390OooO00o;
                            c20358OooO00o7.OooOOO0("PenCapabilityModule");
                            c20358OooO00o7.OooO0Oo(e2, "Failed to create Lenovo provider", new Object[0]);
                        }
                    }
                    return r5;
                case 169:
                    return (T) new o0OOOoo.OooOOO0(c26269OooOOoo.OooOOo());
                case 170:
                    o0OOOOO0.OooO00o activityService = c26269OooOOoo.f89880o000ooo.get();
                    kotlin.jvm.internal.OooOOO0.OooO0oO(activityService, "activityService");
                    InterfaceC34701OooO00o adDao = c26269OooOOoo.f89882o000oooO.get();
                    AdMapper mapper = c26269OooOOoo.f89883o000oooo.get();
                    kotlin.jvm.internal.OooOOO0.OooO0oO(adDao, "adDao");
                    kotlin.jvm.internal.OooOOO0.OooO0oO(mapper, "mapper");
                    return (T) new C29211OooO00o();
                case 171:
                    C35240OooOoOO c35240OooOoOO4 = c26269OooOOoo.f89778OoooOOo.get();
                    C27213OooO00o c27213OooO00o8 = C27214OooO0O0.f95055OooO00o;
                    return (T) ((o0OOOOO0.OooO00o) C21023OooO0Oo.OooO0O0(c35240OooOoOO4, "retrofit", o0OOOOO0.OooO00o.class, "create(...)"));
                case 172:
                    NoteDatabase database7 = c26269OooOOoo.f89744OooOOOO.get();
                    kotlin.jvm.internal.OooOOO0.OooO0oO(database7, "database");
                    T t10 = (T) database7.OooOo0();
                    C25898OooO0Oo.OooO0O0(t10);
                    return t10;
                case 173:
                    return (T) ((AdMapper) oOO00O0O.OooO00o.OooO0O0(AdMapper.class));
                case 174:
                    AbstractApplicationC26277OooOoOO abstractApplicationC26277OooOoOO9 = (AbstractApplicationC26277OooOoOO) c26269OooOOoo.f89731OooO00o.f88129OooO00o;
                    ?? r0 = (T) new C26999OooO0o0();
                    C33874OooO0OO c33874OooO0OO = C33649OoooOOo.f121328OooO00o;
                    C33609OooO0oo.OooO0OO(C33633Oooo0.OooO00o(ExecutorC33873OooO0O0.f122045OooOoO0), null, null, new o0OOO0O.OooO0OO(r0, abstractApplicationC26277OooOoOO9, null), 3);
                    return r0;
                case 175:
                    return (T) new C26952OooO(c26269OooOOoo.f89974o0O0ooO.get(), c26269OooOOoo.f89971o00oOoo.get(), c26269OooOOoo.f89777OoooOOO.get());
                case 176:
                    NoteDatabase database8 = c26269OooOOoo.f89744OooOOOO.get();
                    kotlin.jvm.internal.OooOOO0.OooO0oO(database8, "database");
                    T t11 = (T) database8.OooOoo0();
                    C25898OooO0Oo.OooO0O0(t11);
                    return t11;
                case 177:
                    NoteDatabase database9 = c26269OooOOoo.f89744OooOOOO.get();
                    kotlin.jvm.internal.OooOOO0.OooO0oO(database9, "database");
                    T t12 = (T) database9.OooOo();
                    C25898OooO0Oo.OooO0O0(t12);
                    return t12;
                case 178:
                    o0OO0oO.OooO0o oooO0o = c26269OooOOoo.f89888o00O000o.get();
                    InterfaceC27152OooO0oO interfaceC27152OooO0oO = c26269OooOOoo.f89985oOO00O.get();
                    o0O000o.OooO0O0 oooO0O06 = c26269OooOOoo.f89731OooO00o;
                    return (T) new C26933OooO0oo(oooO0o, new o0OO0oO.OooOO0O(interfaceC27152OooO0oO, (AbstractApplicationC26277OooOoOO) oooO0O06.f88129OooO00o), new o0OO0oO.OooO(c26269OooOOoo.f89893o00O00o0.get(), c26269OooOOoo.f89988oo00o.get(), (AbstractApplicationC26277OooOoOO) oooO0O06.f88129OooO00o), c26269OooOOoo.f89899o00O0O0o.get(), c26269OooOOoo.f89992oo0oOO0.get());
                case 179:
                    return (T) new o0OO0oO.OooO0o((AbstractApplicationC26277OooOoOO) c26269OooOOoo.f89731OooO00o.f88129OooO00o);
                case 180:
                    C35240OooOoOO c35240OooOoOO5 = c26269OooOOoo.f89889o00O00O.get();
                    C27213OooO00o c27213OooO00o9 = C27214OooO0O0.f95055OooO00o;
                    return (T) ((InterfaceC27152OooO0oO) C21023OooO0Oo.OooO0O0(c35240OooOoOO5, "retrofit", InterfaceC27152OooO0oO.class, "create(...)"));
                case 181:
                    OkHttpClient okHttpClient4 = c26269OooOOoo.o00O00.get();
                    C27213OooO00o c27213OooO00o10 = C27214OooO0O0.f95055OooO00o;
                    kotlin.jvm.internal.OooOOO0.OooO0oO(okHttpClient4, "okHttpClient");
                    C35240OooOoOO.OooO0O0 oooO0O07 = new C35240OooOoOO.OooO0O0();
                    oooO0O07.f126593OooO0Oo.add(C35204OooO00o.OooO0OO());
                    oooO0O07.OooO00o("http://47.94.225.144");
                    oooO0O07.f126591OooO0O0 = okHttpClient4;
                    return (T) oooO0O07.OooO0O0();
                case 182:
                    C27213OooO00o c27213OooO00o11 = C27214OooO0O0.f95055OooO00o;
                    OkHttpClient.Builder builder4 = new OkHttpClient.Builder();
                    TimeUnit timeUnit3 = TimeUnit.SECONDS;
                    builder4.OooO0OO(300L, timeUnit3);
                    builder4.OooO00o(300L, timeUnit3);
                    builder4.OooO0o0(300L, timeUnit3);
                    builder4.OooO0O0(C27214OooO0O0.f95055OooO00o);
                    builder4.f124204OooO0OO.add(new C31197OooO00o());
                    return (T) new OkHttpClient(builder4);
                case 183:
                    C35240OooOoOO c35240OooOoOO6 = c26269OooOOoo.f89891o00O00Oo.get();
                    C27213OooO00o c27213OooO00o12 = C27214OooO0O0.f95055OooO00o;
                    return (T) ((o0OOOOO0.OooO0o) C21023OooO0Oo.OooO0O0(c35240OooOoOO6, "retrofit", o0OOOOO0.OooO0o.class, "create(...)"));
                case 184:
                    OkHttpClient okHttpClient5 = c26269OooOOoo.f89890o00O00OO.get();
                    C27213OooO00o c27213OooO00o13 = C27214OooO0O0.f95055OooO00o;
                    kotlin.jvm.internal.OooOOO0.OooO0oO(okHttpClient5, "okHttpClient");
                    C35240OooOoOO.OooO0O0 oooO0O08 = new C35240OooOoOO.OooO0O0();
                    oooO0O08.f126593OooO0Oo.add(C35204OooO00o.OooO0OO());
                    oooO0O08.OooO00o("https://func-higje-gtzrmfrmsp.cn-beijing.fcapp.run");
                    oooO0O08.f126591OooO0O0 = okHttpClient5;
                    return (T) oooO0O08.OooO0O0();
                case 185:
                    C27213OooO00o c27213OooO00o14 = C27214OooO0O0.f95055OooO00o;
                    OkHttpClient.Builder builder5 = new OkHttpClient.Builder();
                    TimeUnit timeUnit4 = TimeUnit.SECONDS;
                    builder5.OooO00o(300L, timeUnit4);
                    builder5.OooO0o0(300L, timeUnit4);
                    builder5.OooO0OO(300L, timeUnit4);
                    builder5.OooO0O0(C27214OooO0O0.f95055OooO00o);
                    builder5.f124204OooO0OO.add(new C31197OooO00o());
                    return (T) new OkHttpClient(builder5);
                case 186:
                    C35240OooOoOO c35240OooOoOO7 = c26269OooOOoo.f89894o00O00oO.get();
                    C27213OooO00o c27213OooO00o15 = C27214OooO0O0.f95055OooO00o;
                    return (T) ((o0OOOOO0.OooO0o) C21023OooO0Oo.OooO0O0(c35240OooOoOO7, "retrofit", o0OOOOO0.OooO0o.class, "create(...)"));
                case 187:
                    OkHttpClient okHttpClient6 = c26269OooOOoo.f89892o00O00o.get();
                    C27213OooO00o c27213OooO00o16 = C27214OooO0O0.f95055OooO00o;
                    kotlin.jvm.internal.OooOOO0.OooO0oO(okHttpClient6, "okHttpClient");
                    C35240OooOoOO.OooO0O0 oooO0O09 = new C35240OooOoOO.OooO0O0();
                    oooO0O09.f126593OooO0Oo.add(C35204OooO00o.OooO0OO());
                    oooO0O09.OooO00o("https://epub-convertor-cvmbrpabum.cn-beijing.fcapp.run");
                    oooO0O09.f126591OooO0O0 = okHttpClient6;
                    return (T) oooO0O09.OooO0O0();
                case 188:
                    C27213OooO00o c27213OooO00o17 = C27214OooO0O0.f95055OooO00o;
                    OkHttpClient.Builder builder6 = new OkHttpClient.Builder();
                    TimeUnit timeUnit5 = TimeUnit.SECONDS;
                    builder6.OooO0OO(300L, timeUnit5);
                    builder6.OooO0o0(300L, timeUnit5);
                    builder6.OooO00o(300L, timeUnit5);
                    builder6.OooO0O0(C27214OooO0O0.f95055OooO00o);
                    builder6.f124204OooO0OO.add(new C31197OooO00o());
                    return (T) new OkHttpClient(builder6);
                case 189:
                    return (T) new C26932OooO0oO(c26269OooOOoo.f89896o00O0O0.get(), c26269OooOOoo.f89743OooOOO0.get(), c26269OooOOoo.f89898o00O0O0O.get(), (AbstractApplicationC26277OooOoOO) c26269OooOOoo.f89731OooO00o.f88129OooO00o);
                case 190:
                    C35240OooOoOO c35240OooOoOO8 = c26269OooOOoo.f89897o00O0O00.get();
                    C27213OooO00o c27213OooO00o18 = C27214OooO0O0.f95055OooO00o;
                    return (T) ((InterfaceC27150OooO0Oo) C21023OooO0Oo.OooO0O0(c35240OooOoOO8, "retrofit", InterfaceC27150OooO0Oo.class, "create(...)"));
                case 191:
                    OkHttpClient okHttpClient7 = c26269OooOOoo.f89885o00O0.get();
                    C27213OooO00o c27213OooO00o19 = C27214OooO0O0.f95055OooO00o;
                    kotlin.jvm.internal.OooOOO0.OooO0oO(okHttpClient7, "okHttpClient");
                    C35240OooOoOO.OooO0O0 oooO0O010 = new C35240OooOoOO.OooO0O0();
                    oooO0O010.f126593OooO0Oo.add(C35204OooO00o.OooO0OO());
                    oooO0O010.OooO00o("https://api.caj2pdf.cn");
                    oooO0O010.f126591OooO0O0 = okHttpClient7;
                    return (T) oooO0O010.OooO0O0();
                case 192:
                    o0000o0O.OooOO0<AbstractC24338OooO0o0> ds = c26269OooOOoo.f89743OooOOO0.get();
                    C27213OooO00o c27213OooO00o20 = C27214OooO0O0.f95055OooO00o;
                    kotlin.jvm.internal.OooOOO0.OooO0oO(ds, "ds");
                    OkHttpClient.Builder builder7 = new OkHttpClient.Builder();
                    builder7.OooO0O0(C27214OooO0O0.f95055OooO00o);
                    builder7.f124204OooO0OO.add(new C31197OooO00o());
                    return (T) new OkHttpClient(builder7);
                case 193:
                    C27213OooO00o c27213OooO00o21 = C27214OooO0O0.f95055OooO00o;
                    OkHttpClient.Builder builder8 = new OkHttpClient.Builder();
                    TimeUnit timeUnit6 = TimeUnit.SECONDS;
                    builder8.OooO00o(30L, timeUnit6);
                    builder8.OooO0o0(30L, timeUnit6);
                    builder8.OooO0OO(30L, timeUnit6);
                    return (T) new OkHttpClient(builder8);
                case 194:
                    return (T) new C26938OooOOoo(c26269OooOOoo.f89900o00O0OO.get(), c26269OooOOoo.f89905o00O0Oo0);
                case 195:
                    C35240OooOoOO c35240OooOoOO9 = c26269OooOOoo.f89990oo0o0O0.get();
                    C27213OooO00o c27213OooO00o22 = C27214OooO0O0.f95055OooO00o;
                    return (T) ((InterfaceC27198OooO0oO) C21023OooO0Oo.OooO0O0(c35240OooOoOO9, "retrofit", InterfaceC27198OooO0oO.class, "create(...)"));
                case 196:
                    OkHttpClient okHttpClient8 = c26269OooOOoo.f89901o00O0OO0.get();
                    C27213OooO00o c27213OooO00o23 = C27214OooO0O0.f95055OooO00o;
                    kotlin.jvm.internal.OooOOO0.OooO0oO(okHttpClient8, "okHttpClient");
                    C35240OooOoOO.OooO0O0 oooO0O011 = new C35240OooOoOO.OooO0O0();
                    oooO0O011.f126593OooO0Oo.add(C35204OooO00o.OooO0OO());
                    oooO0O011.OooO00o("https://solution.wps.cn");
                    oooO0O011.f126591OooO0O0 = okHttpClient8;
                    return (T) oooO0O011.OooO0O0();
                case 197:
                    C27213OooO00o c27213OooO00o24 = C27214OooO0O0.f95055OooO00o;
                    OkHttpClient.Builder builder9 = new OkHttpClient.Builder();
                    TimeUnit timeUnit7 = TimeUnit.SECONDS;
                    builder9.OooO00o(30L, timeUnit7);
                    builder9.OooO0OO(30L, timeUnit7);
                    builder9.OooO0o0(30L, timeUnit7);
                    builder9.OooO0O0(C27214OooO0O0.f95055OooO00o);
                    C27191OooO c27191OooO = new C27191OooO();
                    ArrayList arrayList3 = builder9.f124204OooO0OO;
                    arrayList3.add(c27191OooO);
                    arrayList3.add(new C31197OooO00o());
                    return (T) new OkHttpClient(builder9);
                case 198:
                    OSS client = c26269OooOOoo.f89903o00O0OOo.get();
                    kotlin.jvm.internal.OooOOO0.OooO0oO(client, "client");
                    return (T) new o0OO00Oo.OooO0O0(client);
                case 199:
                    AbstractApplicationC26277OooOoOO abstractApplicationC26277OooOoOO10 = (AbstractApplicationC26277OooOoOO) c26269OooOOoo.f89731OooO00o.f88129OooO00o;
                    OSSCredentialProvider creds = c26269OooOOoo.f89902o00O0OOO.get();
                    kotlin.jvm.internal.OooOOO0.OooO0oO(creds, "creds");
                    return (T) new OSSClient(abstractApplicationC26277OooOoOO10, "http://oss-cn-beijing.aliyuncs.com", creds);
                default:
                    throw new AssertionError(i);
            }
        }

        @Override // oO00ooO0.InterfaceC32462OooO00o
        public final T get() {
            int i = 0;
            int i2 = 2;
            int i3 = 1;
            int i4 = this.f89996OooO0O0;
            int i5 = i4 / 100;
            if (i5 == 0) {
                return OooO00o();
            }
            if (i5 == 1) {
                return OooO0O0();
            }
            if (i5 != 2) {
                throw new AssertionError(i4);
            }
            C26269OooOOoo c26269OooOOoo = this.f89995OooO00o;
            switch (i4) {
                case 200:
                    return (T) new OSSPlainTextAKSKCredentialProvider("LTAI5tHMyPfH1b94DuMmrU9v", "Z4sb5lFLOSWOPUMJQZB05x8imJ4h9n");
                case 201:
                    OkHttpClient okhttpClient = c26269OooOOoo.f89898o00O0O0O.get();
                    kotlin.jvm.internal.OooOOO0.OooO0oO(okhttpClient, "okhttpClient");
                    return (T) new C26944OooO0O0();
                case 202:
                    return (T) new o0OOO0.OooOO0(new C27004OooOO0o(c26269OooOOoo.f89910o00O0o00.get(), c26269OooOOoo.f89743OooOOO0.get()), new C27006OooOOo0(c26269OooOOoo.f89970o00oOOo.get(), c26269OooOOoo.f89743OooOOO0.get()), c26269OooOOoo.f89909o00O0o0.get());
                case 203:
                    NoteAiDatabase database = c26269OooOOoo.f89907o00O0Ooo.get();
                    kotlin.jvm.internal.OooOOO0.OooO0oO(database, "database");
                    T t = (T) database.OooOo();
                    C25898OooO0Oo.OooO0O0(t);
                    return t;
                case 204:
                    AbstractC24673OooOo0O.OooO00o OooO00o2 = C24668OooOOOo.OooO00o((AbstractApplicationC26277OooOoOO) c26269OooOOoo.f89731OooO00o.f88129OooO00o, "note-ai-db", NoteAiDatabase.class);
                    OooO00o2.OooO00o(C27263OooooOo.f95060OooO00o, C27263OooooOo.f95061OooO0O0, C27263OooooOo.f95062OooO0OO);
                    return (T) ((NoteAiDatabase) OooO00o2.OooO0O0());
                case 205:
                    C35240OooOoOO c35240OooOoOO = c26269OooOOoo.f89819o0000oO.get();
                    C27213OooO00o c27213OooO00o = C27214OooO0O0.f95055OooO00o;
                    return (T) ((InterfaceC27159OooO00o) C21023OooO0Oo.OooO0O0(c35240OooOoOO, "retrofit", InterfaceC27159OooO00o.class, "create(...)"));
                case 206:
                    return (T) ((NoteinAiQuotaRecordMapper) oOO00O0O.OooO00o.OooO0O0(NoteinAiQuotaRecordMapper.class));
                case 207:
                    return (T) new C26984OooO0Oo(new C27002OooO0oO((AbstractApplicationC26277OooOoOO) c26269OooOOoo.f89731OooO00o.f88129OooO00o, c26269OooOOoo.f89912o00O0o0o.get()), c26269OooOOoo.f89908o00O0o.get());
                case 208:
                    NoteAiDatabase database2 = c26269OooOOoo.f89907o00O0Ooo.get();
                    kotlin.jvm.internal.OooOOO0.OooO0oO(database2, "database");
                    T t2 = (T) database2.OooOo0();
                    C25898OooO0Oo.OooO0O0(t2);
                    return t2;
                case 209:
                    return (T) ((AiOcrSessionMapper) oOO00O0O.OooO00o.OooO0O0(AiOcrSessionMapper.class));
                case 210:
                    return (T) new o0OOO0.OooO0o(c26269OooOOoo.f89915o00O0oOo.get(), c26269OooOOoo.f89917o00O0oo0.get());
                case 211:
                    return (T) new C27003OooO0oo(c26269OooOOoo.f89914o00O0oOO.get());
                case 212:
                    NoteAiDatabase database3 = c26269OooOOoo.f89907o00O0Ooo.get();
                    kotlin.jvm.internal.OooOOO0.OooO0oO(database3, "database");
                    T t3 = (T) database3.OooOo0O();
                    C25898OooO0Oo.OooO0O0(t3);
                    return t3;
                case 213:
                    return (T) ((AiOcrTextPageMapper) oOO00O0O.OooO00o.OooO0O0(AiOcrTextPageMapper.class));
                case 214:
                    return (T) new C26942OooO0O0();
                case 215:
                    return (T) new C27328OooO0OO(c26269OooOOoo.Oooo0o0(), c26269OooOOoo.f89895o00O0O.get(), c26269OooOOoo.f89735OooO0o.get(), c26269OooOOoo.OooOOOO(), c26269OooOOoo.f89765Oooo00o.get(), c26269OooOOoo.OooOOoo(), c26269OooOOoo.Oooo00O(), c26269OooOOoo.OooOooO(), c26269OooOOoo.Oooo000(), c26269OooOOoo.OooO(), c26269OooOOoo.OooOo(), c26269OooOOoo.f89884o00O.get(), c26269OooOOoo.f89921o00OO000.get());
                case 216:
                    o0O000o.OooO0O0 oooO0O0 = c26269OooOOoo.f89731OooO00o;
                    return (T) new C26437OooO0o0();
                case 217:
                    return (T) new C26436OooO0Oo(c26269OooOOoo.f89740OooOO0O.get());
                case 218:
                    return (T) new C27659OoooOOo(c26269OooOOoo.f89867o000o0o0.get());
                case 219:
                    return (T) new C26929OooO0Oo(c26269OooOOoo.f89920o00OO0.get());
                case 220:
                    return (T) new C26928OooO0OO((AbstractApplicationC26277OooOoOO) c26269OooOOoo.f89731OooO00o.f88129OooO00o);
                case 221:
                    return (T) new C26971OooOo0(new C26972OooOo00(c26269OooOOoo.f89928o00OO0o0.get(), new MaterialMapper()));
                case 222:
                    C35240OooOoOO c35240OooOoOO2 = c26269OooOOoo.f89926o00OO0OO.get();
                    C27213OooO00o c27213OooO00o2 = C27214OooO0O0.f95055OooO00o;
                    return (T) ((InterfaceC27151OooO0o0) C21023OooO0Oo.OooO0O0(c35240OooOoOO2, "retrofit", InterfaceC27151OooO0o0.class, "create(...)"));
                case 223:
                    OkHttpClient okHttpClient = c26269OooOOoo.f89924o00OO0O.get();
                    C27213OooO00o c27213OooO00o3 = C27214OooO0O0.f95055OooO00o;
                    kotlin.jvm.internal.OooOOO0.OooO0oO(okHttpClient, "okHttpClient");
                    C35240OooOoOO.OooO0O0 oooO0O02 = new C35240OooOoOO.OooO0O0();
                    oooO0O02.f126591OooO0O0 = okHttpClient;
                    oooO0O02.OooO00o("https://creative-library.note-in.com");
                    oooO0O02.f126593OooO0Oo.add(C35204OooO00o.OooO0OO());
                    return (T) oooO0O02.OooO0O0();
                case 224:
                    o0000o0O.OooOO0<AbstractC24338OooO0o0> ds = c26269OooOOoo.f89743OooOOO0.get();
                    AbstractApplicationC26277OooOoOO abstractApplicationC26277OooOoOO = (AbstractApplicationC26277OooOoOO) c26269OooOOoo.f89731OooO00o.f88129OooO00o;
                    C27213OooO00o c27213OooO00o4 = C27214OooO0O0.f95055OooO00o;
                    kotlin.jvm.internal.OooOOO0.OooO0oO(ds, "ds");
                    OkHttpClient.Builder builder = new OkHttpClient.Builder();
                    builder.OooO0O0(C27214OooO0O0.f95055OooO00o);
                    C31150OooO00o c31150OooO00o = new C31150OooO00o(ds, abstractApplicationC26277OooOoOO);
                    ArrayList arrayList = builder.f124204OooO0OO;
                    arrayList.add(c31150OooO00o);
                    arrayList.add(new C31197OooO00o());
                    TimeUnit timeUnit = TimeUnit.SECONDS;
                    builder.OooO00o(30L, timeUnit);
                    builder.OooO0OO(30L, timeUnit);
                    builder.OooO0o0(30L, timeUnit);
                    return (T) new OkHttpClient(builder);
                case 225:
                    NoteDatabase database4 = c26269OooOOoo.f89744OooOOOO.get();
                    kotlin.jvm.internal.OooOOO0.OooO0oO(database4, "database");
                    T t4 = (T) database4.OooOo0O();
                    C25898OooO0Oo.OooO0O0(t4);
                    return t4;
                case 226:
                    return (T) ((ColorSetMapper) oOO00O0O.OooO00o.OooO0O0(ColorSetMapper.class));
                case 227:
                    return (T) new C27538o00o0o0O(c26269OooOOoo.f89932o00OOO0.get(), c26269OooOOoo.Oooo0o0(), c26269OooOOoo.f89934o00OOO0O.get(), c26269OooOOoo.OooOOoo(), c26269OooOOoo.f89887o00O0000.get(), (AbstractApplicationC26277OooOoOO) c26269OooOOoo.f89731OooO00o.f88129OooO00o);
                case 228:
                    return (T) new C27076OooOOOO(new C27073OooOO0o(c26269OooOOoo.f89989oo0O.get(), c26269OooOOoo.f89919o00OO.get(), c26269OooOOoo.f89933o00OOO00.get(), (AbstractApplicationC26277OooOoOO) c26269OooOOoo.f89731OooO00o.f88129OooO00o));
                case 229:
                    NoteDatabase database5 = c26269OooOOoo.f89744OooOOOO.get();
                    kotlin.jvm.internal.OooOOO0.OooO0oO(database5, "database");
                    T t5 = (T) database5.Oooo0o0();
                    C25898OooO0Oo.OooO0O0(t5);
                    return t5;
                case 230:
                    NoteDatabase database6 = c26269OooOOoo.f89744OooOOOO.get();
                    kotlin.jvm.internal.OooOOO0.OooO0oO(database6, "database");
                    T t6 = (T) database6.Oooo0OO();
                    C25898OooO0Oo.OooO0O0(t6);
                    return t6;
                case 231:
                    return (T) ((StickerMapper) oOO00O0O.OooO00o.OooO0O0(StickerMapper.class));
                case 232:
                    return (T) new o0OO00o0.o00O0O((AbstractApplicationC26277OooOoOO) c26269OooOOoo.f89731OooO00o.f88129OooO00o);
                case 233:
                    return (T) new C26962OooOO0O((AbstractApplicationC26277OooOoOO) c26269OooOOoo.f89731OooO00o.f88129OooO00o, c26269OooOOoo.f89898o00O0O0O.get());
                case 234:
                    C26474OooO0oo c26474OooO0oo = new C26474OooO0oo(c26269OooOOoo.f89935o00OOOO.get(), c26269OooOOoo.f89937o00OOOOo.get());
                    InterfaceC34808o000ooO noteAiDao = c26269OooOOoo.f89986oOooo0o.get();
                    kotlin.jvm.internal.OooOOO0.OooO0oO(noteAiDao, "noteAiDao");
                    C26470OooO00o c26470OooO00o = new C26470OooO00o();
                    c26470OooO00o.f90943OooO00o = noteAiDao;
                    return (T) new C26471OooO0Oo(c26474OooO0oo, c26470OooO00o, c26269OooOOoo.f89939o00OOOo0.get());
                case 235:
                    C35240OooOoOO c35240OooOoOO3 = c26269OooOOoo.f89936o00OOOO0.get();
                    C27213OooO00o c27213OooO00o5 = C27214OooO0O0.f95055OooO00o;
                    return (T) ((o0OOOOO.OooO00o) C21023OooO0Oo.OooO0O0(c35240OooOoOO3, "retrofit", o0OOOOO.OooO00o.class, "create(...)"));
                case 236:
                    OkHttpClient okHttpClient2 = c26269OooOOoo.f89823o0000oo.get();
                    C27213OooO00o c27213OooO00o6 = C27214OooO0O0.f95055OooO00o;
                    kotlin.jvm.internal.OooOOO0.OooO0oO(okHttpClient2, "okHttpClient");
                    C35240OooOoOO.OooO0O0 oooO0O03 = new C35240OooOoOO.OooO0O0();
                    oooO0O03.f126593OooO0Oo.add(C35204OooO00o.OooO0OO());
                    oooO0O03.OooO00o("https://service-img-73w2dfbxvq-uc.a.run.app/");
                    oooO0O03.f126591OooO0O0 = okHttpClient2;
                    return (T) oooO0O03.OooO0O0();
                case 237:
                    NoteAiDatabase database7 = c26269OooOOoo.f89907o00O0Ooo.get();
                    kotlin.jvm.internal.OooOOO0.OooO0oO(database7, "database");
                    T t7 = (T) database7.OooOoO0();
                    C25898OooO0Oo.OooO0O0(t7);
                    return t7;
                case 238:
                    NoteAiDatabase database8 = c26269OooOOoo.f89907o00O0Ooo.get();
                    kotlin.jvm.internal.OooOOO0.OooO0oO(database8, "database");
                    T t8 = (T) database8.OooOo0o();
                    C25898OooO0Oo.OooO0O0(t8);
                    return t8;
                case 239:
                    return (T) ((NoteAiContentMapper) oOO00O0O.OooO00o.OooO0O0(NoteAiContentMapper.class));
                case 240:
                    C35240OooOoOO c35240OooOoOO4 = c26269OooOOoo.f89941o00OOoo.get();
                    C27213OooO00o c27213OooO00o7 = C27214OooO0O0.f95055OooO00o;
                    return (T) ((InterfaceC27186OooO00o) C21023OooO0Oo.OooO0O0(c35240OooOoOO4, "retrofit", InterfaceC27186OooO00o.class, "create(...)"));
                case 241:
                    OkHttpClient okHttpClient3 = c26269OooOOoo.f89940o00OOOoO.get();
                    C27213OooO00o c27213OooO00o8 = C27214OooO0O0.f95055OooO00o;
                    kotlin.jvm.internal.OooOOO0.OooO0oO(okHttpClient3, "okHttpClient");
                    C35240OooOoOO.OooO0O0 oooO0O04 = new C35240OooOoOO.OooO0O0();
                    oooO0O04.f126593OooO0Oo.add(C35204OooO00o.OooO0OO());
                    oooO0O04.OooO00o("https://fanyi-api.baidu.com/");
                    oooO0O04.f126591OooO0O0 = okHttpClient3;
                    return (T) oooO0O04.OooO0O0();
                case 242:
                    C27213OooO00o c27213OooO00o9 = C27214OooO0O0.f95055OooO00o;
                    OkHttpClient.Builder builder2 = new OkHttpClient.Builder();
                    builder2.OooO0O0(C27214OooO0O0.f95055OooO00o);
                    builder2.f124204OooO0OO.add(new C31197OooO00o());
                    return (T) new OkHttpClient(builder2);
                case 243:
                    return (T) new C27786OooO0OO(c26269OooOOoo.f89795o000000.get());
                case 244:
                    return (T) new o0OO00o0.o00OO(c26269OooOOoo.f89743OooOOO0.get());
                case 245:
                    C35240OooOoOO c35240OooOoOO5 = c26269OooOOoo.f89778OoooOOo.get();
                    C27213OooO00o c27213OooO00o10 = C27214OooO0O0.f95055OooO00o;
                    return (T) ((o0OOOOO0.OooOO0O) C21023OooO0Oo.OooO0O0(c35240OooOoOO5, "retrofit", o0OOOOO0.OooOO0O.class, "create(...)"));
                case 246:
                    AbstractApplicationC26277OooOoOO abstractApplicationC26277OooOoOO2 = (AbstractApplicationC26277OooOoOO) c26269OooOOoo.f89731OooO00o.f88129OooO00o;
                    return (T) C24336OooO0Oo.OooO00o(new C24306OooO0O0(new C27212OooO(i)), com.facebook.soloader.OooOo.OooO0oO(C24323OooO.OooO00o(abstractApplicationC26277OooOoOO2, "notein-audio-sp")), new C25712OooOooo(abstractApplicationC26277OooOoOO2, i3));
                case StyleIdentifier.LIGHT_LIST_ACCENT_6 /* 247 */:
                    return (T) new C26490OooOoo(c26269OooOOoo.f89743OooOOO0.get());
                case StyleIdentifier.LIGHT_GRID_ACCENT_6 /* 248 */:
                    AbstractApplicationC26277OooOoOO abstractApplicationC26277OooOoOO3 = (AbstractApplicationC26277OooOoOO) c26269OooOOoo.f89731OooO00o.f88129OooO00o;
                    return (T) C24336OooO0Oo.OooO00o(new C24306OooO0O0(new C27220OooO0oo()), com.facebook.soloader.OooOo.OooO0oO(C24323OooO.OooO00o(abstractApplicationC26277OooOoOO3, "notein-toolbar-sp")), new C25709OooOoo(abstractApplicationC26277OooOoOO3, i3));
                case StyleIdentifier.MEDIUM_SHADING_1_ACCENT_6 /* 249 */:
                    return (T) new o0OO0O0O.OooO0O0();
                case 250:
                    return (T) new C27515o00o0000((AbstractApplicationC26277OooOoOO) c26269OooOOoo.f89731OooO00o.f88129OooO00o);
                case StyleIdentifier.MEDIUM_LIST_1_ACCENT_6 /* 251 */:
                    return (T) new o0OOOOO0.OooO0O0((AbstractApplicationC26277OooOoOO) c26269OooOOoo.f89731OooO00o.f88129OooO00o);
                case StyleIdentifier.MEDIUM_LIST_2_ACCENT_6 /* 252 */:
                    return (T) new C27377o00000Oo((AbstractApplicationC26277OooOoOO) c26269OooOOoo.f89731OooO00o.f88129OooO00o, c26269OooOOoo.Oooo0o0());
                case StyleIdentifier.MEDIUM_GRID_1_ACCENT_6 /* 253 */:
                    NoteDatabase database9 = c26269OooOOoo.f89744OooOOOO.get();
                    kotlin.jvm.internal.OooOOO0.OooO0oO(database9, "database");
                    T t9 = (T) database9.Oooo0O0();
                    C25898OooO0Oo.OooO0O0(t9);
                    return t9;
                case StyleIdentifier.MEDIUM_GRID_2_ACCENT_6 /* 254 */:
                    return (T) ((PenInfoMapper) oOO00O0O.OooO00o.OooO0O0(PenInfoMapper.class));
                case 255:
                    NoteDatabase database10 = c26269OooOOoo.f89744OooOOOO.get();
                    kotlin.jvm.internal.OooOOO0.OooO0oO(database10, "database");
                    T t10 = (T) database10.Oooo0o();
                    C25898OooO0Oo.OooO0O0(t10);
                    return t10;
                case 256:
                    return (T) ((ToolBoxInfoMapper) oOO00O0O.OooO00o.OooO0O0(ToolBoxInfoMapper.class));
                case 257:
                    return (T) new C27976OooO0o0(c26269OooOOoo.OooOOo(), c26269OooOOoo.OooOoo());
                case StyleIdentifier.COLORFUL_LIST_ACCENT_6 /* 258 */:
                    return (T) new C27366OoooOoo(c26269OooOOoo.OooO0oo());
                case StyleIdentifier.COLORFUL_GRID_ACCENT_6 /* 259 */:
                    AbstractApplicationC26277OooOoOO abstractApplicationC26277OooOoOO4 = (AbstractApplicationC26277OooOoOO) c26269OooOOoo.f89731OooO00o.f88129OooO00o;
                    return (T) C24336OooO0Oo.OooO00o(new C24306OooO0O0(new C27217OooO0o()), com.facebook.soloader.OooOo.OooO0oO(C24323OooO.OooO00o(abstractApplicationC26277OooOoOO4, "notein-toolbox-sp")), new C25707OooOoO0(abstractApplicationC26277OooOoOO4, i2));
                case StyleIdentifier.SUBTLE_EMPHASIS /* 260 */:
                    return (T) new C27670OoooooO(c26269OooOOoo.OooOo0O(), c26269OooOOoo.OooO0oO(), c26269OooOOoo.f89855o000Ooo0.get(), c26269OooOOoo.OooOo00());
                case StyleIdentifier.INTENSE_EMPHASIS /* 261 */:
                    return (T) new C27514o00o000(c26269OooOOoo.f89800o00000OO.get());
                case StyleIdentifier.SUBTLE_REFERENCE /* 262 */:
                    return (T) new o0OO0oO0.OooO00o((AbstractApplicationC26277OooOoOO) c26269OooOOoo.f89731OooO00o.f88129OooO00o);
                case StyleIdentifier.INTENSE_REFERENCE /* 263 */:
                    return (T) new C27540o00o0oO((AbstractApplicationC26277OooOoOO) c26269OooOOoo.f89731OooO00o.f88129OooO00o, c26269OooOOoo.f89895o00O0O.get(), c26269OooOOoo.OooOoOO(), c26269OooOOoo.Oooo0(), c26269OooOOoo.f89972o00ooo.get(), new C27596o00ooo(c26269OooOOoo.f89797o000000o.get(), c26269OooOOoo.OooOo0O(), (AbstractApplicationC26277OooOoOO) c26269OooOOoo.f89731OooO00o.f88129OooO00o));
                case StyleIdentifier.BOOK_TITLE /* 264 */:
                    c26269OooOOoo.getClass();
                    return (T) new C27168OooOOOo(new o0OOOOoO.OooOOO(c26269OooOOoo.f89743OooOOO0.get(), (AbstractApplicationC26277OooOoOO) c26269OooOOoo.f89731OooO00o.f88129OooO00o));
                case StyleIdentifier.BIBLIOGRAPHY /* 265 */:
                    NoteDatabase database11 = c26269OooOOoo.f89744OooOOOO.get();
                    kotlin.jvm.internal.OooOOO0.OooO0oO(database11, "database");
                    T t11 = (T) database11.OooOo0o();
                    C25898OooO0Oo.OooO0O0(t11);
                    return t11;
                case StyleIdentifier.TOC_HEADING /* 266 */:
                    return (T) ((CouponMapper) oOO00O0O.OooO00o.OooO0O0(CouponMapper.class));
                case StyleIdentifier.PLAIN_TABLE_1 /* 267 */:
                    NoteDatabase database12 = c26269OooOOoo.f89744OooOOOO.get();
                    kotlin.jvm.internal.OooOOO0.OooO0oO(database12, "database");
                    T t12 = (T) database12.Oooo0();
                    C25898OooO0Oo.OooO0O0(t12);
                    return t12;
                case StyleIdentifier.PLAIN_TABLE_2 /* 268 */:
                    return (T) ((NoteinMessageMapper) oOO00O0O.OooO00o.OooO0O0(NoteinMessageMapper.class));
                case StyleIdentifier.PLAIN_TABLE_3 /* 269 */:
                    C35240OooOoOO c35240OooOoOO6 = c26269OooOOoo.f89819o0000oO.get();
                    C27213OooO00o c27213OooO00o11 = C27214OooO0O0.f95055OooO00o;
                    return (T) ((o0OOOOO0.OooOO0) C21023OooO0Oo.OooO0O0(c35240OooOoOO6, "retrofit", o0OOOOO0.OooOO0.class, "create(...)"));
                case 270:
                    return (T) new o0OOo0o.o00000OO();
                default:
                    throw new AssertionError(i4);
            }
        }
    }

    public C26269OooOOoo(o0O000o.OooO0O0 oooO0O0) {
        this.f89731OooO00o = oooO0O0;
    }

    public final o0OO00o0.OooOo00 OooO() {
        return new o0OO00o0.OooOo00(this.f89749OooOo.get(), this.f89740OooOO0O.get(), this.f89755OooOoO0.get());
    }

    @Override // o0O0oooO.InterfaceC26258OooO0oO
    public final void OooO00o(App app) {
        app.f69606OooOoO0 = new C24408OooO00o(ImmutableMap.m75128of("com.orion.notein.ui.backup.netdisk.CloudBackupWorker", this.f89799o00000O0, "com.orion.notein.ui.feedback.FeedbackWorker", this.f89798o00000O, "com.orion.notein.domain.workmanager.PageTextCacheUpdateWorker", this.f89829o000O000));
        app.f69605OooOoO = this.f89875o000oo0O.get();
    }

    @Override // o0O0oooO.InterfaceC26339o000OOoO
    public final InterfaceC27313OooOoo0 OooO0O0() {
        return this.f89895o00O0O.get();
    }

    @Override // o0O0oooO.InterfaceC26339o000OOoO
    public final C27428o000oOoO OooO0OO() {
        return this.f89876o000oo0o.get();
    }

    @Override // oO000O0o.OooO00o.InterfaceC20187OooO00o
    public final ImmutableSet OooO0Oo() {
        return ImmutableSet.m75153of();
    }

    public final C27629OooOOoo OooO0o() {
        return new C27629OooOOoo(this.f89856o000OooO.get(), this.f89867o000o0o0.get());
    }

    @Override // oO0OOooo.C33159OooO0OO.OooO00o
    public final C26265OooOOOO OooO0o0() {
        return new C26265OooOOOO(this.f89732OooO0O0);
    }

    public final C27635OooOoO OooO0oO() {
        return new C27635OooOoO(this.f89855o000Ooo0.get(), this.f89743OooOOO0.get(), (AbstractApplicationC26277OooOoOO) this.f89731OooO00o.f88129OooO00o);
    }

    public final o0OO0o0O.OooO OooO0oo() {
        InterfaceC34723Oooo colorSetDao = this.f89929o00OO0oO.get();
        ColorSetMapper mapper = this.f89930o00OO0oo.get();
        kotlin.jvm.internal.OooOOO0.OooO0oO(colorSetDao, "colorSetDao");
        kotlin.jvm.internal.OooOOO0.OooO0oO(mapper, "mapper");
        C25003OooO0O0 c25003OooO0O0 = new C25003OooO0O0();
        c25003OooO0O0.f84821OooO00o = colorSetDao;
        c25003OooO0O0.f84822OooO0O0 = mapper;
        return new o0OO0o0O.OooO(c25003OooO0O0, new o000O0oO.OooOO0());
    }

    public final C27710OooO0oo OooOO0() {
        return new C27710OooO0oo(OooO(), this.f89895o00O0O.get(), this.f89735OooO0o.get(), Oooo0o0(), OooOooO());
    }

    public final o0OO0o.OooO0OO OooOO0O() {
        return new o0OO0o.OooO0OO(new o0OO0o.OooO0O0(this.f89960o00OoOo0.get(), this.f89959o00OoOo.get()), new o0O000o.OooO0O0(this.f89947o00Oo000.get()));
    }

    public final C27798OooO0o0 OooOO0o() {
        return new C27798OooO0o0(this.f89991oo0o0Oo.get());
    }

    public final C28108OooOO0 OooOOO() {
        return new C28108OooOO0(OooOOOO(), this.f89790Ooooooo.get(), this.f89895o00O0O.get(), this.f89775OoooO0O.get(), OooOOOo(), this.f89797o000000o.get(), (AbstractApplicationC26277OooOoOO) this.f89731OooO00o.f88129OooO00o);
    }

    public final C26515OooooO0 OooOOO0() {
        return new C26515OooooO0(this.f89758OooOoo0.get(), this.f89757OooOoo.get(), this.f89759OooOooO.get(), this.f89760OooOooo.get(), OooOOoo());
    }

    public final C28009OooOOOO OooOOOO() {
        return new C28009OooOOOO(this.f89773OoooO0.get(), this.f89775OoooO0O.get(), Oooo0o0(), this.f89785OooooOO.get());
    }

    public final C27600o0ooOO0 OooOOOo() {
        C28009OooOOOO c28009OooOOOOOooOOOO = OooOOOO();
        InterfaceC27313OooOoo0 interfaceC27313OooOoo0 = this.f89895o00O0O.get();
        C27129OoooOOO c27129OoooOOOOooo0o0 = Oooo0o0();
        InterfaceC27309OooOoO interfaceC27309OooOoO = this.f89735OooO0o.get();
        C26417OooOoO c26417OooOoO = new C26417OooOoO(this.f89945o00Oo0.get(), Oooo0o0());
        C26415OooOo0O c26415OooOo0O = this.f89972o00ooo.get();
        o0O000o.OooO0O0 oooO0O0 = this.f89731OooO00o;
        return new C27600o0ooOO0(c28009OooOOOOOooOOOO, interfaceC27313OooOoo0, c27129OoooOOOOooo0o0, interfaceC27309OooOoO, c26417OooOoO, c26415OooOo0O, new C26681o00o0oOO((AbstractApplicationC26277OooOoOO) oooO0O0.f88129OooO00o), this.f89987oo000o.get(), (AbstractApplicationC26277OooOoOO) oooO0O0.f88129OooO00o);
    }

    public final C26577o000oo0O OooOOo() {
        return new C26577o000oo0O(this.f89743OooOOO0.get(), (AbstractApplicationC26277OooOoOO) this.f89731OooO00o.f88129OooO00o);
    }

    public final C27819OooOoo OooOOo0() {
        return new C27819OooOoo(this.f89991oo0o0Oo.get(), this.f89895o00O0O.get(), OooOOOO(), OooOoOO());
    }

    public final C26596o00O0o0 OooOOoo() {
        return new C26596o00O0o0(this.f89754OooOoO.get(), this.f89756OooOoOO.get(), (AbstractApplicationC26277OooOoOO) this.f89731OooO00o.f88129OooO00o);
    }

    public final C26620o00Oo00o OooOo() {
        return new C26620o00Oo00o(this.f89739OooOO0.get(), this.f89740OooOO0O.get(), this.f89741OooOO0o.get());
    }

    public final Map<CloudMetaType, InterfaceC27661OoooOoO> OooOo0() {
        return C34444Oooo0O0.OooO0oo(new C32443OooOOO(CloudMetaType.NOTE, new C27700o0ooOO0(this.f89895o00O0O.get(), this.f89735OooO0o.get())), new C32443OooOOO(CloudMetaType.FOLDER, new C27657OoooOO0(OooOOOO())), new C32443OooOOO(CloudMetaType.TEMPLATE, new C27694o000O0o(Oooo0())));
    }

    public final Map<CloudMetaType, InterfaceC27660OoooOo0> OooOo00() {
        return C34444Oooo0O0.OooO0oo(new C32443OooOOO(CloudMetaType.NOTE, new C27671Ooooooo(this.f89797o000000o.get(), OooOo0O(), this.f89895o00O0O.get(), this.f89735OooO0o.get(), this.f89855o000Ooo0.get(), Oooo0o0(), (AbstractApplicationC26277OooOoOO) this.f89731OooO00o.f88129OooO00o)), new C32443OooOOO(CloudMetaType.FOLDER, new C27647Oooo0O0(this.f89797o000000o.get(), OooOOOO(), Oooo0o0())), new C32443OooOOO(CloudMetaType.TEMPLATE, new C27685o0000o0O(this.f89797o000000o.get(), Oooo0())));
    }

    public final C27449o00O0OoO OooOo0O() {
        InterfaceC27309OooOoO interfaceC27309OooOoO = this.f89735OooO0o.get();
        InterfaceC27313OooOoo0 interfaceC27313OooOoo0 = this.f89895o00O0O.get();
        C27129OoooOOO c27129OoooOOOOooo0o0 = Oooo0o0();
        C28009OooOOOO c28009OooOOOOOooOOOO = OooOOOO();
        C26417OooOoO c26417OooOoO = new C26417OooOoO(this.f89945o00Oo0.get(), Oooo0o0());
        C27020OooOoO0 c27020OooOoO0OooOoOO = OooOoOO();
        o0O000o.OooO0O0 oooO0O0 = this.f89731OooO00o;
        return new C27449o00O0OoO(interfaceC27309OooOoO, interfaceC27313OooOoo0, c27129OoooOOOOooo0o0, c28009OooOOOOOooOOOO, c26417OooOoO, c27020OooOoO0OooOoOO, new C26681o00o0oOO((AbstractApplicationC26277OooOoOO) oooO0O0.f88129OooO00o), OooOoo0(), this.f89765Oooo00o.get(), OooOo(), this.f89984o0ooOoO.get(), OooO(), OooOOoo(), Oooo00O(), Oooo0(), this.f89972o00ooo.get(), Oooo000(), this.f89987oo000o.get(), OooOOO0(), this.f89753OooOo0o.get(), this.f89774OoooO00.get(), this.f89733OooO0OO.get(), Oooo0O0(), this.f89982o0ooOO0.get(), OooOOo0(), OooOO0o(), this.f89796o000000O.get(), OooOooo(), (AbstractApplicationC26277OooOoOO) oooO0O0.f88129OooO00o);
    }

    public final C26983OooOO0O OooOo0o() {
        return new C26983OooOO0O(new C26979OooO0o0(this.f89962o00OoOoo.get(), this.f89965o00Ooo00.get()), new C26981OooO0oo(this.f89964o00Ooo0.get()));
    }

    public final C27881OooOO0O OooOoO() {
        return new C27881OooOO0O(this.f89753OooOo0o.get(), this.f89895o00O0O.get(), this.f89735OooO0o.get(), Oooo0o0());
    }

    public final C27869OooOOO OooOoO0() {
        return new C27869OooOOO(OooOo(), this.f89895o00O0O.get(), this.f89735OooO0o.get(), Oooo0o0());
    }

    public final C27020OooOoO0 OooOoOO() {
        return new C27020OooOoO0(this.f89737OooO0oO.get(), this.f89738OooO0oo.get(), this.f89730OooO.get());
    }

    public final C26433OoooO0 OooOoo() {
        return new C26433OoooO0(new C26424Oooo(this.f89954o00Oo0oO.get(), this.f89955o00Oo0oo.get()), new C26429Oooo0o());
    }

    public final C26427Oooo0O0 OooOoo0() {
        return new C26427Oooo0O0((AbstractApplicationC26277OooOoOO) this.f89731OooO00o.f88129OooO00o, this.f89746OooOOo.get(), this.f89748OooOOoo.get());
    }

    public final C24378OooOoO0 OooOooO() {
        return new C24378OooOoO0(this.f89768Oooo0o.get(), this.f89770Oooo0oO.get());
    }

    public final C27994OooOOOO OooOooo() {
        return new C27994OooOOOO(OooOooO(), this.f89895o00O0O.get(), this.f89735OooO0o.get(), Oooo0o0(), OooOO0(), OooOoO0());
    }

    public final C27095OooOo0O Oooo0() {
        return new C27095OooOo0O(this.f89742OooOOO.get(), this.f89745OooOOOo.get(), this.f89747OooOOo0.get(), this.f89740OooOO0O.get());
    }

    public final C26649o00OoooO Oooo000() {
        return new C26649o00OoooO(this.f89762Oooo0.get(), this.f89766Oooo0O0.get());
    }

    public final C26264OooOOO0 Oooo00O() {
        return new C26264OooOOO0(this.f89767Oooo0OO.get(), this.f89769Oooo0o0.get());
    }

    public final C27545o00o0oo0 Oooo00o() {
        return new C27545o00o0oo0((AbstractApplicationC26277OooOoOO) this.f89731OooO00o.f88129OooO00o, OooOo0O(), OooOoO(), OooOOOo(), this.f89818o0000o0o.get(), Oooo0O0(), this.f89765Oooo00o.get(), OooOOoo(), Oooo00O(), OooOooO(), Oooo000(), OooO(), OooOo(), this.f89822o0000oOo.get(), this.f89804o00000oo.get(), this.f89792o000.get(), this.f89801o00000Oo.get());
    }

    public final C27585o00ooO0 Oooo0O0() {
        C26665o00o0O00 c26665o00o0O00 = this.f89765Oooo00o.get();
        C26596o00O0o0 c26596o00O0o0OooOOoo = OooOOoo();
        C26264OooOOO0 c26264OooOOO0Oooo00O = Oooo00O();
        C26515OooooO0 c26515OooooO0OooOOO0 = OooOOO0();
        C24378OooOoO0 c24378OooOoO0OooOooO = OooOooO();
        C26649o00OoooO c26649o00OoooOOooo000 = Oooo000();
        C27020OooOoO0 c27020OooOoO0OooOoOO = OooOoOO();
        C26427Oooo0O0 c26427Oooo0O0OooOoo0 = OooOoo0();
        C28009OooOOOO c28009OooOOOOOooOOOO = OooOOOO();
        C27129OoooOOO c27129OoooOOOOooo0o0 = Oooo0o0();
        InterfaceC27313OooOoo0 interfaceC27313OooOoo0 = this.f89895o00O0O.get();
        InterfaceC27309OooOoO interfaceC27309OooOoO = this.f89735OooO0o.get();
        o0O000o.OooO0O0 oooO0O0 = this.f89731OooO00o;
        return new C27585o00ooO0(c26665o00o0O00, c26596o00O0o0OooOOoo, c26264OooOOO0Oooo00O, c26515OooooO0OooOOO0, c24378OooOoO0OooOooO, c26649o00OoooOOooo000, c27020OooOoO0OooOoOO, c26427Oooo0O0OooOoo0, c28009OooOOOOOooOOOO, c27129OoooOOOOooo0o0, interfaceC27313OooOoo0, interfaceC27309OooOoO, new C26681o00o0oOO((AbstractApplicationC26277OooOoOO) oooO0O0.f88129OooO00o), this.f89753OooOo0o.get(), this.f89774OoooO00.get(), (AbstractApplicationC26277OooOoOO) oooO0O0.f88129OooO00o);
    }

    public final o0OOOO0.OooO0o Oooo0OO() {
        return new o0OOOO0.OooO0o(new o0OOOO0.OooO00o(this.f89942o00OOooO.get(), this.f89740OooOO0O.get()), new C27084OooO0o0(this.f89740OooOO0O.get()));
    }

    public final C27129OoooOOO Oooo0o0() {
        o0000o0O.OooOO0<AbstractC24338OooO0o0> oooOO02 = this.f89743OooOOO0.get();
        o0000o0O.OooOO0<AbstractC24338OooO0o0> oooOO03 = this.f89740OooOO0O.get();
        o0O0O0Oo userDao = this.f89772OoooO.get();
        UserMapper mapper = this.f89776OoooOO0.get();
        kotlin.jvm.internal.OooOOO0.OooO0oO(userDao, "userDao");
        kotlin.jvm.internal.OooOOO0.OooO0oO(mapper, "mapper");
        C25086OooOo0O c25086OooOo0O = new C25086OooOo0O();
        c25086OooOo0O.f85155OooO00o = userDao;
        c25086OooOo0O.f85156OooO0O0 = mapper;
        AbstractApplicationC26277OooOoOO abstractApplicationC26277OooOoOO = (AbstractApplicationC26277OooOoOO) this.f89731OooO00o.f88129OooO00o;
        return new C27129OoooOOO(oooOO02, oooOO03, c25086OooOo0O, new C27119Oooo0OO(abstractApplicationC26277OooOoOO, this.f89779OoooOo0.get()), new C27099OooO0oo(this.f89780OoooOoO.get(), abstractApplicationC26277OooOoOO), this.f89782Ooooo00.get(), new o0OOOO0o.OooOOOO(this.f89783Ooooo0o.get(), abstractApplicationC26277OooOoOO), new o0OOOO0o.o00000O0(this.f89784OooooO0.get()));
    }
}
