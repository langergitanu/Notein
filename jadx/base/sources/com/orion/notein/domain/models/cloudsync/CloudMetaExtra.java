package com.orion.notein.domain.models.cloudsync;

import androidx.concurrent.futures.OooO00o;
import com.aspose.slides.internal.p332p7.OooO0o;
import com.orion.notein.domain.models.folder.Folder;
import com.orion.notein.domain.models.note.NoteMeta;
import com.orion.notein.domain.models.papertheme.MyTemplate;
import kotlin.Metadata;
import kotlin.jvm.internal.C24018OooO0oo;
import kotlin.jvm.internal.OooOOO0;
import oO0o.InterfaceC33531OooO0o0;
import oO0o0O0o.C33599OooOo0O;
import oO0o0ooO.InterfaceC33908OooO;
import oO0o0ooO.InterfaceC33911OooO0OO;
import oO0oO00.C33940OooO0oo;
import oO0oO00.C33971OoooO;
import oO0oO00.C33983OooooO0;
import oO0oO00.o000000O;
import oO0oO00.o00000OO;
import oO0oO000.OooO0O0;

/* JADX INFO: loaded from: classes9.dex */
@InterfaceC33908OooO
@Metadata(m80611d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b#\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u001b\b\u0087\b\u0018\u0000 [2\u00020\u0001:\u0002[\\BÓ\u0001\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\t\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\t\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u0011\u0012\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u0011\u0012\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\t\u0012\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\t\u0012\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0017\u0010\u0018BÅ\u0001\b\u0010\u0012\u0006\u0010\u0019\u001a\u00020\u0011\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\f\u001a\u0004\u0018\u00010\t\u0012\b\u0010\r\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011\u0012\b\u0010\u0013\u001a\u0004\u0018\u00010\u0011\u0012\b\u0010\u0014\u001a\u0004\u0018\u00010\t\u0012\b\u0010\u0015\u001a\u0004\u0018\u00010\t\u0012\b\u0010\u0016\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u001b\u001a\u0004\u0018\u00010\u001a¢\u0006\u0004\b\u0017\u0010\u001cJ\u0019\u0010\u001e\u001a\u0004\u0018\u00010\u00022\b\u0010\u001d\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u001e\u0010\u001fJ\u0012\u0010 \u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b \u0010!J\u0012\u0010\"\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\"\u0010!J\u0012\u0010#\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b#\u0010!J\u0012\u0010$\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0004\b$\u0010%J\u0012\u0010&\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b&\u0010!J\u0012\u0010'\u001a\u0004\u0018\u00010\tHÆ\u0003¢\u0006\u0004\b'\u0010(J\u0012\u0010)\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b)\u0010!J\u0012\u0010*\u001a\u0004\u0018\u00010\tHÆ\u0003¢\u0006\u0004\b*\u0010(J\u0012\u0010+\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b+\u0010!J\u0012\u0010,\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0004\b,\u0010%J\u0012\u0010-\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0004\b-\u0010%J\u0012\u0010.\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0004\b.\u0010%J\u0012\u0010/\u001a\u0004\u0018\u00010\u0011HÆ\u0003¢\u0006\u0004\b/\u00100J\u0012\u00101\u001a\u0004\u0018\u00010\u0011HÆ\u0003¢\u0006\u0004\b1\u00100J\u0012\u00102\u001a\u0004\u0018\u00010\tHÆ\u0003¢\u0006\u0004\b2\u0010(J\u0012\u00103\u001a\u0004\u0018\u00010\tHÆ\u0003¢\u0006\u0004\b3\u0010(J\u0012\u00104\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b4\u0010!JÜ\u0001\u00105\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u00112\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u00112\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u0002HÆ\u0001¢\u0006\u0004\b5\u00106J\u0010\u00107\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b7\u0010!J\u0010\u00108\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b8\u00109J\u001a\u0010;\u001a\u00020\t2\b\u0010:\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b;\u0010<J'\u0010E\u001a\u00020B2\u0006\u0010=\u001a\u00020\u00002\u0006\u0010?\u001a\u00020>2\u0006\u0010A\u001a\u00020@H\u0001¢\u0006\u0004\bC\u0010DR\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010F\u001a\u0004\bG\u0010!R\u0019\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010F\u001a\u0004\bH\u0010!R\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0005\u0010F\u001a\u0004\bI\u0010!R\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u0010J\u001a\u0004\bK\u0010%R\u0019\u0010\b\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\b\u0010F\u001a\u0004\bL\u0010!R\u0019\u0010\n\u001a\u0004\u0018\u00010\t8\u0006¢\u0006\f\n\u0004\b\n\u0010M\u001a\u0004\bN\u0010(R\u0019\u0010\u000b\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u000b\u0010F\u001a\u0004\bO\u0010!R\u0019\u0010\f\u001a\u0004\u0018\u00010\t8\u0006¢\u0006\f\n\u0004\b\f\u0010M\u001a\u0004\bP\u0010(R\u0019\u0010\r\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\r\u0010F\u001a\u0004\bQ\u0010!R\u0019\u0010\u000e\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b\u000e\u0010J\u001a\u0004\bR\u0010%R\u0019\u0010\u000f\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b\u000f\u0010J\u001a\u0004\bS\u0010%R\u0019\u0010\u0010\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b\u0010\u0010J\u001a\u0004\bT\u0010%R\u0019\u0010\u0012\u001a\u0004\u0018\u00010\u00118\u0006¢\u0006\f\n\u0004\b\u0012\u0010U\u001a\u0004\bV\u00100R\u0019\u0010\u0013\u001a\u0004\u0018\u00010\u00118\u0006¢\u0006\f\n\u0004\b\u0013\u0010U\u001a\u0004\bW\u00100R\u0019\u0010\u0014\u001a\u0004\u0018\u00010\t8\u0006¢\u0006\f\n\u0004\b\u0014\u0010M\u001a\u0004\bX\u0010(R\u0019\u0010\u0015\u001a\u0004\u0018\u00010\t8\u0006¢\u0006\f\n\u0004\b\u0015\u0010M\u001a\u0004\bY\u0010(R\u0019\u0010\u0016\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0016\u0010F\u001a\u0004\bZ\u0010!¨\u0006]"}, m80612d2 = {"Lcom/orion/notein/domain/models/cloudsync/CloudMetaExtra;", "", "", NoteMeta.PROPERTY_NOTE_ID, MyTemplate.PROPERTY_TEMPLATE_ID, Folder.PROPERTY_FOLDER_ID, "", NoteMeta.PROPERTY_LAST_MODIFICATION_TIME, NoteMeta.PROPERTY_PARENT_ID, "", NoteMeta.PROPERTY_FAVORITE, NoteMeta.PROPERTY_TITLE, NoteMeta.PROPERTY_IN_TRASH_BIN, "mimeType", "recycledTime", "createdTime", "editedTime", "", "noteContentVersion", "sortKey", "usingOwnPdf", "lockAdded", "extra", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Long;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/Long;Ljava/lang/Long;Ljava/lang/Long;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/String;)V", "seen0", "LoO0oO00/o000000O;", "serializationConstructorMarker", "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Long;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/Long;Ljava/lang/Long;Ljava/lang/Long;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/String;LoO0oO00/o000000O;)V", "default", "resolvedParentId", "(Ljava/lang/String;)Ljava/lang/String;", "component1", "()Ljava/lang/String;", "component2", "component3", "component4", "()Ljava/lang/Long;", "component5", "component6", "()Ljava/lang/Boolean;", "component7", "component8", "component9", "component10", "component11", "component12", "component13", "()Ljava/lang/Integer;", "component14", "component15", "component16", "component17", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Long;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/Long;Ljava/lang/Long;Ljava/lang/Long;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/String;)Lcom/orion/notein/domain/models/cloudsync/CloudMetaExtra;", "toString", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "self", "LoO0oO000/OooO0O0;", "output", "LoO0o/OooO0o0;", "serialDesc", "LoO00ooO/OooOooO;", "write$Self$app_google_playRelease", "(Lcom/orion/notein/domain/models/cloudsync/CloudMetaExtra;LoO0oO000/OooO0O0;LoO0o/OooO0o0;)V", "write$Self", "Ljava/lang/String;", "getNoteId", "getTemplateId", "getFolderId", "Ljava/lang/Long;", "getLastModificationTime", "getParentId", "Ljava/lang/Boolean;", "getFavorite", "getTitle", "getInTrashBin", "getMimeType", "getRecycledTime", "getCreatedTime", "getEditedTime", "Ljava/lang/Integer;", "getNoteContentVersion", "getSortKey", "getUsingOwnPdf", "getLockAdded", "getExtra", "Companion", "$serializer", "app_google_playRelease"}, m80613k = 1, m80614mv = {2, 1, 0}, m80616xi = 48)
public final /* data */ class CloudMetaExtra {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final String DEFINE_NON_PARENT_ID = "null";
    private final Long createdTime;
    private final Long editedTime;
    private final String extra;
    private final Boolean favorite;
    private final String folderId;
    private final Boolean inTrashBin;
    private final Long lastModificationTime;
    private final Boolean lockAdded;
    private final String mimeType;
    private final Integer noteContentVersion;
    private final String noteId;
    private final String parentId;
    private final Long recycledTime;
    private final Integer sortKey;
    private final String templateId;
    private final String title;
    private final Boolean usingOwnPdf;

    @Metadata(m80611d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0015\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\bJ\u0015\u0010\u000b\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u000b\u0010\fJ\u0015\u0010\u000f\u001a\u00020\u00062\u0006\u0010\u000e\u001a\u00020\r¢\u0006\u0004\b\u000f\u0010\u0010J\u0013\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00060\u0011¢\u0006\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0015\u001a\u00020\u00148\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016¨\u0006\u0017"}, m80612d2 = {"Lcom/orion/notein/domain/models/cloudsync/CloudMetaExtra$Companion;", "", "<init>", "()V", "Lcom/orion/notein/domain/models/note/NoteMeta;", "noteMeta", "Lcom/orion/notein/domain/models/cloudsync/CloudMetaExtra;", "fromNoteMeta", "(Lcom/orion/notein/domain/models/note/NoteMeta;)Lcom/orion/notein/domain/models/cloudsync/CloudMetaExtra;", "Lcom/orion/notein/domain/models/folder/Folder;", "folder", "fromFolder", "(Lcom/orion/notein/domain/models/folder/Folder;)Lcom/orion/notein/domain/models/cloudsync/CloudMetaExtra;", "Lcom/orion/notein/domain/models/papertheme/MyTemplate;", "template", "fromTemplate", "(Lcom/orion/notein/domain/models/papertheme/MyTemplate;)Lcom/orion/notein/domain/models/cloudsync/CloudMetaExtra;", "LoO0o0ooO/OooO0OO;", "serializer", "()LoO0o0ooO/OooO0OO;", "", "DEFINE_NON_PARENT_ID", "Ljava/lang/String;", "app_google_playRelease"}, m80613k = 1, m80614mv = {2, 1, 0}, m80616xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(C24018OooO0oo c24018OooO0oo) {
            this();
        }

        public final CloudMetaExtra fromFolder(Folder folder) {
            OooOOO0.OooO0oO(folder, "folder");
            String id = folder.getId();
            long lastModificationTime = folder.getLastModificationTime();
            String parentId = folder.getParentId();
            if (parentId == null) {
                parentId = CloudMetaExtra.DEFINE_NON_PARENT_ID;
            }
            String str = parentId;
            String title = folder.getTitle();
            boolean inTrashBin = folder.getInTrashBin();
            boolean favorite = folder.getFavorite();
            long creationTime = folder.getCreationTime();
            long lastModificationTime2 = folder.getLastModificationTime();
            return new CloudMetaExtra((String) null, (String) null, id, Long.valueOf(lastModificationTime), str, Boolean.valueOf(favorite), title, Boolean.valueOf(inTrashBin), CloudMime.FOLDER, (Long) null, Long.valueOf(creationTime), Long.valueOf(lastModificationTime2), (Integer) null, (Integer) null, (Boolean) null, (Boolean) null, (String) null, 61955, (C24018OooO0oo) null);
        }

        public final CloudMetaExtra fromNoteMeta(NoteMeta noteMeta) {
            OooOOO0.OooO0oO(noteMeta, "noteMeta");
            long j = 1000;
            long lastModificationTime = (noteMeta.getLastModificationTime() / j) * j;
            String id = noteMeta.getId();
            String parentId = noteMeta.getParentId();
            String parentId2 = noteMeta.getParentId();
            if (parentId2 == null) {
                parentId2 = CloudMetaExtra.DEFINE_NON_PARENT_ID;
            }
            String str = parentId2;
            boolean favorite = noteMeta.getFavorite();
            String title = noteMeta.getTitle();
            boolean inTrashBin = noteMeta.getInTrashBin();
            long creationTime = noteMeta.getCreationTime();
            return new CloudMetaExtra(id, (String) null, parentId, Long.valueOf(lastModificationTime), str, Boolean.valueOf(favorite), title, Boolean.valueOf(inTrashBin), CloudMime.NOTE, (Long) null, Long.valueOf(creationTime), Long.valueOf(lastModificationTime), (Integer) 25, noteMeta.getSortKey(), Boolean.valueOf(noteMeta.getUsingOwnPdf()), Boolean.valueOf(noteMeta.getLockAdded()), (String) null, 514, (C24018OooO0oo) null);
        }

        public final CloudMetaExtra fromTemplate(MyTemplate template) {
            OooOOO0.OooO0oO(template, "template");
            String id = template.getId();
            long lastModificationTime = template.getLastModificationTime();
            String name = template.getName();
            long creationTime = template.getCreationTime();
            long lastModificationTime2 = template.getLastModificationTime();
            return new CloudMetaExtra((String) null, id, (String) null, Long.valueOf(lastModificationTime), (String) null, (Boolean) null, name, (Boolean) null, CloudMime.TEMPLATE, (Long) null, Long.valueOf(creationTime), Long.valueOf(lastModificationTime2), (Integer) null, (Integer) null, (Boolean) null, (Boolean) null, (String) null, 127669, (C24018OooO0oo) null);
        }

        public final InterfaceC33911OooO0OO<CloudMetaExtra> serializer() {
            return CloudMetaExtra$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    public CloudMetaExtra() {
        this((String) null, (String) null, (String) null, (Long) null, (String) null, (Boolean) null, (String) null, (Boolean) null, (String) null, (Long) null, (Long) null, (Long) null, (Integer) null, (Integer) null, (Boolean) null, (Boolean) null, (String) null, 131071, (C24018OooO0oo) null);
    }

    public static /* synthetic */ CloudMetaExtra copy$default(CloudMetaExtra cloudMetaExtra, String str, String str2, String str3, Long l, String str4, Boolean bool, String str5, Boolean bool2, String str6, Long l2, Long l3, Long l4, Integer num, Integer num2, Boolean bool3, Boolean bool4, String str7, int i, Object obj) {
        String str8;
        Boolean bool5;
        String str9;
        CloudMetaExtra cloudMetaExtra2;
        Boolean bool6;
        String str10;
        String str11;
        Long l5;
        String str12;
        Boolean bool7;
        String str13;
        Boolean bool8;
        String str14;
        Long l6;
        Long l7;
        Long l8;
        Integer num3;
        Integer num4;
        String str15 = (i & 1) != 0 ? cloudMetaExtra.noteId : str;
        String str16 = (i & 2) != 0 ? cloudMetaExtra.templateId : str2;
        String str17 = (i & 4) != 0 ? cloudMetaExtra.folderId : str3;
        Long l9 = (i & 8) != 0 ? cloudMetaExtra.lastModificationTime : l;
        String str18 = (i & 16) != 0 ? cloudMetaExtra.parentId : str4;
        Boolean bool9 = (i & 32) != 0 ? cloudMetaExtra.favorite : bool;
        String str19 = (i & 64) != 0 ? cloudMetaExtra.title : str5;
        Boolean bool10 = (i & 128) != 0 ? cloudMetaExtra.inTrashBin : bool2;
        String str20 = (i & 256) != 0 ? cloudMetaExtra.mimeType : str6;
        Long l10 = (i & 512) != 0 ? cloudMetaExtra.recycledTime : l2;
        Long l11 = (i & 1024) != 0 ? cloudMetaExtra.createdTime : l3;
        Long l12 = (i & 2048) != 0 ? cloudMetaExtra.editedTime : l4;
        Integer num5 = (i & 4096) != 0 ? cloudMetaExtra.noteContentVersion : num;
        Integer num6 = (i & 8192) != 0 ? cloudMetaExtra.sortKey : num2;
        String str21 = str15;
        Boolean bool11 = (i & 16384) != 0 ? cloudMetaExtra.usingOwnPdf : bool3;
        Boolean bool12 = (i & 32768) != 0 ? cloudMetaExtra.lockAdded : bool4;
        if ((i & 65536) != 0) {
            bool5 = bool12;
            str8 = cloudMetaExtra.extra;
            bool6 = bool11;
            str10 = str16;
            str11 = str17;
            l5 = l9;
            str12 = str18;
            bool7 = bool9;
            str13 = str19;
            bool8 = bool10;
            str14 = str20;
            l6 = l10;
            l7 = l11;
            l8 = l12;
            num3 = num5;
            num4 = num6;
            str9 = str21;
            cloudMetaExtra2 = cloudMetaExtra;
        } else {
            str8 = str7;
            bool5 = bool12;
            str9 = str21;
            cloudMetaExtra2 = cloudMetaExtra;
            bool6 = bool11;
            str10 = str16;
            str11 = str17;
            l5 = l9;
            str12 = str18;
            bool7 = bool9;
            str13 = str19;
            bool8 = bool10;
            str14 = str20;
            l6 = l10;
            l7 = l11;
            l8 = l12;
            num3 = num5;
            num4 = num6;
        }
        return cloudMetaExtra2.copy(str9, str10, str11, l5, str12, bool7, str13, bool8, str14, l6, l7, l8, num3, num4, bool6, bool5, str8);
    }

    public static final /* synthetic */ void write$Self$app_google_playRelease(CloudMetaExtra self, OooO0O0 output, InterfaceC33531OooO0o0 serialDesc) {
        if (output.OooOoO0(serialDesc) || self.noteId != null) {
            output.OooOo(serialDesc, 0, o00000OO.f122230OooO00o, self.noteId);
        }
        if (output.OooOoO0(serialDesc) || self.templateId != null) {
            output.OooOo(serialDesc, 1, o00000OO.f122230OooO00o, self.templateId);
        }
        if (output.OooOoO0(serialDesc) || self.folderId != null) {
            output.OooOo(serialDesc, 2, o00000OO.f122230OooO00o, self.folderId);
        }
        if (output.OooOoO0(serialDesc) || self.lastModificationTime != null) {
            output.OooOo(serialDesc, 3, C33983OooooO0.f122206OooO00o, self.lastModificationTime);
        }
        if (output.OooOoO0(serialDesc) || self.parentId != null) {
            output.OooOo(serialDesc, 4, o00000OO.f122230OooO00o, self.parentId);
        }
        if (output.OooOoO0(serialDesc) || self.favorite != null) {
            output.OooOo(serialDesc, 5, C33940OooO0oo.f122144OooO00o, self.favorite);
        }
        if (output.OooOoO0(serialDesc) || self.title != null) {
            output.OooOo(serialDesc, 6, o00000OO.f122230OooO00o, self.title);
        }
        if (output.OooOoO0(serialDesc) || self.inTrashBin != null) {
            output.OooOo(serialDesc, 7, C33940OooO0oo.f122144OooO00o, self.inTrashBin);
        }
        if (output.OooOoO0(serialDesc) || self.mimeType != null) {
            output.OooOo(serialDesc, 8, o00000OO.f122230OooO00o, self.mimeType);
        }
        if (output.OooOoO0(serialDesc) || self.recycledTime != null) {
            output.OooOo(serialDesc, 9, C33983OooooO0.f122206OooO00o, self.recycledTime);
        }
        if (output.OooOoO0(serialDesc) || self.createdTime != null) {
            output.OooOo(serialDesc, 10, C33983OooooO0.f122206OooO00o, self.createdTime);
        }
        if (output.OooOoO0(serialDesc) || self.editedTime != null) {
            output.OooOo(serialDesc, 11, C33983OooooO0.f122206OooO00o, self.editedTime);
        }
        if (output.OooOoO0(serialDesc) || self.noteContentVersion != null) {
            output.OooOo(serialDesc, 12, C33971OoooO.f122193OooO00o, self.noteContentVersion);
        }
        if (output.OooOoO0(serialDesc) || self.sortKey != null) {
            output.OooOo(serialDesc, 13, C33971OoooO.f122193OooO00o, self.sortKey);
        }
        if (output.OooOoO0(serialDesc) || self.usingOwnPdf != null) {
            output.OooOo(serialDesc, 14, C33940OooO0oo.f122144OooO00o, self.usingOwnPdf);
        }
        if (output.OooOoO0(serialDesc) || self.lockAdded != null) {
            output.OooOo(serialDesc, 15, C33940OooO0oo.f122144OooO00o, self.lockAdded);
        }
        if (!output.OooOoO0(serialDesc) && self.extra == null) {
            return;
        }
        output.OooOo(serialDesc, 16, o00000OO.f122230OooO00o, self.extra);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getNoteId() {
        return this.noteId;
    }

    /* JADX INFO: renamed from: component10, reason: from getter */
    public final Long getRecycledTime() {
        return this.recycledTime;
    }

    /* JADX INFO: renamed from: component11, reason: from getter */
    public final Long getCreatedTime() {
        return this.createdTime;
    }

    /* JADX INFO: renamed from: component12, reason: from getter */
    public final Long getEditedTime() {
        return this.editedTime;
    }

    /* JADX INFO: renamed from: component13, reason: from getter */
    public final Integer getNoteContentVersion() {
        return this.noteContentVersion;
    }

    /* JADX INFO: renamed from: component14, reason: from getter */
    public final Integer getSortKey() {
        return this.sortKey;
    }

    /* JADX INFO: renamed from: component15, reason: from getter */
    public final Boolean getUsingOwnPdf() {
        return this.usingOwnPdf;
    }

    /* JADX INFO: renamed from: component16, reason: from getter */
    public final Boolean getLockAdded() {
        return this.lockAdded;
    }

    /* JADX INFO: renamed from: component17, reason: from getter */
    public final String getExtra() {
        return this.extra;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getTemplateId() {
        return this.templateId;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getFolderId() {
        return this.folderId;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final Long getLastModificationTime() {
        return this.lastModificationTime;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final String getParentId() {
        return this.parentId;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final Boolean getFavorite() {
        return this.favorite;
    }

    /* JADX INFO: renamed from: component7, reason: from getter */
    public final String getTitle() {
        return this.title;
    }

    /* JADX INFO: renamed from: component8, reason: from getter */
    public final Boolean getInTrashBin() {
        return this.inTrashBin;
    }

    /* JADX INFO: renamed from: component9, reason: from getter */
    public final String getMimeType() {
        return this.mimeType;
    }

    public final CloudMetaExtra copy(String noteId, String templateId, String folderId, Long lastModificationTime, String parentId, Boolean favorite, String title, Boolean inTrashBin, String mimeType, Long recycledTime, Long createdTime, Long editedTime, Integer noteContentVersion, Integer sortKey, Boolean usingOwnPdf, Boolean lockAdded, String extra) {
        return new CloudMetaExtra(noteId, templateId, folderId, lastModificationTime, parentId, favorite, title, inTrashBin, mimeType, recycledTime, createdTime, editedTime, noteContentVersion, sortKey, usingOwnPdf, lockAdded, extra);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof CloudMetaExtra)) {
            return false;
        }
        CloudMetaExtra cloudMetaExtra = (CloudMetaExtra) other;
        return OooOOO0.OooO0O0(this.noteId, cloudMetaExtra.noteId) && OooOOO0.OooO0O0(this.templateId, cloudMetaExtra.templateId) && OooOOO0.OooO0O0(this.folderId, cloudMetaExtra.folderId) && OooOOO0.OooO0O0(this.lastModificationTime, cloudMetaExtra.lastModificationTime) && OooOOO0.OooO0O0(this.parentId, cloudMetaExtra.parentId) && OooOOO0.OooO0O0(this.favorite, cloudMetaExtra.favorite) && OooOOO0.OooO0O0(this.title, cloudMetaExtra.title) && OooOOO0.OooO0O0(this.inTrashBin, cloudMetaExtra.inTrashBin) && OooOOO0.OooO0O0(this.mimeType, cloudMetaExtra.mimeType) && OooOOO0.OooO0O0(this.recycledTime, cloudMetaExtra.recycledTime) && OooOOO0.OooO0O0(this.createdTime, cloudMetaExtra.createdTime) && OooOOO0.OooO0O0(this.editedTime, cloudMetaExtra.editedTime) && OooOOO0.OooO0O0(this.noteContentVersion, cloudMetaExtra.noteContentVersion) && OooOOO0.OooO0O0(this.sortKey, cloudMetaExtra.sortKey) && OooOOO0.OooO0O0(this.usingOwnPdf, cloudMetaExtra.usingOwnPdf) && OooOOO0.OooO0O0(this.lockAdded, cloudMetaExtra.lockAdded) && OooOOO0.OooO0O0(this.extra, cloudMetaExtra.extra);
    }

    public final Long getCreatedTime() {
        return this.createdTime;
    }

    public final Long getEditedTime() {
        return this.editedTime;
    }

    public final String getExtra() {
        return this.extra;
    }

    public final Boolean getFavorite() {
        return this.favorite;
    }

    public final String getFolderId() {
        return this.folderId;
    }

    public final Boolean getInTrashBin() {
        return this.inTrashBin;
    }

    public final Long getLastModificationTime() {
        return this.lastModificationTime;
    }

    public final Boolean getLockAdded() {
        return this.lockAdded;
    }

    public final String getMimeType() {
        return this.mimeType;
    }

    public final Integer getNoteContentVersion() {
        return this.noteContentVersion;
    }

    public final String getNoteId() {
        return this.noteId;
    }

    public final String getParentId() {
        return this.parentId;
    }

    public final Long getRecycledTime() {
        return this.recycledTime;
    }

    public final Integer getSortKey() {
        return this.sortKey;
    }

    public final String getTemplateId() {
        return this.templateId;
    }

    public final String getTitle() {
        return this.title;
    }

    public final Boolean getUsingOwnPdf() {
        return this.usingOwnPdf;
    }

    public int hashCode() {
        String str = this.noteId;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.templateId;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.folderId;
        int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        Long l = this.lastModificationTime;
        int iHashCode4 = (iHashCode3 + (l == null ? 0 : l.hashCode())) * 31;
        String str4 = this.parentId;
        int iHashCode5 = (iHashCode4 + (str4 == null ? 0 : str4.hashCode())) * 31;
        Boolean bool = this.favorite;
        int iHashCode6 = (iHashCode5 + (bool == null ? 0 : bool.hashCode())) * 31;
        String str5 = this.title;
        int iHashCode7 = (iHashCode6 + (str5 == null ? 0 : str5.hashCode())) * 31;
        Boolean bool2 = this.inTrashBin;
        int iHashCode8 = (iHashCode7 + (bool2 == null ? 0 : bool2.hashCode())) * 31;
        String str6 = this.mimeType;
        int iHashCode9 = (iHashCode8 + (str6 == null ? 0 : str6.hashCode())) * 31;
        Long l2 = this.recycledTime;
        int iHashCode10 = (iHashCode9 + (l2 == null ? 0 : l2.hashCode())) * 31;
        Long l3 = this.createdTime;
        int iHashCode11 = (iHashCode10 + (l3 == null ? 0 : l3.hashCode())) * 31;
        Long l4 = this.editedTime;
        int iHashCode12 = (iHashCode11 + (l4 == null ? 0 : l4.hashCode())) * 31;
        Integer num = this.noteContentVersion;
        int iHashCode13 = (iHashCode12 + (num == null ? 0 : num.hashCode())) * 31;
        Integer num2 = this.sortKey;
        int iHashCode14 = (iHashCode13 + (num2 == null ? 0 : num2.hashCode())) * 31;
        Boolean bool3 = this.usingOwnPdf;
        int iHashCode15 = (iHashCode14 + (bool3 == null ? 0 : bool3.hashCode())) * 31;
        Boolean bool4 = this.lockAdded;
        int iHashCode16 = (iHashCode15 + (bool4 == null ? 0 : bool4.hashCode())) * 31;
        String str7 = this.extra;
        return iHashCode16 + (str7 != null ? str7.hashCode() : 0);
    }

    public final String resolvedParentId(String str) {
        String str2 = this.parentId;
        if (str2 == null || C33599OooOo0O.Oooo0o0(str2)) {
            return str;
        }
        if (OooOOO0.OooO0O0(this.parentId, DEFINE_NON_PARENT_ID)) {
            return null;
        }
        return this.parentId;
    }

    public String toString() {
        String str = this.noteId;
        String str2 = this.templateId;
        String str3 = this.folderId;
        Long l = this.lastModificationTime;
        String str4 = this.parentId;
        Boolean bool = this.favorite;
        String str5 = this.title;
        Boolean bool2 = this.inTrashBin;
        String str6 = this.mimeType;
        Long l2 = this.recycledTime;
        Long l3 = this.createdTime;
        Long l4 = this.editedTime;
        Integer num = this.noteContentVersion;
        Integer num2 = this.sortKey;
        Boolean bool3 = this.usingOwnPdf;
        Boolean bool4 = this.lockAdded;
        String str7 = this.extra;
        StringBuilder sbOooO0O0 = OooO0o.OooO0O0("CloudMetaExtra(noteId=", str, ", templateId=", str2, ", folderId=");
        sbOooO0O0.append(str3);
        sbOooO0O0.append(", lastModificationTime=");
        sbOooO0O0.append(l);
        sbOooO0O0.append(", parentId=");
        sbOooO0O0.append(str4);
        sbOooO0O0.append(", favorite=");
        sbOooO0O0.append(bool);
        sbOooO0O0.append(", title=");
        sbOooO0O0.append(str5);
        sbOooO0O0.append(", inTrashBin=");
        sbOooO0O0.append(bool2);
        sbOooO0O0.append(", mimeType=");
        sbOooO0O0.append(str6);
        sbOooO0O0.append(", recycledTime=");
        sbOooO0O0.append(l2);
        sbOooO0O0.append(", createdTime=");
        sbOooO0O0.append(l3);
        sbOooO0O0.append(", editedTime=");
        sbOooO0O0.append(l4);
        sbOooO0O0.append(", noteContentVersion=");
        sbOooO0O0.append(num);
        sbOooO0O0.append(", sortKey=");
        sbOooO0O0.append(num2);
        sbOooO0O0.append(", usingOwnPdf=");
        sbOooO0O0.append(bool3);
        sbOooO0O0.append(", lockAdded=");
        sbOooO0O0.append(bool4);
        sbOooO0O0.append(", extra=");
        return OooO00o.OooO0OO(sbOooO0O0, str7, ")");
    }

    public /* synthetic */ CloudMetaExtra(int i, String str, String str2, String str3, Long l, String str4, Boolean bool, String str5, Boolean bool2, String str6, Long l2, Long l3, Long l4, Integer num, Integer num2, Boolean bool3, Boolean bool4, String str7, o000000O o000000o2) {
        if ((i & 1) == 0) {
            this.noteId = null;
        } else {
            this.noteId = str;
        }
        if ((i & 2) == 0) {
            this.templateId = null;
        } else {
            this.templateId = str2;
        }
        if ((i & 4) == 0) {
            this.folderId = null;
        } else {
            this.folderId = str3;
        }
        if ((i & 8) == 0) {
            this.lastModificationTime = null;
        } else {
            this.lastModificationTime = l;
        }
        if ((i & 16) == 0) {
            this.parentId = null;
        } else {
            this.parentId = str4;
        }
        if ((i & 32) == 0) {
            this.favorite = null;
        } else {
            this.favorite = bool;
        }
        if ((i & 64) == 0) {
            this.title = null;
        } else {
            this.title = str5;
        }
        if ((i & 128) == 0) {
            this.inTrashBin = null;
        } else {
            this.inTrashBin = bool2;
        }
        if ((i & 256) == 0) {
            this.mimeType = null;
        } else {
            this.mimeType = str6;
        }
        if ((i & 512) == 0) {
            this.recycledTime = null;
        } else {
            this.recycledTime = l2;
        }
        if ((i & 1024) == 0) {
            this.createdTime = null;
        } else {
            this.createdTime = l3;
        }
        if ((i & 2048) == 0) {
            this.editedTime = null;
        } else {
            this.editedTime = l4;
        }
        if ((i & 4096) == 0) {
            this.noteContentVersion = null;
        } else {
            this.noteContentVersion = num;
        }
        if ((i & 8192) == 0) {
            this.sortKey = null;
        } else {
            this.sortKey = num2;
        }
        if ((i & 16384) == 0) {
            this.usingOwnPdf = null;
        } else {
            this.usingOwnPdf = bool3;
        }
        if ((32768 & i) == 0) {
            this.lockAdded = null;
        } else {
            this.lockAdded = bool4;
        }
        if ((i & 65536) == 0) {
            this.extra = null;
        } else {
            this.extra = str7;
        }
    }

    public CloudMetaExtra(String str, String str2, String str3, Long l, String str4, Boolean bool, String str5, Boolean bool2, String str6, Long l2, Long l3, Long l4, Integer num, Integer num2, Boolean bool3, Boolean bool4, String str7) {
        this.noteId = str;
        this.templateId = str2;
        this.folderId = str3;
        this.lastModificationTime = l;
        this.parentId = str4;
        this.favorite = bool;
        this.title = str5;
        this.inTrashBin = bool2;
        this.mimeType = str6;
        this.recycledTime = l2;
        this.createdTime = l3;
        this.editedTime = l4;
        this.noteContentVersion = num;
        this.sortKey = num2;
        this.usingOwnPdf = bool3;
        this.lockAdded = bool4;
        this.extra = str7;
    }

    public /* synthetic */ CloudMetaExtra(String str, String str2, String str3, Long l, String str4, Boolean bool, String str5, Boolean bool2, String str6, Long l2, Long l3, Long l4, Integer num, Integer num2, Boolean bool3, Boolean bool4, String str7, int i, C24018OooO0oo c24018OooO0oo) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : str3, (i & 8) != 0 ? null : l, (i & 16) != 0 ? null : str4, (i & 32) != 0 ? null : bool, (i & 64) != 0 ? null : str5, (i & 128) != 0 ? null : bool2, (i & 256) != 0 ? null : str6, (i & 512) != 0 ? null : l2, (i & 1024) != 0 ? null : l3, (i & 2048) != 0 ? null : l4, (i & 4096) != 0 ? null : num, (i & 8192) != 0 ? null : num2, (i & 16384) != 0 ? null : bool3, (i & 32768) != 0 ? null : bool4, (i & 65536) != 0 ? null : str7);
    }
}
