package com.orion.notein.p607ui.export;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.Metadata;
import kotlin.jvm.internal.OooOOO0;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(m80611d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bw\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u0082\u0001\u0002\u0004\u0005ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0006À\u0006\u0001"}, m80612d2 = {"Lcom/orion/notein/ui/export/ExportRequest;", "Landroid/os/Parcelable;", "NoteExport", "PageExport", "Lcom/orion/notein/ui/export/ExportRequest$NoteExport;", "Lcom/orion/notein/ui/export/ExportRequest$PageExport;", "app_google_playRelease"}, m80613k = 1, m80614mv = {2, 1, 0}, m80616xi = 48)
public interface ExportRequest extends Parcelable {

    @Metadata(m80611d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m80612d2 = {"Lcom/orion/notein/ui/export/ExportRequest$NoteExport;", "Lcom/orion/notein/ui/export/ExportRequest;", "app_google_playRelease"}, m80613k = 1, m80614mv = {2, 1, 0}, m80616xi = 48)
    public static final /* data */ class NoteExport implements ExportRequest {
        public static final Parcelable.Creator<NoteExport> CREATOR = new OooO00o();

        /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
        public final String f71677OooOo;

        /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
        public final String f71678OooOo0o;

        public static final class OooO00o implements Parcelable.Creator<NoteExport> {
            @Override // android.os.Parcelable.Creator
            public final NoteExport createFromParcel(Parcel parcel) {
                OooOOO0.OooO0oO(parcel, "parcel");
                return new NoteExport(parcel.readString(), parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final NoteExport[] newArray(int i) {
                return new NoteExport[i];
            }
        }

        public NoteExport(String idPayloadPath, String suggestedFileName) {
            OooOOO0.OooO0oO(idPayloadPath, "idPayloadPath");
            OooOOO0.OooO0oO(suggestedFileName, "suggestedFileName");
            this.f71678OooOo0o = idPayloadPath;
            this.f71677OooOo = suggestedFileName;
        }

        @Override // com.orion.notein.p607ui.export.ExportRequest
        /* JADX INFO: renamed from: OooOOoo, reason: from getter */
        public final String getF71681OooOoO0() {
            return this.f71677OooOo;
        }

        @Override // com.orion.notein.p607ui.export.ExportRequest
        /* JADX INFO: renamed from: Oooo00o, reason: from getter */
        public final String getF71680OooOo0o() {
            return this.f71678OooOo0o;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof NoteExport)) {
                return false;
            }
            NoteExport noteExport = (NoteExport) obj;
            return OooOOO0.OooO0O0(this.f71678OooOo0o, noteExport.f71678OooOo0o) && OooOOO0.OooO0O0(this.f71677OooOo, noteExport.f71677OooOo);
        }

        public final int hashCode() {
            return this.f71677OooOo.hashCode() + (this.f71678OooOo0o.hashCode() * 31);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("NoteExport(idPayloadPath=");
            sb.append(this.f71678OooOo0o);
            sb.append(", suggestedFileName=");
            return androidx.concurrent.futures.OooO00o.OooO0OO(sb, this.f71677OooOo, ")");
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            OooOOO0.OooO0oO(dest, "dest");
            dest.writeString(this.f71678OooOo0o);
            dest.writeString(this.f71677OooOo);
        }
    }

    @Metadata(m80611d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m80612d2 = {"Lcom/orion/notein/ui/export/ExportRequest$PageExport;", "Lcom/orion/notein/ui/export/ExportRequest;", "app_google_playRelease"}, m80613k = 1, m80614mv = {2, 1, 0}, m80616xi = 48)
    public static final /* data */ class PageExport implements ExportRequest {
        public static final Parcelable.Creator<PageExport> CREATOR = new OooO00o();

        /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
        public final String f71679OooOo;

        /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
        public final String f71680OooOo0o;

        /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
        public final String f71681OooOoO0;

        public static final class OooO00o implements Parcelable.Creator<PageExport> {
            @Override // android.os.Parcelable.Creator
            public final PageExport createFromParcel(Parcel parcel) {
                OooOOO0.OooO0oO(parcel, "parcel");
                return new PageExport(parcel.readString(), parcel.readString(), parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final PageExport[] newArray(int i) {
                return new PageExport[i];
            }
        }

        public PageExport(String idPayloadPath, String hostNoteId, String suggestedFileName) {
            OooOOO0.OooO0oO(idPayloadPath, "idPayloadPath");
            OooOOO0.OooO0oO(hostNoteId, "hostNoteId");
            OooOOO0.OooO0oO(suggestedFileName, "suggestedFileName");
            this.f71680OooOo0o = idPayloadPath;
            this.f71679OooOo = hostNoteId;
            this.f71681OooOoO0 = suggestedFileName;
        }

        @Override // com.orion.notein.p607ui.export.ExportRequest
        /* JADX INFO: renamed from: OooOOoo, reason: from getter */
        public final String getF71681OooOoO0() {
            return this.f71681OooOoO0;
        }

        @Override // com.orion.notein.p607ui.export.ExportRequest
        /* JADX INFO: renamed from: Oooo00o, reason: from getter */
        public final String getF71680OooOo0o() {
            return this.f71680OooOo0o;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof PageExport)) {
                return false;
            }
            PageExport pageExport = (PageExport) obj;
            return OooOOO0.OooO0O0(this.f71680OooOo0o, pageExport.f71680OooOo0o) && OooOOO0.OooO0O0(this.f71679OooOo, pageExport.f71679OooOo) && OooOOO0.OooO0O0(this.f71681OooOoO0, pageExport.f71681OooOoO0);
        }

        public final int hashCode() {
            return this.f71681OooOoO0.hashCode() + com.aspose.slides.internal.p497xc.OooO00o.OooO0O0(this.f71680OooOo0o.hashCode() * 31, 31, this.f71679OooOo);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("PageExport(idPayloadPath=");
            sb.append(this.f71680OooOo0o);
            sb.append(", hostNoteId=");
            sb.append(this.f71679OooOo);
            sb.append(", suggestedFileName=");
            return androidx.concurrent.futures.OooO00o.OooO0OO(sb, this.f71681OooOoO0, ")");
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            OooOOO0.OooO0oO(dest, "dest");
            dest.writeString(this.f71680OooOo0o);
            dest.writeString(this.f71679OooOo);
            dest.writeString(this.f71681OooOoO0);
        }
    }

    /* JADX INFO: renamed from: OooOOoo */
    String getF71681OooOoO0();

    /* JADX INFO: renamed from: Oooo00o */
    String getF71680OooOo0o();
}
