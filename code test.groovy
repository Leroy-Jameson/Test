import eu.mihosoft.vrl.v3d.CSG
import eu.mihosoft.vrl.v3d.Cube
import eu.mihosoft.vrl.v3d.Isosceles

// code here
CSG Base = new Cube(	20,// X dimention
			20,// Y dimention
			20//  Z dimention
			).toCSG()// this converts from the geometry to an object we can work with
Base = Base.toZMin() 
		.toXMin() .toYMin()
CSG Roof = new Isosceles(20,20,15).toCSG()
		.toXMin() .toYMin() .movez(20)
CSG Window = new Cube(	10,// X dimention
			10,// Y dimention
			10//  Z dimention
			).toCSG()// this converts from the geometry to an object we can work with
		.movex(20).movey(10).movez(10)
CSG Window 2 = new cube(   20,// X dimension
			   20,// y dimention
			   20,// z dimension
			   ).toCSG()//
return CSG.unionAll([Base, Roof]).difference(Window)
