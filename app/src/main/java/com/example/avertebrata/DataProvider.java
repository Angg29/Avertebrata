package com.example.avertebrata;

import android.content.Context;

import java.util.ArrayList;
import java.util.List;

import com.example.avertebrata.model.Kucing;
import com.example.avertebrata.model.Anjing;
import com.example.avertebrata.model.Monyet;
import com.example.avertebrata.model.Hewan;

public class DataProvider {
    private static List<Hewan> hewans = new ArrayList<>();

    private static List<Kucing> initDataKucing(Context ctx) {
        List<Kucing> kucings = new ArrayList<>();
        kucings.add(new Kucing(ctx.getString(R.string.Anggora_name), ctx.getString(R.string.Anggora_asal),
                ctx.getString(R.string.Anggora_deskripsi), R.drawable.cat_angora));
        kucings.add(new Kucing(ctx.getString(R.string.Bengal_name), ctx.getString(R.string.Bengal_asal),
                ctx.getString(R.string.Bengal_deskripsi), R.drawable.cat_bengal));
        kucings.add(new Kucing(ctx.getString(R.string.Birmani_name), ctx.getString(R.string.Birmani_asal),
                ctx.getString(R.string.Birmani_deskripsi), R.drawable.cat_birman));
        kucings.add(new Kucing(ctx.getString(R.string.Persia_name), ctx.getString(R.string.Persia_asal),
                ctx.getString(R.string.Persia_deskripsi), R.drawable.cat_persia));
        kucings.add(new Kucing(ctx.getString(R.string.Siam_name), ctx.getString(R.string.Siam_asal),
                ctx.getString(R.string.Siam_deskripsi), R.drawable.cat_siam));
        kucings.add(new Kucing(ctx.getString(R.string.Siberia_name), ctx.getString(R.string.Siberia_asal),
                ctx.getString(R.string.Siberia_deskripsi), R.drawable.cat_siberian));
        return kucings;
    }

    private static List<Anjing> initDataAnjing(Context ctx) {
        List<Anjing> anjings = new ArrayList<>();
        anjings.add(new Anjing(ctx.getString(R.string.Anjing_name), ctx.getString(R.string.Anjing_asal),
                ctx.getString(R.string.Anjing_deskripsi), R.drawable.dog_bulldog));
        anjings.add(new Anjing(ctx.getString(R.string.Hunsky_name), ctx.getString(R.string.Hunsky_asal),
                ctx.getString(R.string.Hunsky_deskripsi), R.drawable.dog_husky));
        anjings.add(new Anjing(ctx.getString(R.string.Kintamani_name), ctx.getString(R.string.Kintamani_asal),
                ctx.getString(R.string.Kintamani_deskripsi), R.drawable.dog_kintamani));
        anjings.add(new Anjing(ctx.getString(R.string.Samoyed_name), ctx.getString(R.string.Samoyed_asal),
                ctx.getString(R.string.Samoyed_deskripsi), R.drawable.dog_samoyed));
        anjings.add(new Anjing(ctx.getString(R.string.Shepherd_name), ctx.getString(R.string.Shepherd_asal),
                ctx.getString(R.string.Shepherd_deskripsi), R.drawable.dog_shepherd));
        anjings.add(new Anjing(ctx.getString(R.string.Shiba_name), ctx.getString(R.string.Shiba_asal),
                ctx.getString(R.string.Shiba_deskripsi), R.drawable.dog_shiba));
        return anjings;
    }

    private static List<Monyet> initDataMonyet(Context ctx) {
        List<Monyet> monyets = new ArrayList<>();
        monyets.add(new Monyet(ctx.getString(R.string.Pigmy_name), ctx.getString(R.string.Pigmy_asal),
                ctx.getString(R.string.Pigmy_deskripsi), R.drawable.monyet_pigmy));
        monyets.add(new Monyet(ctx.getString(R.string.Emperor_name), ctx.getString(R.string.Emperor_asal),
                ctx.getString(R.string.Emperor_deskripsi), R.drawable.monyet_emperor));
        monyets.add(new Monyet(ctx.getString(R.string.Probocis_name), ctx.getString(R.string.Probocis_asal),
                ctx.getString(R.string.Probocis_deskripsi), R.drawable.monyet_ganteng));
        monyets.add(new Monyet(ctx.getString(R.string.Simpanse_name), ctx.getString(R.string.Simpanse_asal),
                ctx.getString(R.string.Simpanse_deskripsi), R.drawable.monyet_simpanse));
        return monyets;
    }

    public static void initAllHewans(Context ctx) {
        hewans.addAll(initDataKucing(ctx));
        hewans.addAll(initDataAnjing(ctx));
        hewans.addAll(initDataMonyet(ctx));
    }

    public static List<Hewan> getHewansByTipe(Context ctx, String jenis) {
        List<Hewan> hewansByType = new ArrayList<>();
        if (hewans.size() == 0) {
            initAllHewans(ctx);
        }
        for (Hewan h : hewans) {
            if (h.getJenis().equals(jenis)) {
                hewansByType.add(h);
            }
        }
        return hewansByType;
    }

}
