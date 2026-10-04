package com.aspose.slides.internal.p332p7;

import com.aspose.slides.internal.p077d8.C3068ks;
import com.microsoft.identity.common.java.authorities.AzureActiveDirectoryAudience;
import com.orion.notein.domain.models.backup.BackupFile;
import com.orion.notein.domain.models.note.NoteMeta;

/* JADX INFO: loaded from: classes4.dex */
public class ssa {

    /* JADX INFO: renamed from: k4 */
    private static final C3068ks f30360k4 = new C3068ks(1, "address", "annote", "author", "bibliography-type", "booktitle", "chapter", "custom1", "custom2", "custom3", "custom4", "custom5", "edition", "editor", "howpublished", "identifier", "institution", "isbn", "issn", "journal", "month", BackupFile.FILE_CONTENT_TYPE_NOTE, "number", AzureActiveDirectoryAudience.ORGANIZATIONS, "pages", "publisher", "report-type", "school", "series", NoteMeta.PROPERTY_TITLE, "url", "volume", "year");

    /* JADX INFO: renamed from: k4 */
    public static int m41277k4(String str) {
        C3068ks c3068ks = f30360k4;
        if (c3068ks.m12965x1(str)) {
            return c3068ks.m12963k4(str);
        }
        return 0;
    }

    /* JADX INFO: renamed from: k4 */
    public static String m41278k4(int i) {
        return f30360k4.m12964k4(i);
    }
}
