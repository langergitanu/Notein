package com.google.firebase.vertexai.type;

import Oooo0oO.C21111o0ooOoO;
import kotlin.Metadata;
import kotlin.jvm.internal.C24018OooO0oo;
import kotlin.jvm.internal.OooOOO0;
import o0000Ooo.C24242OooOOo;
import oO0o.InterfaceC33531OooO0o0;
import oO0o0ooO.InterfaceC33908OooO;
import oO0o0ooO.InterfaceC33911OooO0OO;
import oO0o0ooO.InterfaceC33916OooO0oo;
import oO0oO00.o000000O;
import oO0oO000.OooO0O0;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(m80611d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\u0018\u00002\u00020\u0001:\u0001\tB\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0002\u0010\u0005R\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\u0007¨\u0006\n"}, m80612d2 = {"Lcom/google/firebase/vertexai/type/FileDataPart;", "Lcom/google/firebase/vertexai/type/Part;", "uri", "", "mimeType", "(Ljava/lang/String;Ljava/lang/String;)V", "getMimeType", "()Ljava/lang/String;", "getUri", "Internal", "com.google.firebase-firebase-vertexai"}, m80613k = 1, m80614mv = {1, 8, 0}, m80616xi = 48)
public final class FileDataPart implements Part {
    private final String mimeType;
    private final String uri;

    @InterfaceC33908OooO
    @Metadata(m80611d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\n\b\u0081\b\u0018\u0000 %2\u00020\u0001:\u0003&%'B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005B'\b\u0017\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\n\b\u0001\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\u0004\u0010\nJ(\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u000b\u001a\u00020\u00002\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u000eHÇ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0013\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0013\u0010\u0014J\u001a\u0010\u0015\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0018\u001a\u00020\u0017HÖ\u0001¢\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u001a\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u001a\u0010\u001bJ\u001a\u0010\u001f\u001a\u00020\u001e2\b\u0010\u001d\u001a\u0004\u0018\u00010\u001cHÖ\u0003¢\u0006\u0004\b\u001f\u0010 R \u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0003\u0010!\u0012\u0004\b#\u0010$\u001a\u0004\b\"\u0010\u0014¨\u0006("}, m80612d2 = {"Lcom/google/firebase/vertexai/type/FileDataPart$Internal;", "Lcom/google/firebase/vertexai/type/InternalPart;", "Lcom/google/firebase/vertexai/type/FileDataPart$Internal$FileData;", "fileData", "<init>", "(Lcom/google/firebase/vertexai/type/FileDataPart$Internal$FileData;)V", "", "seen1", "LoO0oO00/o000000O;", "serializationConstructorMarker", "(ILcom/google/firebase/vertexai/type/FileDataPart$Internal$FileData;LoO0oO00/o000000O;)V", "self", "LoO0oO000/OooO0O0;", "output", "LoO0o/OooO0o0;", "serialDesc", "LoO00ooO/OooOooO;", "write$Self", "(Lcom/google/firebase/vertexai/type/FileDataPart$Internal;LoO0oO000/OooO0O0;LoO0o/OooO0o0;)V", "component1", "()Lcom/google/firebase/vertexai/type/FileDataPart$Internal$FileData;", "copy", "(Lcom/google/firebase/vertexai/type/FileDataPart$Internal$FileData;)Lcom/google/firebase/vertexai/type/FileDataPart$Internal;", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lcom/google/firebase/vertexai/type/FileDataPart$Internal$FileData;", "getFileData", "getFileData$annotations", "()V", "Companion", "$serializer", "FileData", "com.google.firebase-firebase-vertexai"}, m80613k = 1, m80614mv = {1, 8, 0}, m80616xi = 48)
    public static final /* data */ class Internal implements InternalPart {

        /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);
        private final FileData fileData;

        @Metadata(m80611d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0016\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0001¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, m80612d2 = {"Lcom/google/firebase/vertexai/type/FileDataPart$Internal$Companion;", "", "<init>", "()V", "LoO0o0ooO/OooO0OO;", "Lcom/google/firebase/vertexai/type/FileDataPart$Internal;", "serializer", "()LoO0o0ooO/OooO0OO;", "com.google.firebase-firebase-vertexai"}, m80613k = 1, m80614mv = {1, 8, 0}, m80616xi = 48)
        public static final class Companion {
            public /* synthetic */ Companion(C24018OooO0oo c24018OooO0oo) {
                this();
            }

            public final InterfaceC33911OooO0OO<Internal> serializer() {
                return FileDataPart$Internal$$serializer.INSTANCE;
            }

            private Companion() {
            }
        }

        @InterfaceC33908OooO
        @Metadata(m80611d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u000b\n\u0002\b\u000b\b\u0081\b\u0018\u0000 &2\u00020\u0001:\u0002'&B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006B3\b\u0017\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\n\b\u0001\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0001\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\u0005\u0010\u000bJ(\u0010\u0012\u001a\u00020\u00112\u0006\u0010\f\u001a\u00020\u00002\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u000fHÇ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0014\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0016\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0016\u0010\u0015J$\u0010\u0017\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u0019\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0019\u0010\u0015J\u0010\u0010\u001a\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\u001a\u0010\u001bJ\u001a\u0010\u001e\u001a\u00020\u001d2\b\u0010\u001c\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u001e\u0010\u001fR \u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0003\u0010 \u0012\u0004\b\"\u0010#\u001a\u0004\b!\u0010\u0015R \u0010\u0004\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0004\u0010 \u0012\u0004\b%\u0010#\u001a\u0004\b$\u0010\u0015¨\u0006("}, m80612d2 = {"Lcom/google/firebase/vertexai/type/FileDataPart$Internal$FileData;", "", "", "mimeType", "fileUri", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "", "seen1", "LoO0oO00/o000000O;", "serializationConstructorMarker", "(ILjava/lang/String;Ljava/lang/String;LoO0oO00/o000000O;)V", "self", "LoO0oO000/OooO0O0;", "output", "LoO0o/OooO0o0;", "serialDesc", "LoO00ooO/OooOooO;", "write$Self", "(Lcom/google/firebase/vertexai/type/FileDataPart$Internal$FileData;LoO0oO000/OooO0O0;LoO0o/OooO0o0;)V", "component1", "()Ljava/lang/String;", "component2", "copy", "(Ljava/lang/String;Ljava/lang/String;)Lcom/google/firebase/vertexai/type/FileDataPart$Internal$FileData;", "toString", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getMimeType", "getMimeType$annotations", "()V", "getFileUri", "getFileUri$annotations", "Companion", "$serializer", "com.google.firebase-firebase-vertexai"}, m80613k = 1, m80614mv = {1, 8, 0}, m80616xi = 48)
        public static final /* data */ class FileData {

            /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
            public static final Companion INSTANCE = new Companion(null);
            private final String fileUri;
            private final String mimeType;

            @Metadata(m80611d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0016\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0001¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, m80612d2 = {"Lcom/google/firebase/vertexai/type/FileDataPart$Internal$FileData$Companion;", "", "<init>", "()V", "LoO0o0ooO/OooO0OO;", "Lcom/google/firebase/vertexai/type/FileDataPart$Internal$FileData;", "serializer", "()LoO0o0ooO/OooO0OO;", "com.google.firebase-firebase-vertexai"}, m80613k = 1, m80614mv = {1, 8, 0}, m80616xi = 48)
            public static final class Companion {
                public /* synthetic */ Companion(C24018OooO0oo c24018OooO0oo) {
                    this();
                }

                public final InterfaceC33911OooO0OO<FileData> serializer() {
                    return FileDataPart$Internal$FileData$$serializer.INSTANCE;
                }

                private Companion() {
                }
            }

            public /* synthetic */ FileData(int i, @InterfaceC33916OooO0oo("mime_type") String str, @InterfaceC33916OooO0oo("file_uri") String str2, o000000O o000000o2) {
                if (3 != (i & 3)) {
                    C24242OooOOo.OooO0O0(i, 3, FileDataPart$Internal$FileData$$serializer.INSTANCE.getDescriptor());
                    throw null;
                }
                this.mimeType = str;
                this.fileUri = str2;
            }

            public static /* synthetic */ FileData copy$default(FileData fileData, String str, String str2, int i, Object obj) {
                if ((i & 1) != 0) {
                    str = fileData.mimeType;
                }
                if ((i & 2) != 0) {
                    str2 = fileData.fileUri;
                }
                return fileData.copy(str, str2);
            }

            @InterfaceC33916OooO0oo("file_uri")
            public static /* synthetic */ void getFileUri$annotations() {
            }

            @InterfaceC33916OooO0oo("mime_type")
            public static /* synthetic */ void getMimeType$annotations() {
            }

            public static final /* synthetic */ void write$Self(FileData self, OooO0O0 output, InterfaceC33531OooO0o0 serialDesc) {
                output.OooOO0o(serialDesc, 0, self.mimeType);
                output.OooOO0o(serialDesc, 1, self.fileUri);
            }

            /* JADX INFO: renamed from: component1, reason: from getter */
            public final String getMimeType() {
                return this.mimeType;
            }

            /* JADX INFO: renamed from: component2, reason: from getter */
            public final String getFileUri() {
                return this.fileUri;
            }

            public final FileData copy(String mimeType, String fileUri) {
                OooOOO0.OooO0oO(mimeType, "mimeType");
                OooOOO0.OooO0oO(fileUri, "fileUri");
                return new FileData(mimeType, fileUri);
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof FileData)) {
                    return false;
                }
                FileData fileData = (FileData) other;
                return OooOOO0.OooO0O0(this.mimeType, fileData.mimeType) && OooOOO0.OooO0O0(this.fileUri, fileData.fileUri);
            }

            public final String getFileUri() {
                return this.fileUri;
            }

            public final String getMimeType() {
                return this.mimeType;
            }

            public int hashCode() {
                return this.fileUri.hashCode() + (this.mimeType.hashCode() * 31);
            }

            public String toString() {
                StringBuilder sb = new StringBuilder("FileData(mimeType=");
                sb.append(this.mimeType);
                sb.append(", fileUri=");
                return C21111o0ooOoO.OooO0OO(this.fileUri, ')', sb);
            }

            public FileData(String mimeType, String fileUri) {
                OooOOO0.OooO0oO(mimeType, "mimeType");
                OooOOO0.OooO0oO(fileUri, "fileUri");
                this.mimeType = mimeType;
                this.fileUri = fileUri;
            }
        }

        public /* synthetic */ Internal(int i, @InterfaceC33916OooO0oo("file_data") FileData fileData, o000000O o000000o2) {
            if (1 == (i & 1)) {
                this.fileData = fileData;
            } else {
                C24242OooOOo.OooO0O0(i, 1, FileDataPart$Internal$$serializer.INSTANCE.getDescriptor());
                throw null;
            }
        }

        public static /* synthetic */ Internal copy$default(Internal internal, FileData fileData, int i, Object obj) {
            if ((i & 1) != 0) {
                fileData = internal.fileData;
            }
            return internal.copy(fileData);
        }

        @InterfaceC33916OooO0oo("file_data")
        public static /* synthetic */ void getFileData$annotations() {
        }

        /* JADX INFO: renamed from: component1, reason: from getter */
        public final FileData getFileData() {
            return this.fileData;
        }

        public final Internal copy(FileData fileData) {
            OooOOO0.OooO0oO(fileData, "fileData");
            return new Internal(fileData);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof Internal) && OooOOO0.OooO0O0(this.fileData, ((Internal) other).fileData);
        }

        public final FileData getFileData() {
            return this.fileData;
        }

        public int hashCode() {
            return this.fileData.hashCode();
        }

        public String toString() {
            return "Internal(fileData=" + this.fileData + ')';
        }

        public Internal(FileData fileData) {
            OooOOO0.OooO0oO(fileData, "fileData");
            this.fileData = fileData;
        }
    }

    public FileDataPart(String uri, String mimeType) {
        OooOOO0.OooO0oO(uri, "uri");
        OooOOO0.OooO0oO(mimeType, "mimeType");
        this.uri = uri;
        this.mimeType = mimeType;
    }

    public final String getMimeType() {
        return this.mimeType;
    }

    public final String getUri() {
        return this.uri;
    }
}
