package com.aspose.words.internal;

import com.aspose.words.net.System.Data.DataColumn;
import com.aspose.words.net.System.Data.DataTable;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes5.dex */
final class zzZNC {

    public static class zzX {
        private DataColumn zzZVs;
        private DataTable zzZVv;
        private Map<DataColumn, Integer> zzZVu = new HashMap();
        private List<DataColumn> zzZVt = new ArrayList();

        public zzX(DataTable dataTable) {
            this.zzZVv = dataTable;
        }

        public final boolean containsColumn(String str) {
            Iterator<DataColumn> it = this.zzZVt.iterator();
            while (it.hasNext()) {
                if (it.next().getColumnName().equals(str)) {
                    return true;
                }
            }
            Iterator<DataColumn> it2 = this.zzZVu.keySet().iterator();
            while (it2.hasNext()) {
                if (it2.next().getColumnName().equals(str)) {
                    return true;
                }
            }
            return false;
        }

        public final DataTable getTable() {
            return this.zzZVv;
        }

        public final void zzZ(DataColumn dataColumn) {
            this.zzZVs = dataColumn;
        }

        public final DataColumn zzhf() {
            return this.zzZVs;
        }

        public final List<DataColumn> zzhg() {
            return this.zzZVt;
        }

        public final Map<DataColumn, Integer> zzhh() {
            return this.zzZVu;
        }
    }

    public static class zzY {
        private String zzZVA;
        private String zzZVB;
        private String zzZVC;
        private boolean zzZVw;
        private boolean zzZVx;
        private String zzZVy;
        private String zzZVz;

        public final String getChildTableName() {
            return this.zzZVA;
        }

        public final String getParentTableName() {
            return this.zzZVB;
        }

        public final void zzUL(String str) {
            this.zzZVy = str;
        }

        public final void zzUM(String str) {
            this.zzZVz = str;
        }

        public final void zzUN(String str) {
            this.zzZVA = str;
        }

        public final void zzUO(String str) {
            this.zzZVB = str;
        }

        public final boolean zzhi() {
            return this.zzZVw;
        }

        public final void zzhj() {
            this.zzZVw = true;
        }

        public final boolean zzhk() {
            return this.zzZVx;
        }

        public final void zzhl() {
            this.zzZVx = true;
        }

        public final String zzhm() {
            return this.zzZVy;
        }

        public final String zzhn() {
            return this.zzZVz;
        }

        public final String zzho() {
            return this.zzZVC;
        }
    }

    public static class zzZ {
        public final boolean zzZVD;
        public final boolean zzZVE;
        public final String zzZVF;
        public final boolean zzZVG;
        public final String zzZVH;
        public final boolean[] zzZVI;
        public final String[] zzZVJ;
        public final String zzZVK;

        public zzZ(String str, String[] strArr, boolean[] zArr, String str2, boolean z, String str3, boolean z2, boolean z3) {
            this.zzZVK = str;
            this.zzZVJ = strArr;
            this.zzZVI = zArr;
            this.zzZVH = zzZN8.decode(str2);
            this.zzZVG = z;
            this.zzZVF = str3;
            this.zzZVE = z2;
            this.zzZVD = z3;
        }
    }
}
