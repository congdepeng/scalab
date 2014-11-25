#!/bin/sh
exec scala "$0" "$@"
!#

object Hello extends App{

println("Hello, scala script.")

}

Hello.main(args)
