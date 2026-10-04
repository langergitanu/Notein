package com.aspose.words;

import com.orion.notein.domain.models.cloudsync.CloudMetaExtra;
import java.util.Iterator;

/* JADX INFO: loaded from: classes6.dex */
final class zz9A {
    private boolean zzZ5I = true;

    private static String zzIY(int i) {
        return com.aspose.words.internal.zzZKN.format("'{0}'", zz9Z.zzJ4(i));
    }

    private static String zzP(zz5A zz5a) {
        if (zz5a == null) {
            return CloudMetaExtra.DEFINE_NON_PARENT_ID;
        }
        zz58 zz58Var = (zz58) com.aspose.words.internal.zzZKW.zzZ(zz5a, zz58.class);
        if (zz58Var != null) {
            return zz58Var.toString();
        }
        String string = ((zz59) zz5a).toString();
        return com.aspose.words.internal.zzZKN.format("{0}..{1}", string.substring(0, 2), string.substring(string.length() - 2, string.length()));
    }

    private static String zzR(zz9K zz9k) {
        return zz9k == null ? CloudMetaExtra.DEFINE_NON_PARENT_ID : com.aspose.words.internal.zzZKN.format("{0}, {1}-{2}", zz9k.zzZDW(), zz9Z.zzJl(zz9k.zzZDU().getType()), zzP(zz9k.zzZDU().zzZEC()));
    }

    private static String zzW(zzBE zzbe) {
        if (zzbe.zzZF7() == 2) {
            return zzIY(zzbe.getType());
        }
        StringBuilder sb = new StringBuilder();
        com.aspose.words.internal.zzZNH.zzZ(sb, "'{0}-{1}", zz9Z.zzJ4(zzbe.getType()), zz9Z.zzJf(zzbe.zzZF7()));
        if (com.aspose.words.internal.zzZYD.zzXk(zzbe.zzZF6())) {
            sb.append('-');
            com.aspose.words.internal.zzZNH.zzU(sb, zzbe.zzZF6());
        }
        if (zzbe.zzZF5() != 0) {
            sb.append('-');
            com.aspose.words.internal.zzZNH.zzU(sb, zz9Z.zzJh(zzbe.zzZF5()));
        }
        sb.append('\'');
        return sb.toString();
    }

    private static String zzXW(long j) {
        return zzs(Float.intBitsToFloat((int) j), com.aspose.words.internal.zzZPW.zzYz(j));
    }

    private static String zzY(zzZC9 zzzc9) {
        zzZC8 zzzc8 = (zzZC8) com.aspose.words.internal.zzZKW.zzZ(zzzc9, zzZC8.class);
        return zzzc8 != null ? zzW(zzzc8.zzZzt()) : zzIY(zzzc9.getType());
    }

    private static String zzZy(com.aspose.words.internal.zzZQ4 zzzq4) {
        return com.aspose.words.internal.zzZKN.format("({0:F2};{1:F2};{2:F2};{3:F2})", Float.valueOf(zzzq4.zzZm()), Float.valueOf(zzzq4.zzZo()), Float.valueOf(zzzq4.getWidth()), Float.valueOf(zzzq4.getHeight()));
    }

    private static String zzs(float f, float f2) {
        return com.aspose.words.internal.zzZKN.format("({0:F2};{1:F2})", Float.valueOf(f), Float.valueOf(f2));
    }

    public final void zzIZ(int i) {
        if (this.zzZ5I) {
            return;
        }
        com.aspose.words.internal.zzZKN.format("Constraint state restored to ({0})", Integer.valueOf(i - 1));
    }

    public final void zzS(zz9K zz9k) {
        if (this.zzZ5I) {
            return;
        }
        com.aspose.words.internal.zzZKN.format("{0}: Laying out connectors", zzR(zz9k));
    }

    public final void zzT(zz9K zz9k) {
        if (this.zzZ5I) {
            return;
        }
        com.aspose.words.internal.zzZKN.format("{0}: Layout finished. Result size {1}, text {2}fit", zzR(zz9k), zzXW(zz9k.zzZDQ()), zz9k.zzZDO() ? "" : "NOT ");
    }

    public final void zzU(zz9K zz9k) {
        if (this.zzZ5I) {
            return;
        }
        com.aspose.words.internal.zzZKN.format("{0}: Laying out children", zzR(zz9k));
    }

    public final void zzV(zz9K zz9k) {
        if (this.zzZ5I) {
            return;
        }
        com.aspose.words.internal.zzZKN.format("{0}: Applying parent constraints to children", zzR(zz9k));
    }

    public final void zzXn(boolean z) {
        this.zzZ5I = z;
    }

    public final void zzZ(zzBC zzbc, int i) {
        if (this.zzZ5I) {
            return;
        }
        com.aspose.words.internal.zzZKN.format("({4}) {0}: {1} {2} = {3}", zzR(zzbc.zzZF3().zzZzn()), zzY(zzbc), zzY(zzbc.zzZF3()), Float.valueOf(zzbc.zzPv()), Integer.valueOf(i));
    }

    private static String zzY(zzBC zzbc) {
        if (zzbc instanceof zzBB) {
            return "Algorithm change";
        }
        if (zzbc instanceof zzB7) {
            return "Rule change";
        }
        if (zzbc instanceof zzBA) {
            return "Available extent";
        }
        if (zzbc instanceof zzB9) {
            return "Parent sync";
        }
        if (zzbc instanceof zzB8) {
            return "Push to children";
        }
        return "";
    }

    public final void zzZ(zz9K zz9k, long j) {
        if (this.zzZ5I) {
            return;
        }
        zzZ(zz9k, Float.intBitsToFloat((int) j), com.aspose.words.internal.zzZPW.zzYz(j));
    }

    private void zzZ(zz9K zz9k, float f, float f2) {
        if (this.zzZ5I) {
            return;
        }
        com.aspose.words.internal.zzZKN.format("{0}: Start layout to size {1}", zzR(zz9k), zzs(f, f2));
    }

    public final void zzZ(zz9K zz9k, long j, long j2) {
        if (this.zzZ5I) {
            return;
        }
        com.aspose.words.internal.zzZKN.format("{0}: Scaling algorithm from {1} to {2}", zzR(zz9k), zzXW(j), zzXW(j2));
    }

    private static void zzY(zz61 zz61Var) {
        zzR(zz61Var.zzZ24);
        Iterator<zz61> it = zz61Var.zzZ1Y.iterator();
        while (it.hasNext()) {
            zzY(it.next());
        }
    }

    public final void zzZ(zzBE zzbe, float f, float f2) {
        if (this.zzZ5I) {
            return;
        }
        com.aspose.words.internal.zzZKN.format("Applying rule to {0}. Range from {1} to {2}", zzW(zzbe), Float.valueOf(f), Float.valueOf(f2));
    }

    public final void zzZ(zzBE zzbe, float f) {
        if (this.zzZ5I) {
            return;
        }
        com.aspose.words.internal.zzZKN.format("Rule on {0} calculated. Value set to {1}", zzW(zzbe), Float.valueOf(f));
    }

    public final void zzZ(zz9K zz9k, com.aspose.words.internal.zzZQ4 zzzq4) {
        if (this.zzZ5I) {
            return;
        }
        com.aspose.words.internal.zzZKN.format("{0}: Location {1}", zzR(zz9k), zzZy(zzzq4));
    }

    public final void zzZ(zz61 zz61Var) {
        if (this.zzZ5I) {
            return;
        }
        zzY(zz61Var);
    }
}
