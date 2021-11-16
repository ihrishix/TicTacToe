package com.hrishi.tictactoe


//TicTacToe Board Class
class TicTacToe(private val size: Int) {
    private val board = Array(size) { Array(size) { '-' } }
     var turn: Char = 'X'
    var status = Status.ONGOINING
        private set

    fun move(x: Int, y: Int): Boolean {

        if (status == Status.ONGOINING) {
            if (board[x][y] == '-') {
                board[x][y] = turn
                checkWinner()
                toggleTurn()
                return true
            }
        }


        return false
    }

    private fun checkWinner() {

        //diag 1
        var i = 0
        var sym = board[i][i]
        if (sym != '-') {
            while (i < size && board[i][i] == sym) {
                i++
            }
        }

        if (i == size) {
            status = Status.WON
            return
        }

        //diag 2
        sym = board[0][size - 1]
        i = 0
        var j = size - 1
        if (sym != '-') {
            while (i < size && j >= 0 && board[i][j] == sym) {
                i++
                j--
            }
        }

        if (i == size) {
            status = Status.WON
            return
        }

        //rows
        for (k in 0..size - 1) {
            sym = board[k][0]
            if (sym != '-') {
                for (l in 0..size - 1) {
                    if (board[k][l] != sym) {
                        break
                    }
                    if (l == size - 1) {
                        status = Status.WON
                        return
                    }
                }
            }
        }

        //col
        for (k in 0..size - 1) {
            sym = board[0][k]
            if (sym != '-') {
                for (l in 0..size - 1) {
                    if (board[l][k] != sym) {
                        break
                    }
                    if (l == size - 1) {
                        status = Status.WON
                        return
                    }
                }
            }
        }

        //check draw
        for (o in 0..size-1){
            for (p in 0..size-1){
                if(board[o][p] == '-'){
                    return
                }
            }
        }

        status = Status.DRAW

    }

    fun displayBoard() {
        board.forEach { row ->
            row.forEach { ch ->
                print("| $ch |")
            }
            println()
        }
    }

    private fun toggleTurn() {
        turn = if (turn == 'X') 'O' else 'X'
    }
}

//game status
enum class Status {
    WON,
    ONGOINING,
    DRAW
}