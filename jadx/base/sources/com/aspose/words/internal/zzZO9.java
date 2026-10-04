package com.aspose.words.internal;

import com.nimbusds.jose.shaded.json.parser.JSONParser;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes5.dex */
final class zzZO9 extends zzZOC {
    private zzZO0 zzi8() {
        return new zzZNO(new zzZNZ(1257, "windows-1257", "windows-1257", "windows-1257", "windows-1257", 1257)).zzY(new HashMap<Integer, Integer>() { // from class: com.aspose.words.internal.zzZO9.6
            {
                put(131, 402);
                put(170, 63737);
                put(240, Integer.valueOf(JSONParser.MODE_JSON_SIMPLE));
            }
        });
    }

    private zzZO0 zzi9() {
        return new zzZNO(new zzZNZ(1253, "Windows-1253", "iso-8859-7", "Windows-1253", "Windows-1253", 1253)).zzY(new HashMap<Integer, Integer>() { // from class: com.aspose.words.internal.zzZO9.5
            {
                put(131, 402);
                put(170, 63737);
                put(240, Integer.valueOf(JSONParser.MODE_JSON_SIMPLE));
            }
        }).zzX(new HashMap<Integer, Integer>() { // from class: com.aspose.words.internal.zzZO9.4
            {
                put(63737, 170);
            }
        });
    }

    private zzZO0 zzia() {
        return new zzZNO(new zzZNZ(1252, "Windows-1252", "iso-8859-1", "Windows-1252", "Windows-1252", 1252)).zzX(new HashMap<Integer, Integer>() { // from class: com.aspose.words.internal.zzZO9.3
            {
                put(128, 63);
                put(142, 63);
                put(158, 63);
            }
        }).zzY(new HashMap<Integer, Integer>() { // from class: com.aspose.words.internal.zzZO9.2
            {
                put(128, 8364);
                put(142, 381);
                put(158, 382);
            }
        });
    }

    private static zzZO0 zzib() {
        return new zzZNO(new zzZNZ(1250, "windows-1250", "iso-8859-2", "windows-1250", "windows-1250", 1250));
    }

    private static zzZO0 zzic() {
        return new zzZNO(new zzZNZ(1251, "windows-1251", "koi8-r", "windows-1251", "windows-1251", 1251));
    }

    private static zzZO0 zzid() {
        return new zzZNO(new zzZNZ(1254, "windows-1254", "iso-8859-9", "windows-1254", "windows-1254", 1254));
    }

    private static zzZO0 zzie() {
        return new zzZNO(new zzZNZ(1255, "windows-1255", "windows-1255", "windows-1255", "windows-1255", 1255));
    }

    private static zzZO0 zzif() {
        return new zzZNO(new zzZNZ(1256, "windows-1256", "windows-1256", "windows-1256", "windows-1256", 1256));
    }

    private static zzZO0 zzig() {
        return new zzZNO(new zzZNZ(1258, "windows-1258", "windows-1258", "windows-1258", "windows-1258", 1258));
    }

    @Override // com.aspose.words.internal.zzZOC
    public final Map<Integer, zzZO0> zzii() {
        HashMap map = new HashMap();
        map.put(1250, zzib());
        map.put(1251, zzic());
        map.put(1252, zzia());
        map.put(1253, zzi9());
        map.put(1254, zzid());
        map.put(1255, zzie());
        map.put(1256, zzif());
        map.put(1257, zzi8());
        map.put(1258, zzig());
        map.put(65000, new zzZNJ());
        map.put(65001, new zzZNI());
        map.put(1200, new zzZNM());
        map.put(1201, new zzZNN());
        map.put(12000, new zzZNK());
        map.put(12001, new zzZNL());
        map.put(720, new zzZOD(new zzZNZ(720, "DOS-720", "DOS-720", "DOS-720", "DOS-720", 1256), new zzZI3()));
        map.put(862, new zzZOD(new zzZNZ(862, "DOS-862", "DOS-862", "DOS-862", "DOS-862", 1255, "IBM862")));
        map.put(866, new zzZOD(new zzZNZ(866, "cp866", "cp866", "cp866", "cp866", 1251, "IBM866")));
        return map;
    }

    @Override // com.aspose.words.internal.zzZOC
    public final Map<String, Integer> zzij() {
        return new HashMap<String, Integer>() { // from class: com.aspose.words.internal.zzZO9.1
            {
                put("Unicode", 1200);
                put("UTF-16LE", 1200);
                put("cp862", 862);
            }
        };
    }
}
