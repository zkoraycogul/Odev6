package com.example.netflixcopy

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.StaggeredGridLayoutManager
import com.example.netflixcopy.databinding.FragmentAnaSayfaBinding

class AnaSayfaFragment : Fragment() {
    private lateinit var tasarim : FragmentAnaSayfaBinding
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,savedInstanceState: Bundle?): View? {
        tasarim = FragmentAnaSayfaBinding.inflate(inflater, container, false)

        tasarim.rv.layoutManager = StaggeredGridLayoutManager(1,StaggeredGridLayoutManager.HORIZONTAL)
        tasarim.rv2.layoutManager = StaggeredGridLayoutManager(1,StaggeredGridLayoutManager.HORIZONTAL)
        tasarim.rv3.layoutManager = StaggeredGridLayoutManager(1,StaggeredGridLayoutManager.HORIZONTAL)

        val filmlerListesiPopular = ArrayList<Filmler>()

        val filmPop1 = Filmler(1,"The Witcher","thewitcher")
        val filmPop2 = Filmler(2,"Blackaf","blackaf")
        val filmPop3 = Filmler(3,"Hustle","hustle")
        val filmPop4 = Filmler(4,"Red Notice","rednotice")
        val filmPop5 = Filmler(5,"Scoob","scoob")
        val filmPop6 = Filmler(6,"The Adam Project","theadamproject")

        filmlerListesiPopular.add(filmPop1)
        filmlerListesiPopular.add(filmPop2)
        filmlerListesiPopular.add(filmPop3)
        filmlerListesiPopular.add(filmPop4)
        filmlerListesiPopular.add(filmPop5)
        filmlerListesiPopular.add(filmPop6)

        val adapter = FilmlerAdapter(requireContext(),filmlerListesiPopular)
        tasarim.rv.adapter = adapter



        val filmlerListesiGundemdekiler = ArrayList<Filmler>()

        val filmGun1 = Filmler(7,"Angry Birds 2","angrybirds2")
        val filmGun2 = Filmler(8,"The Ridiculous 6","theridiciolus6")
        val filmGun3 = Filmler(9,"Narcos","narcos")
        val filmGun4 = Filmler(10,"The Do Over","thedoover")
        val filmGun5 = Filmler(11,"Torontolu Adam","torontoluadam")
        val filmGun6 = Filmler(12,"Kara Şövalye","karasovalye")

        filmlerListesiGundemdekiler.add(filmGun1)
        filmlerListesiGundemdekiler.add(filmGun2)
        filmlerListesiGundemdekiler.add(filmGun3)
        filmlerListesiGundemdekiler.add(filmGun4)
        filmlerListesiGundemdekiler.add(filmGun5)
        filmlerListesiGundemdekiler.add(filmGun6)



        val adapter2 = FilmlerAdapter(requireContext(),filmlerListesiGundemdekiler)
        tasarim.rv2.adapter = adapter2



        val filmlerListesiYenidenIzle = ArrayList<Filmler>()

        val filmYeniden1 = Filmler(13,"Django","django")
        val filmYeniden2 = Filmler(14,"Inception","inception")
        val filmYeniden3 = Filmler(15,"Interstellar","interstellar")
        val filmYeniden4 = Filmler(16,"The Hateful Eight","thehatefuleight")
        val filmYeniden5 = Filmler(17,"Anadoluda","anadoluda")
        val filmYeniden6 = Filmler(18,"The Pianist","thepianist")

        filmlerListesiYenidenIzle.add(filmYeniden1)
        filmlerListesiYenidenIzle.add(filmYeniden2)
        filmlerListesiYenidenIzle.add(filmYeniden3)
        filmlerListesiYenidenIzle.add(filmYeniden4)
        filmlerListesiYenidenIzle.add(filmYeniden5)
        filmlerListesiYenidenIzle.add(filmYeniden6)



        val adapter3 = FilmlerAdapter(requireContext(),filmlerListesiYenidenIzle)
        tasarim.rv3.adapter = adapter3



        return tasarim.root
    }
}